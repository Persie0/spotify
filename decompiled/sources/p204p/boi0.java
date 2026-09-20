package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class boi0 {

    /* JADX INFO: renamed from: a */
    public final boolean f29185a;

    /* JADX INFO: renamed from: b */
    public final boolean f29186b;

    public boi0(boolean z, boolean z2) {
        this.f29185a = z;
        this.f29186b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boi0)) {
            return false;
        }
        boi0 boi0Var = (boi0) obj;
        return this.f29185a == boi0Var.f29185a && this.f29186b == boi0Var.f29186b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29186b) + (Boolean.hashCode(this.f29185a) * 31);
    }
}
