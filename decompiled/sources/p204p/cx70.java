package p204p;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class cx70 {

    /* JADX INFO: renamed from: a */
    public final Object f42944a = new Object();

    /* JADX INFO: renamed from: b */
    public final String f42945b;

    /* JADX INFO: renamed from: c */
    public volatile Logger f42946c;

    public cx70(Class cls) {
        this.f42945b = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m34241a() {
        Logger logger = this.f42946c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f42944a) {
            try {
                Logger logger2 = this.f42946c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f42945b);
                this.f42946c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
