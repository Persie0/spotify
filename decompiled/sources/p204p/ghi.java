package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ghi {

    /* JADX INFO: renamed from: a */
    public final Object f79930a;

    /* JADX INFO: renamed from: b */
    public final boolean f79931b;

    public ghi(Object obj, boolean z) {
        this.f79930a = obj;
        this.f79931b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghi)) {
            return false;
        }
        ghi ghiVar = (ghi) obj;
        return wj50.m88271j(this.f79930a, ghiVar.f79930a) && this.f79931b == ghiVar.f79931b;
    }

    public final int hashCode() {
        Object obj = this.f79930a;
        return Boolean.hashCode(this.f79931b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
