package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hso extends iso {

    /* JADX INFO: renamed from: a */
    public final Object f94770a;

    public hso(Object obj) {
        this.f94770a = obj;
    }

    @Override // p204p.iso
    /* JADX INFO: renamed from: a */
    public final Object mo42569a() {
        return this.f94770a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hso) && wj50.m88271j(this.f94770a, ((hso) obj).f94770a);
    }

    public final int hashCode() {
        Object obj = this.f94770a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
