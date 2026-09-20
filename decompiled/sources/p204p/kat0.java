package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kat0 implements qat0 {

    /* JADX INFO: renamed from: a */
    public final boolean f120962a;

    public kat0(boolean z) {
        this.f120962a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kat0) && this.f120962a == ((kat0) obj).f120962a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120962a);
    }
}
