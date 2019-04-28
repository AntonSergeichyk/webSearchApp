**Web Search Application**

**About**

The Web Search Application is a command-line application which performs a web search using a search engine (Yandex) and returns a title and URL of the first search result.

**Tools/libraries**

The application uses the jsoup library. It's a Java library for working with HTML. It provides an API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods. Unlike working with other web parsers, it provides convenient methods that eliminate the manual using regular expressions. In the Web Search Application also was used HTTP client library which provides a handy API for working with URIs, such as creating and modifying URLs and URL parameters with a builder pattern.

**Installation guideline (for windows)**

-to install the Web Search Application, you need to download it from a remote repository via the link using a third-party application (Git Bash...) or download a ZIP-archive, in the second case you need to unpack the archive after downloading; 
-you should install apache-maven (link: https://maven.apache.org/);
-to download the Lines Matcher, go to the root directory of the project from the command line (.../webSearchApplication) and type the command (mvn clean package exec:java);
-for correct launching of the application, you must set the UTF-8 encoding command (chcp 65001).
-you can also run the application in any development environment.

**email**

SergeichykAnton@gmail.com