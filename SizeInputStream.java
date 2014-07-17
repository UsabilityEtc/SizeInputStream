import java.io.*;

/**
 * The SizeInputStream class enables reading progress to be monitored when
 * the number of bytes to be read can be determined from sources other
 * than an InputStream object, such as from a URLConnection object.
 * 
 * @author	Jeffrey Morgan
 */
public class SizeInputStream extends InputStream {
	private final InputStream in;
	private final int size;
	private int bytesRead = 0;

	public SizeInputStream(final InputStream in, final int size) {
		this.in = in;
		this.size = size;
	}

	@Override
	public int available() {
		return size - bytesRead;
	}

	@Override
	public int read() throws IOException {
		int b = in.read();
		if (b != -1) {
			bytesRead++;
		}
		return b;
	}

	@Override
	public int read(final byte[] b) throws IOException {
		int read = in.read(b);
		bytesRead += read;
		return read;
	}

	@Override
	public int read(final byte[] b, final int off, final int len) throws IOException {
		int read = in.read(b, off, len);
		bytesRead += read;
		return read;
	}
}
