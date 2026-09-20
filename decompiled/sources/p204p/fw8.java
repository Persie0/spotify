package p204p;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class fw8 implements cw8 {

    /* JADX INFO: renamed from: i */
    public static final AtomicLong f74016i = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: a */
    public final yt8 f74017a;

    /* JADX INFO: renamed from: b */
    public final c9k f74018b;

    /* JADX INFO: renamed from: c */
    public final cv8 f74019c;

    /* JADX INFO: renamed from: d */
    public final long f74020d = f74016i.getAndIncrement();

    /* JADX INFO: renamed from: e */
    public final zv41 f74021e;

    /* JADX INFO: renamed from: f */
    public final kmx f74022f;

    /* JADX INFO: renamed from: g */
    public boolean f74023g;

    /* JADX INFO: renamed from: h */
    public boolean f74024h;

    public fw8(yt8 yt8Var, c9k c9kVar, cv8 cv8Var) {
        this.f74017a = yt8Var;
        this.f74018b = c9kVar;
        this.f74019c = cv8Var;
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f74021e = zv41VarM52819d;
        this.f74022f = b0g1.m27791m(zv41VarM52819d);
    }

    /* JADX INFO: renamed from: a */
    public final void m42953a() {
        if (this.f74024h) {
            return;
        }
        kk40.m56680v(this.f74018b, null);
        this.f74024h = true;
        this.f74019c.invoke(this);
    }

    public final String toString() {
        return edb.m38562k(this.f74020d, "BannerTicketImpl[id=", "]");
    }
}
