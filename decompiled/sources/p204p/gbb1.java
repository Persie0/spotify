package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gbb1 {

    /* JADX INFO: renamed from: a */
    public final String f78258a;

    /* JADX INFO: renamed from: b */
    public final String f78259b;

    /* JADX INFO: renamed from: c */
    public final int f78260c;

    public gbb1(String str, String str2, int i) {
        this.f78258a = str;
        this.f78259b = str2;
        this.f78260c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbb1)) {
            return false;
        }
        gbb1 gbb1Var = (gbb1) obj;
        return wj50.m88271j(this.f78258a, gbb1Var.f78258a) && wj50.m88271j(this.f78259b, gbb1Var.f78259b) && this.f78260c == gbb1Var.f78260c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78260c) + s571.m77243b(this.f78258a.hashCode() * 31, 31, this.f78259b);
    }
}
