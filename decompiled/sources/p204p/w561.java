package p204p;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface w561 extends Closeable {
    String getDatabaseName();

    u561 getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
