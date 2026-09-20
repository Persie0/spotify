package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class plr0 extends tlr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f178776a;

    public plr0(boolean z) {
        this.f178776a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof plr0) && this.f178776a == ((plr0) obj).f178776a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178776a);
    }
}
