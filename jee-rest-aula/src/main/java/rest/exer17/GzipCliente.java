package rest.exer17;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;

public class GzipCliente implements ReaderInterceptor{

	@Override
	public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
		InputStream originalImputStream = context.getInputStream();
		context.setInputStream(new GZIPInputStream(originalImputStream));
		return context.proceed();
	}

}
