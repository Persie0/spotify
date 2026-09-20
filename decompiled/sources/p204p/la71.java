package p204p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes6.dex */
public final class la71 implements k950 {

    /* JADX INFO: renamed from: a */
    public final Flowable f131290a;

    /* JADX INFO: renamed from: b */
    public final voi f131291b;

    /* JADX INFO: renamed from: c */
    public final oyp0 f131292c;

    /* JADX INFO: renamed from: d */
    public final whp f131293d;

    /* JADX INFO: renamed from: e */
    public final xuk f131294e;

    /* JADX INFO: renamed from: f */
    public di41 f131295f;

    public la71(Flowable flowable, voi voiVar, oyp0 oyp0Var, whp whpVar, c9k c9kVar) {
        this.f131290a = flowable;
        this.f131291b = voiVar;
        this.f131292c = oyp0Var;
        this.f131293d = whpVar;
        this.f131294e = c9kVar;
    }

    @Override // p204p.k950
    /* JADX INFO: renamed from: b */
    public final void mo41050b(String str, m921 m921Var) {
        if (this.f131295f != null) {
            throw new IllegalStateException("This interaction is already in progress");
        }
        this.f131295f = x0h1.m89578u(this.f131294e, null, 0, new h431(this, str, m921Var, (fbk) null, 26), 3);
    }

    @Override // p204p.m950
    public final void cancel() {
        di41 di41Var = this.f131295f;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }
}
