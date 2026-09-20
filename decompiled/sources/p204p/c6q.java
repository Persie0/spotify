package p204p;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes7.dex */
public final class c6q implements f001 {

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArraySet f34599a = new CopyOnWriteArraySet();

    @Override // p204p.f001
    /* JADX INFO: renamed from: a */
    public final void mo31587a() {
        Iterator it = this.f34599a.iterator();
        while (it.hasNext()) {
            ((f001) it.next()).mo31587a();
        }
    }
}
