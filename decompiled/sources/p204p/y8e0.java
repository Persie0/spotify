package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y8e0 {

    /* JADX INFO: renamed from: a */
    public final String f270289a;

    /* JADX INFO: renamed from: b */
    public final String f270290b;

    public y8e0(String str, String str2) {
        this.f270289a = str;
        this.f270290b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8e0)) {
            return false;
        }
        y8e0 y8e0Var = (y8e0) obj;
        return wj50.m88271j(this.f270289a, y8e0Var.f270289a) && wj50.m88271j(this.f270290b, y8e0Var.f270290b);
    }

    public final int hashCode() {
        return this.f270290b.hashCode() + (this.f270289a.hashCode() * 31);
    }
}
