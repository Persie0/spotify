package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class ylg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f274013a;

    public ylg0(zlg0 zlg0Var, int i, Integer num) {
        String str;
        yt91 yt91VarM96903c = zlg0Var.f284007a.m96903c();
        switch (i) {
            case 1:
                str = "blend";
                break;
            case 2:
                str = "bluejay";
                break;
            case 3:
                str = "collaborative_playlist";
                break;
            case 4:
                str = "euterpe";
                break;
            case 5:
                str = "jam";
                break;
            case 6:
                str = "kallax";
                break;
            case 7:
                str = "magpie";
                break;
            case 8:
                str = "mixed_playlist";
                break;
            case 9:
                str = "playlist";
                break;
            case 10:
                str = "prompt_playlist";
                break;
            case 11:
                str = "skubb";
                break;
            case 12:
                str = "sts";
                break;
            default:
                throw null;
        }
        yt91VarM96903c.f276055i.add(new bu91("menu_item", str, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f274013a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m94162a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f274013a, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lau.f131415a);
        zt91 zt91Var = this.f274013a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }
}
