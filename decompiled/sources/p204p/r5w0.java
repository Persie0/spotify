package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class r5w0 implements ise0 {

    /* JADX INFO: renamed from: a */
    public final Set f196139a;

    @Override // p204p.ise0
    /* JADX INFO: renamed from: a */
    public boolean mo51519a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (this.f196139a.contains(((kse0) it.next()).f125937a)) {
                return false;
            }
        }
        return true;
    }
}
