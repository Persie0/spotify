package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xlg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263143a;

    /* JADX INFO: renamed from: b */
    public final zt91 f263144b;

    /* JADX INFO: renamed from: c */
    public final List f263145c;

    public xlg0(String str, int i) {
        this.f263143a = i;
        switch (i) {
            case 3:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-credits-page";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276050d = str;
                this.f263144b = yt91VarM50626j.m94607a();
                this.f263145c = Collections.singletonList("track-credits/credits");
                break;
            case 7:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-edit-playlist-items-page";
                yt91VarM50626j2.f276052f = "7.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276050d = str;
                this.f263144b = yt91VarM50626j2.m94607a();
                this.f263145c = Collections.singletonList("playlist/edit-items");
                break;
            case 8:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-edit-playlist-metadata-page";
                yt91VarM50626j3.f276052f = "6.1.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276050d = str;
                this.f263144b = yt91VarM50626j3.m94607a();
                this.f263145c = Collections.singletonList("playlist/edit-metadata");
                break;
            case 14:
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-gated-content-bottom-sheet";
                yt91VarM50626j4.f276052f = "1.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                yt91VarM50626j4.f276050d = str;
                this.f263144b = yt91VarM50626j4.m94607a();
                this.f263145c = Collections.singletonList("gatedcontent/bottomsheet");
                break;
            case 18:
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-gen-alpha-blocking";
                yt91VarM50626j5.f276052f = "6.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                yt91VarM50626j5.f276050d = str;
                this.f263144b = yt91VarM50626j5.m94607a();
                this.f263145c = h6f.m46715L("kid-parental-blocking/artist", "kid-parental-blocking/track");
                break;
            default:
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-create-playlist";
                yt91VarM50626j6.f276052f = "6.1.0";
                yt91VarM50626j6.f276053g = "20.0.5";
                yt91VarM50626j6.f276048b = str;
                this.f263144b = yt91VarM50626j6.m94607a();
                this.f263145c = Collections.singletonList("playlist/create");
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f263143a;
        lau lauVar = lau.f131415a;
        zt91 zt91Var = this.f263144b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 1:
                st91 st91Var2 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 2:
                st91 st91Var3 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 3:
                st91 st91Var4 = st91.f213865b;
                st91 st91Var5 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList.add(zt91Var);
                return new st91(arrayList);
            case 4:
                st91 st91Var6 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 5:
                st91 st91Var7 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 6:
                st91 st91Var8 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 7:
                st91 st91Var9 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 8:
                st91 st91Var10 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 9:
                st91 st91Var11 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 10:
                st91 st91Var12 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 11:
                st91 st91Var13 = st91.f213865b;
                st91 st91Var14 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList2.add(zt91Var);
                return new st91(arrayList2);
            case 12:
                st91 st91Var15 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 13:
                st91 st91Var16 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 14:
                st91 st91Var17 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 15:
                st91 st91Var18 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 16:
                st91 st91Var19 = st91.f213865b;
                st91 st91Var20 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList3.add(zt91Var);
                return new st91(arrayList3);
            case 17:
                st91 st91Var21 = st91.f213865b;
                st91 st91Var22 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList4.add(zt91Var);
                return new st91(arrayList4);
            case 18:
                st91 st91Var23 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 19:
                st91 st91Var24 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 20:
                st91 st91Var25 = st91.f213865b;
                st91 st91Var26 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList5.add(zt91Var);
                return new st91(arrayList5);
            case 21:
                st91 st91Var27 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 22:
                st91 st91Var28 = st91.f213865b;
                st91 st91Var29 = st91.f213865b;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList6.add(zt91Var);
                return new st91(arrayList6);
            case 23:
                st91 st91Var30 = st91.f213865b;
                st91 st91Var31 = st91.f213865b;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList7.add(zt91Var);
                return new st91(arrayList7);
            case 24:
                st91 st91Var32 = st91.f213865b;
                st91 st91Var33 = st91.f213865b;
                ArrayList arrayList8 = new ArrayList();
                arrayList8.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList8.add(zt91Var);
                return new st91(arrayList8);
            case 25:
                st91 st91Var34 = st91.f213865b;
                st91 st91Var35 = st91.f213865b;
                ArrayList arrayList9 = new ArrayList();
                arrayList9.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList9.add(zt91Var);
                return new st91(arrayList9);
            case 26:
                st91 st91Var36 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 27:
                st91 st91Var37 = st91.f213865b;
                st91 st91Var38 = st91.f213865b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList10.add(zt91Var);
                return new st91(arrayList10);
            case 28:
                st91 st91Var39 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            default:
                st91 st91Var40 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
        }
    }

    public xlg0(int i, byte b) {
        this.f263143a = i;
        switch (i) {
            case 5:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-edit-group-chat-details";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j.m94607a();
                this.f263145c = Collections.singletonList("chat/edit-group-details");
                break;
            case 6:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-edit-playlist-cover-art";
                yt91VarM50626j2.f276052f = "2.1.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j2.m94607a();
                this.f263145c = Collections.singletonList("playlist/edit-coverart");
                break;
            case 7:
            case 8:
            case 12:
            case 14:
            case 15:
            case 18:
            default:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-dj-settings-language-page";
                yt91VarM50626j3.f276052f = "3.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j3.m94607a();
                this.f263145c = Collections.singletonList("contextmenu/djlanguagesettings");
                break;
            case 9:
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-edit-playlists-privacy-page";
                yt91VarM50626j4.f276052f = "1.1.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j4.m94607a();
                this.f263145c = Collections.singletonList("playlists/edit-privacy");
                break;
            case 10:
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-edit-playlists-profile-visibility-page";
                yt91VarM50626j5.f276052f = "3.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j5.m94607a();
                this.f263145c = Collections.singletonList("playlists/edit-profile-visibility");
                break;
            case 11:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-email-authentication-validate-otp";
                yt91VarM50626j6.f276052f = "0.1.0";
                yt91VarM50626j6.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j6.m94607a();
                this.f263145c = Collections.singletonList("emailauthentication/validateotp");
                break;
            case 13:
                zt91 zt91Var7 = zt91.f286105i;
                yt91 yt91VarM50626j7 = ihf1.m50626j();
                yt91VarM50626j7.f276054h = "music";
                yt91VarM50626j7.f276047a = "mobile-games-fast-track";
                yt91VarM50626j7.f276052f = "1.1.0";
                yt91VarM50626j7.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j7.m94607a();
                this.f263145c = h6f.m46715L("fast-track", "fast-track/page-1", "fast-track/page-2", "fast-track/page-3");
                break;
            case 16:
                st91 st91Var2 = st91.f213865b;
                zt91 zt91Var8 = zt91.f286105i;
                yt91 yt91VarM50626j8 = ihf1.m50626j();
                yt91VarM50626j8.f276054h = "music";
                yt91VarM50626j8.f276047a = "mobile-gen-alpha-accountclosure";
                yt91VarM50626j8.f276052f = "1.0.0";
                yt91VarM50626j8.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j8.m94607a();
                this.f263145c = Collections.singletonList("childaccountclosure");
                break;
            case 17:
                st91 st91Var3 = st91.f213865b;
                zt91 zt91Var9 = zt91.f286105i;
                yt91 yt91VarM50626j9 = ihf1.m50626j();
                yt91VarM50626j9.f276054h = "music";
                yt91VarM50626j9.f276047a = "mobile-gen-alpha-age-assurance-request-parental-consent";
                yt91VarM50626j9.f276052f = "1.0.0";
                yt91VarM50626j9.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j9.m94607a();
                this.f263145c = Collections.singletonList("age-assurance/request-parental-consent");
                break;
            case 19:
                zt91 zt91Var10 = zt91.f286105i;
                yt91 yt91VarM50626j10 = ihf1.m50626j();
                yt91VarM50626j10.f276054h = "music";
                yt91VarM50626j10.f276047a = "mobile-gen-alpha-change-pin";
                yt91VarM50626j10.f276052f = "2.0.0";
                yt91VarM50626j10.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j10.m94607a();
                this.f263145c = Collections.singletonList("changepin");
                break;
            case 20:
                st91 st91Var4 = st91.f213865b;
                zt91 zt91Var11 = zt91.f286105i;
                yt91 yt91VarM50626j11 = ihf1.m50626j();
                yt91VarM50626j11.f276054h = "music";
                yt91VarM50626j11.f276047a = "mobile-gen-alpha-child-led-signup-share-parental-consent";
                yt91VarM50626j11.f276052f = "1.2.0";
                yt91VarM50626j11.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j11.m94607a();
                this.f263145c = h6f.m46715L("child-led-signup/share-parental-consent", "age-assurance/share-parental-consent");
                break;
            case 21:
                zt91 zt91Var12 = zt91.f286105i;
                yt91 yt91VarM50626j12 = ihf1.m50626j();
                yt91VarM50626j12.f276054h = "music";
                yt91VarM50626j12.f276047a = "mobile-gen-alpha-graduation-approved";
                yt91VarM50626j12.f276052f = "2.0.0";
                yt91VarM50626j12.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j12.m94607a();
                this.f263145c = Collections.singletonList("graduation/approved");
                break;
            case 22:
                st91 st91Var5 = st91.f213865b;
                zt91 zt91Var13 = zt91.f286105i;
                yt91 yt91VarM50626j13 = ihf1.m50626j();
                yt91VarM50626j13.f276054h = "music";
                yt91VarM50626j13.f276047a = "mobile-gen-alpha-graduation-education";
                yt91VarM50626j13.f276052f = "1.0.0";
                yt91VarM50626j13.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j13.m94607a();
                this.f263145c = Collections.singletonList("graduation/education");
                break;
            case 23:
                st91 st91Var6 = st91.f213865b;
                zt91 zt91Var14 = zt91.f286105i;
                yt91 yt91VarM50626j14 = ihf1.m50626j();
                yt91VarM50626j14.f276054h = "music";
                yt91VarM50626j14.f276047a = "mobile-gen-alpha-graduation-postponed";
                yt91VarM50626j14.f276052f = "1.0.0";
                yt91VarM50626j14.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j14.m94607a();
                this.f263145c = Collections.singletonList("graduation/postponed");
                break;
            case 24:
                st91 st91Var7 = st91.f213865b;
                zt91 zt91Var15 = zt91.f286105i;
                yt91 yt91VarM50626j15 = ihf1.m50626j();
                yt91VarM50626j15.f276054h = "music";
                yt91VarM50626j15.f276047a = "mobile-gen-alpha-graduation-rejected";
                yt91VarM50626j15.f276052f = "1.0.0";
                yt91VarM50626j15.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j15.m94607a();
                this.f263145c = Collections.singletonList("graduation/rejected");
                break;
            case 25:
                st91 st91Var8 = st91.f213865b;
                zt91 zt91Var16 = zt91.f286105i;
                yt91 yt91VarM50626j16 = ihf1.m50626j();
                yt91VarM50626j16.f276054h = "music";
                yt91VarM50626j16.f276047a = "mobile-gen-alpha-graduation-requested";
                yt91VarM50626j16.f276052f = "1.0.0";
                yt91VarM50626j16.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j16.m94607a();
                this.f263145c = Collections.singletonList("graduation/requested");
                break;
            case 26:
                zt91 zt91Var17 = zt91.f286105i;
                yt91 yt91VarM50626j17 = ihf1.m50626j();
                yt91VarM50626j17.f276054h = "music";
                yt91VarM50626j17.f276047a = "mobile-gen-alpha-graduation-supervision";
                yt91VarM50626j17.f276052f = "2.0.0";
                yt91VarM50626j17.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j17.m94607a();
                this.f263145c = Collections.singletonList("graduation/supervision");
                break;
            case 27:
                st91 st91Var9 = st91.f213865b;
                zt91 zt91Var18 = zt91.f286105i;
                yt91 yt91VarM50626j18 = ihf1.m50626j();
                yt91VarM50626j18.f276054h = "music";
                yt91VarM50626j18.f276047a = "mobile-gen-alpha-graduation-terms";
                yt91VarM50626j18.f276052f = "1.0.0";
                yt91VarM50626j18.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j18.m94607a();
                this.f263145c = Collections.singletonList("graduation/terms");
                break;
            case 28:
                zt91 zt91Var19 = zt91.f286105i;
                yt91 yt91VarM50626j19 = ihf1.m50626j();
                yt91VarM50626j19.f276054h = "music";
                yt91VarM50626j19.f276047a = "mobile-gen-alpha-graduation-view-request";
                yt91VarM50626j19.f276052f = "2.0.0";
                yt91VarM50626j19.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j19.m94607a();
                this.f263145c = Collections.singletonList("graduation/view-request");
                break;
            case 29:
                zt91 zt91Var20 = zt91.f286105i;
                yt91 yt91VarM50626j20 = ihf1.m50626j();
                yt91VarM50626j20.f276054h = "music";
                yt91VarM50626j20.f276047a = "mobile-gen-alpha-kid-account-creation-ageverification";
                yt91VarM50626j20.f276052f = "3.0.0";
                yt91VarM50626j20.f276053g = "20.0.5";
                this.f263144b = yt91VarM50626j20.m94607a();
                this.f263145c = h6f.m46715L("kid-account-creation/age-verification", "kid-account-transition/age-verification");
                break;
        }
    }

    public xlg0(String str, String str2, int i) {
        this.f263143a = i;
        switch (i) {
            case 2:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-creator-artist-page";
                yt91VarM50626j.f276052f = "3.2.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = str;
                yt91VarM50626j.f276050d = str2;
                this.f263144b = yt91VarM50626j.m94607a();
                this.f263145c = Collections.singletonList("artist");
                break;
            case 15:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-gen-alpha-account-selection";
                yt91VarM50626j2.f276052f = "4.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276048b = str;
                yt91VarM50626j2.f276050d = str2;
                this.f263144b = yt91VarM50626j2.m94607a();
                this.f263145c = Collections.singletonList("kid-account-selection");
                break;
            default:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-cover-art-snake";
                yt91VarM50626j3.f276052f = "2.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276048b = str;
                yt91VarM50626j3.f276050d = str2;
                this.f263144b = yt91VarM50626j3.m94607a();
                this.f263145c = Collections.singletonList("playlist/cover-art-snake");
                break;
        }
    }

    public xlg0(int i) {
        String str;
        this.f263143a = 12;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-fan-event-redemption-sheet";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str = "deeplink";
        } else if (i == 2) {
            str = "hub_section";
        } else if (i == 3) {
            str = "notification";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "unknown";
        }
        yt91VarM50626j.f276051e = str;
        this.f263144b = yt91VarM50626j.m94607a();
        this.f263145c = Collections.singletonList("fan-events/redemption");
    }
}
