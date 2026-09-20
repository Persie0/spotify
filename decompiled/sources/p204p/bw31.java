package p204p;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class bw31 implements aw31 {

    /* JADX INFO: renamed from: a */
    public final String f31520a;

    /* JADX INFO: renamed from: b */
    public final nok0 f31521b;

    /* JADX INFO: renamed from: c */
    public final long f31522c;

    /* JADX INFO: renamed from: d */
    public final iaz f31523d;

    /* JADX INFO: renamed from: e */
    public final boolean f31524e;

    /* JADX INFO: renamed from: f */
    public cw31 f31525f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f31526g;

    /* JADX INFO: renamed from: h */
    public final String f31527h;

    /* JADX INFO: renamed from: i */
    public final int f31528i;

    public bw31(String str, nok0 nok0Var, long j, long j2, iaz iazVar, String str2, int i) {
        long jM65241a = (i & 4) != 0 ? nok0Var.m65241a() : j;
        long j3 = (i & 8) != 0 ? 0L : j2;
        iaz iazVar2 = (i & 16) != 0 ? iaz.f100375O0 : iazVar;
        String str3 = (i & 32) != 0 ? "" : str2;
        boolean z = (i & 64) == 0;
        this.f31520a = str;
        this.f31521b = nok0Var;
        this.f31522c = jM65241a;
        this.f31523d = iazVar2;
        this.f31524e = z;
        this.f31525f = new cw31(UUID.randomUUID(), str, jM65241a, j3, new ConcurrentHashMap());
        this.f31526g = new AtomicBoolean(false);
        String strM38566o = z ? edb.m38566o("oops:", str3, ".", str) : "";
        this.f31527h = strM38566o;
        this.f31528i = z ? iazVar2.m50109b(strM38566o) : 0;
    }

    @Override // p204p.aw31
    /* JADX INFO: renamed from: a */
    public final void mo27275a(Long l) {
        if (this.f31526g.compareAndSet(false, true)) {
            if (this.f31524e) {
                this.f31523d.m50110c(this.f31527h, this.f31528i);
            }
            if (l != null) {
                this.f31525f = cw31.m34082a(this.f31525f, l.longValue());
            } else {
                this.f31525f = cw31.m34082a(this.f31525f, this.f31521b.m65241a());
            }
        }
    }
}
