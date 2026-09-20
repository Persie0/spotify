package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yli0 {

    /* JADX INFO: renamed from: a */
    public final boolean f274032a;

    public yli0(boolean z) {
        this.f274032a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yli0) && this.f274032a == ((yli0) obj).f274032a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274032a);
    }
}
