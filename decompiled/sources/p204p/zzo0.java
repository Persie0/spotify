package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zzo0 {

    /* JADX INFO: renamed from: a */
    public final boolean f288054a;

    /* JADX INFO: renamed from: b */
    public final boolean f288055b;

    public zzo0(boolean z, boolean z2) {
        this.f288054a = z;
        this.f288055b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo0)) {
            return false;
        }
        zzo0 zzo0Var = (zzo0) obj;
        return this.f288054a == zzo0Var.f288054a && this.f288055b == zzo0Var.f288055b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f288055b) + (Boolean.hashCode(this.f288054a) * 31);
    }
}
