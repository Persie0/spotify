package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zrb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f285606a;

    public zrb1(boolean z) {
        this.f285606a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrb1) && this.f285606a == ((zrb1) obj).f285606a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285606a);
    }
}
