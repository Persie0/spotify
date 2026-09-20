package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes6.dex */
public final class x6j0 {

    /* JADX INFO: renamed from: a */
    public final am71 f258690a;

    /* JADX INFO: renamed from: b */
    public sr4 f258691b;

    public x6j0(am71 am71Var, int i) {
        switch (i) {
            case 1:
                this.f258690a = am71Var;
                break;
            default:
                this.f258690a = am71Var;
                this.f258691b = ((rr4) am71Var).m76275a("cwp_page_load");
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m90094a() {
        sr4 sr4Var = this.f258691b;
        sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "failure");
        sr4Var.m79016f("navigate");
        ((rr4) this.f258690a).m76276b(sr4Var.m79015d());
    }

    /* JADX INFO: renamed from: b */
    public void m90095b(int i, int i2) {
        String str;
        String str2;
        if (i == 1) {
            str = "success";
        } else if (i == 2) {
            str = "empty";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "error";
        }
        sr4 sr4Var = this.f258691b;
        if (sr4Var != null) {
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
            if (i2 == 1) {
                str2 = "network";
            } else if (i2 == 2) {
                str2 = "memory_cache";
            } else if (i2 == 3) {
                str2 = "http_cache";
            } else {
                if (i2 != 4) {
                    throw null;
                }
                str2 = "stale_http_cache";
            }
            sr4Var.m79013a("source", str2);
            sr4Var.m79016f("load_children");
            ((rr4) this.f258690a).m76276b(sr4Var.m79015d());
        } else {
            Logger.m3973i("Attempt to end a measurement that was not started or has already ended", new Object[0]);
        }
        this.f258691b = null;
    }

    /* JADX INFO: renamed from: c */
    public void m90096c(String str) {
        String str2;
        sr4 sr4VarM76275a = ((rr4) this.f258690a).m76275a("mbs_load_children_content");
        sr4VarM76275a.m79019k("load_children", null, (4 & 4) != 0);
        sr4VarM76275a.f213231f = "media-browser-service";
        k0j0 k0j0Var = k0j0.f118115a;
        if (wj50.m88271j(str, WidgetInteraction.Background.DESTINATION_HOME)) {
            str2 = "home";
        } else {
            x0j0 x0j0Var = x0j0.f256888a;
            if (wj50.m88271j(str, "spotify:recently-played")) {
                str2 = "recently-played";
            } else {
                g0j0 g0j0Var = g0j0.f75385a;
                if (wj50.m88271j(str, "spotify:browse")) {
                    str2 = "browse";
                } else {
                    o0j0 o0j0Var = o0j0.f160412a;
                    str2 = wj50.m88271j(str, "spotify:collection") ? "your-library" : "other";
                }
            }
        }
        sr4VarM76275a.m79013a("content_type", str2);
        sr4VarM76275a.m79013a("package_name", "androidx.car.app");
        sr4VarM76275a.m79014b("parent_id", str);
        this.f258691b = sr4VarM76275a;
    }

    /* JADX INFO: renamed from: d */
    public void m90097d() {
        sr4 sr4Var = this.f258691b;
        sr4Var.getClass();
        sr4Var.m79019k("navigate", null, (4 & 4) != 0);
        sr4Var.m79013a("page", hdg1.m47201q(2));
    }

    /* JADX INFO: renamed from: e */
    public void m90098e(String str) {
        sr4 sr4Var = this.f258691b;
        sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "success");
        sr4Var.m79014b("destination", str);
        sr4Var.m79016f("navigate");
        ((rr4) this.f258690a).m76276b(sr4Var.m79015d());
    }

    /* JADX INFO: renamed from: f */
    public void m90099f(int i) {
        sr4 sr4Var = this.f258691b;
        sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, "cancelled");
        sr4Var.m79014b("timeout_value", String.valueOf(i));
        sr4Var.m79016f("navigate");
        ((rr4) this.f258690a).m76276b(sr4Var.m79015d());
    }
}
