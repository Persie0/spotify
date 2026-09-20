package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gso extends iso {

    /* JADX INFO: renamed from: a */
    public final Object f83996a;

    public gso(Object obj) {
        this.f83996a = obj;
    }

    @Override // p204p.iso
    /* JADX INFO: renamed from: a */
    public final Object mo42569a() {
        return this.f83996a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gso) && wj50.m88271j(this.f83996a, ((gso) obj).f83996a);
    }

    public final int hashCode() {
        Object obj = this.f83996a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
