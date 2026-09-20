package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z011 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f277933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a111 f277934b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z011(a111 a111Var, int i) {
        super(4);
        this.f277933a = i;
        this.f277934b = a111Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f277933a) {
            case 0:
                ((Number) obj3).intValue();
                eeh0 eeh0Var = this.f277934b.f11235c;
                eeh0Var.getClass();
                return new deh0(eeh0Var);
            default:
                if (((s011) obj4) instanceof p011) {
                    a111 a111Var = this.f277934b;
                    kv91 kv91Var = a111Var.f11236d;
                    eeh0 eeh0Var2 = a111Var.f11235c;
                    eeh0Var2.getClass();
                    yt91 yt91VarM96903c = eeh0Var2.f58800b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("error_view", null, null, null, null));
                    yt91VarM96903c.f276056j = true;
                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                    nu91 nu91Var = new nu91();
                    nu91Var.f248107a = zt91VarM94607a;
                    nu91Var.f248108b = eeh0Var2.f58799a;
                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                }
                return null;
        }
    }
}
