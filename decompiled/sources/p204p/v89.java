package p204p;

import com.spotify.betamax.player.offline.exception.BetamaxDownloadException;
import com.spotify.messages.BetamaxDownloadSession;

/* JADX INFO: loaded from: classes5.dex */
public final class v89 implements s89 {

    /* JADX INFO: renamed from: a */
    public final qre0 f238434a;

    /* JADX INFO: renamed from: b */
    public final c8s f238435b;

    /* JADX INFO: renamed from: c */
    public final ybu0 f238436c;

    /* JADX INFO: renamed from: d */
    public final c9k f238437d;

    /* JADX INFO: renamed from: e */
    public final nuu0 f238438e;

    /* JADX INFO: renamed from: f */
    public String f238439f;

    /* JADX INFO: renamed from: g */
    public long f238440g;

    /* JADX INFO: renamed from: h */
    public long f238441h;

    /* JADX INFO: renamed from: i */
    public String f238442i;

    public v89(qre0 qre0Var, c8s c8sVar, gcu0 gcu0Var, luk lukVar) {
        this.f238434a = qre0Var;
        this.f238435b = c8sVar;
        ybu0 ybu0Var = new ybu0(new mqj0(false, false));
        this.f238436c = ybu0Var;
        c9k c9kVarM56661c = kk40.m56661c(lukVar);
        this.f238437d = c9kVarM56661c;
        this.f238438e = bzf1.m31029u(new vjz(gcu0Var.mo44322d(), new C2102lt(this, (fbk) null, 19), 2), c9kVarM56661c, hf11.f90581a, ybu0Var);
        this.f238439f = "unknown";
        this.f238442i = "";
    }

    @Override // p204p.s89
    /* JADX INFO: renamed from: a */
    public final void mo26718a(g6s g6sVar, long j, long j2) {
        this.f238434a.m73616a(m84911h(g6sVar, j, 3, j2));
        kk40.m56680v(this.f238437d, null);
    }

    @Override // p204p.s89
    /* JADX INFO: renamed from: b */
    public final void mo77465b(String str) {
        if (str == null) {
            str = "";
        }
        this.f238442i = str;
    }

    @Override // p204p.s89
    /* JADX INFO: renamed from: c */
    public final void mo26719c(g6s g6sVar, long j, long j2) {
        this.f238434a.m73616a(m84911h(g6sVar, j, 1, j2));
        kk40.m56680v(this.f238437d, null);
    }

    @Override // p204p.s89
    /* JADX INFO: renamed from: d */
    public final void mo26720d(long j) {
        this.f238440g = j;
        this.f238439f = axf1.m27404s((acu0) this.f238438e.f158717a.getValue());
    }

    @Override // p204p.s89
    /* JADX INFO: renamed from: e */
    public final void mo26721e(g6s g6sVar, long j, long j2) {
        this.f238434a.m73616a(m84911h(g6sVar, j, 2, j2));
        kk40.m56680v(this.f238437d, null);
    }

    @Override // p204p.s89
    /* JADX INFO: renamed from: f */
    public final void mo26722f(g6s g6sVar, long j) {
        if (this.f238441h == 0) {
            this.f238441h = j;
        }
    }

    @Override // p204p.s89
    /* JADX INFO: renamed from: g */
    public final void mo26723g(g6s g6sVar, long j, BetamaxDownloadException betamaxDownloadException, long j2) {
        this.f238434a.m73616a(m84911h(g6sVar, j, 4, j2));
        kk40.m56680v(this.f238437d, null);
    }

    /* JADX INFO: renamed from: h */
    public final BetamaxDownloadSession m84911h(g6s g6sVar, long j, int i, long j2) {
        String str;
        long j3 = j2 - this.f238440g;
        long j4 = (j - this.f238441h) / ((long) 1000);
        long j5 = this.f238435b.f35309a;
        String strM27404s = axf1.m27404s((acu0) this.f238438e.f158717a.getValue());
        u89 u89VarM13616x = BetamaxDownloadSession.m13616x();
        u89VarM13616x.m82557s();
        u89VarM13616x.m82559u(g6sVar.f77101a.f100067a);
        u89VarM13616x.m82562x(g6sVar.f77102b);
        u89VarM13616x.m82558t(j4);
        u89VarM13616x.m82560v(j3);
        if (i == 1) {
            str = "completed";
        } else if (i == 2) {
            str = "cancelled";
        } else if (i == 3) {
            str = "stopped";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "error";
        }
        u89VarM13616x.m82561w(str);
        u89VarM13616x.m82554m(j5);
        u89VarM13616x.m82556r(this.f238439f);
        u89VarM13616x.m82555q(strM27404s);
        u89VarM13616x.m82563y(this.f238442i);
        return (BetamaxDownloadSession) u89VarM13616x.build();
    }
}
