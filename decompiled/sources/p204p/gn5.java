package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gn5 implements xn5 {

    /* JADX INFO: renamed from: a */
    public final String f81573a;

    public gn5(String str) {
        this.f81573a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn5) && wj50.m88271j(this.f81573a, ((gn5) obj).f81573a);
    }

    public final int hashCode() {
        return this.f81573a.hashCode();
    }
}
