package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sci0 implements tci0 {

    /* JADX INFO: renamed from: a */
    public final int f207750a;

    public sci0(int i) {
        this.f207750a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sci0) && this.f207750a == ((sci0) obj).f207750a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207750a);
    }
}
