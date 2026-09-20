package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f0x implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f64739a;

    public f0x(String str) {
        this.f64739a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0x) && wj50.m88271j(this.f64739a, ((f0x) obj).f64739a);
    }

    public final int hashCode() {
        return this.f64739a.hashCode();
    }
}
