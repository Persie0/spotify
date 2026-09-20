package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lqx implements irx {

    /* JADX INFO: renamed from: a */
    public final String f136158a;

    public lqx(String str) {
        this.f136158a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqx) && wj50.m88271j(this.f136158a, ((lqx) obj).f136158a);
    }

    public final int hashCode() {
        return this.f136158a.hashCode();
    }
}
