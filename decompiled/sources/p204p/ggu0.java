package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class ggu0 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hgu0 f79748b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggu0(hgu0 hgu0Var, int i) {
        super(4);
        this.f79747a = i;
        this.f79748b = hgu0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f79747a) {
            case 0:
                ((Number) obj3).intValue();
                return new geg0(this.f79748b.f91220b);
            default:
                fgu0 fgu0Var = (fgu0) obj2;
                egu0 egu0Var = (egu0) obj4;
                zt91 zt91Var = ((geg0) obj).f79118a;
                int i = fgu0Var.f69402b;
                boolean zEquals = egu0Var.equals(cgu0.f37811a);
                nau nauVar = nau.f152117a;
                if (zEquals) {
                    int iM38547C = edb.m38547C(i);
                    if (iM38547C == 0) {
                        String str = fgu0Var.f69401a;
                        yt91 yt91VarM96903c = zt91Var.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("message", str, null, null, null));
                        yt91VarM96903c.f276056j = false;
                        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                        yt91VarM96903c2.f276055i.add(new bu91("reactions_button", null, null, null, null));
                        yt91VarM96903c2.f276056j = false;
                        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                    if (iM38547C == 1) {
                        String str2 = fgu0Var.f69401a;
                        yt91 yt91VarM96903c3 = zt91Var.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("shareable_card", str2, null, null, null));
                        yt91VarM96903c3.f276056j = true;
                        yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                        yt91VarM96903c4.f276055i.add(new bu91("reactions_button", null, null, null, null));
                        yt91VarM96903c4.f276056j = false;
                        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                    if (iM38547C == 2) {
                        gug0 gug0Var = (gug0) this.f79748b.f91225g.getValue();
                        gug0Var.getClass();
                        yt91 yt91VarM96903c5 = gug0Var.f84470a.m96903c();
                        yt91VarM96903c5.f276055i.add(new bu91("reactions_button", null, null, null, null));
                        yt91VarM96903c5.f276056j = false;
                        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c5.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                    if (iM38547C != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (!(egu0Var instanceof dgu0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iM38547C2 = edb.m38547C(i);
                    if (iM38547C2 == 0) {
                        String str3 = fgu0Var.f69401a;
                        yt91 yt91VarM96903c6 = zt91Var.m96903c();
                        yt91VarM96903c6.f276055i.add(new bu91("message", str3, null, null, null));
                        yt91VarM96903c6.f276056j = false;
                        yt91 yt91VarM96903c7 = yt91VarM96903c6.m94607a().m96903c();
                        yt91VarM96903c7.f276055i.add(new bu91("reactions_button", null, null, null, null));
                        yt91VarM96903c7.f276056j = false;
                        return new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nauVar), yt91VarM96903c7.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                    if (iM38547C2 == 1) {
                        String str4 = fgu0Var.f69401a;
                        yt91 yt91VarM96903c8 = zt91Var.m96903c();
                        yt91VarM96903c8.f276055i.add(new bu91("shareable_card", str4, null, null, null));
                        yt91VarM96903c8.f276056j = true;
                        yt91 yt91VarM96903c9 = yt91VarM96903c8.m94607a().m96903c();
                        yt91VarM96903c9.f276055i.add(new bu91("reactions_button", null, null, null, null));
                        yt91VarM96903c9.f276056j = false;
                        return new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nauVar), yt91VarM96903c9.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                    if (iM38547C2 != 2 && iM38547C2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return null;
        }
    }
}
