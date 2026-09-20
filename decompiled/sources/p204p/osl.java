package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class osl {

    /* JADX INFO: renamed from: a */
    public final String f168834a;

    public osl(String str) {
        this.f168834a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osl) && wj50.m88271j(this.f168834a, ((osl) obj).f168834a);
    }

    public final int hashCode() {
        return this.f168834a.hashCode();
    }
}
