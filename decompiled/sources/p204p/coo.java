package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class coo {

    /* JADX INFO: renamed from: a */
    public final String f40312a;

    /* JADX INFO: renamed from: b */
    public final int f40313b;

    public coo(String str, int i) {
        this.f40312a = str;
        this.f40313b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coo)) {
            return false;
        }
        coo cooVar = (coo) obj;
        return wj50.m88271j(this.f40312a, cooVar.f40312a) && this.f40313b == cooVar.f40313b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40313b) + (this.f40312a.hashCode() * 31);
    }
}
