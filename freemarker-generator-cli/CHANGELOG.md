# Change Log

All notable changes to this project will be documented in this file. We try to adhere to https://github.com/olivierlacan/keep-a-changelog.

## 0.2.0-SNAPSHOT

### Changed
* [FREEMARKER-195] Improve exposure of DataSources using TemplateHashModelEx2

## 0.1.0-SNAPSHOT (unreleased)

### Added
* Use `-Xverify:none -XX:TieredStopAtLevel=1` to improve startup time of CLI
* [FREEMARKER-188] Support an output "generation" mode to create an output for each `DataSource`
* [FREEMARKER-181] Support custom pattern definitions for Grok tool
* Parse a list of `DataSources` for the various tools
* [FREEMARKER-161] Allow multiple transformations on the CLI
* [FREEMARKER-163] Integrate Java Faker library for test data generation
* [FREEMARKER-149] Support multiple template transformations on the command line
* [FREEMARKER-144] Proof Of Concept for providing DataFrames
* [FREEMARKER-142] Support Transformation Of Directories
* [FREEMARKER-139] freemarker-cli: Provide GsonTool to align with Maven plugin
* Environment variables can bes passed as `DataSource`
* [FREEMARKER-135] Support user-supplied names for `DataSource` on the command line
* [FREEMARKER-129] Support `DataSource` exclude pattern in addition to include pattern
* [FREEMARKER-129] User-defined parameters are passed as `-Pkey=value` instead of using system properties
* [FREEMARKER-129] Migrate `freemarker-cli` into `freemarker-generator` project (see [https://github.com/sgoeschl/freemarker-cli](https://github.com/sgoeschl/freemarker-cli))
* [FREEMARKER-129] Provide a `toString()` method for all tools

* [FREEMARKER-182] Upgrade to Apache FreeMarker 2.3.31
* [FREEMARKER-175] Use latest FreeMarker version
* [FREEMARKER-173] Allow to pass arbitrary key/value pairs to DataSource when using NamedURIs
* [FREEMARKER-172] Use lower-case keys for DataSource metadata map
* [FREEMARKER-148] Make usage of "DataSources" more "Freemarker" like
* [FREEMARKER-155] Migrate the FTL code to terser dotter form
* [FREEMARKER-153] Packaged templates are now prefixed with `freemarker-generator`, e.g. `freemarker-generator/info.ftl`
* [FREEMARKER-153] Renamed `--basedir` command line option to `--template-dir`
* [FREEMARKER-153] Renamed `freemarker-cli` to `freemarker-generator`
* [FREEMARKER-146] Cleanly separate example templates and data from user-supplied content
* `DataSource` use `uri` instead of `location`
* [FREEMARKER-138] freemarker-generator: Rename `Datasource` to `DataSource`
* [FREEMARKER-136] Fix broken `site:stage` build
* [FREEMARKER-134] Rename `Document` to `Datasource` which also changes `--document` to `--datasource`
* [FREEMARKER-129] Use `freemarker.configuration.setting` in `freemarker-cli.properties` to configure FreeMarker
* [FREEMARKER-129] Use version "0.X.Y" to cater for API changes according to [Semantic Versioning](https://semver.org)

### Fixed
* [FREEMARKER-176] Running examples on Windows fails
* [FREEMARKER-156] The Maven plugin unit tests failed randomly
* [FREEMARKER-153] Configuration files are bootstrapped from "app.home" system property 
* [FREEMARKER-151] Ensure that build and and examples are running on Windows
* [FREEMARKER-147] Complete Maven site documentation
* [FREEMARKER-127] Site build fails with missing "org/apache/maven/doxia/siterenderer/DocumentContent"

### Internal
* [FREEMARKER-174] Don't expose "DataSources" in the FreeMarker context
* [FREEMARKER-172] Refactor DataSourceFactory
* [FREEMARKER-164] Use default unsafe FreeMarker configuration
* [FREEMARKER-153] FreeMarker Generator release preparations
* [FREEMARKER-168] Upgrade dependencies of freemarker-generator

[FREEMARKER-127]: https://issues.apache.org/jira/browse/FREEMARKER-127
[FREEMARKER-128]: https://issues.apache.org/jira/browse/FREEMARKER-128
[FREEMARKER-129]: https://issues.apache.org/jira/browse/FREEMARKER-129
[FREEMARKER-134]: https://issues.apache.org/jira/browse/FREEMARKER-134
[FREEMARKER-135]: https://issues.apache.org/jira/browse/FREEMARKER-135
[FREEMARKER-136]: https://issues.apache.org/jira/browse/FREEMARKER-136
[FREEMARKER-138]: https://issues.apache.org/jira/browse/FREEMARKER-138
[FREEMARKER-139]: https://issues.apache.org/jira/browse/FREEMARKER-139
[FREEMARKER-142]: https://issues.apache.org/jira/browse/FREEMARKER-142
[FREEMARKER-144]: https://issues.apache.org/jira/browse/FREEMARKER-144
[FREEMARKER-146]: https://issues.apache.org/jira/browse/FREEMARKER-146
[FREEMARKER-147]: https://issues.apache.org/jira/browse/FREEMARKER-147
[FREEMARKER-148]: https://issues.apache.org/jira/browse/FREEMARKER-148
[FREEMARKER-149]: https://issues.apache.org/jira/browse/FREEMARKER-149
[FREEMARKER-151]: https://issues.apache.org/jira/browse/FREEMARKER-151
[FREEMARKER-153]: https://issues.apache.org/jira/browse/FREEMARKER-153
[FREEMARKER-155]: https://issues.apache.org/jira/browse/FREEMARKER-155
[FREEMARKER-156]: https://issues.apache.org/jira/browse/FREEMARKER-156
[FREEMARKER-161]: https://issues.apache.org/jira/browse/FREEMARKER-161
[FREEMARKER-163]: https://issues.apache.org/jira/browse/FREEMARKER-163
[FREEMARKER-164]: https://issues.apache.org/jira/browse/FREEMARKER-164
[FREEMARKER-168]: https://issues.apache.org/jira/browse/FREEMARKER-168
[FREEMARKER-172]: https://issues.apache.org/jira/browse/FREEMARKER-172
[FREEMARKER-173]: https://issues.apache.org/jira/browse/FREEMARKER-173
[FREEMARKER-174]: https://issues.apache.org/jira/browse/FREEMARKER-174
[FREEMARKER-175]: https://issues.apache.org/jira/browse/FREEMARKER-175
[FREEMARKER-176]: https://issues.apache.org/jira/browse/FREEMARKER-176
[FREEMARKER-181]: https://issues.apache.org/jira/browse/FREEMARKER-181
[FREEMARKER-182]: https://issues.apache.org/jira/browse/FREEMARKER-182
[FREEMARKER-188]: https://issues.apache.org/jira/browse/FREEMARKER-188
[FREEMARKER-195]: https://issues.apache.org/jira/browse/FREEMARKER-195

