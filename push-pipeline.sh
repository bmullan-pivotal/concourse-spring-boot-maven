#!/bin/bash
fly -t adrift set-pipeline --pipeline sbm --config <(cat ci/resources.yml ci/jobs.yml) -l credentials.yml
fly -t adrift unpause-pipeline --pipeline sbm

