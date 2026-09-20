package p204p;

import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class i8g0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99784a;

    /* JADX INFO: renamed from: b */
    public final zt91 f99785b;

    public i8g0(String str, int i) {
        this.f99784a = i;
        switch (i) {
            case 13:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-audiobook-consumption";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276050d = str;
                this.f99785b = yt91VarM50626j.m94607a();
                break;
            case 27:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-chat-settings";
                yt91VarM50626j2.f276052f = "1.1.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276050d = str;
                this.f99785b = yt91VarM50626j2.m94607a();
                break;
            case 28:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-chat-sharedby-chip";
                yt91VarM50626j3.f276052f = "3.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276050d = str;
                this.f99785b = yt91VarM50626j3.m94607a();
                break;
            default:
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-aligned-curation-first-save";
                yt91VarM50626j4.f276052f = "2.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91VarM50626j4.f276050d = str;
                this.f99785b = yt91VarM50626j4.m94607a();
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f99784a;
        lau lauVar = lau.f131415a;
        zt91 zt91Var = this.f99785b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 1:
                st91 st91Var2 = st91.f213865b;
                st91 st91Var3 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList.add(zt91Var);
                return new st91(arrayList);
            case 2:
                st91 st91Var4 = st91.f213865b;
                st91 st91Var5 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList2.add(zt91Var);
                return new st91(arrayList2);
            case 3:
                st91 st91Var6 = st91.f213865b;
                st91 st91Var7 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList3.add(zt91Var);
                return new st91(arrayList3);
            case 4:
                st91 st91Var8 = st91.f213865b;
                st91 st91Var9 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList4.add(zt91Var);
                return new st91(arrayList4);
            case 5:
                st91 st91Var10 = st91.f213865b;
                st91 st91Var11 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList5.add(zt91Var);
                return new st91(arrayList5);
            case 6:
                st91 st91Var12 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 7:
                st91 st91Var13 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 8:
                st91 st91Var14 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 9:
                st91 st91Var15 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 10:
                st91 st91Var16 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 11:
                st91 st91Var17 = st91.f213865b;
                st91 st91Var18 = st91.f213865b;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList6.add(zt91Var);
                return new st91(arrayList6);
            case 12:
                st91 st91Var19 = st91.f213865b;
                st91 st91Var20 = st91.f213865b;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList7.add(zt91Var);
                return new st91(arrayList7);
            case 13:
                st91 st91Var21 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 14:
                st91 st91Var22 = st91.f213865b;
                st91 st91Var23 = st91.f213865b;
                ArrayList arrayList8 = new ArrayList();
                arrayList8.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList8.add(zt91Var);
                return new st91(arrayList8);
            case 15:
                st91 st91Var24 = st91.f213865b;
                st91 st91Var25 = st91.f213865b;
                ArrayList arrayList9 = new ArrayList();
                arrayList9.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList9.add(zt91Var);
                return new st91(arrayList9);
            case 16:
                st91 st91Var26 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
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
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 21:
                st91 st91Var31 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 22:
                st91 st91Var32 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 23:
                st91 st91Var33 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 24:
                st91 st91Var34 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 25:
                st91 st91Var35 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 26:
                st91 st91Var36 = st91.f213865b;
                st91 st91Var37 = st91.f213865b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList10.add(zt91Var);
                return new st91(arrayList10);
            case 27:
                st91 st91Var38 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 28:
                st91 st91Var39 = st91.f213865b;
                st91 st91Var40 = st91.f213865b;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList11.add(zt91Var);
                return new st91(arrayList11);
            default:
                st91 st91Var41 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
        }
    }

    /* JADX INFO: renamed from: e */
    public av91 m49946e() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), this.f99785b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public x9g0 m49947h() {
        return new x9g0(this, (byte) 0);
    }

    public i8g0(int i) {
        String str;
        this.f99784a = 11;
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-audiobook-addon-consideration";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str = "audiobook_boost";
        } else if (i == 2) {
            str = "audiobook_family_mgr";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "audiobook_family_sub";
        }
        yt91VarM50626j.f276048b = str;
        this.f99785b = yt91VarM50626j.m94607a();
    }

    public i8g0(int i, byte b) {
        this.f99784a = i;
        switch (i) {
            case 1:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-account-switching-notifications";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j.m94607a();
                break;
            case 2:
                st91 st91Var2 = st91.f213865b;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-add-child-to-plan";
                yt91VarM50626j2.f276052f = "0.1.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j2.m94607a();
                break;
            case 3:
                st91 st91Var3 = st91.f213865b;
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-add-on-management";
                yt91VarM50626j3.f276052f = "0.2.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j3.m94607a();
                break;
            case 4:
                st91 st91Var4 = st91.f213865b;
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-ads-cmp-android";
                yt91VarM50626j4.f276052f = "1.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91VarM50626j4.f276051e = "User Consent";
                yt91VarM50626j4.f276050d = "https://c.spotify.com";
                this.f99785b = yt91VarM50626j4.m94607a();
                break;
            case 5:
                st91 st91Var5 = st91.f213865b;
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-agents-details";
                yt91VarM50626j5.f276052f = "1.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j5.m94607a();
                break;
            case 6:
            case 8:
            case 11:
            case 13:
            case 16:
            default:
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-account-linking-feedback-nudge";
                yt91VarM50626j6.f276052f = "2.0.0";
                yt91VarM50626j6.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j6.m94607a();
                break;
            case 7:
                zt91 zt91Var7 = zt91.f286105i;
                yt91 yt91VarM50626j7 = ihf1.m50626j();
                yt91VarM50626j7.f276054h = "music";
                yt91VarM50626j7.f276047a = "mobile-aligned-curation-messaging";
                yt91VarM50626j7.f276052f = "2.0.0";
                yt91VarM50626j7.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j7.m94607a();
                break;
            case 9:
                zt91 zt91Var8 = zt91.f286105i;
                yt91 yt91VarM50626j8 = ihf1.m50626j();
                yt91VarM50626j8.f276054h = "music";
                yt91VarM50626j8.f276047a = "mobile-allboarding-search";
                yt91VarM50626j8.f276052f = "5.0.0";
                yt91VarM50626j8.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j8.m94607a();
                break;
            case 10:
                zt91 zt91Var9 = zt91.f286105i;
                yt91 yt91VarM50626j9 = ihf1.m50626j();
                yt91VarM50626j9.f276054h = "music";
                yt91VarM50626j9.f276047a = "mobile-android-widget";
                yt91VarM50626j9.f276052f = "2.0.0";
                yt91VarM50626j9.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j9.m94607a();
                break;
            case 12:
                st91 st91Var6 = st91.f213865b;
                zt91 zt91Var10 = zt91.f286105i;
                yt91 yt91VarM50626j10 = ihf1.m50626j();
                yt91VarM50626j10.f276054h = "music";
                yt91VarM50626j10.f276047a = "mobile-audiobook-consumption-details";
                yt91VarM50626j10.f276052f = "0.1.0";
                yt91VarM50626j10.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j10.m94607a();
                break;
            case 14:
                st91 st91Var7 = st91.f213865b;
                zt91 zt91Var11 = zt91.f286105i;
                yt91 yt91VarM50626j11 = ihf1.m50626j();
                yt91VarM50626j11.f276054h = "music";
                yt91VarM50626j11.f276047a = "mobile-available-plans";
                yt91VarM50626j11.f276052f = "4.0.0";
                yt91VarM50626j11.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j11.m94607a();
                break;
            case 15:
                st91 st91Var8 = st91.f213865b;
                zt91 zt91Var12 = zt91.f286105i;
                yt91 yt91VarM50626j12 = ihf1.m50626j();
                yt91VarM50626j12.f276054h = "music";
                yt91VarM50626j12.f276047a = "mobile-billing-page";
                yt91VarM50626j12.f276052f = "0.1.0";
                yt91VarM50626j12.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j12.m94607a();
                break;
            case 17:
                zt91 zt91Var13 = zt91.f286105i;
                yt91 yt91VarM50626j13 = ihf1.m50626j();
                yt91VarM50626j13.f276054h = "music";
                yt91VarM50626j13.f276047a = "mobile-blend-edit-page";
                yt91VarM50626j13.f276052f = "3.0.0";
                yt91VarM50626j13.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j13.m94607a();
                break;
            case 18:
                zt91 zt91Var14 = zt91.f286105i;
                yt91 yt91VarM50626j14 = ihf1.m50626j();
                yt91VarM50626j14.f276054h = "music";
                yt91VarM50626j14.f276047a = "mobile-btpermissions-jam-acquisition-sheet";
                yt91VarM50626j14.f276052f = "7.0.0";
                yt91VarM50626j14.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j14.m94607a();
                break;
            case 19:
                zt91 zt91Var15 = zt91.f286105i;
                yt91 yt91VarM50626j15 = ihf1.m50626j();
                yt91VarM50626j15.f276054h = "music";
                yt91VarM50626j15.f276047a = "mobile-btpermissions-system-dialog-android";
                yt91VarM50626j15.f276052f = "4.0.0";
                yt91VarM50626j15.f276053g = "20.0.5";
                yt91VarM50626j15.f276048b = "android.btpermissions.dialog.system";
                this.f99785b = yt91VarM50626j15.m94607a();
                break;
            case 20:
                zt91 zt91Var16 = zt91.f286105i;
                yt91 yt91VarM50626j16 = ihf1.m50626j();
                yt91VarM50626j16.f276054h = "music";
                yt91VarM50626j16.f276047a = "mobile-business-information-page";
                yt91VarM50626j16.f276052f = "2.0.0";
                yt91VarM50626j16.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j16.m94607a();
                break;
            case 21:
                zt91 zt91Var17 = zt91.f286105i;
                yt91 yt91VarM50626j17 = ihf1.m50626j();
                yt91VarM50626j17.f276054h = "music";
                yt91VarM50626j17.f276047a = "mobile-carapplibrary-jam-participants";
                yt91VarM50626j17.f276052f = "1.0.0";
                yt91VarM50626j17.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j17.m94607a();
                break;
            case 22:
                zt91 zt91Var18 = zt91.f286105i;
                yt91 yt91VarM50626j18 = ihf1.m50626j();
                yt91VarM50626j18.f276054h = "music";
                yt91VarM50626j18.f276047a = "mobile-carapplibrary-jam-settings";
                yt91VarM50626j18.f276052f = "1.0.0";
                yt91VarM50626j18.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j18.m94607a();
                break;
            case 23:
                zt91 zt91Var19 = zt91.f286105i;
                yt91 yt91VarM50626j19 = ihf1.m50626j();
                yt91VarM50626j19.f276054h = "music";
                yt91VarM50626j19.f276047a = "mobile-carapplibrary-queue";
                yt91VarM50626j19.f276052f = "2.0.0";
                yt91VarM50626j19.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j19.m94607a();
                break;
            case 24:
                zt91 zt91Var20 = zt91.f286105i;
                yt91 yt91VarM50626j20 = ihf1.m50626j();
                yt91VarM50626j20.f276054h = "music";
                yt91VarM50626j20.f276047a = "mobile-carapplibrary-search";
                yt91VarM50626j20.f276052f = "2.0.0";
                yt91VarM50626j20.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j20.m94607a();
                break;
            case 25:
                zt91 zt91Var21 = zt91.f286105i;
                yt91 yt91VarM50626j21 = ihf1.m50626j();
                yt91VarM50626j21.f276054h = "music";
                yt91VarM50626j21.f276047a = "mobile-carapplibrary-tabs";
                yt91VarM50626j21.f276052f = "1.0.0";
                yt91VarM50626j21.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j21.m94607a();
                break;
            case 26:
                st91 st91Var9 = st91.f213865b;
                zt91 zt91Var22 = zt91.f286105i;
                yt91 yt91VarM50626j22 = ihf1.m50626j();
                yt91VarM50626j22.f276054h = "music";
                yt91VarM50626j22.f276047a = "mobile-chat-add-friends-sheet";
                yt91VarM50626j22.f276052f = "1.0.0";
                yt91VarM50626j22.f276053g = "20.0.5";
                this.f99785b = yt91VarM50626j22.m94607a();
                break;
        }
    }

    public i8g0(String str, String str2) {
        this.f99784a = 16;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-blend-data-story";
        yt91VarM50626j.f276052f = "5.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276050d = str2;
        this.f99785b = yt91VarM50626j.m94607a();
    }

    public i8g0(UUID uuid) {
        this.f99784a = 29;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-checkout-dialogs";
        yt91VarM50626j.f276052f = "3.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = uuid.toString();
        this.f99785b = yt91VarM50626j.m94607a();
    }

    public i8g0(String str, UUID uuid) {
        this.f99784a = 8;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-allboarding-carousel";
        yt91VarM50626j.f276052f = "1.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = uuid.toString();
        yt91VarM50626j.f276051e = str;
        this.f99785b = yt91VarM50626j.m94607a();
    }
}
