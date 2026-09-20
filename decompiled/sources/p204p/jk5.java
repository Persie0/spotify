package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jk5 implements kk5 {

    /* JADX INFO: renamed from: a */
    public final String f113214a;

    public jk5(String str) {
        this.f113214a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jk5) && wj50.m88271j(this.f113214a, ((jk5) obj).f113214a);
    }

    @Override // p204p.kk5
    public final String getMessage() {
        return this.f113214a;
    }

    public final int hashCode() {
        return this.f113214a.hashCode();
    }
}
