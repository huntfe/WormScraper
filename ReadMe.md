# ReadMe

This is a scraper that will take the text of the web-serial Worm by Wildbow from https://parahumans.wordpress.com and consolidate it in an e pub format, or something. I haven't thought this through very much.

**Disclaimer**: Obviously I don't own any of the work by Wildbow. I can barely write this program, there's no way I'm writing Worm.

I am using Jsoup to scrape the site, https://jsoup.org/

## TODO:

### Structure of Program

- ~~Go to https://parahumans.wordpress.com~~ Done, way too many times
- ~~Find the first entry~~ Done
- ~~Find and copy the heading~~ Done
	- ~~Name and number of arc~~ Done
	- ~~Number of entry in arc~~ Done
- ~~Find the content~~
- ~~Copy the content to a file that has been created~~
	- The file:
		- HTML to start?
		- ~~Convert to something like markdown after all the entries are there~~
		- Convert from html to epub, then use kindle keygen(?) to put it on kindle
		- Convert to the format that allows it to be put on kindle
- ~~Click on the next chapter button~~
- Get the link to the next page from the button on the previous page
- Copy the content and append it to the file