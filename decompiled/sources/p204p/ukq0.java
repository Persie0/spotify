package p204p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class ukq0 {

    /* JADX INFO: renamed from: a */
    public final am71 f231342a;

    /* JADX INFO: renamed from: b */
    public sr4 f231343b;

    /* JADX INFO: renamed from: c */
    public boolean f231344c;

    /* JADX INFO: renamed from: f */
    public String f231347f;

    /* JADX INFO: renamed from: g */
    public boolean f231348g;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f231345d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f231346e = new LinkedHashSet();

    /* JADX INFO: renamed from: h */
    public final Handler f231349h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i */
    public final kk00 f231350i = new kk00(this, 27);

    public ukq0(am71 am71Var) {
        this.f231342a = am71Var;
    }

    /* JADX INFO: renamed from: g */
    public static void m83334g(ukq0 ukq0Var, String str) {
        sr4 sr4Var;
        if (!ukq0Var.f231345d.add(str) || (sr4Var = ukq0Var.f231343b) == null) {
            return;
        }
        sr4Var.m79019k(str, null, false);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m83335a() {
        m83336b("response_decode_map");
        m83336b("data_ready");
        m83334g(this, "data_to_useful_frame");
    }

    /* JADX INFO: renamed from: b */
    public final void m83336b(String str) {
        sr4 sr4Var;
        if (this.f231345d.contains(str) && this.f231346e.add(str) && (sr4Var = this.f231343b) != null) {
            sr4Var.m79016f(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m83337c(String str) {
        sr4 sr4Var = this.f231343b;
        if (sr4Var == null) {
            return;
        }
        this.f231349h.removeCallbacks(this.f231350i);
        sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, str);
        m83336b("premium_destination_readiness");
        ((rr4) this.f231342a).m76276b(sr4Var.m79015d());
        this.f231343b = null;
        this.f231344c = true;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m83338d() {
        sr4 sr4Var;
        if (this.f231343b == null && !this.f231344c) {
            sr4 sr4VarM76275a = ((rr4) this.f231342a).m76275a("premium_destination_readiness");
            sr4VarM76275a.m79013a("page_identifier", "premium-destination");
            sr4VarM76275a.m79013a("contract_version", "1");
            this.f231343b = sr4VarM76275a;
            if (this.f231345d.add("premium_destination_readiness") && (sr4Var = this.f231343b) != null) {
                sr4Var.m79019k("premium_destination_readiness", null, true);
            }
            m83334g(this, "data_ready");
            m83334g(this, "useful_content_ready");
            m83334g(this, "interactive_ready");
            m83334g(this, "hero_image_ready");
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m83339e(String str) {
        try {
            sr4 sr4Var = this.f231343b;
            if (sr4Var != null) {
                sr4Var.m79013a("surface_variant", str);
            }
            m83334g(this, "offers_request");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m83340f(String str, boolean z) {
        String str2;
        if (this.f231348g || this.f231344c) {
            return;
        }
        this.f231348g = true;
        sr4 sr4Var = this.f231343b;
        if (sr4Var != null) {
            sr4Var.m79013a("hero_image_outcome", str);
        }
        if (z) {
            m83336b("hero_image_ready");
        }
        if (!this.f231348g || (str2 = this.f231347f) == null) {
            return;
        }
        m83337c(str2);
    }
}
