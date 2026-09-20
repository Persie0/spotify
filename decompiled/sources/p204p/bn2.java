package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bn2 {

    /* JADX INFO: renamed from: a */
    public final String f28680a;

    /* JADX INFO: renamed from: b */
    public final wm2 f28681b;

    public bn2(String str, wm2 wm2Var) {
        this.f28680a = str;
        this.f28681b = wm2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn2)) {
            return false;
        }
        bn2 bn2Var = (bn2) obj;
        return wj50.m88271j(this.f28680a, bn2Var.f28680a) && wj50.m88271j(this.f28681b, bn2Var.f28681b);
    }

    public final int hashCode() {
        int iHashCode = this.f28680a.hashCode() * 31;
        wm2 wm2Var = this.f28681b;
        return iHashCode + (wm2Var == null ? 0 : wm2Var.hashCode());
    }
}
