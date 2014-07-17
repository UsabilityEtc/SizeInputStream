Size-Input-Stream
=================

A java.io.InputStream subclass that enables progress monitoring when the number of bytes to be read cannot be determined.

About
-----

Progress bars provide visual feedback on the progress of lengthy tasks, such as reading a stream of bytes stored in a file. In some cases, Java progress monitors cannot be used because the number of bytes that remain to be read is not available from the InputStream object that the bytes are read from. The SizeInputStream class enables reading progress to be monitored when the number of bytes to be read can be determined from sources other than an InputStream object, such as from a URLConnection object.

More Information
----------------

For more information, please read [Monitoring Progress with Size Input Streams](http://usabilityetc.com/articles/size-input-streams/).
