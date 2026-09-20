package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o9t implements q9t {

    /* JADX INFO: renamed from: a */
    public final Object f163130a;

    public o9t(List list) {
        this.f163130a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9t) && this.f163130a.equals(((o9t) obj).f163130a);
    }

    public final int hashCode() {
        return this.f163130a.hashCode();
    }
}
