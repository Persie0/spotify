package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ihm0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f102321a;

    public ihm0(LinkedHashMap linkedHashMap) {
        this.f102321a = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final Object m50662a(ghm0 ghm0Var) {
        Object obj = this.f102321a.get(ghm0Var);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(("Requested service of kind " + ghm0Var + " is not available").toString());
    }
}
