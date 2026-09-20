package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class h6e {

    /* JADX INFO: renamed from: a */
    public final Object f88071a;

    public h6e(List list) {
        this.f88071a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h6e) && this.f88071a.equals(((h6e) obj).f88071a);
    }

    public final int hashCode() {
        return this.f88071a.hashCode();
    }
}
