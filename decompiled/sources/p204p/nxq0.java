package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class nxq0 {

    /* JADX INFO: renamed from: a */
    public final Object f159581a;

    public nxq0(List list) {
        this.f159581a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxq0) && this.f159581a.equals(((nxq0) obj).f159581a);
    }

    public final int hashCode() {
        return this.f159581a.hashCode();
    }
}
