package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class vi50 implements zi50 {

    /* JADX INFO: renamed from: a */
    public final boolean f241618a;

    public vi50(boolean z) {
        this.f241618a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vi50) && this.f241618a == ((vi50) obj).f241618a;
    }

    @Override // p204p.zi50
    public final String getName() {
        return "car_connection_type_changed";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f241618a);
    }
}
