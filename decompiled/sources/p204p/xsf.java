package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xsf {

    /* JADX INFO: renamed from: a */
    public final String f265584a;

    public xsf(String str) {
        this.f265584a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsf) && wj50.m88271j(this.f265584a, ((xsf) obj).f265584a);
    }

    public final int hashCode() {
        return Integer.hashCode(16) + mt60.m62800g(5, mt60.m62800g(3, this.f265584a.hashCode() * 31, 31), 31);
    }
}
