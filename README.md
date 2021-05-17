# docker-learning

Whenever you make changes to your code you need to rebuild the image so that the changes are visible in production.

Below are the Steps for updating docker image.

1. Make sure you create new jar by running maven:install task.
2. After that embed the new jar into the image file.
    1. CD to project root
    2. 'docker build -f Dockerfile -t docket-sb-transactionmgmt .'
3. Run the docker image
    docker run -p 8085:8085 docker-sb-transactionmgmt