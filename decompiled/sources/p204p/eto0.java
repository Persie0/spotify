package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class eto0 {

    /* JADX INFO: renamed from: a */
    public final Object f62750a;

    public eto0(List list) {
        this.f62750a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eto0) && this.f62750a.equals(((eto0) obj).f62750a);
    }

    public final int hashCode() {
        return this.f62750a.hashCode();
    }
}
