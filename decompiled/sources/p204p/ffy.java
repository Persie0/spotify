package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ffy extends g0b1 {

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f69119f;

    /* JADX INFO: renamed from: g */
    public final boolean f69120g;

    public ffy(LinkedHashMap linkedHashMap, boolean z) {
        this.f69119f = linkedHashMap;
        this.f69120g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffy)) {
            return false;
        }
        ffy ffyVar = (ffy) obj;
        return this.f69119f.equals(ffyVar.f69119f) && this.f69120g == ffyVar.f69120g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69120g) + (this.f69119f.hashCode() * 31);
    }
}
