package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l97 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f131019a;

    /* JADX INFO: renamed from: b */
    public final boolean f131020b;

    public l97(String str, boolean z) {
        this.f131019a = str;
        this.f131020b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l97)) {
            return false;
        }
        l97 l97Var = (l97) obj;
        return wj50.m88271j(this.f131019a, l97Var.f131019a) && this.f131020b == l97Var.f131020b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131020b) + (this.f131019a.hashCode() * 31);
    }
}
