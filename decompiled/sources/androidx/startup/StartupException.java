package androidx.startup;

/* JADX INFO: loaded from: classes3.dex */
public final class StartupException extends RuntimeException {
    public StartupException() {
        super("Context cannot be null");
    }

    public StartupException(Throwable th) {
        super(th);
    }
}
