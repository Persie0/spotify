package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d350 {

    /* JADX INFO: renamed from: a */
    public final String f44772a;

    /* JADX INFO: renamed from: b */
    public final e350 f44773b;

    public d350(String str, e350 e350Var) {
        this.f44772a = str;
        this.f44773b = e350Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d350)) {
            return false;
        }
        d350 d350Var = (d350) obj;
        return wj50.m88271j(this.f44772a, d350Var.f44772a) && wj50.m88271j(this.f44773b, d350Var.f44773b);
    }

    public final int hashCode() {
        return this.f44773b.hashCode() + (this.f44772a.hashCode() * 31);
    }
}
