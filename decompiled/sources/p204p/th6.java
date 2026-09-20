package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class th6 extends uh6 {

    /* JADX INFO: renamed from: a */
    public final boolean f220351a;

    public th6(boolean z) {
        this.f220351a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th6) && this.f220351a == ((th6) obj).f220351a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220351a);
    }
}
