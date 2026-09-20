package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c261 {

    /* JADX INFO: renamed from: a */
    public final Object f33303a;

    public c261(List list) {
        this.f33303a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c261) && this.f33303a.equals(((c261) obj).f33303a);
    }

    public final int hashCode() {
        return this.f33303a.hashCode();
    }
}
