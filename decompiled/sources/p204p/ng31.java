package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ng31 implements vg31 {

    /* JADX INFO: renamed from: a */
    public final String f153545a;

    public ng31(String str) {
        this.f153545a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng31) && wj50.m88271j(this.f153545a, ((ng31) obj).f153545a);
    }

    public final int hashCode() {
        return this.f153545a.hashCode();
    }
}
