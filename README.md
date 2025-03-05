# Pushing Java App Image to Amazon ECR

## Objective
Containerize a Java application and deploy it to Amazon ECR using GitHub Actions.

## Steps
1. Write a `Dockerfile` and necessary config files.
2. Configure a GitHub Actions workflow to:
    - Build and tag the Docker image as `yourfullname_appname`.
    - Push the image to a public ECR repository.

## Usage
Store AWS credentials as GitHub secrets:
- `AWS_ACCESS_KEY_ID`
- `AWS_SECRET_ACCESS_KEY`

Trigger the workflow by pushing to `main`.

