package p204p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public enum yj3 {
    CONTENT_PICKER(xgg1.m90662N1("ALLBOARDING_CONTENTPICKER", "allboarding/contentpicker", 144, kc3.f121351b), new voc1("spotify:internal:allboarding:origin:default")),
    SEARCH(xgg1.m90662N1("ALLBOARDING_SEARCH", "allboarding/search", 148, kc3.f121351b), new voc1("spotify:internal:allboarding:search")),
    SUMMARY(xgg1.m90662N1("ALLBOARDING_SEND", "allboarding/send", 149, kc3.f121351b), new voc1("spotify:internal:allboarding:send")),
    NOTIFICATION_PERMISSION(xgg1.m90662N1("PUSHOPTIN", "pushoptin", 1549, "pushoptin"), new voc1("spotify:internal:push-opt-in")),
    CAROUSEL(xgg1.m90662N1("ALLBOARDING_CAROUSEL", "allboarding/carousel", 143, kc3.f121351b), new voc1("spotify:internal:allboarding:carousel"));


    /* JADX INFO: renamed from: a */
    public final cbm0 f273279a;

    /* JADX INFO: renamed from: b */
    public final voc1 f273280b;

    static {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
    }

    yj3(cbm0 cbm0Var, voc1 voc1Var) {
        this.f273279a = cbm0Var;
        this.f273280b = voc1Var;
    }
}
