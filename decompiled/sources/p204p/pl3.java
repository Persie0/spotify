package p204p;

import com.spotify.voiceassistants.playermodels.VoiceAssistantsPerformance;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class pl3 {

    /* JADX INFO: renamed from: a */
    public final am71 f178618a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f178619b = new LinkedHashMap();

    public pl3(am71 am71Var) {
        this.f178618a = am71Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m70250a(AbstractC1861fi abstractC1861fi) {
        abstractC1861fi.toString();
        LinkedHashMap linkedHashMap = this.f178619b;
        sr4 sr4Var = (sr4) linkedHashMap.get("allboarding_initial_load");
        if (sr4Var != null) {
            sr4Var.m79016f("allboarding_initial_load");
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, abstractC1861fi.f69733a);
            ((rr4) this.f178618a).m76276b(sr4Var.m79015d());
        }
        linkedHashMap.remove("allboarding_initial_load");
    }

    /* JADX INFO: renamed from: b */
    public final void m70251b(String str, AbstractC1861fi abstractC1861fi) {
        abstractC1861fi.toString();
        LinkedHashMap linkedHashMap = this.f178619b;
        sr4 sr4Var = (sr4) linkedHashMap.get("allboarding_load_more_" + str);
        if (sr4Var != null) {
            sr4Var.m79016f("allboarding_load_more");
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, abstractC1861fi.f69733a);
            ((rr4) this.f178618a).m76276b(sr4Var.m79015d());
        }
        linkedHashMap.remove("allboarding_load_more_" + str);
    }

    /* JADX INFO: renamed from: c */
    public final void m70252c(AbstractC1861fi abstractC1861fi) {
        abstractC1861fi.toString();
        LinkedHashMap linkedHashMap = this.f178619b;
        sr4 sr4Var = (sr4) linkedHashMap.get("allboarding_post");
        if (sr4Var != null) {
            sr4Var.m79016f("allboarding_post");
            sr4Var.m79013a(VoiceAssistantsPerformance.DIMENSION_OUTCOME, abstractC1861fi.f69733a);
            ((rr4) this.f178618a).m76276b(sr4Var.m79015d());
        }
        linkedHashMap.remove("allboarding_post");
    }
}
