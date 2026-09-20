package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class hog0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93536a;

    /* JADX INFO: renamed from: b */
    public final st91 f93537b;

    /* JADX INFO: renamed from: c */
    public final zt91 f93538c;

    public hog0(int i, String str, st91 st91Var) {
        this.f93536a = i;
        switch (i) {
            case 4:
                this.f93537b = st91Var;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-games-fast-track-intro";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = str;
                this.f93538c = yt91VarM50626j.m94607a();
                break;
            case 5:
                this.f93537b = st91Var;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-games-fast-track-results";
                yt91VarM50626j2.f276052f = "1.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276048b = str;
                this.f93538c = yt91VarM50626j2.m94607a();
                break;
            case 14:
                this.f93537b = st91Var;
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-listening-activity-group-audience-row";
                yt91VarM50626j3.f276052f = "1.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276050d = str;
                this.f93538c = yt91VarM50626j3.m94607a();
                break;
            case 17:
                this.f93537b = st91Var;
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-lyrics-sharing";
                yt91VarM50626j4.f276052f = "1.1.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91VarM50626j4.f276050d = str;
                this.f93538c = yt91VarM50626j4.m94607a();
                break;
            default:
                this.f93537b = st91Var;
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-games-fast-track-gameplay";
                yt91VarM50626j5.f276052f = "1.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                yt91VarM50626j5.f276048b = str;
                this.f93538c = yt91VarM50626j5.m94607a();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public av91 m48030a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f93538c, this.f93537b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f93536a;
        st91 st91Var = this.f93537b;
        zt91 zt91Var = this.f93538c;
        switch (i) {
            case 0:
                st91 st91Var2 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                if (st91Var != null) {
                    arrayList.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var != null) {
                    arrayList2.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var4 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var != null) {
                    arrayList3.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
            case 3:
                st91 st91Var5 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var != null) {
                    arrayList4.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
            case 4:
                st91 st91Var6 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                if (st91Var != null) {
                    arrayList5.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList5, zt91Var, arrayList5);
            case 5:
                st91 st91Var7 = st91.f213865b;
                ArrayList arrayList6 = new ArrayList();
                if (st91Var != null) {
                    arrayList6.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList6, zt91Var, arrayList6);
            case 6:
                st91 st91Var8 = st91.f213865b;
                ArrayList arrayList7 = new ArrayList();
                if (st91Var != null) {
                    arrayList7.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList7, zt91Var, arrayList7);
            case 7:
                st91 st91Var9 = st91.f213865b;
                ArrayList arrayList8 = new ArrayList();
                if (st91Var != null) {
                    arrayList8.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList8, zt91Var, arrayList8);
            case 8:
                st91 st91Var10 = st91.f213865b;
                ArrayList arrayList9 = new ArrayList();
                if (st91Var != null) {
                    arrayList9.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList9, zt91Var, arrayList9);
            case 9:
                st91 st91Var11 = st91.f213865b;
                ArrayList arrayList10 = new ArrayList();
                if (st91Var != null) {
                    arrayList10.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList10, zt91Var, arrayList10);
            case 10:
                st91 st91Var12 = st91.f213865b;
                ArrayList arrayList11 = new ArrayList();
                if (st91Var != null) {
                    arrayList11.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList11, zt91Var, arrayList11);
            case 11:
                st91 st91Var13 = st91.f213865b;
                ArrayList arrayList12 = new ArrayList();
                if (st91Var != null) {
                    arrayList12.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList12, zt91Var, arrayList12);
            case 12:
                st91 st91Var14 = st91.f213865b;
                ArrayList arrayList13 = new ArrayList();
                if (st91Var != null) {
                    arrayList13.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList13, zt91Var, arrayList13);
            case 13:
                st91 st91Var15 = st91.f213865b;
                ArrayList arrayList14 = new ArrayList();
                if (st91Var != null) {
                    arrayList14.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList14, zt91Var, arrayList14);
            case 14:
                st91 st91Var16 = st91.f213865b;
                ArrayList arrayList15 = new ArrayList();
                if (st91Var != null) {
                    arrayList15.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList15, zt91Var, arrayList15);
            case 15:
                st91 st91Var17 = st91.f213865b;
                ArrayList arrayList16 = new ArrayList();
                if (st91Var != null) {
                    arrayList16.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList16, zt91Var, arrayList16);
            case 16:
                st91 st91Var18 = st91.f213865b;
                ArrayList arrayList17 = new ArrayList();
                if (st91Var != null) {
                    arrayList17.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList17, zt91Var, arrayList17);
            case 17:
                st91 st91Var19 = st91.f213865b;
                ArrayList arrayList18 = new ArrayList();
                if (st91Var != null) {
                    arrayList18.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList18, zt91Var, arrayList18);
            case 18:
                st91 st91Var20 = st91.f213865b;
                ArrayList arrayList19 = new ArrayList();
                if (st91Var != null) {
                    arrayList19.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList19, zt91Var, arrayList19);
            case 19:
                st91 st91Var21 = st91.f213865b;
                ArrayList arrayList20 = new ArrayList();
                if (st91Var != null) {
                    arrayList20.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList20, zt91Var, arrayList20);
            case 20:
                st91 st91Var22 = st91.f213865b;
                ArrayList arrayList21 = new ArrayList();
                if (st91Var != null) {
                    arrayList21.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList21, zt91Var, arrayList21);
            case 21:
                st91 st91Var23 = st91.f213865b;
                ArrayList arrayList22 = new ArrayList();
                if (st91Var != null) {
                    arrayList22.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList22, zt91Var, arrayList22);
            case 22:
                st91 st91Var24 = st91.f213865b;
                ArrayList arrayList23 = new ArrayList();
                if (st91Var != null) {
                    arrayList23.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList23, zt91Var, arrayList23);
            case 23:
                st91 st91Var25 = st91.f213865b;
                ArrayList arrayList24 = new ArrayList();
                if (st91Var != null) {
                    arrayList24.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList24, zt91Var, arrayList24);
            case 24:
                st91 st91Var26 = st91.f213865b;
                ArrayList arrayList25 = new ArrayList();
                if (st91Var != null) {
                    arrayList25.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList25, zt91Var, arrayList25);
            case 25:
                st91 st91Var27 = st91.f213865b;
                ArrayList arrayList26 = new ArrayList();
                if (st91Var != null) {
                    arrayList26.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList26, zt91Var, arrayList26);
            case 26:
                st91 st91Var28 = st91.f213865b;
                ArrayList arrayList27 = new ArrayList();
                arrayList27.addAll(st91Var.f213866a);
                ofg1.m66846o(zt91Var, "location");
                arrayList27.add(zt91Var);
                return new st91(arrayList27);
            case 27:
                st91 st91Var29 = st91.f213865b;
                ArrayList arrayList28 = new ArrayList();
                if (st91Var != null) {
                    arrayList28.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList28, zt91Var, arrayList28);
            case 28:
                st91 st91Var30 = st91.f213865b;
                ArrayList arrayList29 = new ArrayList();
                if (st91Var != null) {
                    arrayList29.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList29, zt91Var, arrayList29);
            default:
                st91 st91Var31 = st91.f213865b;
                ArrayList arrayList30 = new ArrayList();
                if (st91Var != null) {
                    arrayList30.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList30, zt91Var, arrayList30);
        }
    }

    /* JADX INFO: renamed from: e */
    public vog0 m48031e() {
        return new vog0(this, 0);
    }

    /* JADX INFO: renamed from: h */
    public av91 m48032h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("like", 1, Collections.singletonMap("item_to_be_liked", string)), this.f93538c, this.f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public av91 m48033i(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), this.f93538c, this.f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: j */
    public av91 m48034j() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f93538c, this.f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: k */
    public av91 m48035k() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f93538c, this.f93537b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: l */
    public s8g0 m48036l(String str) {
        return new s8g0(this, str);
    }

    /* JADX INFO: renamed from: m */
    public s8g0 m48037m(String str) {
        return new s8g0(this, str, (byte) 0);
    }

    /* JADX INFO: renamed from: n */
    public s8g0 m48038n(String str) {
        return new s8g0(this, str, (char) 0);
    }

    /* JADX INFO: renamed from: o */
    public s8g0 m48039o(String str) {
        return new s8g0(this, str, 0);
    }

    /* JADX INFO: renamed from: p */
    public vog0 m48040p() {
        return new vog0(this, 1);
    }

    /* JADX INFO: renamed from: q */
    public vog0 m48041q() {
        return new vog0(this, 2);
    }

    public hog0(int i, String str, String str2, st91 st91Var) {
        this.f93536a = i;
        switch (i) {
            case 24:
                this.f93537b = st91Var;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-now-playing-view-ads";
                yt91VarM50626j.f276052f = "9.1.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = str;
                yt91VarM50626j.f276050d = str2;
                this.f93538c = yt91VarM50626j.m94607a();
                break;
            default:
                this.f93537b = st91Var;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-episode-related-content";
                yt91VarM50626j2.f276052f = "2.1.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276048b = str;
                yt91VarM50626j2.f276050d = str2;
                this.f93538c = yt91VarM50626j2.m94607a();
                break;
        }
    }

    public hog0(String str, Integer num, st91 st91Var) {
        this.f93536a = 9;
        this.f93537b = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-genpods-onboarding-question";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276049c = num;
        this.f93538c = yt91VarM50626j.m94607a();
    }

    public hog0(st91 st91Var, int i) {
        this.f93536a = i;
        switch (i) {
            case 2:
                this.f93537b = st91Var;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-games-fast-track-entry-point";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j.m94607a();
                break;
            case 6:
                this.f93537b = st91Var;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-gen-alpha-parental-control-manage-content-search-elements";
                yt91VarM50626j2.f276052f = "1.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j2.m94607a();
                break;
            case 7:
                this.f93537b = st91Var;
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-gen-alpha-parental-controls-settings";
                yt91VarM50626j3.f276052f = "0.3.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j3.m94607a();
                break;
            case 8:
                this.f93537b = st91Var;
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-genpods-entity-editor";
                yt91VarM50626j4.f276052f = "1.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j4.m94607a();
                break;
            case 10:
                this.f93537b = st91Var;
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-genpods-personal-apps-settings";
                yt91VarM50626j5.f276052f = "1.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j5.m94607a();
                break;
            case 11:
                this.f93537b = st91Var;
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-genpods-show-picker-sheet";
                yt91VarM50626j6.f276052f = "1.0.0";
                yt91VarM50626j6.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j6.m94607a();
                break;
            case 12:
                this.f93537b = st91Var;
                zt91 zt91Var7 = zt91.f286105i;
                yt91 yt91VarM50626j7 = ihf1.m50626j();
                yt91VarM50626j7.f276054h = "music";
                yt91VarM50626j7.f276047a = "mobile-group-session-queue-header";
                yt91VarM50626j7.f276052f = "2.0.0";
                yt91VarM50626j7.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j7.m94607a();
                break;
            case 13:
                this.f93537b = st91Var;
                zt91 zt91Var8 = zt91.f286105i;
                yt91 yt91VarM50626j8 = ihf1.m50626j();
                yt91VarM50626j8.f276054h = "music";
                yt91VarM50626j8.f276047a = "mobile-in-app-message-click-action";
                yt91VarM50626j8.f276052f = "2.0.0";
                yt91VarM50626j8.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j8.m94607a();
                break;
            case 16:
                this.f93537b = st91Var;
                zt91 zt91Var9 = zt91.f286105i;
                yt91 yt91VarM50626j9 = ihf1.m50626j();
                yt91VarM50626j9.f276054h = "music";
                yt91VarM50626j9.f276047a = "mobile-lyrics-npv-lyrics-entry-point";
                yt91VarM50626j9.f276052f = "1.0.0";
                yt91VarM50626j9.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j9.m94607a();
                break;
            case 25:
                this.f93537b = st91Var;
                zt91 zt91Var10 = zt91.f286105i;
                yt91 yt91VarM50626j10 = ihf1.m50626j();
                yt91VarM50626j10.f276054h = "music";
                yt91VarM50626j10.f276047a = "mobile-now-playing-view-captions-button";
                yt91VarM50626j10.f276052f = "1.0.0";
                yt91VarM50626j10.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j10.m94607a();
                break;
            case 26:
                this.f93537b = st91Var;
                zt91 zt91Var11 = zt91.f286105i;
                yt91 yt91VarM50626j11 = ihf1.m50626j();
                yt91VarM50626j11.f276054h = "music";
                yt91VarM50626j11.f276047a = "mobile-nowplaying-upsell-smart-shuffle-button";
                yt91VarM50626j11.f276052f = "1.0.0";
                yt91VarM50626j11.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j11.m94607a();
                break;
            case 27:
                this.f93537b = st91Var;
                zt91 zt91Var12 = zt91.f286105i;
                yt91 yt91VarM50626j12 = ihf1.m50626j();
                yt91VarM50626j12.f276054h = "music";
                yt91VarM50626j12.f276047a = "mobile-playlist-added-by-user-attribution";
                yt91VarM50626j12.f276052f = "1.0.0";
                yt91VarM50626j12.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j12.m94607a();
                break;
            case 28:
                this.f93537b = st91Var;
                zt91 zt91Var13 = zt91.f286105i;
                yt91 yt91VarM50626j13 = ihf1.m50626j();
                yt91VarM50626j13.f276054h = "music";
                yt91VarM50626j13.f276047a = "mobile-playlist-change-artwork-element";
                yt91VarM50626j13.f276052f = "1.0.0";
                yt91VarM50626j13.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j13.m94607a();
                break;
            case 29:
                this.f93537b = st91Var;
                zt91 zt91Var14 = zt91.f286105i;
                yt91 yt91VarM50626j14 = ihf1.m50626j();
                yt91VarM50626j14.f276054h = "music";
                yt91VarM50626j14.f276047a = "mobile-playlist-entity-before-track-list";
                yt91VarM50626j14.f276052f = "11.0.0";
                yt91VarM50626j14.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j14.m94607a();
                break;
            default:
                this.f93537b = st91Var;
                zt91 zt91Var15 = zt91.f286105i;
                yt91 yt91VarM50626j15 = ihf1.m50626j();
                yt91VarM50626j15.f276054h = "music";
                yt91VarM50626j15.f276047a = "mobile-free-on-demand-download";
                yt91VarM50626j15.f276052f = "2.0.0";
                yt91VarM50626j15.f276053g = "20.0.5";
                this.f93538c = yt91VarM50626j15.m94607a();
                break;
        }
    }

    public hog0() {
        this.f93536a = 15;
        this.f93537b = st91.f213865b;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-live-room-dialogs";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f93538c = yt91VarM50626j.m94607a();
    }

    public hog0(String str, int i) {
        this.f93536a = i;
        switch (i) {
            case 19:
                this.f93537b = st91.f213865b;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-notifications-playback-controls-default-android";
                yt91VarM50626j.f276052f = "3.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = "";
                yt91VarM50626j.f276050d = str;
                this.f93538c = yt91VarM50626j.m94607a();
                break;
            case 20:
                this.f93537b = st91.f213865b;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-notifications-playback-controls-endless-feed-android";
                yt91VarM50626j2.f276052f = "2.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276048b = "";
                yt91VarM50626j2.f276050d = str;
                this.f93538c = yt91VarM50626j2.m94607a();
                break;
            case 21:
                this.f93537b = st91.f213865b;
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-notifications-playback-controls-feedback-android";
                yt91VarM50626j3.f276052f = "3.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276048b = "";
                yt91VarM50626j3.f276050d = str;
                this.f93538c = yt91VarM50626j3.m94607a();
                break;
            case 22:
                this.f93537b = st91.f213865b;
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-notifications-playback-controls-freetier-android";
                yt91VarM50626j4.f276052f = "3.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91VarM50626j4.f276048b = "";
                yt91VarM50626j4.f276050d = str;
                this.f93538c = yt91VarM50626j4.m94607a();
                break;
            case 23:
                this.f93537b = st91.f213865b;
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-notifications-playback-controls-podcast-android";
                yt91VarM50626j5.f276052f = "3.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                yt91VarM50626j5.f276048b = "";
                yt91VarM50626j5.f276050d = str;
                this.f93538c = yt91VarM50626j5.m94607a();
                break;
            default:
                this.f93537b = st91.f213865b;
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-notifications-playback-controls-ads-android";
                yt91VarM50626j6.f276052f = "5.0.0";
                yt91VarM50626j6.f276053g = "20.0.5";
                yt91VarM50626j6.f276048b = "";
                yt91VarM50626j6.f276050d = str;
                this.f93538c = yt91VarM50626j6.m94607a();
                break;
        }
    }
}
