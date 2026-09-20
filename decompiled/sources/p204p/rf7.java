package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rf7 extends ri00 implements th00 {

    /* JADX INFO: renamed from: h */
    public static final rf7 f198536h = new rf7(2, sb7.class, "hitNavigateToWebviewUri", "hitNavigateToWebviewUri(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0);

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        sb7 sb7Var = (sb7) obj;
        String str = (String) obj2;
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", string)), sb7Var.f207371a, sb7Var.f207372b.f218769a, System.currentTimeMillis());
    }
}
