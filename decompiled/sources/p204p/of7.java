package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class of7 extends ri00 implements th00 {

    /* JADX INFO: renamed from: h */
    public static final of7 f164657h = new of7(2, rb7.class, "hitUiNavigate", "hitUiNavigate(Ljava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiInteractionEvent;", 0);

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        rb7 rb7Var = (rb7) obj;
        String str = (String) obj2;
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), rb7Var.f197516a, rb7Var.f197517b.f218769a, System.currentTimeMillis());
    }
}
