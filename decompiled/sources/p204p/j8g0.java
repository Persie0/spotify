package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class j8g0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f109935a;

    /* JADX INFO: renamed from: b */
    public final zt91 f109936b;

    /* JADX INFO: renamed from: c */
    public final List f109937c;

    public j8g0(int i) {
        String str;
        this.f109935a = 6;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-on-demand-trial-snackbar";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        if (i == 1) {
            str = "download";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "shuffle";
        }
        yt91VarM50626j.f276048b = str;
        this.f109936b = yt91VarM50626j.m94607a();
        this.f109937c = Collections.singletonList("any");
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f109935a;
        zt91 zt91Var = this.f109936b;
        switch (i) {
            case 0:
                st91 st91Var = st91.f213865b;
                break;
            case 1:
                st91 st91Var2 = st91.f213865b;
                break;
            case 2:
                st91 st91Var3 = st91.f213865b;
                break;
            case 3:
                st91 st91Var4 = st91.f213865b;
                break;
            case 4:
                st91 st91Var5 = st91.f213865b;
                break;
            case 5:
                st91 st91Var6 = st91.f213865b;
                break;
            case 6:
                st91 st91Var7 = st91.f213865b;
                break;
            case 7:
                st91 st91Var8 = st91.f213865b;
                break;
            case 8:
                st91 st91Var9 = st91.f213865b;
                break;
            case 9:
                st91 st91Var10 = st91.f213865b;
                break;
            default:
                st91 st91Var11 = st91.f213865b;
                break;
        }
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        switch (this.f109935a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f109936b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var.f158542f = this.f109937c;
                return (ou91) nu91Var.m87248a();
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f109936b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var2.f158542f = this.f109937c;
                return (ou91) nu91Var2.m87248a();
            case 2:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f109936b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var3.f158542f = this.f109937c;
                return (ou91) nu91Var3.m87248a();
            case 3:
                nu91 nu91Var4 = new nu91();
                nu91Var4.f248107a = this.f109936b;
                nu91Var4.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var4.f158542f = this.f109937c;
                return (ou91) nu91Var4.m87248a();
            case 4:
                nu91 nu91Var5 = new nu91();
                nu91Var5.f248107a = this.f109936b;
                nu91Var5.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var5.f158542f = this.f109937c;
                return (ou91) nu91Var5.m87248a();
            case 5:
                nu91 nu91Var6 = new nu91();
                nu91Var6.f248107a = this.f109936b;
                nu91Var6.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var6.f158542f = this.f109937c;
                return (ou91) nu91Var6.m87248a();
            case 6:
                nu91 nu91Var7 = new nu91();
                nu91Var7.f248107a = this.f109936b;
                nu91Var7.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var7.f158542f = this.f109937c;
                return (ou91) nu91Var7.m87248a();
            case 7:
                nu91 nu91Var8 = new nu91();
                nu91Var8.f248107a = this.f109936b;
                nu91Var8.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var8.f158542f = this.f109937c;
                return (ou91) nu91Var8.m87248a();
            case 8:
                nu91 nu91Var9 = new nu91();
                nu91Var9.f248107a = this.f109936b;
                nu91Var9.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var9.f158542f = this.f109937c;
                return (ou91) nu91Var9.m87248a();
            case 9:
                nu91 nu91Var10 = new nu91();
                nu91Var10.f248107a = this.f109936b;
                nu91Var10.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var10.f158542f = this.f109937c;
                return (ou91) nu91Var10.m87248a();
            default:
                nu91 nu91Var11 = new nu91();
                nu91Var11.f248107a = this.f109936b;
                nu91Var11.f248109c = Long.valueOf(System.currentTimeMillis());
                nu91Var11.f158542f = this.f109937c;
                return (ou91) nu91Var11.m87248a();
        }
    }

    /* JADX INFO: renamed from: h */
    public av91 m52704h() {
        return new av91("", "", new dv91("drag", 1), new bv91("ui_navigate_back", 1, nau.f152117a), this.f109936b, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public av91 m52705i() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), this.f109936b, st91.f213865b, System.currentTimeMillis());
    }

    public j8g0(int i, byte b) {
        this.f109935a = i;
        switch (i) {
            case 1:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-connect-context-menu";
                yt91VarM50626j.f276052f = "2.1.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f109936b = yt91VarM50626j.m94607a();
                this.f109937c = Collections.singletonList("connect/contextmenu");
                break;
            case 2:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-connect-device-picker";
                yt91VarM50626j2.f276052f = "18.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f109936b = yt91VarM50626j2.m94607a();
                this.f109937c = Collections.singletonList("connect/devicepicker");
                break;
            case 3:
            case 4:
            case 6:
            case 8:
            default:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-account-switching-picker";
                yt91VarM50626j3.f276052f = "2.1.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                this.f109936b = yt91VarM50626j3.m94607a();
                this.f109937c = Collections.singletonList("accountswitching/picker");
                break;
            case 5:
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-now-playing-video-playback-settings-menu";
                yt91VarM50626j4.f276052f = "2.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                this.f109936b = yt91VarM50626j4.m94607a();
                this.f109937c = Collections.singletonList("nowplaying");
                break;
            case 7:
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-premium-destination";
                yt91VarM50626j5.f276052f = "2.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                this.f109936b = yt91VarM50626j5.m94607a();
                this.f109937c = Collections.singletonList("premium-destination");
                break;
            case 9:
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-prompt-playlist-cap-page";
                yt91VarM50626j6.f276052f = "2.0.0";
                yt91VarM50626j6.f276053g = "20.0.5";
                this.f109936b = yt91VarM50626j6.m94607a();
                this.f109937c = Collections.singletonList("magpie/cap");
                break;
        }
    }

    public j8g0(String str, int i) {
        this.f109935a = i;
        switch (i) {
            case 4:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-now-playing-pip";
                yt91VarM50626j.f276052f = "3.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276050d = str;
                this.f109936b = yt91VarM50626j.m94607a();
                this.f109937c = Collections.singletonList("nowplaying");
                break;
            case 10:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-workout-settings-bottom-sheet";
                yt91VarM50626j2.f276052f = "1.1.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276050d = str;
                this.f109936b = yt91VarM50626j2.m94607a();
                this.f109937c = Collections.singletonList("fitness/workout-settings");
                break;
            default:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-custom-reactions-picker";
                yt91VarM50626j3.f276052f = "1.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                yt91VarM50626j3.f276050d = str;
                this.f109936b = yt91VarM50626j3.m94607a();
                this.f109937c = Collections.singletonList("custom-reactions-picker");
                break;
        }
    }

    public j8g0(String str, String str2) {
        this.f109935a = 8;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-prerelease-page";
        yt91VarM50626j.f276052f = "7.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276050d = str2;
        this.f109936b = yt91VarM50626j.m94607a();
        this.f109937c = Collections.singletonList("prerelease");
    }
}
