package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class j9a0 implements daa0 {

    /* JADX INFO: renamed from: a */
    public final Object f110131a;

    public j9a0(Object obj) {
        this.f110131a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9a0) && wj50.m88271j(this.f110131a, ((j9a0) obj).f110131a);
    }

    public final int hashCode() {
        Object obj = this.f110131a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
