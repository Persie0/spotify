package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class il3 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ li0 f103275b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ il3(li0 li0Var, int i) {
        super(4);
        this.f103274a = i;
        this.f103275b = li0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f103274a) {
            case 0:
                hl3 hl3Var = (hl3) obj;
                ((Number) obj3).intValue();
                i8g0 i8g0Var = (i8g0) this.f103275b.f133682d;
                int i = hl3Var.f92598a;
                n0z0 n0z0Var = hl3Var.f92599b;
                String str = n0z0Var.f149208c;
                int iM38547C = edb.m38547C(n0z0Var.f149206a);
                if (iM38547C == 0) {
                    return new sag0(new sag0(new tag0(i8g0Var)), Integer.valueOf(i), str, 1);
                }
                if (iM38547C == 1) {
                    return new sag0(new sag0(new tag0(i8g0Var)), Integer.valueOf(i), str, 0);
                }
                if (iM38547C == 2) {
                    return new sag0(new sag0(new tag0(i8g0Var)), Integer.valueOf(i), str, 2);
                }
                throw new NoWhenBranchMatchedException();
            default:
                hl3 hl3Var2 = (hl3) obj2;
                i8g0 i8g0Var2 = (i8g0) this.f103275b.f133682d;
                int i2 = hl3Var2.f92598a;
                n0z0 n0z0Var2 = hl3Var2.f92599b;
                String str2 = n0z0Var2.f149208c;
                if (!((gl3) obj4).equals(gl3.f80986a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iM38547C2 = edb.m38547C(n0z0Var2.f149206a);
                nau nauVar = nau.f152117a;
                if (iM38547C2 == 0) {
                    yt91 yt91VarM96903c = i8g0Var2.f99785b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("content", null, null, null, null));
                    yt91VarM96903c.f276056j = true;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("results", null, null, null, null));
                    yt91VarM96903c2.f276056j = true;
                    zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                    Integer numValueOf = Integer.valueOf(i2);
                    yt91 yt91VarM96903c3 = zt91VarM94607a.m96903c();
                    yt91VarM96903c3.f276055i.add(new bu91("default_item", null, numValueOf, str2, null));
                    yt91VarM96903c3.f276056j = true;
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                if (iM38547C2 == 1) {
                    yt91 yt91VarM96903c4 = i8g0Var2.f99785b.m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("content", null, null, null, null));
                    yt91VarM96903c4.f276056j = true;
                    yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
                    yt91VarM96903c5.f276055i.add(new bu91("results", null, null, null, null));
                    yt91VarM96903c5.f276056j = true;
                    zt91 zt91VarM94607a2 = yt91VarM96903c5.m94607a();
                    Integer numValueOf2 = Integer.valueOf(i2);
                    yt91 yt91VarM96903c6 = zt91VarM94607a2.m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("artist_item", null, numValueOf2, str2, null));
                    yt91VarM96903c6.f276056j = true;
                    return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c6.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                if (iM38547C2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                yt91 yt91VarM96903c7 = i8g0Var2.f99785b.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("content", null, null, null, null));
                yt91VarM96903c7.f276056j = true;
                yt91 yt91VarM96903c8 = yt91VarM96903c7.m94607a().m96903c();
                yt91VarM96903c8.f276055i.add(new bu91("results", null, null, null, null));
                yt91VarM96903c8.f276056j = true;
                zt91 zt91VarM94607a3 = yt91VarM96903c8.m94607a();
                Integer numValueOf3 = Integer.valueOf(i2);
                yt91 yt91VarM96903c9 = zt91VarM94607a3.m96903c();
                yt91VarM96903c9.f276055i.add(new bu91("show_item", null, numValueOf3, str2, null));
                yt91VarM96903c9.f276056j = true;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), yt91VarM96903c9.m94607a(), st91.f213865b, System.currentTimeMillis());
        }
    }
}
