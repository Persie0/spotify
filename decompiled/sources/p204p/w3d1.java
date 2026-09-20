package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class w3d1 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247566a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y3d1 f247567b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f247568c;

    public /* synthetic */ w3d1(y3d1 y3d1Var, int i, int i2) {
        this.f247566a = i2;
        this.f247567b = y3d1Var;
        this.f247568c = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f247566a) {
            case 0:
                ((kl00) this.f247567b.f268898c).m56793a(new g6d1(null, 1, ywg1.m94799k(this.f247568c, Long.valueOf(((ky71) obj).f127716c)), "authenticationSucceeded"));
                break;
            case 1:
                this.f247567b.m92754c(this.f247568c, (Throwable) obj);
                break;
            default:
                ((kl00) this.f247567b.f268898c).m56793a(new g6d1(null, 1, ywg1.m94799k(this.f247568c, null), "authenticationStarted"));
                break;
        }
    }

    public w3d1(y3d1 y3d1Var, String str, int i) {
        this.f247566a = 2;
        this.f247567b = y3d1Var;
        this.f247568c = i;
    }
}
