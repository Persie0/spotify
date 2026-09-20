package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mnz implements Iterable {

    /* JADX INFO: renamed from: a */
    public final xul0 f145504a;

    public mnz() {
        this.f145504a = C2244p5.f174033a;
    }

    public final String toString() {
        Iterator it = ((Iterable) this.f145504a.mo49280e(this)).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    public mnz(Iterable iterable) {
        this.f145504a = xul0.m92201d(iterable);
    }
}
