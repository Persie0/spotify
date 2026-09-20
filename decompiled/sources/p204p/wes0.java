package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wes0 extends ofs0 {

    /* JADX INFO: renamed from: a */
    public final String f250617a;

    /* JADX INFO: renamed from: b */
    public final String f250618b;

    public wes0(String str, String str2) {
        this.f250617a = str;
        this.f250618b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wes0)) {
            return false;
        }
        wes0 wes0Var = (wes0) obj;
        return wj50.m88271j(this.f250617a, wes0Var.f250617a) && wj50.m88271j(this.f250618b, wes0Var.f250618b);
    }

    public final int hashCode() {
        return this.f250618b.hashCode() + (this.f250617a.hashCode() * 31);
    }
}
