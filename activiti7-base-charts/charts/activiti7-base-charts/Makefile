#CHART_REPO := http://jenkins-x-chartmuseum:8080
CURRENT=$(pwd)
NAME := ttc-example
OS := $(shell uname)
RELEASE_VERSION := $(shell cat ../../VERSION)

GITHUB_CHARTS_REPO := $(or $(GITHUB_CHARTS_REPO),$(shell git config --get remote.origin.url))
GITHUB_CHARTS_BRANCH := $(or $(GITHUB_CHARTS_BRANCH),gh-pages)
ORG:=$(or $(ORG),activiti)

build: clean
	helm init --client-only
	helm repo add activiti-cloud-helm-charts https://activiti.github.io/activiti-cloud-helm-charts/
	helm repo add activiti-cloud-charts https://activiti.github.io/activiti-cloud-charts/
	helm dependency build
	helm lint


install: clean build
	sed -i -e "s/jx-staging/${PREVIEW_NAMESPACE}/g" values.yaml
	helm install . --name ${HELM_RELEASE_NAME} --namespace ${PREVIEW_NAMESPACE} --debug --dry-run
	helm install . --name ${HELM_RELEASE_NAME} --namespace ${PREVIEW_NAMESPACE} --wait

upgrade: clean build
	helm upgrade ${HELM_RELEASE_NAME} .

delete:
	helm delete --purge ${HELM_RELEASE_NAME}

clean:
	rm -rf requirements.lock
	rm -rf charts
	rm -rf ${NAME}*.tgz
