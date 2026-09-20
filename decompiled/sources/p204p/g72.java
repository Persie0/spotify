package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class g72 extends j72 {

    /* JADX INFO: renamed from: a */
    public final Object f77158a;

    public g72(Map map) {
        this.f77158a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g72) && this.f77158a.equals(((g72) obj).f77158a);
    }

    public final int hashCode() {
        return this.f77158a.hashCode();
    }
}
