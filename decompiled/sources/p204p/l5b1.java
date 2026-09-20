package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class l5b1 {

    /* JADX INFO: renamed from: a */
    public final w05 f129870a;

    /* JADX INFO: renamed from: b */
    public final bqs f129871b;

    public l5b1(w05 w05Var, bqs bqsVar) {
        this.f129870a = w05Var;
        this.f129871b = bqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5b1)) {
            return false;
        }
        l5b1 l5b1Var = (l5b1) obj;
        return wj50.m88271j(this.f129870a, l5b1Var.f129870a) && wj50.m88271j(this.f129871b, l5b1Var.f129871b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f129871b.hashCode() + (this.f129870a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f129870a + ", easing=" + this.f129871b + ", arcMode=ArcMode(value=0))";
    }
}
