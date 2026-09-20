package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lji0 implements nji0 {

    /* JADX INFO: renamed from: a */
    public final String f134092a;

    public lji0(String str) {
        this.f134092a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lji0) && wj50.m88271j(this.f134092a, ((lji0) obj).f134092a);
    }

    public final int hashCode() {
        return this.f134092a.hashCode();
    }
}
