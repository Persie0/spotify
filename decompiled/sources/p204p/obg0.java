package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class obg0 implements xt91, qv91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163642a;

    /* JADX INFO: renamed from: b */
    public final st91 f163643b;

    /* JADX INFO: renamed from: c */
    public final zt91 f163644c;

    public obg0(Integer num, String str, String str2, st91 st91Var) {
        this.f163642a = 1;
        this.f163643b = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-dj-entrypoint-section";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276050d = str2;
        this.f163644c = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f163642a;
        st91 st91Var = this.f163643b;
        zt91 zt91Var = this.f163644c;
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
            default:
                st91 st91Var4 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var != null) {
                    arrayList3.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
        }
    }

    @Override // p204p.qv91
    /* JADX INFO: renamed from: e */
    public final kt91 mo29028e() {
        switch (this.f163642a) {
            case 0:
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = this.f163644c;
                nu91Var.f248108b = this.f163643b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                return new kt91((ou91) nu91Var.m87248a());
            case 1:
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = this.f163644c;
                nu91Var2.f248108b = this.f163643b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                return new kt91((ou91) nu91Var2.m87248a());
            default:
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = this.f163644c;
                nu91Var3.f248108b = this.f163643b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                return new kt91((ou91) nu91Var3.m87248a());
        }
    }

    public obg0(int i, int i2, Integer num, String str, st91 st91Var) {
        this.f163642a = i2;
        String str2 = "audiobrowse_v2";
        switch (i2) {
            case 2:
                this.f163643b = st91Var;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-video-preview-card";
                yt91VarM50626j.f276052f = "3.3.0";
                yt91VarM50626j.f276053g = "20.0.5";
                if (i != 1) {
                    if (i == 2) {
                        str2 = "medium_density";
                    } else if (i == 3) {
                        str2 = "medium_density_carousel_promo";
                    } else {
                        if (i != 4) {
                            throw null;
                        }
                        str2 = "medium_density_promo";
                    }
                }
                yt91VarM50626j.f276048b = str2;
                yt91VarM50626j.f276049c = num;
                yt91VarM50626j.f276050d = str;
                this.f163644c = yt91VarM50626j.m94607a();
                return;
            default:
                this.f163643b = st91Var;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-audio-preview-card";
                yt91VarM50626j2.f276052f = "4.5.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                if (i != 1) {
                    if (i == 2) {
                        str2 = "medium_density";
                    } else if (i == 3) {
                        str2 = "medium_density_promo";
                    } else if (i == 4) {
                        str2 = "medium_density_promo_with_prerelease";
                    } else {
                        if (i != 5) {
                            throw null;
                        }
                        str2 = "medium_density_with_prerelease";
                    }
                }
                yt91VarM50626j2.f276048b = str2;
                yt91VarM50626j2.f276049c = num;
                yt91VarM50626j2.f276050d = str;
                this.f163644c = yt91VarM50626j2.m94607a();
                return;
        }
    }
}
