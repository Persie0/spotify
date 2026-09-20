package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wk3 implements xk3 {

    /* JADX INFO: renamed from: a */
    public final String f252113a;

    public wk3(String str) {
        this.f252113a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk3) && wj50.m88271j(this.f252113a, ((wk3) obj).f252113a);
    }

    public final int hashCode() {
        return this.f252113a.hashCode();
    }
}
