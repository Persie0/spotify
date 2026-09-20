package p204p;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class jrk implements Iterable {

    /* JADX INFO: renamed from: a */
    public final Object f115209a = new Object();

    /* JADX INFO: renamed from: b */
    public final HashMap f115210b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Set f115211c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    public List f115212d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public final int m54185a(ehs ehsVar) {
        int iIntValue;
        synchronized (this.f115209a) {
            try {
                iIntValue = this.f115210b.containsKey(ehsVar) ? ((Integer) this.f115210b.get(ehsVar)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f115209a) {
            it = this.f115212d.iterator();
        }
        return it;
    }
}
