package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cbh0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36127a;

    /* JADX INFO: renamed from: b */
    public final zt91 f36128b;

    /* JADX INFO: renamed from: c */
    public final List f36129c;

    public cbh0(String str, String str2, int i) {
        this.f36127a = i;
        switch (i) {
            case 14:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-song-dna-blend-page";
                yt91VarM50626j.f276052f = "4.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = str;
                yt91VarM50626j.f276050d = str2;
                this.f36128b = yt91VarM50626j.m94607a();
                this.f36129c = Collections.singletonList("blend-dna");
                break;
            case 17:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-storytelling-container";
                yt91VarM50626j2.f276052f = "8.1.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276048b = str;
                yt91VarM50626j2.f276050d = str2;
                this.f36128b = yt91VarM50626j2.m94607a();
                this.f36129c = h6f.m46715L("wrapped/datastories", "blend/data-story", "playlist/ondemand", "culturalmoments/stories");
                break;
            case 24:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-venue-entity";
                yt91VarM50626j3.f276052f = "1.2.1";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276048b = str;
                yt91VarM50626j3.f276050d = str2;
                this.f36128b = yt91VarM50626j3.m94607a();
                this.f36129c = Collections.singletonList("venue");
                break;
            default:
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-song-dna-artist-page";
                yt91VarM50626j4.f276052f = "3.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91VarM50626j4.f276048b = str;
                yt91VarM50626j4.f276050d = str2;
                this.f36128b = yt91VarM50626j4.m94607a();
                this.f36129c = Collections.singletonList("artists-dna");
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f36127a;
        lau lauVar = lau.f131415a;
        zt91 zt91Var = this.f36128b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 1:
                st91 st91Var2 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 2:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList.add(zt91Var);
                return new st91(arrayList);
            case 3:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList2.add(zt91Var);
                return new st91(arrayList2);
            case 4:
                st91 st91Var7 = st91.f213865b;
                st91 st91Var8 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList3.add(zt91Var);
                return new st91(arrayList3);
            case 5:
                st91 st91Var9 = st91.f213865b;
                st91 st91Var10 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList4.add(zt91Var);
                return new st91(arrayList4);
            case 6:
                st91 st91Var11 = st91.f213865b;
                st91 st91Var12 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList5.add(zt91Var);
                return new st91(arrayList5);
            case 7:
                st91 st91Var13 = st91.f213865b;
                st91 st91Var14 = st91.f213865b;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList6.add(zt91Var);
                return new st91(arrayList6);
            case 8:
                st91 st91Var15 = st91.f213865b;
                st91 st91Var16 = st91.f213865b;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList7.add(zt91Var);
                return new st91(arrayList7);
            case 9:
                st91 st91Var17 = st91.f213865b;
                st91 st91Var18 = st91.f213865b;
                ArrayList arrayList8 = new ArrayList();
                arrayList8.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList8.add(zt91Var);
                return new st91(arrayList8);
            case 10:
                st91 st91Var19 = st91.f213865b;
                st91 st91Var20 = st91.f213865b;
                ArrayList arrayList9 = new ArrayList();
                arrayList9.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList9.add(zt91Var);
                return new st91(arrayList9);
            case 11:
                st91 st91Var21 = st91.f213865b;
                st91 st91Var22 = st91.f213865b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList10.add(zt91Var);
                return new st91(arrayList10);
            case 12:
                st91 st91Var23 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 13:
                st91 st91Var24 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 14:
                st91 st91Var25 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 15:
                st91 st91Var26 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 16:
                st91 st91Var27 = st91.f213865b;
                st91 st91Var28 = st91.f213865b;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList11.add(zt91Var);
                return new st91(arrayList11);
            case 17:
                st91 st91Var29 = st91.f213865b;
                st91 st91Var30 = st91.f213865b;
                ArrayList arrayList12 = new ArrayList();
                arrayList12.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList12.add(zt91Var);
                return new st91(arrayList12);
            case 18:
                st91 st91Var31 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 19:
                st91 st91Var32 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 20:
                st91 st91Var33 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 21:
                st91 st91Var34 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 22:
                st91 st91Var35 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 23:
                st91 st91Var36 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 24:
                st91 st91Var37 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 25:
                st91 st91Var38 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 26:
                st91 st91Var39 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 27:
                st91 st91Var40 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 28:
                st91 st91Var41 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            default:
                st91 st91Var42 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
        }
    }

    /* JADX INFO: renamed from: h */
    public sxg0 m32161h() {
        return new sxg0(this, (char) 0);
    }

    /* JADX INFO: renamed from: i */
    public qih0 m32162i(String str) {
        return new qih0(this, str);
    }

    /* JADX INFO: renamed from: j */
    public qih0 m32163j() {
        return new qih0(this, (byte) 0);
    }

    /* JADX INFO: renamed from: k */
    public cag0 m32164k(String str) {
        return new cag0(this, str);
    }

    /* JADX INFO: renamed from: l */
    public qih0 m32165l() {
        return new qih0(this);
    }

    /* JADX INFO: renamed from: m */
    public sxg0 m32166m() {
        return new sxg0(this, 26, (byte) 0);
    }

    /* JADX INFO: renamed from: n */
    public sxg0 m32167n() {
        return new sxg0(this, 27, (byte) 0);
    }

    /* JADX INFO: renamed from: o */
    public cih0 m32168o() {
        return new cih0(this);
    }

    /* JADX INFO: renamed from: p */
    public g4h0 m32169p() {
        return new g4h0(this);
    }

    /* JADX INFO: renamed from: q */
    public hjh0 m32170q(Integer num, String str) {
        return new hjh0(this, num, str);
    }

    public cbh0(int i, byte b) {
        this.f36127a = i;
        switch (i) {
            case 1:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-settings-search";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j.m94607a();
                this.f36129c = Collections.singletonList("settings/search");
                break;
            case 2:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-signup-birthday-confirmation-modal";
                yt91VarM50626j2.f276052f = "2.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j2.m94607a();
                this.f36129c = Collections.singletonList("signup/ageconfirmation");
                break;
            case 3:
                st91 st91Var2 = st91.f213865b;
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-signup-country-picker-screen";
                yt91VarM50626j3.f276052f = "0.1.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j3.m94607a();
                this.f36129c = Collections.singletonList("phonenumber/callingcodepicker");
                break;
            case 4:
                st91 st91Var3 = st91.f213865b;
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-signup-displayname-screen";
                yt91VarM50626j4.f276052f = "2.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j4.m94607a();
                this.f36129c = Collections.singletonList("signup/displayname");
                break;
            case 5:
                st91 st91Var4 = st91.f213865b;
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-signup-email-dob-screen";
                yt91VarM50626j5.f276052f = "2.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j5.m94607a();
                this.f36129c = Collections.singletonList("signup/birthday");
                break;
            case 6:
                st91 st91Var5 = st91.f213865b;
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-signup-email-password-screen";
                yt91VarM50626j6.f276052f = "2.0.0";
                yt91VarM50626j6.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j6.m94607a();
                this.f36129c = Collections.singletonList("signup/password");
                break;
            case 7:
                st91 st91Var6 = st91.f213865b;
                zt91 zt91Var7 = zt91.f286105i;
                yt91 yt91VarM50626j7 = ihf1.m50626j();
                yt91VarM50626j7.f276054h = "music";
                yt91VarM50626j7.f276047a = "mobile-signup-email-screen";
                yt91VarM50626j7.f276052f = "2.0.0";
                yt91VarM50626j7.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j7.m94607a();
                this.f36129c = Collections.singletonList("signup/email");
                break;
            case 8:
            case 13:
            case 14:
            case 15:
            case 17:
            case 21:
            case 22:
            case 24:
            case 27:
            default:
                zt91 zt91Var8 = zt91.f286105i;
                yt91 yt91VarM50626j8 = ihf1.m50626j();
                yt91VarM50626j8.f276054h = "music";
                yt91VarM50626j8.f276047a = "mobile-remote-downloads-onboarding";
                yt91VarM50626j8.f276052f = "1.1.0";
                yt91VarM50626j8.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j8.m94607a();
                this.f36129c = Collections.singletonList("remotedownloads/onboarding");
                break;
            case 9:
                st91 st91Var7 = st91.f213865b;
                zt91 zt91Var9 = zt91.f286105i;
                yt91 yt91VarM50626j9 = ihf1.m50626j();
                yt91VarM50626j9.f276054h = "music";
                yt91VarM50626j9.f276047a = "mobile-signup-gender-selection-screen";
                yt91VarM50626j9.f276052f = "2.0.0";
                yt91VarM50626j9.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j9.m94607a();
                this.f36129c = Collections.singletonList("signup/gender");
                break;
            case 10:
                st91 st91Var8 = st91.f213865b;
                zt91 zt91Var10 = zt91.f286105i;
                yt91 yt91VarM50626j10 = ihf1.m50626j();
                yt91VarM50626j10.f276054h = "music";
                yt91VarM50626j10.f276047a = "mobile-signup-phone-number-screen";
                yt91VarM50626j10.f276052f = "0.1.0";
                yt91VarM50626j10.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j10.m94607a();
                this.f36129c = Collections.singletonList("phonenumber/phonenumberentry");
                break;
            case 11:
                st91 st91Var9 = st91.f213865b;
                zt91 zt91Var11 = zt91.f286105i;
                yt91 yt91VarM50626j11 = ihf1.m50626j();
                yt91VarM50626j11.f276054h = "music";
                yt91VarM50626j11.f276047a = "mobile-signup-validate-otp-screen";
                yt91VarM50626j11.f276052f = "0.1.0";
                yt91VarM50626j11.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j11.m94607a();
                this.f36129c = Collections.singletonList("phonenumber/validateotp");
                break;
            case 12:
                zt91 zt91Var12 = zt91.f286105i;
                yt91 yt91VarM50626j12 = ihf1.m50626j();
                yt91VarM50626j12.f276054h = "music";
                yt91VarM50626j12.f276047a = "mobile-skip-forward-picker";
                yt91VarM50626j12.f276052f = "1.0.0";
                yt91VarM50626j12.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j12.m94607a();
                this.f36129c = Collections.singletonList("bluejay/skip-forward");
                break;
            case 16:
                st91 st91Var10 = st91.f213865b;
                zt91 zt91Var13 = zt91.f286105i;
                yt91 yt91VarM50626j13 = ihf1.m50626j();
                yt91VarM50626j13.f276054h = "music";
                yt91VarM50626j13.f276047a = "mobile-start-screen";
                yt91VarM50626j13.f276052f = "0.1.0";
                yt91VarM50626j13.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j13.m94607a();
                this.f36129c = Collections.singletonList("start");
                break;
            case 18:
                zt91 zt91Var14 = zt91.f286105i;
                yt91 yt91VarM50626j14 = ihf1.m50626j();
                yt91VarM50626j14.f276054h = "music";
                yt91VarM50626j14.f276047a = "mobile-tab-bar";
                yt91VarM50626j14.f276052f = "11.1.0";
                yt91VarM50626j14.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j14.m94607a();
                this.f36129c = Collections.singletonList("any");
                break;
            case 19:
                zt91 zt91Var15 = zt91.f286105i;
                yt91 yt91VarM50626j15 = ihf1.m50626j();
                yt91VarM50626j15.f276054h = "music";
                yt91VarM50626j15.f276047a = "mobile-taste-profile";
                yt91VarM50626j15.f276052f = "3.1.0";
                yt91VarM50626j15.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j15.m94607a();
                this.f36129c = Collections.singletonList("tasteprofile");
                break;
            case 20:
                zt91 zt91Var16 = zt91.f286105i;
                yt91 yt91VarM50626j16 = ihf1.m50626j();
                yt91VarM50626j16.f276054h = "music";
                yt91VarM50626j16.f276047a = "mobile-track-page-free";
                yt91VarM50626j16.f276052f = "5.1.0";
                yt91VarM50626j16.f276053g = "20.0.5";
                yt91VarM50626j16.f276051e = "";
                this.f36128b = yt91VarM50626j16.m94607a();
                this.f36129c = Collections.singletonList("free-tier-track");
                break;
            case 23:
                zt91 zt91Var17 = zt91.f286105i;
                yt91 yt91VarM50626j17 = ihf1.m50626j();
                yt91VarM50626j17.f276054h = "music";
                yt91VarM50626j17.f276047a = "mobile-trending-near-you";
                yt91VarM50626j17.f276052f = "0.1.0";
                yt91VarM50626j17.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j17.m94607a();
                this.f36129c = Collections.singletonList("trending-near-you/entity");
                break;
            case 25:
                zt91 zt91Var18 = zt91.f286105i;
                yt91 yt91VarM50626j18 = ihf1.m50626j();
                yt91VarM50626j18.f276054h = "music";
                yt91VarM50626j18.f276047a = "mobile-voting-page";
                yt91VarM50626j18.f276052f = "1.0.0";
                yt91VarM50626j18.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j18.m94607a();
                this.f36129c = Collections.singletonList("voting/root");
                break;
            case 26:
                zt91 zt91Var19 = zt91.f286105i;
                yt91 yt91VarM50626j19 = ihf1.m50626j();
                yt91VarM50626j19.f276054h = "music";
                yt91VarM50626j19.f276047a = "mobile-voting-share-page";
                yt91VarM50626j19.f276052f = "1.0.0";
                yt91VarM50626j19.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j19.m94607a();
                this.f36129c = Collections.singletonList("voting/share");
                break;
            case 28:
                zt91 zt91Var20 = zt91.f286105i;
                yt91 yt91VarM50626j20 = ihf1.m50626j();
                yt91VarM50626j20.f276054h = "music";
                yt91VarM50626j20.f276047a = "mobile-widget-deprecation-educational-message";
                yt91VarM50626j20.f276052f = "1.0.0";
                yt91VarM50626j20.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j20.m94607a();
                this.f36129c = Collections.singletonList("any");
                break;
            case 29:
                zt91 zt91Var21 = zt91.f286105i;
                yt91 yt91VarM50626j21 = ihf1.m50626j();
                yt91VarM50626j21.f276054h = "music";
                yt91VarM50626j21.f276047a = "mobile-your-addons";
                yt91VarM50626j21.f276052f = "1.0.0";
                yt91VarM50626j21.f276053g = "20.0.5";
                this.f36128b = yt91VarM50626j21.m94607a();
                this.f36129c = Collections.singletonList("your-addons");
                break;
        }
    }

    public cbh0(int i) {
        String str;
        this.f36127a = 8;
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-signup-error-dialog";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str = "apple_signup";
        } else if (i == 2) {
            str = "facebook_signup";
        } else if (i == 3) {
            str = "google_signup";
        } else if (i == 4) {
            str = "naver_signup";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "phone_number_signup";
        }
        yt91VarM50626j.f276048b = str;
        this.f36128b = yt91VarM50626j.m94607a();
        this.f36129c = Collections.singletonList("signup/signupunavailable");
    }

    public cbh0(String str, int i) {
        this.f36127a = i;
        switch (i) {
            case 21:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-transcript-selection-sharing";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276050d = str;
                this.f36128b = yt91VarM50626j.m94607a();
                this.f36129c = Collections.singletonList("readalong/share");
                break;
            case 22:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-transcript-translation-selector";
                yt91VarM50626j2.f276052f = "1.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276050d = str;
                this.f36128b = yt91VarM50626j2.m94607a();
                this.f36129c = Collections.singletonList("readalong/languagepicker");
                break;
            default:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-song-dna-contributor-sheet";
                yt91VarM50626j3.f276052f = "2.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276050d = str;
                this.f36128b = yt91VarM50626j3.m94607a();
                this.f36129c = Collections.singletonList("song-dna-contributor");
                break;
        }
    }

    public cbh0(String str, String str2, Integer num, String str3) {
        this.f36127a = 27;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-watch-feed";
        yt91VarM50626j.f276052f = "21.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276051e = str2;
        yt91VarM50626j.f276050d = str3;
        this.f36128b = yt91VarM50626j.m94607a();
        this.f36129c = h6f.m46715L("watchfeed", "watchfeed-wrapped");
    }
}
