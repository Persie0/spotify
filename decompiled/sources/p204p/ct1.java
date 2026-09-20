package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ct1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f41735b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xq1 f41736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ct1(xq1 xq1Var, gh00 gh00Var) {
        super(0);
        this.f41734a = 1;
        this.f41735b = (qe70) gh00Var;
        this.f41736c = xq1Var;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v8, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v12, types: [p.gh00, p.qe70] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f41734a) {
            case 0:
                xq1 xq1Var = this.f41736c;
                kv91 kv91Var = xq1Var.f264839a;
                q8g0 q8g0Var = xq1Var.f264840b;
                q8g0Var.getClass();
                yt91 yt91VarM96903c = q8g0Var.f186318a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("cancel_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                this.f41735b.invoke(rp1.f201397a);
                break;
            case 1:
                xq1 xq1Var2 = this.f41736c;
                kv91 kv91Var2 = xq1Var2.f264839a;
                q8g0 q8g0Var2 = xq1Var2.f264840b;
                q8g0Var2.getClass();
                yt91 yt91VarM96903c2 = q8g0Var2.f186318a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("toolbar", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("create_playlist", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f41735b.invoke(new sp1(kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null)));
                break;
            default:
                xq1 xq1Var3 = this.f41736c;
                kv91 kv91Var3 = xq1Var3.f264839a;
                q8g0 q8g0Var3 = xq1Var3.f264840b;
                q8g0Var3.getClass();
                yt91 yt91VarM96903c4 = q8g0Var3.f186318a.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("filter_container", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
                yt91VarM96903c5.f276055i.add(new bu91("sort_button", null, null, null, null));
                yt91VarM96903c5.f276056j = false;
                kv91Var3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c5.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                this.f41735b.invoke(dq1.f51789a);
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ct1(xq1 xq1Var, gh00 gh00Var, int i) {
        super(0);
        this.f41734a = i;
        switch (i) {
            case 2:
                this.f41736c = xq1Var;
                this.f41735b = (qe70) gh00Var;
                super(0);
                break;
            default:
                this.f41736c = xq1Var;
                this.f41735b = (qe70) gh00Var;
                break;
        }
    }
}
