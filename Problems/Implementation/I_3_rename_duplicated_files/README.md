
## Implementation: Rename Duplicated Files

There is a list of files in a directory:


#### Source directory contents:
```
file1.ext
file2.ext
file3.ext
file4.ext
```

These files should be moved to another directory. In this destination directory there are some files that may have the same name of the source files, although, their contents are not the same. So, for example, in the destination directory we may have:


#### Destination directory contents:
```
file1.ext
file3.ext
file5.ext
```

In order to copy the files from source to destination directory, you need to add a sufix to it: `-01`, `-02`, and so on.

The maximum number of files with the same name is 100, so `-99` will be enough.

In the exemple above, the final list of files will be: 

```
file1.ext
file1-01.ext
file2.ext
file3.ext
file3-01.ext
file4.ext
file5.ext
```

## Problem
Create a program that will rename the file name so it will contains the right sufix. 


## Other examples

### Example 1

#### Source
```
file1.ext
file2.ext
file3.ext
```

#### Destination
```
file1.ext
file1-01.ext
file3.ext
```


#### Result
```
file1.ext
file1-01.ext
file1-02.ext
file2.ext
file3.ext
file3-01.ext
```