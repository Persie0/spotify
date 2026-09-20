package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vth {

    /* JADX INFO: renamed from: a */
    public final String f244674a;

    /* JADX INFO: renamed from: b */
    public final String f244675b;

    public vth(String str, String str2) {
        this.f244674a = str;
        this.f244675b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vth)) {
            return false;
        }
        vth vthVar = (vth) obj;
        return wj50.m88271j(this.f244674a, vthVar.f244674a) && wj50.m88271j(this.f244675b, vthVar.f244675b);
    }

    public final int hashCode() {
        return this.f244675b.hashCode() + (this.f244674a.hashCode() * 31);
    }
}
