package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fe31 implements ie31 {

    /* JADX INFO: renamed from: a */
    public final String f68675a;

    public fe31(String str) {
        this.f68675a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe31) && wj50.m88271j(this.f68675a, ((fe31) obj).f68675a);
    }

    public final int hashCode() {
        return this.f68675a.hashCode();
    }
}
