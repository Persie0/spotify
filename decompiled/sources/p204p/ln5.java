package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ln5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final String f135089a;

    public ln5(String str) {
        this.f135089a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln5) && wj50.m88271j(this.f135089a, ((ln5) obj).f135089a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f135089a.hashCode() * 31);
    }
}
