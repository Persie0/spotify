package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xdb1 implements zdb1 {

    /* JADX INFO: renamed from: a */
    public final String f260432a;

    public xdb1(String str) {
        this.f260432a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdb1) && wj50.m88271j(this.f260432a, ((xdb1) obj).f260432a);
    }

    public final int hashCode() {
        return this.f260432a.hashCode();
    }
}
