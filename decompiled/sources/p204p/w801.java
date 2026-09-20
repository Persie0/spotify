package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w801 implements x801 {

    /* JADX INFO: renamed from: a */
    public final boolean f248820a;

    public w801(boolean z) {
        this.f248820a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w801) && this.f248820a == ((w801) obj).f248820a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248820a);
    }
}
