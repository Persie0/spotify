package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class ltn0 implements xja1 {

    /* JADX INFO: renamed from: a */
    public static final ltn0 f136833a = new ltn0();

    /* JADX INFO: renamed from: b */
    public static final List f136834b = h6f.m46715L(new wja1("internal/personal-podcast/onboarding", laz.f131453U0), new wja1("internal/personal-podcast/onboarding/preset-picker", maz.f141730U0), new wja1("internal/personal-podcast/onboarding/preset-preview/{preset_id as text}", cyx.f43382T0), new wja1("internal/personal-podcast/onboarding/preset-submit/{preset_id as text}", gyx.f85768V0), new wja1("internal/personal-podcast/onboarding/custom-prompt", wyx.f256379W0), new wja1("internal/personal-podcast/onboarding/personalization/{preset_id as text}", yyx.f277608U0), new wja1("internal/personal-podcast/onboarding/personalization/{preset_id as text}/location-picker", zyx.f287704W0), new wja1("internal/personal-podcast/onboarding/personalization/{preset_id as text}/questionnaire", dzx.f54776V0));

    /* JADX INFO: renamed from: c */
    public static final List f136835c = h6f.m46715L(otn0.f170041d, stn0.f213937d, ttn0.f223645e, utn0.f233947e, ntn0.f158105d, ptn0.f181203e, qtn0.f192415e, rtn0.f202616e);

    /* JADX INFO: renamed from: d */
    public static final wg61 f136836d = new wg61(lin0.f133852f);

    @Override // p204p.xja1
    /* JADX INFO: renamed from: a */
    public final List mo27071a() {
        return f136835c;
    }

    @Override // p204p.xja1
    /* JADX INFO: renamed from: b */
    public final List mo27072b() {
        return f136834b;
    }

    /* JADX INFO: renamed from: c */
    public final he41 m59903c(String str) {
        eka1 eka1Var = (eka1) f136836d.getValue();
        Set set = ff41.f68906e;
        ff41 ff41VarM44796g = gif1.m44796g(str);
        if (ff41VarM44796g == null) {
            return null;
        }
        return eka1Var.m39275a(ff41VarM44796g);
    }
}
