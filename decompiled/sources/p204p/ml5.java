package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ml5 {

    /* JADX INFO: renamed from: a */
    public final String f144756a;

    /* JADX INFO: renamed from: b */
    public final String f144757b;

    public ml5(String str, String str2) {
        this.f144756a = str;
        this.f144757b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml5)) {
            return false;
        }
        ml5 ml5Var = (ml5) obj;
        return wj50.m88271j(this.f144756a, ml5Var.f144756a) && wj50.m88271j(this.f144757b, ml5Var.f144757b);
    }

    public final int hashCode() {
        return this.f144757b.hashCode() + (this.f144756a.hashCode() * 31);
    }
}
