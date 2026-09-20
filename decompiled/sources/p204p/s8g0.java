package p204p;

import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class s8g0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f206642a = 1;

    /* JADX INFO: renamed from: b */
    public final zt91 f206643b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pv91 f206644c;

    public s8g0(tmg0 tmg0Var, String str) {
        this.f206644c = tmg0Var;
        yt91 yt91VarM96903c = tmg0Var.f221725b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("save_button", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: A */
    public wxg0 m77471A() {
        return new wxg0(this, 1);
    }

    /* JADX INFO: renamed from: B */
    public txg0 m77472B() {
        return new txg0(this, 2);
    }

    /* JADX INFO: renamed from: C */
    public uxg0 m77473C() {
        return new uxg0(this, 3);
    }

    /* JADX INFO: renamed from: D */
    public vxg0 m77474D() {
        return new vxg0(this, 3);
    }

    /* JADX INFO: renamed from: E */
    public wxg0 m77475E() {
        return new wxg0(this, 2);
    }

    /* JADX INFO: renamed from: F */
    public txg0 m77476F() {
        return new txg0(this, 3);
    }

    /* JADX INFO: renamed from: G */
    public uxg0 m77477G() {
        return new uxg0(this, 4);
    }

    /* JADX INFO: renamed from: H */
    public vxg0 m77478H() {
        return new vxg0(this, 4);
    }

    /* JADX INFO: renamed from: I */
    public wxg0 m77479I() {
        return new wxg0(this, 3);
    }

    /* JADX INFO: renamed from: a */
    public av91 m77480a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f206643b, ((ktg0) this.f206644c).f126290a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f206642a;
        pv91 pv91Var = this.f206644c;
        zt91 zt91Var = this.f206643b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = ((t8g0) pv91Var).f218080a;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = ((b9g0) pv91Var).f24903a;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = ((zm8) pv91Var).f284179b;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var6 != null) {
                    arrayList3.addAll(st91Var6.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
            case 3:
                st91 st91Var7 = st91.f213865b;
                st91 st91Var8 = ((zm8) pv91Var).f284179b;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var8 != null) {
                    arrayList4.addAll(st91Var8.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
            case 4:
                st91 st91Var9 = st91.f213865b;
                st91 st91Var10 = ((zm8) pv91Var).f284179b;
                ArrayList arrayList5 = new ArrayList();
                if (st91Var10 != null) {
                    arrayList5.addAll(st91Var10.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList5, zt91Var, arrayList5);
            case 5:
                st91 st91Var11 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 6:
                st91 st91Var12 = st91.f213865b;
                st91 st91Var13 = ((zm8) pv91Var).f284179b;
                ArrayList arrayList6 = new ArrayList();
                if (st91Var13 != null) {
                    arrayList6.addAll(st91Var13.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList6, zt91Var, arrayList6);
            case 7:
                st91 st91Var14 = st91.f213865b;
                st91 st91Var15 = ((zm8) pv91Var).f284179b;
                ArrayList arrayList7 = new ArrayList();
                if (st91Var15 != null) {
                    arrayList7.addAll(st91Var15.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList7, zt91Var, arrayList7);
            case 8:
                st91 st91Var16 = st91.f213865b;
                st91 st91Var17 = ((vdg0) pv91Var).f240407a;
                ArrayList arrayList8 = new ArrayList();
                if (st91Var17 != null) {
                    arrayList8.addAll(st91Var17.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList8, zt91Var, arrayList8);
            case 9:
                st91 st91Var18 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 10:
                st91 st91Var19 = st91.f213865b;
                st91 st91Var20 = ((gag0) pv91Var).f78049b;
                ArrayList arrayList9 = new ArrayList();
                if (st91Var20 != null) {
                    arrayList9.addAll(st91Var20.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList9, zt91Var, arrayList9);
            case 11:
                st91 st91Var21 = st91.f213865b;
                st91 st91Var22 = ((zm8) pv91Var).f284179b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(st91Var22.f213866a);
                ofg1.m66846o(zt91Var, "location");
                arrayList10.add(zt91Var);
                return new st91(arrayList10);
            case 12:
                st91 st91Var23 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 13:
                st91 st91Var24 = st91.f213865b;
                st91 st91Var25 = ((tmg0) pv91Var).f221724a;
                ArrayList arrayList11 = new ArrayList();
                if (st91Var25 != null) {
                    arrayList11.addAll(st91Var25.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList11, zt91Var, arrayList11);
            case 14:
                st91 st91Var26 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 15:
                st91 st91Var27 = st91.f213865b;
                st91 st91Var28 = ((gag0) pv91Var).f78049b;
                ArrayList arrayList12 = new ArrayList();
                if (st91Var28 != null) {
                    arrayList12.addAll(st91Var28.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList12, zt91Var, arrayList12);
            case 16:
                st91 st91Var29 = st91.f213865b;
                st91 st91Var30 = ((vog0) pv91Var).f243480c.f93537b;
                ArrayList arrayList13 = new ArrayList();
                if (st91Var30 != null) {
                    arrayList13.addAll(st91Var30.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList13, zt91Var, arrayList13);
            case 17:
                st91 st91Var31 = st91.f213865b;
                st91 st91Var32 = ((vog0) pv91Var).f243480c.f93537b;
                ArrayList arrayList14 = new ArrayList();
                if (st91Var32 != null) {
                    arrayList14.addAll(st91Var32.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList14, zt91Var, arrayList14);
            case 18:
                st91 st91Var33 = st91.f213865b;
                st91 st91Var34 = ((vog0) pv91Var).f243480c.f93537b;
                ArrayList arrayList15 = new ArrayList();
                if (st91Var34 != null) {
                    arrayList15.addAll(st91Var34.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList15, zt91Var, arrayList15);
            case 19:
                st91 st91Var35 = st91.f213865b;
                st91 st91Var36 = ((hog0) pv91Var).f93537b;
                ArrayList arrayList16 = new ArrayList();
                if (st91Var36 != null) {
                    arrayList16.addAll(st91Var36.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList16, zt91Var, arrayList16);
            case 20:
                st91 st91Var37 = st91.f213865b;
                st91 st91Var38 = ((ktg0) pv91Var).f126290a;
                ArrayList arrayList17 = new ArrayList();
                if (st91Var38 != null) {
                    arrayList17.addAll(st91Var38.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList17, zt91Var, arrayList17);
            case 21:
                st91 st91Var39 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 22:
                st91 st91Var40 = st91.f213865b;
                st91 st91Var41 = ((hog0) pv91Var).f93537b;
                ArrayList arrayList18 = new ArrayList();
                if (st91Var41 != null) {
                    arrayList18.addAll(st91Var41.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList18, zt91Var, arrayList18);
            case 23:
                st91 st91Var42 = st91.f213865b;
                st91 st91Var43 = ((hog0) pv91Var).f93537b;
                ArrayList arrayList19 = new ArrayList();
                if (st91Var43 != null) {
                    arrayList19.addAll(st91Var43.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList19, zt91Var, arrayList19);
            case 24:
                st91 st91Var44 = st91.f213865b;
                st91 st91Var45 = ((hog0) pv91Var).f93537b;
                ArrayList arrayList20 = new ArrayList();
                if (st91Var45 != null) {
                    arrayList20.addAll(st91Var45.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList20, zt91Var, arrayList20);
            case 25:
                st91 st91Var46 = st91.f213865b;
                st91 st91Var47 = ((hog0) pv91Var).f93537b;
                ArrayList arrayList21 = new ArrayList();
                if (st91Var47 != null) {
                    arrayList21.addAll(st91Var47.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList21, zt91Var, arrayList21);
            case 26:
                st91 st91Var48 = st91.f213865b;
                st91 st91Var49 = ((czg0) pv91Var).f43561a;
                ArrayList arrayList22 = new ArrayList();
                if (st91Var49 != null) {
                    arrayList22.addAll(st91Var49.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList22, zt91Var, arrayList22);
            case 27:
                st91 st91Var50 = st91.f213865b;
                st91 st91Var51 = ((o0h0) pv91Var).f160391a;
                ArrayList arrayList23 = new ArrayList();
                if (st91Var51 != null) {
                    arrayList23.addAll(st91Var51.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList23, zt91Var, arrayList23);
            case 28:
                st91 st91Var52 = st91.f213865b;
                st91 st91Var53 = ((r2h0) pv91Var).f195144b;
                ArrayList arrayList24 = new ArrayList();
                if (st91Var53 != null) {
                    arrayList24.addAll(st91Var53.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList24, zt91Var, arrayList24);
            default:
                st91 st91Var54 = st91.f213865b;
                st91 st91Var55 = ((w3h0) pv91Var).f247591a;
                ArrayList arrayList25 = new ArrayList();
                if (st91Var55 != null) {
                    arrayList25.addAll(st91Var55.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList25, zt91Var, arrayList25);
        }
    }

    /* JADX INFO: renamed from: e */
    public vxg0 m77481e() {
        return new vxg0(this, 0);
    }

    /* JADX INFO: renamed from: h */
    public a9g0 m77482h() {
        return new a9g0(this, 0);
    }

    /* JADX INFO: renamed from: i */
    public a9g0 m77483i() {
        return new a9g0(this, 1);
    }

    /* JADX INFO: renamed from: j */
    public a9g0 m77484j() {
        return new a9g0(this, 2);
    }

    /* JADX INFO: renamed from: k */
    public txg0 m77485k() {
        return new txg0(this, 0);
    }

    /* JADX INFO: renamed from: l */
    public uxg0 m77486l() {
        return new uxg0(this, 0);
    }

    /* JADX INFO: renamed from: m */
    public vxg0 m77487m() {
        return new vxg0(this, 1);
    }

    /* JADX INFO: renamed from: n */
    public av91 m77488n(String str, String str2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("playlist", string);
        String string2 = str2 != null ? str2.toString() : null;
        return new av91("", "", dv91Var, new bv91("add_to_playlist", 2, kkc0.m56695h0(pqm0Var, new pqm0("item_to_be_added", string2 != null ? string2 : ""))), this.f206643b, ((w3h0) this.f206644c).f247591a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: o */
    public av91 m77489o(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string)), this.f206643b, ((tmg0) this.f206644c).f221724a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: p */
    public av91 m77490p(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), this.f206643b, ((b9g0) this.f206644c).f24903a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: q */
    public av91 m77491q(String str, String str2, String str3) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("prerelease_id", string);
        String string2 = str2 != null ? str2.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        pqm0 pqm0Var2 = new pqm0("item_to_be_presaved", string2);
        String string3 = str3 != null ? str3.toString() : null;
        return new av91("", "", dv91Var, new bv91("presave", 1, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0(ContextTrack.Metadata.KEY_CONTEXT_URI, string3 != null ? string3 : ""))), this.f206643b, ((czg0) this.f206644c).f43561a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: r */
    public av91 m77492r(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("remove_like", 1, Collections.singletonMap("item_no_longer_liked", string)), this.f206643b, ((tmg0) this.f206644c).f221724a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: s */
    public av91 m77493s(String str, String str2, String str3) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("prerelease_id", string);
        String string2 = str2 != null ? str2.toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        pqm0 pqm0Var2 = new pqm0("item_to_be_removed_from_presaved", string2);
        String string3 = str3 != null ? str3.toString() : null;
        return new av91("", "", dv91Var, new bv91("remove_presave", 1, kkc0.m56695h0(pqm0Var, pqm0Var2, new pqm0(ContextTrack.Metadata.KEY_CONTEXT_URI, string3 != null ? string3 : ""))), this.f206643b, ((czg0) this.f206644c).f43561a, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: t */
    public av91 m77494t() {
        switch (this.f206642a) {
            case 1:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f206643b, ((b9g0) this.f206644c).f24903a, System.currentTimeMillis());
            case 15:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f206643b, ((gag0) this.f206644c).f78049b, System.currentTimeMillis());
            case 16:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f206643b, ((vog0) this.f206644c).f243480c.f93537b, System.currentTimeMillis());
            case 17:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f206643b, ((vog0) this.f206644c).f243480c.f93537b, System.currentTimeMillis());
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f206643b, ((vog0) this.f206644c).f243480c.f93537b, System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: u */
    public txg0 m77495u() {
        return new txg0(this, 1);
    }

    /* JADX INFO: renamed from: v */
    public uxg0 m77496v() {
        return new uxg0(this, 1);
    }

    /* JADX INFO: renamed from: w */
    public vxg0 m77497w() {
        return new vxg0(this, 2);
    }

    /* JADX INFO: renamed from: x */
    public wxg0 m77498x() {
        return new wxg0(this, 0);
    }

    /* JADX INFO: renamed from: y */
    public a9g0 m77499y() {
        return new a9g0(this, 3);
    }

    /* JADX INFO: renamed from: z */
    public uxg0 m77500z() {
        return new uxg0(this, 2);
    }

    public s8g0(zm8 zm8Var) {
        this.f206644c = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("merch_carousel", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(zm8 zm8Var, char c) {
        this.f206644c = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("recommeded_carousel", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(hog0 hog0Var) {
        this.f206644c = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("managed_accounts_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(hog0 hog0Var, String str) {
        this.f206644c = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(hog0 hog0Var, String str, char c) {
        this.f206644c = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(hog0 hog0Var, String str, int i) {
        this.f206644c = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(hog0 hog0Var, String str, byte b) {
        this.f206644c = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("horizontal_container", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(zm8 zm8Var, int i, Integer num, int i2) {
        String str;
        String str2;
        this.f206644c = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        if (i == 1) {
            str = "general_sale";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "reserved";
        }
        String str3 = str;
        switch (i2) {
            case 1:
                str2 = "active";
                break;
            case 2:
                str2 = "cancelled";
                break;
            case 3:
                str2 = "ended";
                break;
            case 4:
                str2 = "purchased";
                break;
            case 5:
                str2 = "sold_out";
                break;
            case 6:
                str2 = "unspecified";
                break;
            case 7:
                str2 = "upcoming";
                break;
            default:
                throw null;
        }
        yt91VarM96903c.f276055i.add(new bu91("timeline_entry", str3, num, null, str2));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(gag0 gag0Var, Integer num) {
        this.f206644c = gag0Var;
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("section", null, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(gag0 gag0Var) {
        this.f206644c = gag0Var;
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("dialog", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(o0h0 o0h0Var) {
        this.f206644c = o0h0Var;
        yt91 yt91VarM96903c = o0h0Var.f160392b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("companion_content_items", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(b9g0 b9g0Var) {
        this.f206644c = b9g0Var;
        yt91 yt91VarM96903c = b9g0Var.f24904b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("card", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(czg0 czg0Var) {
        this.f206644c = czg0Var;
        yt91 yt91VarM96903c = czg0Var.f43562b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("presave_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(ktg0 ktg0Var) {
        this.f206644c = ktg0Var;
        yt91 yt91VarM96903c = ktg0Var.f126291b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("link_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(zm8 zm8Var, byte b) {
        this.f206644c = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("popular_releases_carousel", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(zm8 zm8Var, int i) {
        this.f206644c = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("series_carousel", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(tgg0 tgg0Var) {
        this.f206644c = tgg0Var;
        yt91 yt91VarM96903c = tgg0Var.f220188a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("device_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(vog0 vog0Var, String str, char c) {
        this.f206644c = vog0Var;
        yt91 yt91VarM96903c = vog0Var.f243479b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("download_row_context", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(xug0 xug0Var, Integer num) {
        this.f206644c = xug0Var;
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("card_group", null, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(t8g0 t8g0Var) {
        this.f206644c = t8g0Var;
        yt91 yt91VarM96903c = t8g0Var.f218081b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("carousel", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(vdg0 vdg0Var) {
        this.f206644c = vdg0Var;
        yt91 yt91VarM96903c = vdg0Var.f240408b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("entity_list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(l9g0 l9g0Var, byte b) {
        this.f206644c = l9g0Var;
        yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("media_grid", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(xlg0 xlg0Var) {
        this.f206644c = xlg0Var;
        yt91 yt91VarM96903c = xlg0Var.f263144b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("items_section", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(l9g0 l9g0Var) {
        this.f206644c = l9g0Var;
        yt91 yt91VarM96903c = l9g0Var.f131086b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("card_container", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(vog0 vog0Var, String str) {
        this.f206644c = vog0Var;
        yt91 yt91VarM96903c = vog0Var.f243479b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("download_row_context", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(zm8 zm8Var, int i, String str) {
        String str2;
        this.f206644c = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        if (i == 1) {
            str2 = "no_shuffle";
        } else if (i == 2) {
            str2 = "shuffle";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "smart_shuffle";
        }
        yt91VarM96903c.f276055i.add(new bu91("play_button", str2, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(r2h0 r2h0Var) {
        this.f206644c = r2h0Var;
        yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("footer_section", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(vog0 vog0Var, String str, byte b) {
        this.f206644c = vog0Var;
        yt91 yt91VarM96903c = vog0Var.f243479b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("download_row_context", null, null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }

    public s8g0(w3h0 w3h0Var) {
        this.f206644c = w3h0Var;
        yt91 yt91VarM96903c = w3h0Var.f247592b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("add_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f206643b = yt91VarM96903c.m94607a();
    }
}
