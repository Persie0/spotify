package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fl81 {

    /* JADX INFO: renamed from: a */
    public final kl81 f70725a;

    /* JADX INFO: renamed from: b */
    public final String f70726b;

    public fl81(kl81 kl81Var, String str) {
        this.f70725a = kl81Var;
        this.f70726b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl81)) {
            return false;
        }
        fl81 fl81Var = (fl81) obj;
        return wj50.m88271j(this.f70725a, fl81Var.f70725a) && wj50.m88271j(this.f70726b, fl81Var.f70726b);
    }

    public final int hashCode() {
        int iHashCode = this.f70725a.hashCode() * 31;
        String str = this.f70726b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
