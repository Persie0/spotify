package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gfc0 implements kfc0 {

    /* JADX INFO: renamed from: a */
    public final int f79327a;

    public gfc0(int i) {
        this.f79327a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfc0) && this.f79327a == ((gfc0) obj).f79327a;
    }

    @Override // p204p.kfc0
    public final int getCount() {
        return this.f79327a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79327a);
    }
}
