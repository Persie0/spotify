package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rob1 extends wob1 {

    /* JADX INFO: renamed from: a */
    public final int f201218a;

    /* JADX INFO: renamed from: b */
    public final String f201219b;

    /* JADX INFO: renamed from: c */
    public final String f201220c;

    /* JADX INFO: renamed from: d */
    public final psj f201221d;

    public rob1(int i, String str, String str2, psj psjVar) {
        this.f201218a = i;
        this.f201219b = str;
        this.f201220c = str2;
        this.f201221d = psjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rob1)) {
            return false;
        }
        rob1 rob1Var = (rob1) obj;
        return this.f201218a == rob1Var.f201218a && wj50.m88271j(this.f201219b, rob1Var.f201219b) && wj50.m88271j(this.f201220c, rob1Var.f201220c) && this.f201221d == rob1Var.f201221d;
    }

    public final int hashCode() {
        return this.f201221d.hashCode() + s571.m77243b(s571.m77243b(Integer.hashCode(this.f201218a) * 31, 31, this.f201219b), 31, this.f201220c);
    }
}
