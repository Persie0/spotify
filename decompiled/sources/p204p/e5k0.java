package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class e5k0 extends f5k0 {

    /* JADX INFO: renamed from: a */
    public final String f56424a;

    public e5k0(String str) {
        this.f56424a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5k0) && wj50.m88271j(this.f56424a, ((e5k0) obj).f56424a);
    }

    public final int hashCode() {
        String str = this.f56424a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
