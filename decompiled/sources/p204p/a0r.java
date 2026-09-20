package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class a0r implements k0r {

    /* JADX INFO: renamed from: a */
    public final String f11157a;

    public a0r(String str) {
        this.f11157a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0r) && wj50.m88271j(this.f11157a, ((a0r) obj).f11157a);
    }

    public final int hashCode() {
        String str = this.f11157a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
