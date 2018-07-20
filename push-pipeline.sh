#!/bin/bash
fly -t adrift set-pipeline --pipeline sbm -l credentials.yml --config <(cat ci/resources.yml ci/jobs.yml)
fly -t adrift unpause-pipeline --pipeline sbm

