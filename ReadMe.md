#ReadMe

This is a scraper that will take the text of the web-serial Worm by Wildbow from https://parahumans.wordpress.com and consolidate it in an epub format, or something. I haven't thought this through very much.

##TODO:

###Structure of Program

- Go to https://parahumans.wordpress.com
- Find the first entry
- Find and copy the heading
	- Name and number of arc
	- Number of entry in arc
- Find the content
- Copy the content to a file that has been created
	- The file:
		- HTML to start?
		- Convert to something like markdown after all the entries are there
		- Convert to the format that allows it to be put on kindle
- Click on the next chapter button
- Copy the content and append it to the file