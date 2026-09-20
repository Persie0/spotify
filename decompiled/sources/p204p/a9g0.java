package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class a9g0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13564a;

    /* JADX INFO: renamed from: b */
    public final zt91 f13565b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s8g0 f13566c;

    public a9g0(s8g0 s8g0Var, int i) {
        this.f13564a = i;
        switch (i) {
            case 1:
                this.f13566c = s8g0Var;
                yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("dismiss_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f13565b = yt91VarM96903c.m94607a();
                break;
            case 2:
                this.f13566c = s8g0Var;
                yt91 yt91VarM96903c2 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("expand_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f13565b = yt91VarM96903c2.m94607a();
                break;
            case 3:
                this.f13566c = s8g0Var;
                yt91 yt91VarM96903c3 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("repeat_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f13565b = yt91VarM96903c3.m94607a();
                break;
            default:
                this.f13566c = s8g0Var;
                yt91 yt91VarM96903c4 = s8g0Var.f206643b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("cta_button", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                this.f13565b = yt91VarM96903c4.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f13564a;
        s8g0 s8g0Var = this.f13566c;
        zt91 zt91Var = this.f13565b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = ((b9g0) s8g0Var.f206644c).f24903a;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = ((b9g0) s8g0Var.f206644c).f24903a;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = ((b9g0) s8g0Var.f206644c).f24903a;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var6 != null) {
                    arrayList3.addAll(st91Var6.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
            default:
                st91 st91Var7 = st91.f213865b;
                st91 st91Var8 = ((b9g0) s8g0Var.f206644c).f24903a;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var8 != null) {
                    arrayList4.addAll(st91Var8.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
        }
    }

    /* JADX INFO: renamed from: e */
    public av91 m25115e(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), this.f13565b, ((b9g0) this.f13566c.f206644c).f24903a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public av91 m25116h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string)), this.f13565b, ((b9g0) this.f13566c.f206644c).f24903a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public av91 m25117i() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f13565b, ((b9g0) this.f13566c.f206644c).f24903a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: j */
    public av91 m25118j() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f13565b, ((b9g0) this.f13566c.f206644c).f24903a, System.currentTimeMillis());
    }
}
