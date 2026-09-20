package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class w02 implements ic81 {

    /* JADX INFO: renamed from: a */
    public final ahg0 f246618a;

    public w02(ahg0 ahg0Var) {
        this.f246618a = ahg0Var;
    }

    @Override // p204p.ic81
    /* JADX INFO: renamed from: a */
    public final av91 mo42676a(fc81 fc81Var, String str, am81 am81Var) {
        zt91 zt91Var = this.f246618a.f15692b;
        long j = am81Var.f17061b;
        long j2 = am81Var.f17060a;
        int iOrdinal = fc81Var.ordinal();
        if (iOrdinal == 0) {
            yt91 yt91VarM96903c = zt91Var.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("cover_art", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            int i = (int) j2;
            int i2 = (int) j;
            dv91 dv91Var = new dv91("swipe", 1);
            String string = str.toString();
            if (string == null) {
                string = "";
            }
            pqm0 pqm0Var = new pqm0("item_to_be_skipped", string);
            String strValueOf = String.valueOf(i);
            if (strValueOf == null) {
                strValueOf = "";
            }
            pqm0 pqm0Var2 = new pqm0("position_ms", strValueOf);
            String strValueOf2 = String.valueOf(i2);
            return new av91("", "", dv91Var, new bv91("skip_to_next", 2, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0("total_content_ms", strValueOf2 != null ? strValueOf2 : ""))), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        yt91 yt91VarM96903c2 = zt91Var.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("cover_art", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
        int i3 = (int) j2;
        int i4 = (int) j;
        dv91 dv91Var2 = new dv91("swipe", 1);
        String string2 = str.toString();
        if (string2 == null) {
            string2 = "";
        }
        pqm0 pqm0Var3 = new pqm0("item_to_be_skipped", string2);
        String strValueOf3 = String.valueOf(i3);
        if (strValueOf3 == null) {
            strValueOf3 = "";
        }
        pqm0 pqm0Var4 = new pqm0("position_ms", strValueOf3);
        String strValueOf4 = String.valueOf(i4);
        return new av91("", "", dv91Var2, new bv91("skip_to_previous", 2, kkc0.m56695h0(pqm0Var3, pqm0Var4, new pqm0("total_content_ms", strValueOf4 != null ? strValueOf4 : ""))), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
    }
}
