package p204p;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes2.dex */
public final class if4 extends Handler {

    /* JADX INFO: renamed from: a */
    public static final if4 f101644a = new if4();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        CopyOnWriteArraySet copyOnWriteArraySet = hf4.f90591a;
        hf4.m47323a(cct.m32316o(logRecord), logRecord.getLoggerName(), logRecord.getMessage(), logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
