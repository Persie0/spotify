package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vht0 implements zht0 {

    /* JADX INFO: renamed from: a */
    public final Object f241557a;

    public vht0(Object obj) {
        this.f241557a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vht0) && wj50.m88271j(this.f241557a, ((vht0) obj).f241557a);
    }

    public final int hashCode() {
        Object obj = this.f241557a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
