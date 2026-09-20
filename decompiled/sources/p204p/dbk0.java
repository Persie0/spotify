package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dbk0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gbk0 f47326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dbk0(gbk0 gbk0Var, int i) {
        super(1);
        this.f47325a = i;
        this.f47326b = gbk0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        int i = this.f47325a;
        gbk0 gbk0Var = this.f47326b;
        switch (i) {
            case 0:
                gbk0Var.f78331a.f57957g.invoke(Integer.valueOf(((Number) obj).intValue()));
                return w2a1.f247311a;
            default:
                ((Number) obj).intValue();
                yt91 yt91VarM96903c = gbk0Var.f78344i.f67285a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("horizontal_layout", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                st91 st91Var = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a));
        }
    }
}
