package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class z2a0 {

    /* JADX INFO: renamed from: a */
    public final am71 f278528a;

    /* JADX INFO: renamed from: b */
    public final sr4 f278529b;

    /* JADX INFO: renamed from: c */
    public boolean f278530c;

    /* JADX INFO: renamed from: d */
    public boolean f278531d;

    public z2a0(am71 am71Var, String str, Map map) {
        this.f278528a = am71Var;
        sr4 sr4VarM76275a = ((rr4) am71Var).m76275a("mbs_load_root_content");
        sr4VarM76275a.f213231f = "media-browser-service";
        this.f278529b = sr4VarM76275a;
        sr4VarM76275a.m79019k("loading_root", null, (4 & 4) != 0);
        sr4VarM76275a.m79019k("get_root", null, (4 & 4) != 0);
        sr4VarM76275a.m79013a("package_name", str);
        for (Map.Entry entry : map.entrySet()) {
            this.f278529b.m79014b((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m95180a(int i, int i2) {
        if (this.f278531d) {
            return;
        }
        this.f278531d = true;
        sr4 sr4Var = this.f278529b;
        sr4Var.m79016f("load_children");
        sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, mt60.m62799f(i));
        sr4Var.m79013a("source", mt60.m62798e(i2));
        sr4Var.m79016f("loading_root");
        ((rr4) this.f278528a).m76276b(sr4Var.m79015d());
    }

    /* JADX INFO: renamed from: b */
    public final void m95181b(String str) {
        boolean z = this.f278530c;
        sr4 sr4Var = this.f278529b;
        if (z) {
            sr4Var.m79014b("duplicate_load", "true");
            return;
        }
        this.f278530c = true;
        sr4Var.m79014b("root_id", str);
        sr4Var.m79019k("load_children", null, (4 & 4) != 0);
    }
}
