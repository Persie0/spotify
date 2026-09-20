package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dyk implements myk {

    /* JADX INFO: renamed from: a */
    public final String f54387a;

    /* JADX INFO: renamed from: b */
    public final int f54388b;

    public dyk(String str, int i) {
        this.f54387a = str;
        this.f54388b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyk)) {
            return false;
        }
        dyk dykVar = (dyk) obj;
        return wj50.m88271j(this.f54387a, dykVar.f54387a) && this.f54388b == dykVar.f54388b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54388b) + (this.f54387a.hashCode() * 31);
    }
}
