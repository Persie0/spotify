package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class otb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f169030a;

    /* JADX INFO: renamed from: b */
    public final q5c1 f169031b;

    /* JADX INFO: renamed from: c */
    public final String f169032c;

    public otb1(boolean z, q5c1 q5c1Var, String str) {
        this.f169030a = z;
        this.f169031b = q5c1Var;
        this.f169032c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otb1)) {
            return false;
        }
        otb1 otb1Var = (otb1) obj;
        return this.f169030a == otb1Var.f169030a && wj50.m88271j(this.f169031b, otb1Var.f169031b) && wj50.m88271j(this.f169032c, otb1Var.f169032c);
    }

    public final int hashCode() {
        return this.f169032c.hashCode() + ((this.f169031b.hashCode() + (Boolean.hashCode(this.f169030a) * 31)) * 31);
    }
}
