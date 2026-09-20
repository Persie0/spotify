package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class o5c1 extends q5c1 {

    /* JADX INFO: renamed from: a */
    public final Object f161943a;

    public o5c1(Set set) {
        this.f161943a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5c1) && this.f161943a.equals(((o5c1) obj).f161943a);
    }

    public final int hashCode() {
        return this.f161943a.hashCode();
    }
}
