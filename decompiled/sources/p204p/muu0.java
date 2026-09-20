package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class muu0 extends oa31 {

    /* JADX INFO: renamed from: e */
    public final gh00 f147439e;

    /* JADX INFO: renamed from: f */
    public int f147440f;

    public muu0(long j, sa31 sa31Var, gh00 gh00Var) {
        super(j, sa31Var);
        this.f147439e = gh00Var;
        this.f147440f = 1;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: c */
    public final void mo28814c() {
        if (this.f163203c) {
            return;
        }
        mo28822l();
        this.f163203c = true;
        synchronized (ua31.f228351c) {
            m66516o();
        }
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: e */
    public final gh00 mo28816e() {
        return this.f147439e;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: f */
    public final boolean mo28817f() {
        return true;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: i */
    public final gh00 mo28820i() {
        return null;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: k */
    public final void mo28821k() {
        this.f147440f++;
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: l */
    public final void mo28822l() {
        int i = this.f147440f - 1;
        this.f147440f = i;
        if (i == 0) {
            m66514a();
        }
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: n */
    public final void mo28824n(vw41 vw41Var) {
        u9y0 u9y0Var = ua31.f228349a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: u */
    public final oa31 mo28828u(gh00 gh00Var) {
        ua31.m82667c(this);
        return new tfj0(this.f163202b, this.f163201a, ua31.m82675k(gh00Var, this.f147439e, true), this);
    }

    @Override // p204p.oa31
    /* JADX INFO: renamed from: m */
    public final void mo28823m() {
    }
}
