package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hx60 implements kx60 {

    /* JADX INFO: renamed from: a */
    public final String f96147a;

    public hx60(String str) {
        this.f96147a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx60) && wj50.m88271j(this.f96147a, ((hx60) obj).f96147a);
    }

    public final int hashCode() {
        String str = this.f96147a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
