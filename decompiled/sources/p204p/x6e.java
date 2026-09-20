package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x6e extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sag0 f258646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6e(sag0 sag0Var, int i) {
        super(0);
        this.f258645a = i;
        this.f258646b = sag0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f258645a) {
            case 0:
                return this.f258646b.mo24514e();
            case 1:
                yt91 yt91VarM96903c = this.f258646b.f207208b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("change_product_btn", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var.m87248a();
            case 2:
                yt91 yt91VarM96903c2 = this.f258646b.f207208b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("billing_card", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = zt91VarM94607a2;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var2.m87248a();
            case 3:
                yt91 yt91VarM96903c3 = this.f258646b.f207208b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("billing_card", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("legal_checkbox_container", null, null, null, null));
                yt91VarM96903c4.f276056j = true;
                zt91 zt91VarM94607a3 = yt91VarM96903c4.m94607a();
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = zt91VarM94607a3;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var3.m87248a();
            case 4:
                yt91 yt91VarM96903c5 = this.f258646b.f207208b.m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("change_country_cta", null, null, null, null));
                yt91VarM96903c5.f276056j = true;
                zt91 zt91VarM94607a4 = yt91VarM96903c5.m94607a();
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = zt91VarM94607a4;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var4.m87248a();
            case 5:
                yt91 yt91VarM96903c6 = this.f258646b.f207208b.m96903c();
                yt91VarM96903c6.f276055i.add(new bu91("billing_unavailable_card", null, null, null, null));
                yt91VarM96903c6.f276056j = true;
                zt91 zt91VarM94607a5 = yt91VarM96903c6.m94607a();
                nu91 nu91Var5 = new nu91();
                nu91Var5.f248107a = zt91VarM94607a5;
                nu91Var5.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var5.m87248a();
            default:
                yt91 yt91VarM96903c7 = this.f258646b.f207208b.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("billing_unavailable_card", null, null, null, null));
                yt91VarM96903c7.f276056j = true;
                yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                yt91VarM96903c8.f276055i.add(new bu91("billing_unavailable_btn", null, null, null, null));
                yt91VarM96903c8.f276056j = true;
                zt91 zt91VarM94607a6 = yt91VarM96903c8.m94607a();
                nu91 nu91Var6 = new nu91();
                nu91Var6.f248107a = zt91VarM94607a6;
                nu91Var6.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var6.m87248a();
        }
    }
}
