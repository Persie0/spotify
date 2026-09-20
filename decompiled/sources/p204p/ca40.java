package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ca40 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ da40 f35722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca40(da40 da40Var, int i) {
        super(0);
        this.f35721a = i;
        this.f35722b = da40Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f35721a) {
            case 0:
                da40 da40Var = this.f35722b;
                kv91 kv91Var = da40Var.f46971a;
                ipg0 ipg0Var = da40Var.f46972b;
                ipg0Var.getClass();
                yt91 yt91VarM96903c = ipg0Var.f104499b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("image", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                return kv91Var.mo57453r(new av91("", "", new dv91("drag", 1), new bv91("move_image", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            case 1:
                da40 da40Var2 = this.f35722b;
                kv91 kv91Var2 = da40Var2.f46971a;
                ipg0 ipg0Var2 = da40Var2.f46972b;
                ipg0Var2.getClass();
                yt91 yt91VarM96903c2 = ipg0Var2.f104499b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("image", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                return kv91Var2.mo57453r(new av91("", "", new dv91("pinch", 1), new bv91("resize_image", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
            default:
                da40 da40Var3 = this.f35722b;
                kv91 kv91Var3 = da40Var3.f46971a;
                ipg0 ipg0Var3 = da40Var3.f46972b;
                ipg0Var3.getClass();
                yt91 yt91VarM96903c3 = ipg0Var3.f104499b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("image", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                return kv91Var3.mo57453r(new av91("", "", new dv91("spread", 1), new bv91("resize_image", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
        }
    }
}
