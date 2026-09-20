package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xfc1 implements cgc1 {

    /* JADX INFO: renamed from: a */
    public final String f260927a;

    public xfc1(String str) {
        this.f260927a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfc1) && wj50.m88271j(this.f260927a, ((xfc1) obj).f260927a);
    }

    public final int hashCode() {
        return this.f260927a.hashCode();
    }
}
