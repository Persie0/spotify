package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p0x implements s2x {

    /* JADX INFO: renamed from: a */
    public final String f172826a;

    public p0x(String str) {
        this.f172826a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0x) && wj50.m88271j(this.f172826a, ((p0x) obj).f172826a);
    }

    public final int hashCode() {
        return this.f172826a.hashCode();
    }
}
