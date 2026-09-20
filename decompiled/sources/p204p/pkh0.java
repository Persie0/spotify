package p204p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class pkh0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f178462a;

    /* JADX INFO: renamed from: b */
    public final zt91 f178463b;

    /* JADX INFO: renamed from: c */
    public final List f178464c;

    public pkh0(int i) {
        this.f178462a = i;
        switch (i) {
            case 3:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-your-listening-highlight-details";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f178463b = yt91VarM50626j.m94607a();
                this.f178464c = Collections.singletonList("listeningstats/highlight-details");
                break;
            case 4:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-your-listening-summary";
                yt91VarM50626j2.f276052f = "1.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f178463b = yt91VarM50626j2.m94607a();
                this.f178464c = Collections.singletonList("listeningstats/summary");
                break;
            case 5:
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-your-plan";
                yt91VarM50626j3.f276052f = "1.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                this.f178463b = yt91VarM50626j3.m94607a();
                this.f178464c = Collections.singletonList("your-plan");
                break;
            case 6:
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-your-premium-page";
                yt91VarM50626j4.f276052f = "3.0.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                this.f178463b = yt91VarM50626j4.m94607a();
                this.f178464c = Collections.singletonList("your-premium");
                break;
            default:
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-your-library-search-page";
                yt91VarM50626j5.f276052f = "4.0.0";
                yt91VarM50626j5.f276053g = "20.0.5";
                this.f178463b = yt91VarM50626j5.m94607a();
                this.f178464c = Collections.singletonList("yourlibrary/search");
                break;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f178462a;
        zt91 zt91Var = this.f178463b;
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
            default:
                st91 st91Var7 = st91.f213865b;
                break;
        }
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public qih0 m70218e() {
        return new qih0(this, 13);
    }

    /* JADX INFO: renamed from: h */
    public qih0 m70219h() {
        return new qih0(this, (char) 0);
    }

    public pkh0(String str, int i) {
        this.f178462a = i;
        switch (i) {
            case 1:
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-your-library-page";
                yt91VarM50626j.f276052f = "9.1.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276048b = str;
                this.f178463b = yt91VarM50626j.m94607a();
                this.f178464c = Collections.singletonList("yourlibrary");
                break;
            default:
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-your-library-folder-page";
                yt91VarM50626j2.f276052f = "3.0.1";
                yt91VarM50626j2.f276053g = "20.0.5";
                yt91VarM50626j2.f276048b = str;
                this.f178463b = yt91VarM50626j2.m94607a();
                this.f178464c = Collections.singletonList("playlist/folder");
                break;
        }
    }
}
