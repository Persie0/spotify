package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tts0 {

    /* JADX INFO: renamed from: a */
    public final ty80 f223671a;

    /* JADX INFO: renamed from: b */
    public final kts0 f223672b;

    public tts0(ty80 ty80Var, kts0 kts0Var) {
        this.f223671a = ty80Var;
        this.f223672b = kts0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tts0)) {
            return false;
        }
        tts0 tts0Var = (tts0) obj;
        return wj50.m88271j(this.f223671a, tts0Var.f223671a) && wj50.m88271j(this.f223672b, tts0Var.f223672b);
    }

    public final int hashCode() {
        int iHashCode = this.f223671a.hashCode() * 31;
        kts0 kts0Var = this.f223672b;
        return iHashCode + (kts0Var == null ? 0 : kts0Var.hashCode());
    }
}
