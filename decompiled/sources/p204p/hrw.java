package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public final class hrw implements p8p0 {

    /* JADX INFO: renamed from: a */
    public final r7k f94545a;

    /* JADX INFO: renamed from: b */
    public final msa0 f94546b;

    /* JADX INFO: renamed from: c */
    public final boolean f94547c;

    public hrw(r7k r7kVar, msa0 msa0Var, boolean z) {
        this.f94545a = r7kVar;
        this.f94546b = msa0Var;
        this.f94547c = z;
    }

    @Override // p204p.p8p0
    /* JADX INFO: renamed from: a */
    public final Single mo48412a(h8p0 h8p0Var) {
        int i = 0;
        brw brwVar = new brw(this, i);
        crw crwVar = new crw(this, i);
        int i2 = 0;
        return (Single) h8p0Var.mo25046a(brwVar, crwVar, new h7u(this, 6), new b5p(this, 28), new k9u(this, 6), new i2v(this, 5), new d9p(this, 29), new drw(this, i2), new erw(this), new xqw(this, i2), new yqw(this, i2), new zqw(this, i2), new arw(this, i2));
    }

    /* JADX INFO: renamed from: b */
    public final Single m48413b(eh00 eh00Var) {
        if (this.f94547c) {
            Single singleDefer = Single.defer(new frw(0, eh00Var));
            wj50.m88279p(singleDefer);
            return singleDefer;
        }
        Single singleJust = Single.just(eh00Var.invoke());
        wj50.m88279p(singleJust);
        return singleJust;
    }
}
