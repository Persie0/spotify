package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kyq implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f127901a;

    /* JADX INFO: renamed from: b */
    public final eh00 f127902b;

    public /* synthetic */ kyq(int i, eh00 eh00Var) {
        this.f127901a = i;
        this.f127902b = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f127901a) {
            case 0:
                return g6f.m43736n1((Iterable) this.f127902b.invoke());
            default:
                bfe0 bfe0Var = (bfe0) this.f127902b.invoke();
                return bfe0Var instanceof tx70 ? ((tx70) bfe0Var).m81881h() : bfe0Var;
        }
    }
}
