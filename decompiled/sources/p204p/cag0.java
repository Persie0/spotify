package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class cag0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35815a = 0;

    /* JADX INFO: renamed from: b */
    public final zt91 f35816b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pv91 f35817c;

    public cag0(zm8 zm8Var) {
        this.f35817c = zm8Var;
        yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("offline_status_item", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public av91 m32022a(String str) {
        switch (this.f35815a) {
            case 0:
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f35816b, ((zm8) ((s8g0) this.f35817c).f206644c).f284179b, System.currentTimeMillis());
            case 2:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate", 1, Collections.singletonMap("destination", "spotify:collection")), this.f35816b, ((zm8) this.f35817c).f284179b, System.currentTimeMillis());
            case 3:
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str != null ? str.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                return new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), this.f35816b, st91.f213865b, System.currentTimeMillis());
            case 18:
                dv91 dv91Var3 = new dv91("hit", 1);
                String string3 = str != null ? str.toString() : null;
                if (string3 == null) {
                    string3 = "";
                }
                return new av91("", "", dv91Var3, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string3)), this.f35816b, st91.f213865b, System.currentTimeMillis());
            default:
                dv91 dv91Var4 = new dv91("hit", 1);
                String string4 = str != null ? str.toString() : null;
                if (string4 == null) {
                    string4 = "";
                }
                return new av91("", "", dv91Var4, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string4)), this.f35816b, st91.f213865b, System.currentTimeMillis());
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f35815a;
        pv91 pv91Var = this.f35817c;
        zt91 zt91Var = this.f35816b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = ((zm8) ((s8g0) pv91Var).f206644c).f284179b;
                ArrayList arrayList = new ArrayList();
                if (st91Var2 != null) {
                    arrayList.addAll(st91Var2.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = ((zm8) ((s8g0) pv91Var).f206644c).f284179b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var4 != null) {
                    arrayList2.addAll(st91Var4.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = ((zm8) pv91Var).f284179b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(st91Var6.f213866a);
                ofg1.m66846o(zt91Var, "location");
                arrayList3.add(zt91Var);
                return new st91(arrayList3);
            case 3:
                st91 st91Var7 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 4:
                st91 st91Var8 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 5:
                st91 st91Var9 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 6:
                st91 st91Var10 = st91.f213865b;
                st91 st91Var11 = ((vog0) pv91Var).f243480c.f93537b;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var11 != null) {
                    arrayList4.addAll(st91Var11.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
            case 7:
                st91 st91Var12 = st91.f213865b;
                st91 st91Var13 = ((hog0) pv91Var).f93537b;
                ArrayList arrayList5 = new ArrayList();
                if (st91Var13 != null) {
                    arrayList5.addAll(st91Var13.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList5, zt91Var, arrayList5);
            case 8:
                st91 st91Var14 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 9:
                st91 st91Var15 = st91.f213865b;
                st91 st91Var16 = ((hog0) pv91Var).f93537b;
                ArrayList arrayList6 = new ArrayList();
                if (st91Var16 != null) {
                    arrayList6.addAll(st91Var16.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList6, zt91Var, arrayList6);
            case 10:
                st91 st91Var17 = st91.f213865b;
                st91 st91Var18 = ((r2h0) pv91Var).f195144b;
                ArrayList arrayList7 = new ArrayList();
                if (st91Var18 != null) {
                    arrayList7.addAll(st91Var18.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList7, zt91Var, arrayList7);
            case 11:
                st91 st91Var19 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 12:
                st91 st91Var20 = st91.f213865b;
                st91 st91Var21 = ((o5h0) pv91Var).f161971a;
                ArrayList arrayList8 = new ArrayList();
                if (st91Var21 != null) {
                    arrayList8.addAll(st91Var21.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList8, zt91Var, arrayList8);
            case 13:
                st91 st91Var22 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 14:
                st91 st91Var23 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 15:
                st91 st91Var24 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 16:
                st91 st91Var25 = st91.f213865b;
                st91 st91Var26 = ((r2h0) ((g4h0) pv91Var).f76422c).f195144b;
                ArrayList arrayList9 = new ArrayList();
                if (st91Var26 != null) {
                    arrayList9.addAll(st91Var26.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList9, zt91Var, arrayList9);
            case 17:
                st91 st91Var27 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 18:
                st91 st91Var28 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 19:
                st91 st91Var29 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 20:
                st91 st91Var30 = st91.f213865b;
                st91 st91Var31 = ((vch0) pv91Var).f240134b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(st91Var31.f213866a);
                ofg1.m66846o(zt91Var, "location");
                arrayList10.add(zt91Var);
                return new st91(arrayList10);
            default:
                st91 st91Var32 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
        }
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f35815a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f35816b;
                nu91Var.f248108b = ((zm8) ((s8g0) this.f35817c).f206644c).f284179b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var.m87248a();
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f35816b;
                nu91Var2.f248108b = ((zm8) ((s8g0) this.f35817c).f206644c).f284179b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var2.m87248a();
            case 2:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f35816b;
                nu91Var3.f248108b = ((zm8) this.f35817c).f284179b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var3.m87248a();
            case 3:
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = this.f35816b;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var4.f158542f = ((geg0) this.f35817c).f79119b;
                return (ou91) nu91Var4.m87248a();
            case 4:
                nu91 nu91Var5 = new nu91();
                nu91Var5.f248107a = this.f35816b;
                nu91Var5.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var5.f158542f = ((ulg0) this.f35817c).f231559b;
                return (ou91) nu91Var5.m87248a();
            case 5:
                nu91 nu91Var6 = new nu91();
                nu91Var6.f248107a = this.f35816b;
                nu91Var6.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var6.f158542f = ((hmg0) this.f35817c).f92979b;
                return (ou91) nu91Var6.m87248a();
            case 6:
                nu91 nu91Var7 = new nu91();
                nu91Var7.f248107a = this.f35816b;
                nu91Var7.f248108b = ((vog0) this.f35817c).f243480c.f93537b;
                nu91Var7.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var7.m87248a();
            case 7:
                nu91 nu91Var8 = new nu91();
                nu91Var8.f248107a = this.f35816b;
                nu91Var8.f248108b = ((hog0) this.f35817c).f93537b;
                nu91Var8.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var8.m87248a();
            case 8:
                nu91 nu91Var9 = new nu91();
                nu91Var9.f248107a = this.f35816b;
                nu91Var9.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var9.f158542f = ((xug0) this.f35817c).f266110c;
                return (ou91) nu91Var9.m87248a();
            case 9:
                nu91 nu91Var10 = new nu91();
                nu91Var10.f248107a = this.f35816b;
                nu91Var10.f248108b = ((hog0) this.f35817c).f93537b;
                nu91Var10.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var10.m87248a();
            case 10:
                nu91 nu91Var11 = new nu91();
                nu91Var11.f248107a = this.f35816b;
                nu91Var11.f248108b = ((r2h0) this.f35817c).f195144b;
                nu91Var11.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var11.m87248a();
            case 11:
                nu91 nu91Var12 = new nu91();
                nu91Var12.f248107a = this.f35816b;
                nu91Var12.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var12.f158542f = ((xug0) this.f35817c).f266110c;
                return (ou91) nu91Var12.m87248a();
            case 12:
                nu91 nu91Var13 = new nu91();
                nu91Var13.f248107a = this.f35816b;
                nu91Var13.f248108b = ((o5h0) this.f35817c).f161971a;
                nu91Var13.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var13.m87248a();
            case 13:
                nu91 nu91Var14 = new nu91();
                nu91Var14.f248107a = this.f35816b;
                nu91Var14.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var14.f158542f = ((g6h0) this.f35817c).f77054c.f109937c;
                return (ou91) nu91Var14.m87248a();
            case 14:
                nu91 nu91Var15 = new nu91();
                nu91Var15.f248107a = this.f35816b;
                nu91Var15.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var15.f158542f = ((ebg0) ((g4h0) ((rbh0) this.f35817c).f197601c.f76422c).f76422c).f57927c;
                return (ou91) nu91Var15.m87248a();
            case 15:
                nu91 nu91Var16 = new nu91();
                nu91Var16.f248107a = this.f35816b;
                nu91Var16.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var16.f158542f = ((ebg0) ((g4h0) ((rbh0) this.f35817c).f197601c.f76422c).f76422c).f57927c;
                return (ou91) nu91Var16.m87248a();
            case 16:
                nu91 nu91Var17 = new nu91();
                nu91Var17.f248107a = this.f35816b;
                nu91Var17.f248108b = ((r2h0) ((g4h0) this.f35817c).f76422c).f195144b;
                nu91Var17.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var17.m87248a();
            case 17:
                nu91 nu91Var18 = new nu91();
                nu91Var18.f248107a = this.f35816b;
                nu91Var18.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var18.f158542f = ((cbh0) this.f35817c).f36129c;
                return (ou91) nu91Var18.m87248a();
            case 18:
                nu91 nu91Var19 = new nu91();
                nu91Var19.f248107a = this.f35816b;
                nu91Var19.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var19.f158542f = ((cbh0) this.f35817c).f36129c;
                return (ou91) nu91Var19.m87248a();
            case 19:
                nu91 nu91Var20 = new nu91();
                nu91Var20.f248107a = this.f35816b;
                nu91Var20.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var20.f158542f = ((cbh0) ((g4h0) this.f35817c).f76422c).f36129c;
                return (ou91) nu91Var20.m87248a();
            case 20:
                nu91 nu91Var21 = new nu91();
                nu91Var21.f248107a = this.f35816b;
                nu91Var21.f248108b = ((vch0) this.f35817c).f240134b;
                nu91Var21.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var21.m87248a();
            default:
                nu91 nu91Var22 = new nu91();
                nu91Var22.f248107a = this.f35816b;
                nu91Var22.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var22.f158542f = ((pkh0) this.f35817c).f178464c;
                return (ou91) nu91Var22.m87248a();
        }
    }

    /* JADX INFO: renamed from: g */
    public av91 m32023g() {
        return new av91("", "", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f35816b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public av91 m32024h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), this.f35816b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public av91 m32025i() {
        return new av91("", "", new dv91("hit", 1), new bv91("no_action", 1, nau.f152117a), this.f35816b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: j */
    public av91 m32026j(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play_preview", 1, Collections.singletonMap("item_to_be_previewed", string)), this.f35816b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: k */
    public av91 m32027k(Integer num) {
        dv91 dv91Var = new dv91("hit", 1);
        String strValueOf = String.valueOf(num.intValue());
        if (strValueOf == null) {
            strValueOf = "";
        }
        return new av91("", "", dv91Var, new bv91("stop_preview", 1, Collections.singletonMap("duration_ms", strValueOf)), this.f35816b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: l */
    public av91 m32028l() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f35816b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: m */
    public av91 m32029m() {
        switch (this.f35815a) {
            case 6:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f35816b, ((vog0) this.f35817c).f243480c.f93537b, System.currentTimeMillis());
            default:
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f35816b, st91.f213865b, System.currentTimeMillis());
        }
    }

    public cag0(r2h0 r2h0Var, String str, String str2) {
        this.f35817c = r2h0Var;
        yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("header_view_story", str, null, str2, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(vch0 vch0Var) {
        this.f35817c = vch0Var;
        yt91 yt91VarM96903c = vch0Var.f240135c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("confirm_action_dialog", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(hog0 hog0Var, String str) {
        this.f35817c = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("header_view", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(Integer num, String str, s8g0 s8g0Var) {
        this.f35817c = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("playlist_item", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(g4h0 g4h0Var, String str) {
        this.f35817c = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("chip", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(hmg0 hmg0Var) {
        this.f35817c = hmg0Var;
        yt91 yt91VarM96903c = hmg0Var.f92978a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("header", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(int i, Integer num, String str, s8g0 s8g0Var) {
        this.f35817c = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("release_card", f9g0.m41060d(i), num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(o5h0 o5h0Var) {
        this.f35817c = o5h0Var;
        yt91 yt91VarM96903c = o5h0Var.f161972b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("header", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(ulg0 ulg0Var, String str) {
        this.f35817c = ulg0Var;
        yt91 yt91VarM96903c = ulg0Var.f231558a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("snackbar", "edit_note", null, str, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(Integer num, String str, xug0 xug0Var) {
        this.f35817c = xug0Var;
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("candidate_track_row", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(vog0 vog0Var, String str) {
        this.f35817c = vog0Var;
        yt91 yt91VarM96903c = vog0Var.f243479b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("download_toggle", null, null, str, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(g6h0 g6h0Var, String str, Integer num, String str2, String str3) {
        this.f35817c = g6h0Var;
        yt91 yt91VarM96903c = g6h0Var.f77053b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("hubs_component", str, num, str3, str2));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(pkh0 pkh0Var) {
        this.f35817c = pkh0Var;
        yt91 yt91VarM96903c = pkh0Var.f178463b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("header_deprecated", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(xug0 xug0Var, Integer num) {
        this.f35817c = xug0Var;
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("grid", null, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(cbh0 cbh0Var) {
        this.f35817c = cbh0Var;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("location_search_page", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(cbh0 cbh0Var, String str) {
        this.f35817c = cbh0Var;
        yt91 yt91VarM96903c = cbh0Var.f36128b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("event_row", null, null, str, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(geg0 geg0Var, String str) {
        this.f35817c = geg0Var;
        yt91 yt91VarM96903c = geg0Var.f79118a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("shareable_card", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(g4h0 g4h0Var, String str, byte b) {
        this.f35817c = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("tab", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(hog0 hog0Var, String str, String str2, String str3) {
        this.f35817c = hog0Var;
        yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("context_menu", str, null, str3, str2));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(rbh0 rbh0Var, byte b) {
        this.f35817c = rbh0Var;
        yt91 yt91VarM96903c = rbh0Var.f197600b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("no_results_message", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }

    public cag0(rbh0 rbh0Var) {
        this.f35817c = rbh0Var;
        yt91 yt91VarM96903c = rbh0Var.f197600b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("no_results_message", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f35816b = yt91VarM96903c.m94607a();
    }
}
