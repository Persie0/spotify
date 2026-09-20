package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vc31 implements wc31 {

    /* JADX INFO: renamed from: a */
    public final Object f239659a;

    public vc31(Object obj) {
        this.f239659a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc31) && wj50.m88271j(this.f239659a, ((vc31) obj).f239659a);
    }

    public final int hashCode() {
        Object obj = this.f239659a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
