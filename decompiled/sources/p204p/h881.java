package p204p;

import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class h881 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f88653a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1790du f88654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h881(C1790du c1790du, int i) {
        super(4);
        this.f88653a = i;
        this.f88654b = c1790du;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        av91 av91Var;
        av91 av91Var2;
        String string;
        switch (this.f88653a) {
            case 0:
                b881 b881Var = (b881) obj;
                ((Number) obj3).intValue();
                slh0 slh0Var = (slh0) this.f88654b.f52930h;
                if (b881Var instanceof g881) {
                    i = 5;
                } else {
                    if (!(b881Var instanceof c881)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 3;
                }
                return new rlh0(slh0Var, i);
            default:
                b881 b881Var2 = (b881) obj2;
                z781 z781Var = (z781) obj4;
                zt91 zt91Var = ((rlh0) obj).f200317a;
                boolean z = z781Var instanceof y781;
                C1790du c1790du = this.f88654b;
                if (!z) {
                    boolean z2 = z781Var instanceof u781;
                    nau nauVar = nau.f152117a;
                    if (z2) {
                        List items = b881Var2.getItems();
                        u781 u781Var = (u781) z781Var;
                        int i2 = u781Var.f227532a;
                        int iM36882w = C1790du.m36882w(c1790du, items, i2);
                        Integer numValueOf = Integer.valueOf(i2);
                        String str = u781Var.f227533b;
                        yt91 yt91VarM96903c = zt91Var.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("top_chart_item", null, numValueOf, str, rkh0.m75730d(iM36882w)));
                        yt91VarM96903c.f276056j = false;
                        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                        yt91VarM96903c2.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                        yt91VarM96903c2.f276056j = false;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
                    } else if (z781Var instanceof w781) {
                        List items2 = b881Var2.getItems();
                        w781 w781Var = (w781) z781Var;
                        int i3 = w781Var.f248602a;
                        int iM36882w2 = C1790du.m36882w(c1790du, items2, i3);
                        Integer numValueOf2 = Integer.valueOf(i3);
                        String str2 = w781Var.f248603b;
                        yt91 yt91VarM96903c3 = zt91Var.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("top_chart_item", null, numValueOf2, str2, rkh0.m75730d(iM36882w2)));
                        yt91VarM96903c3.f276056j = false;
                        yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                        yt91VarM96903c4.f276055i.add(new bu91("face_pile", null, null, null, "1"));
                        yt91VarM96903c4.f276056j = false;
                        zt91 zt91VarM94607a = yt91VarM96903c4.m94607a();
                        String str3 = w781Var.f248603b;
                        dv91 dv91Var = new dv91("hit", 1);
                        string = str3 != null ? str3.toString() : null;
                        av91Var2 = new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
                    } else {
                        if (!(z781Var instanceof v781)) {
                            return null;
                        }
                        List items3 = b881Var2.getItems();
                        v781 v781Var = (v781) z781Var;
                        int i4 = v781Var.f238099a;
                        int iM36882w3 = C1790du.m36882w(c1790du, items3, i4);
                        Integer numValueOf3 = Integer.valueOf(i4);
                        String str4 = v781Var.f238100b;
                        yt91 yt91VarM96903c5 = zt91Var.m96903c();
                        yt91VarM96903c5.f276055i.add(new bu91("top_chart_item", null, numValueOf3, str4, rkh0.m75730d(iM36882w3)));
                        yt91VarM96903c5.f276056j = false;
                        zt91 zt91VarM94607a2 = yt91VarM96903c5.m94607a();
                        String strValueOf = String.valueOf(((e881) b881Var2.getItems().get(i4)).f57104Y.size());
                        yt91 yt91VarM96903c6 = zt91VarM94607a2.m96903c();
                        yt91VarM96903c6.f276055i.add(new bu91("face_pile", null, null, null, strValueOf));
                        yt91VarM96903c6.f276056j = false;
                        av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c6.m94607a(), st91.f213865b, System.currentTimeMillis());
                    }
                    return av91Var;
                }
                List items4 = b881Var2.getItems();
                y781 y781Var = (y781) z781Var;
                int i5 = y781Var.f269992a;
                int iM36882w4 = C1790du.m36882w(c1790du, items4, i5);
                Integer numValueOf4 = Integer.valueOf(i5);
                String str5 = y781Var.f269993b;
                yt91 yt91VarM96903c7 = zt91Var.m96903c();
                yt91VarM96903c7.f276055i.add(new bu91("top_chart_item", null, numValueOf4, str5, rkh0.m75730d(iM36882w4)));
                yt91VarM96903c7.f276056j = false;
                zt91 zt91VarM94607a3 = yt91VarM96903c7.m94607a();
                String str6 = y781Var.f269993b;
                dv91 dv91Var2 = new dv91("hit", 1);
                string = str6 != null ? str6.toString() : null;
                av91Var2 = new av91("", "", dv91Var2, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string != null ? string : "")), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis());
                return av91Var2;
        }
    }
}
