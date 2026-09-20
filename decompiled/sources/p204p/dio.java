package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dio extends eio {

    /* JADX INFO: renamed from: a */
    public final int f49448a;

    public dio(int i) {
        this.f49448a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dio) && this.f49448a == ((dio) obj).f49448a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f49448a);
    }
}
