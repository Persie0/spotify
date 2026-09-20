package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fso extends iso {

    /* JADX INFO: renamed from: a */
    public final Object f72910a;

    public fso(Object obj) {
        this.f72910a = obj;
    }

    @Override // p204p.iso
    /* JADX INFO: renamed from: a */
    public final Object mo42569a() {
        return this.f72910a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fso) && wj50.m88271j(this.f72910a, ((fso) obj).f72910a);
    }

    public final int hashCode() {
        Object obj = this.f72910a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
