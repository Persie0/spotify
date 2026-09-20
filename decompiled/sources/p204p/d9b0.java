package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class d9b0 implements f9b0 {

    /* JADX INFO: renamed from: a */
    public final int f46775a;

    public /* synthetic */ d9b0(int i) {
        this.f46775a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d9b0) {
            return this.f46775a == ((d9b0) obj).f46775a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46775a);
    }

    public final String toString() {
        return edb.m38563l("RawRes(resId=", this.f46775a, ")");
    }
}
