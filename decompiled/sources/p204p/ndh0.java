package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ndh0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f152778a;

    /* JADX INFO: renamed from: b */
    public final zt91 f152779b;

    public ndh0(int i) {
        String str;
        this.f152778a = 0;
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-settings-item-partnerintegration";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str = "alexa_default_voice_assistant";
        } else if (i == 2) {
            str = "alexa_partner_integration";
        } else if (i == 3) {
            str = "google_maps";
        } else if (i == 4) {
            str = d6n0.f45731d;
        } else {
            if (i != 5) {
                throw null;
            }
            str = "waze";
        }
        yt91VarM50626j.f276048b = str;
        this.f152779b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f152778a;
        lau lauVar = lau.f131415a;
        zt91 zt91Var = this.f152779b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                st91 st91Var2 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList.add(zt91Var);
                return new st91(arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                st91 st91Var4 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList2.add(zt91Var);
                return new st91(arrayList2);
            case 2:
                st91 st91Var5 = st91.f213865b;
                st91 st91Var6 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(lauVar);
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
                st91 st91Var11 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList4.add(zt91Var);
                return new st91(arrayList4);
            case 7:
                st91 st91Var12 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
            case 8:
                st91 st91Var13 = st91.f213865b;
                st91 st91Var14 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(lauVar);
                ofg1.m66846o(zt91Var, "location");
                arrayList5.add(zt91Var);
                return new st91(arrayList5);
            default:
                st91 st91Var15 = st91.f213865b;
                return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
        }
    }

    public ndh0(int i, byte b) {
        this.f152778a = i;
        switch (i) {
            case 2:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-settings-item-version";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f152779b = yt91VarM50626j.m94607a();
                break;
            case 3:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-settings-page";
                yt91VarM50626j2.f276052f = "1.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f152779b = yt91VarM50626j2.m94607a();
                break;
            case 4:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-social-listening";
                yt91VarM50626j3.f276052f = "4.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                this.f152779b = yt91VarM50626j3.m94607a();
                break;
            case 5:
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-upcoming-hub";
                yt91VarM50626j4.f276052f = "2.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                this.f152779b = yt91VarM50626j4.m94607a();
                break;
            case 6:
            case 7:
            default:
                st91 st91Var2 = st91.f213865b;
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-settings-item-storagelocation";
                yt91VarM50626j5.f276052f = "0.1.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                this.f152779b = yt91VarM50626j5.m94607a();
                break;
            case 8:
                st91 st91Var3 = st91.f213865b;
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-widget-promo-native-android";
                yt91VarM50626j6.f276052f = "1.0.1";
                yt91VarM50626j6.f276053g = "20.0.5";
                this.f152779b = yt91VarM50626j6.m94607a();
                break;
            case 9:
                zt91 zt91Var7 = zt91.f286105i;
                yt91 yt91VarM50626j7 = ihf1.m50626j();
                yt91VarM50626j7.f276054h = "music";
                yt91VarM50626j7.f276047a = "mobile-widget-promo-overlay-android";
                yt91VarM50626j7.f276052f = "3.0.0";
                yt91VarM50626j7.f276053g = "20.0.5";
                this.f152779b = yt91VarM50626j7.m94607a();
                break;
        }
    }

    public ndh0(String str, int i) {
        this.f152778a = i;
        switch (i) {
            case 7:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-widget-npv-recommendations";
                yt91VarM50626j.f276052f = "7.1.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = str;
                this.f152779b = yt91VarM50626j.m94607a();
                break;
            default:
                st91 st91Var = st91.f213865b;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-watch-feed-pivoting";
                yt91VarM50626j2.f276052f = "2.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276050d = str;
                this.f152779b = yt91VarM50626j2.m94607a();
                break;
        }
    }
}
