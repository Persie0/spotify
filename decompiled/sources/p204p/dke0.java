package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dke0 implements pmj {

    /* JADX INFO: renamed from: a */
    public final int f49961a;

    /* JADX INFO: renamed from: b */
    public final boolean f49962b;

    public dke0(String str, int i, boolean z) {
        this.f49961a = i;
        this.f49962b = z;
    }

    @Override // p204p.pmj
    /* JADX INFO: renamed from: a */
    public final hej mo26175a(r9b0 r9b0Var, u8b0 u8b0Var, oz8 oz8Var) {
        if (r9b0Var.f196984Y) {
            return new eke0(this);
        }
        sra0.m79109c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.f49961a;
        if (i == 1) {
            str = "MERGE";
        } else if (i == 2) {
            str = "ADD";
        } else if (i == 3) {
            str = "SUBTRACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
