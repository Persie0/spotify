package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class rvy0 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203160a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ svy0 f203161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvy0(svy0 svy0Var, int i) {
        super(4);
        this.f203160a = i;
        this.f203161b = svy0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f203160a) {
            case 0:
                seh0 seh0Var = (seh0) obj;
                jvy0 jvy0Var = (jvy0) obj4;
                ueh0 ueh0Var = seh0Var.f208301b;
                zt91 zt91Var = seh0Var.f208300a;
                if (!(jvy0Var instanceof hvy0)) {
                    if (!jvy0Var.equals(avy0.f20296a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yt91 yt91VarM96903c = zt91Var.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("clear_button", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    return new av91("", "", new dv91("hit", 1), new bv91("text_clear", 1, nau.f152117a), yt91VarM96903c.m94607a(), ueh0Var.f229540a, System.currentTimeMillis());
                }
                if (!this.f203161b.f214534a) {
                    return null;
                }
                yt91 yt91VarM96903c2 = zt91Var.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("input_field", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                String str = ((hvy0) jvy0Var).f95819a;
                dv91 dv91Var = new dv91("key_stroke", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("change_search_query", 1, Collections.singletonMap("search_query_string", string)), zt91VarM94607a, ueh0Var.f229540a, System.currentTimeMillis());
            case 1:
                hdg0 hdg0Var = (hdg0) obj;
                jvy0 jvy0Var2 = (jvy0) obj4;
                if (jvy0Var2 instanceof hvy0) {
                    if (this.f203161b.f214534a) {
                        return new av91("", "", new dv91("key_stroke", 1), new bv91("filter", 1, nau.f152117a), hdg0Var.f90139a, st91.f213865b, System.currentTimeMillis());
                    }
                } else if (!jvy0Var2.equals(avy0.f20296a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return null;
            default:
                edg0 edg0Var = (edg0) obj;
                jvy0 jvy0Var3 = (jvy0) obj4;
                if (jvy0Var3 instanceof hvy0) {
                    if (this.f203161b.f214534a) {
                        yt91 yt91VarM96903c3 = edg0Var.f58516a.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("search_text", null, null, null, null));
                        yt91VarM96903c3.f276056j = false;
                        return new av91("", "", new dv91("key_stroke", 1), new bv91("filter", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                } else if (!jvy0Var3.equals(avy0.f20296a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return null;
        }
    }
}
