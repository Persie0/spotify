package p204p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class fhc0 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f69621a = true;

    /* JADX INFO: renamed from: b */
    public volatile int f69622b = 1;

    /* JADX INFO: renamed from: c */
    public final ehc0 f69623c;

    /* JADX INFO: renamed from: d */
    public final r46 f69624d;

    public fhc0(r46 r46Var, LinkedHashMap linkedHashMap) {
        this.f69624d = r46Var;
        this.f69623c = new ehc0(this, linkedHashMap);
    }

    /* JADX INFO: renamed from: i */
    public static fhc0 m41653i() {
        return new fhc0(new r46(16), new LinkedHashMap());
    }

    /* JADX INFO: renamed from: a */
    public final ehc0 m41654a() {
        new LinkedHashMap();
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m41655b() {
        new fhc0(this.f69624d, ihc0.m50610d(m41657d()));
    }

    /* JADX INFO: renamed from: c */
    public final void m41656c() {
        if (!this.f69621a) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Map m41657d() {
        if (this.f69622b == 2) {
            synchronized (this) {
                try {
                    if (this.f69622b == 2) {
                        m41654a();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableMap(this.f69623c);
    }

    /* JADX INFO: renamed from: e */
    public final ehc0 m41658e() {
        if (this.f69622b != 1) {
            if (this.f69622b == 2) {
                m41654a();
                throw null;
            }
            this.f69622b = 1;
        }
        return this.f69623c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fhc0) {
            return ihc0.m50611g(m41657d(), ((fhc0) obj).m41657d());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m41659f() {
        return this.f69621a;
    }

    /* JADX INFO: renamed from: g */
    public final void m41660g() {
        this.f69621a = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m41661h(fhc0 fhc0Var) {
        m41658e().putAll(ihc0.m50610d(fhc0Var.m41657d()));
    }

    public final int hashCode() {
        return ihc0.m50608b(m41657d());
    }
}
