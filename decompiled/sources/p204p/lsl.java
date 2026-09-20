package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lsl {

    /* JADX INFO: renamed from: a */
    public final String f136565a;

    public lsl(String str) {
        this.f136565a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsl) && wj50.m88271j(this.f136565a, ((lsl) obj).f136565a);
    }

    public final int hashCode() {
        return this.f136565a.hashCode();
    }
}
