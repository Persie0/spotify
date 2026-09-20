package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ew7 {

    /* JADX INFO: renamed from: a */
    public final boolean f63446a;

    /* JADX INFO: renamed from: b */
    public final boolean f63447b;

    public ew7(boolean z, boolean z2) {
        this.f63446a = z;
        this.f63447b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew7)) {
            return false;
        }
        ew7 ew7Var = (ew7) obj;
        return this.f63446a == ew7Var.f63446a && this.f63447b == ew7Var.f63447b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63447b) + (Boolean.hashCode(this.f63446a) * 31);
    }
}
