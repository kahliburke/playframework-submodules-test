playframework-submodules-test
=============================

Test multiple projects with 2.1-RC1.

## Expected

I would expect 3 routes to exist, 1 belonging to each submodule, and 1 belonging to the main project we're running:

**/sub1**

**/sub2**

**/**

Instead, only 1 is available (in my case, **/sub1**).

## Setup

1. Publish submodules locally:

```
cd submodule1
play
>clean
>update
>eclipse
>publish-local
ctrl-c
```

```
cd ../submodule2
play
>clean
>update
>eclipse
>publish-local
ctrl-c
```

1. Run the application:
```
cd ../core
play
>clean
>update
>eclipse
>run
```

