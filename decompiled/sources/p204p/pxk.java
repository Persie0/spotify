package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pxk implements txk {

    /* JADX INFO: renamed from: a */
    public final Object f182324a;

    public pxk(List list) {
        this.f182324a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxk) && this.f182324a.equals(((pxk) obj).f182324a);
    }

    public final int hashCode() {
        return this.f182324a.hashCode();
    }
}
