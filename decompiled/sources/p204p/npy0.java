package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class npy0 extends rpy0 {

    /* JADX INFO: renamed from: a */
    public final v9u f157093a;

    public npy0(v9u v9uVar) {
        this.f157093a = v9uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npy0) && wj50.m88271j(this.f157093a, ((npy0) obj).f157093a);
    }

    public final int hashCode() {
        return this.f157093a.hashCode();
    }
}
