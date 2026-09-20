package p204p;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i6u0 {

    /* JADX INFO: renamed from: a */
    public final wel0 f99334a;

    /* JADX INFO: renamed from: b */
    public volatile Object f99335b;

    public i6u0(wel0 wel0Var) {
        this.f99334a = wel0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m49819a() {
        Object obj;
        Object obj2 = this.f99335b;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f99335b;
                if (obj == null) {
                    obj = new Object();
                    this.f99335b = obj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final String toString() {
        double micros;
        Locale locale = Locale.ROOT;
        synchronized (m49819a()) {
            micros = TimeUnit.SECONDS.toMicros(1L) / ((f531) this).f65928e;
        }
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(micros));
    }
}
