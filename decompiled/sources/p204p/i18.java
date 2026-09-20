package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i18 {

    /* JADX INFO: renamed from: a */
    public final hc80 f97436a;

    /* JADX INFO: renamed from: b */
    public final my7 f97437b;

    public i18(hc80 hc80Var, my7 my7Var) {
        if (hc80Var == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f97436a = hc80Var;
        if (my7Var == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f97437b = my7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i18) {
            i18 i18Var = (i18) obj;
            if (this.f97436a.equals(i18Var.f97436a) && this.f97437b.equals(i18Var.f97437b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f97436a.hashCode() ^ 1000003) * 1000003) ^ this.f97437b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f97436a + ", cameraId=" + this.f97437b + "}";
    }
}
