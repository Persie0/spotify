package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c340 {

    /* JADX INFO: renamed from: a */
    public final String f33551a;

    /* JADX INFO: renamed from: b */
    public final String f33552b;

    public c340(String str, String str2) {
        this.f33551a = str;
        this.f33552b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c340)) {
            return false;
        }
        c340 c340Var = (c340) obj;
        return wj50.m88271j(this.f33551a, c340Var.f33551a) && wj50.m88271j(this.f33552b, c340Var.f33552b);
    }

    public final int hashCode() {
        return this.f33552b.hashCode() + (this.f33551a.hashCode() * 31);
    }
}
