package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lbu {

    /* JADX INFO: renamed from: a */
    public final kbu f131719a;

    /* JADX INFO: renamed from: b */
    public final boolean f131720b;

    public lbu(kbu kbuVar, boolean z) {
        this.f131719a = kbuVar;
        this.f131720b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbu)) {
            return false;
        }
        lbu lbuVar = (lbu) obj;
        return wj50.m88271j(this.f131719a, lbuVar.f131719a) && this.f131720b == lbuVar.f131720b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131720b) + (this.f131719a.hashCode() * 31);
    }
}
