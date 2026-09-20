package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: a */
    public final int f971a;

    public DataSourceException(int i) {
        this.f971a = i;
    }

    public DataSourceException(int i, Exception exc) {
        super(exc);
        this.f971a = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.f971a = i;
    }

    public DataSourceException(int i, Exception exc, String str) {
        super(str, exc);
        this.f971a = i;
    }
}
