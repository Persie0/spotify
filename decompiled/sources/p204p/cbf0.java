package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class cbf0 extends dbf0 {

    /* JADX INFO: renamed from: a */
    public final Object f36107a;

    public cbf0(Object obj) {
        this.f36107a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbf0) && wj50.m88271j(this.f36107a, ((cbf0) obj).f36107a);
    }

    public final int hashCode() {
        return this.f36107a.hashCode();
    }
}
