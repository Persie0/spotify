package p204p;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class oh4 implements oc60 {

    /* JADX INFO: renamed from: a */
    public final Set f165332a = Collections.newSetFromMap(new ConcurrentHashMap());

    @Override // p204p.oc60
    /* JADX INFO: renamed from: o */
    public final void mo64230o(i900 i900Var) {
        for (mc60 mc60Var : this.f165332a) {
            mc60Var.f142076b++;
            if (i900Var.f99885d) {
                mc60Var.f142077c++;
            }
        }
    }
}
