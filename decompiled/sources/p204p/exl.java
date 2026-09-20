package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class exl {

    /* JADX INFO: renamed from: a */
    public final String f63791a;

    /* JADX INFO: renamed from: b */
    public final lxl f63792b;

    public exl(String str, lxl lxlVar) {
        this.f63791a = str;
        this.f63792b = lxlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exl)) {
            return false;
        }
        exl exlVar = (exl) obj;
        return wj50.m88271j(this.f63791a, exlVar.f63791a) && wj50.m88271j(this.f63792b, exlVar.f63792b);
    }

    public final int hashCode() {
        return this.f63792b.hashCode() + (this.f63791a.hashCode() * 31);
    }
}
