package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i581 implements j581 {

    /* JADX INFO: renamed from: a */
    public final int f98845a;

    /* JADX INFO: renamed from: b */
    public final String f98846b;

    public i581(int i, String str) {
        this.f98845a = i;
        this.f98846b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i581)) {
            return false;
        }
        i581 i581Var = (i581) obj;
        return this.f98845a == i581Var.f98845a && wj50.m88271j(this.f98846b, i581Var.f98846b);
    }

    public final int hashCode() {
        return this.f98846b.hashCode() + (Integer.hashCode(this.f98845a) * 31);
    }
}
