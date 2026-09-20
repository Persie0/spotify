package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jmt implements qmt {

    /* JADX INFO: renamed from: a */
    public final String f113945a;

    public jmt(String str) {
        this.f113945a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m53792a() {
        return this.f113945a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmt) && wj50.m88271j(this.f113945a, ((jmt) obj).f113945a);
    }

    public final int hashCode() {
        return this.f113945a.hashCode();
    }
}
