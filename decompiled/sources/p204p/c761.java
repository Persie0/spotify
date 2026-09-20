package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c761 {

    /* JADX INFO: renamed from: a */
    public final boolean f34764a;

    /* JADX INFO: renamed from: b */
    public final int f34765b;

    public c761(boolean z, int i) {
        this.f34764a = z;
        this.f34765b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c761)) {
            return false;
        }
        c761 c761Var = (c761) obj;
        return this.f34764a == c761Var.f34764a && this.f34765b == c761Var.f34765b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f34765b) + (Boolean.hashCode(this.f34764a) * 31);
    }
}
