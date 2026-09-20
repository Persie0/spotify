package p204p;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class bg7 {

    /* JADX INFO: renamed from: a */
    public String f26853a = null;

    /* JADX INFO: renamed from: b */
    public Boolean f26854b = null;

    /* JADX INFO: renamed from: a */
    public static String m29047a(String str, Object[] objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX INFO: renamed from: b */
    public qg71 m29048b() {
        String str = this.f26853a;
        return new qg71(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, this.f26854b);
    }

    /* JADX INFO: renamed from: c */
    public void m29049c() {
        this.f26854b = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public void m29050d() {
        Locale locale = Locale.ROOT;
        this.f26853a = "heartbeat-thread-%d";
    }
}
