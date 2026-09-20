package p204p;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yfq0 implements wfq0, Serializable {

    /* JADX INFO: renamed from: a */
    public final List f272313a;

    public yfq0(List list) {
        this.f272313a = list;
    }

    @Override // p204p.wfq0
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f272313a;
            if (i >= list.size()) {
                return true;
            }
            if (!((wfq0) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yfq0) {
            return this.f272313a.equals(((yfq0) obj).f272313a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f272313a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f272313a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
