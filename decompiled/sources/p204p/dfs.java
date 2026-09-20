package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dfs extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ib31 f48638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f48639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ib31 f48640c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f48641d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jc20 f48642e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ kqi0 f48643f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfs(ib31 ib31Var, int i, ib31 ib31Var2, kqi0 kqi0Var, jc20 jc20Var, kqi0 kqi0Var2) {
        super(0);
        this.f48638a = ib31Var;
        this.f48639b = i;
        this.f48640c = ib31Var2;
        this.f48641d = kqi0Var;
        this.f48642e = jc20Var;
        this.f48643f = kqi0Var2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f48639b;
        Float f = (Float) this.f48638a.get(Integer.valueOf(i));
        Float f2 = (Float) this.f48640c.get(Integer.valueOf(i));
        if (f != null && f2 != null) {
            hfs.m47367b(this.f48641d, this.f48642e, this.f48643f, new C1878fz(f2.floatValue() + f.floatValue()));
        }
        return w2a1.f247311a;
    }
}
