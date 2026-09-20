package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d230 implements e230 {

    /* JADX INFO: renamed from: a */
    public final Object f44467a;

    public d230(Object obj) {
        this.f44467a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d230) && wj50.m88271j(this.f44467a, ((d230) obj).f44467a);
    }

    public final int hashCode() {
        Object obj = this.f44467a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
