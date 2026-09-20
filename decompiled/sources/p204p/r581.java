package p204p;

import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class r581 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f195993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pk0 f195994b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r581(pk0 pk0Var, int i) {
        super(4);
        this.f195993a = i;
        this.f195994b = pk0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        av91 av91Var;
        String string;
        switch (this.f195993a) {
            case 0:
                l581 l581Var = (l581) obj;
                ((Number) obj3).intValue();
                slh0 slh0Var = (slh0) this.f195994b.f178342t;
                if (l581Var instanceof p581) {
                    i = 4;
                } else {
                    if (!(l581Var instanceof m581)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 2;
                }
                return new rlh0(slh0Var, i);
            default:
                l581 l581Var2 = (l581) obj2;
                j581 j581Var = (j581) obj4;
                zt91 zt91Var = ((rlh0) obj).f200317a;
                boolean z = j581Var instanceof f581;
                pk0 pk0Var = this.f195994b;
                if (z) {
                    List items = l581Var2.getItems();
                    f581 f581Var = (f581) j581Var;
                    int i2 = f581Var.f65979a;
                    int iM70167n = pk0.m70167n(pk0Var, items, i2);
                    Integer numValueOf = Integer.valueOf(i2);
                    String str = f581Var.f65980b;
                    yt91 yt91VarM96903c = zt91Var.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("top_chart_item", null, numValueOf, str, rkh0.m75730d(iM70167n)));
                    yt91VarM96903c.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                    String str2 = f581Var.f65980b;
                    dv91 dv91Var = new dv91("hit", 1);
                    string = str2 != null ? str2.toString() : null;
                    return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a, st91.f213865b, System.currentTimeMillis());
                }
                boolean z2 = j581Var instanceof g581;
                nau nauVar = nau.f152117a;
                if (z2) {
                    List items2 = l581Var2.getItems();
                    g581 g581Var = (g581) j581Var;
                    int i3 = g581Var.f76614a;
                    int iM70167n2 = pk0.m70167n(pk0Var, items2, i3);
                    Integer numValueOf2 = Integer.valueOf(i3);
                    String str3 = g581Var.f76615b;
                    yt91 yt91VarM96903c2 = zt91Var.m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("top_chart_item", null, numValueOf2, str3, rkh0.m75730d(iM70167n2)));
                    yt91VarM96903c2.f276056j = false;
                    yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
                    yt91VarM96903c3.f276055i.add(new bu91("context_menu_button", null, null, null, null));
                    yt91VarM96903c3.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis());
                } else {
                    if (j581Var instanceof i581) {
                        List items3 = l581Var2.getItems();
                        i581 i581Var = (i581) j581Var;
                        int i4 = i581Var.f98845a;
                        int iM70167n3 = pk0.m70167n(pk0Var, items3, i4);
                        Integer numValueOf3 = Integer.valueOf(i4);
                        String str4 = i581Var.f98846b;
                        yt91 yt91VarM96903c4 = zt91Var.m96903c();
                        yt91VarM96903c4.f276055i.add(new bu91("top_chart_item", null, numValueOf3, str4, rkh0.m75730d(iM70167n3)));
                        yt91VarM96903c4.f276056j = false;
                        yt91 yt91VarM96903c5 = yt91VarM96903c4.m94607a().m96903c();
                        yt91VarM96903c5.f276055i.add(new bu91("face_pile", null, null, null, "1"));
                        yt91VarM96903c5.f276056j = false;
                        zt91 zt91VarM94607a2 = yt91VarM96903c5.m94607a();
                        String str5 = i581Var.f98846b;
                        dv91 dv91Var2 = new dv91("hit", 1);
                        string = str5 != null ? str5.toString() : null;
                        return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis());
                    }
                    if (!(j581Var instanceof h581)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List items4 = l581Var2.getItems();
                    h581 h581Var = (h581) j581Var;
                    int i5 = h581Var.f87771a;
                    int iM70167n4 = pk0.m70167n(pk0Var, items4, i5);
                    Integer numValueOf4 = Integer.valueOf(i5);
                    String str6 = h581Var.f87772b;
                    yt91 yt91VarM96903c6 = zt91Var.m96903c();
                    yt91VarM96903c6.f276055i.add(new bu91("top_chart_item", null, numValueOf4, str6, rkh0.m75730d(iM70167n4)));
                    yt91VarM96903c6.f276056j = false;
                    zt91 zt91VarM94607a3 = yt91VarM96903c6.m94607a();
                    String strValueOf = String.valueOf(((o581) l581Var2.getItems().get(i5)).f161921t.size());
                    yt91 yt91VarM96903c7 = zt91VarM94607a3.m96903c();
                    yt91VarM96903c7.f276055i.add(new bu91("face_pile", null, null, null, strValueOf));
                    yt91VarM96903c7.f276056j = false;
                    av91Var = new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), yt91VarM96903c7.m94607a(), st91.f213865b, System.currentTimeMillis());
                }
                return av91Var;
        }
    }
}
