package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ddb1 implements edb1 {

    /* JADX INFO: renamed from: a */
    public final String f47764a;

    public ddb1(String str) {
        this.f47764a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ddb1) && wj50.m88271j(this.f47764a, ((ddb1) obj).f47764a);
    }

    public final int hashCode() {
        return this.f47764a.hashCode();
    }
}
