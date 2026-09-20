package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nef0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oef0 f152983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nef0(oef0 oef0Var, int i) {
        super(0);
        this.f152982a = i;
        this.f152983b = oef0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f152982a;
        oef0 oef0Var = this.f152983b;
        switch (i) {
            case 0:
                yt91 yt91VarM96903c = ((ahg0) oef0Var.f164421T0).f15692b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("track_information", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                st91 st91Var = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a));
            default:
                yt91 yt91VarM96903c2 = ((ahg0) oef0Var.f164421T0).f15692b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("main_controls", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                st91 st91Var2 = st91.f213865b;
                return new st91(fr0.m42467k(zt91VarM94607a2));
        }
    }
}
