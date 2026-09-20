package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ute1 implements vte1 {

    /* JADX INFO: renamed from: a */
    public final int f233905a;

    /* JADX INFO: renamed from: b */
    public final String f233906b;

    public ute1(int i, String str) {
        this.f233905a = i;
        this.f233906b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ute1)) {
            return false;
        }
        ute1 ute1Var = (ute1) obj;
        return this.f233905a == ute1Var.f233905a && wj50.m88271j(this.f233906b, ute1Var.f233906b);
    }

    public final int hashCode() {
        return this.f233906b.hashCode() + (Integer.hashCode(this.f233905a) * 31);
    }
}
