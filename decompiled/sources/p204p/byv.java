package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class byv implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f32324a;

    public byv(int i) {
        this.f32324a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byv) && this.f32324a == ((byv) obj).f32324a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f32324a);
    }
}
