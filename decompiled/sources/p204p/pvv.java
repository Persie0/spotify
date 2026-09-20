package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pvv extends wvv {

    /* JADX INFO: renamed from: a */
    public final boolean f181851a;

    public pvv(boolean z) {
        this.f181851a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvv) && this.f181851a == ((pvv) obj).f181851a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f181851a);
    }
}
