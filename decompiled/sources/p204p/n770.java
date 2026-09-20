package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class n770 {

    /* JADX INFO: renamed from: a */
    public final String f151091a;

    /* JADX INFO: renamed from: b */
    public final Map f151092b;

    public n770(String str, Map map) {
        this.f151091a = str;
        this.f151092b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n770)) {
            return false;
        }
        n770 n770Var = (n770) obj;
        return wj50.m88271j(this.f151091a, n770Var.f151091a) && wj50.m88271j(this.f151092b, n770Var.f151092b);
    }

    public final int hashCode() {
        return this.f151092b.hashCode() + (this.f151091a.hashCode() * 31);
    }

    public final String toString() {
        return "@" + this.f151091a + '(' + g6f.m43753y0(kkc0.m56704q0(this.f151092b), null, null, null, mxq.f148142T0, 31) + ')';
    }
}
