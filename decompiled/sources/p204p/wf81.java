package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wf81 {

    /* JADX INFO: renamed from: a */
    public final String f250763a;

    /* JADX INFO: renamed from: b */
    public final String f250764b;

    public wf81(String str, String str2) {
        this.f250763a = str;
        this.f250764b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf81)) {
            return false;
        }
        wf81 wf81Var = (wf81) obj;
        return wj50.m88271j(this.f250763a, wf81Var.f250763a) && wj50.m88271j(this.f250764b, wf81Var.f250764b);
    }

    public final int hashCode() {
        return this.f250764b.hashCode() + (this.f250763a.hashCode() * 31);
    }
}
