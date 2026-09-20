package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class m111 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f138793a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p111 f138794b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m111(p111 p111Var, int i) {
        super(4);
        this.f138793a = i;
        this.f138794b = p111Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f138793a) {
            case 0:
                ((Number) obj3).intValue();
                vch0 vch0Var = this.f138794b.f172919c;
                vch0Var.getClass();
                return new ieh0(vch0Var);
            default:
                if (((f111) obj4) instanceof d111) {
                    p111 p111Var = this.f138794b;
                    kv91 kv91Var = p111Var.f172920d;
                    vch0 vch0Var2 = p111Var.f172919c;
                    yt91 yt91VarM96903c = vch0Var2.f240135c.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("error_view", null, null, null, null));
                    yt91VarM96903c.f276056j = true;
                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                    nu91 nu91Var = new nu91();
                    nu91Var.f248107a = zt91VarM94607a;
                    nu91Var.f248108b = vch0Var2.f240134b;
                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                }
                return null;
        }
    }
}
