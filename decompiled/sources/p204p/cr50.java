package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cr50 {

    /* JADX INFO: renamed from: a */
    public final String f41191a;

    /* JADX INFO: renamed from: b */
    public final String f41192b;

    public cr50(String str, String str2) {
        this.f41191a = str;
        this.f41192b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr50)) {
            return false;
        }
        cr50 cr50Var = (cr50) obj;
        return wj50.m88271j(this.f41191a, cr50Var.f41191a) && wj50.m88271j(this.f41192b, cr50Var.f41192b);
    }

    public final int hashCode() {
        return this.f41192b.hashCode() + (this.f41191a.hashCode() * 31);
    }
}
