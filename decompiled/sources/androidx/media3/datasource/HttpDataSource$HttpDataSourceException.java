package androidx.media3.datasource;

import com.spotify.searchview.proto.AudioEpisode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p204p.vie1;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: b */
    public final int f972b;

    public HttpDataSource$HttpDataSourceException(int i) {
        super(i == 2000 ? 2001 : i);
        this.f972b = 1;
    }

    /* JADX INFO: renamed from: a */
    public static HttpDataSource$HttpDataSourceException m758a(int i, final IOException iOException) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = AudioEpisode.VIDEO_FORMAT_FIELD_NUMBER;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !vie1.m85612A(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException) { // from class: androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(i2, i, iOException);
    }

    public HttpDataSource$HttpDataSourceException(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.f972b = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(int i, int i2, IOException iOException) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(i, iOException);
        this.f972b = i2;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i) {
        super(i == 2000 ? 2001 : i, iOException, str);
        this.f972b = 1;
    }
}
