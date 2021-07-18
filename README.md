QuadTree 
---------------
This is a Java implementation of [Quadtree](http://en.wikipedia.org/wiki/Quadtree), a tree data structure useful to store 2D positional data.

[![CircleCI](https://circleci.com/gh/varunpant/Quadtree.svg?style=svg)](https://circleci.com/gh/varunpant/Quadtree)

![Illustration](http://upload.wikimedia.org/wikipedia/commons/8/8b/Point_quadtree.svg "This image is for Illustration only")


## Adding as a gradle dep

in lieu of setting up a build and publishing to a maven repo, the project has been converted to gradle to use a plugin that clones, builds and creates dependencies on gradle projects in git

in gradle.build
```groovy
git {
    implementation 'https://github.com/Argonaught/Quadtree.git', {
        tag '1.1'
    }
}
```


in gradle.settings
```groovy
plugins {
    id 'com.alexvasilkov.git-dependencies' version '2.0.1'
}
```

