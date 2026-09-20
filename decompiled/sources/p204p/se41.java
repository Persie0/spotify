package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class se41 {

    /* JADX INFO: renamed from: a */
    public final zrr0 f208194a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f208195b;

    /* JADX INFO: renamed from: c */
    public final eod0 f208196c;

    /* JADX INFO: renamed from: d */
    public final dbw0 f208197d;

    /* JADX INFO: renamed from: e */
    public final vzx f208198e;

    /* JADX INFO: renamed from: f */
    public final prd0 f208199f;

    /* JADX INFO: renamed from: g */
    public ha80 f208200g;

    /* JADX INFO: renamed from: i */
    public volatile boolean f208202i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f208203j;

    /* JADX INFO: renamed from: k */
    public final iwr f208204k = new iwr();

    /* JADX INFO: renamed from: h */
    public final fpd0 f208201h = new fpd0();

    public se41(zrr0 zrr0Var, Scheduler scheduler, dbw0 dbw0Var, eod0 eod0Var, vzx vzxVar, prd0 prd0Var) {
        this.f208194a = zrr0Var;
        this.f208195b = scheduler;
        this.f208196c = eod0Var;
        this.f208197d = dbw0Var;
        this.f208198e = vzxVar;
        this.f208199f = prd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final rg50 m77883a() {
        return m77884b().m46916c();
    }

    /* JADX INFO: renamed from: b */
    public final ha80 m77884b() {
        if (this.f208200g == null) {
            ha80 ha80VarM96773k = this.f208194a.m96773k();
            this.f208200g = ha80VarM96773k;
            Logger.m3965a("MediaSession has been created %s", ha80VarM96773k.m46919f());
            this.f208201h.m42331b(this.f208200g);
        }
        return this.f208200g;
    }

    /* JADX INFO: renamed from: c */
    public final void m77885c() {
        ha80 ha80Var;
        Logger.m3965a("MediaSession release if possible. MBS is bound to MS: %s Background scope has entered: %s", Boolean.valueOf(this.f208202i), Boolean.valueOf(this.f208203j));
        if (this.f208202i || this.f208203j || (ha80Var = this.f208200g) == null) {
            return;
        }
        rg50 rg50VarM46916c = ha80Var.m46916c();
        rg50VarM46916c.release();
        Logger.m3965a("MediaSession has been released %s", rg50VarM46916c.mo53385a());
        this.f208201h.m42331b(null);
        this.f208200g = null;
    }
}
