package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lsc {

    /* JADX INFO: renamed from: a */
    public final String f136496a;

    public lsc(String str) {
        this.f136496a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsc) && wj50.m88271j(this.f136496a, ((lsc) obj).f136496a);
    }

    public final int hashCode() {
        return this.f136496a.hashCode();
    }
}
