package androidx.media3.datasource;

import java.util.Map;
import p204p.s571;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: c */
    public final int f973c;

    /* JADX INFO: renamed from: d */
    public final String f974d;

    /* JADX INFO: renamed from: e */
    public final Map f975e;

    /* JADX INFO: renamed from: f */
    public final byte[] f976f;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, DataSourceException dataSourceException, Map map, byte[] bArr) {
        super(s571.m77246e(i, "Response code: "), dataSourceException, 2004);
        this.f973c = i;
        this.f974d = str;
        this.f975e = map;
        this.f976f = bArr;
    }
}
