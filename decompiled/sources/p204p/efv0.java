package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class efv0 {

    /* JADX INFO: renamed from: a */
    public final Object f59132a;

    public efv0(List list) {
        this.f59132a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efv0) && this.f59132a.equals(((efv0) obj).f59132a);
    }

    public final int hashCode() {
        return this.f59132a.hashCode();
    }
}
