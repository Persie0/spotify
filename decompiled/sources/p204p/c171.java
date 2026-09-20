package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c171 {

    /* JADX INFO: renamed from: a */
    public final String f33014a;

    /* JADX INFO: renamed from: b */
    public final int f33015b;

    public c171(String str, int i) {
        this.f33014a = str;
        this.f33015b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c171)) {
            return false;
        }
        c171 c171Var = (c171) obj;
        return wj50.m88271j(this.f33014a, c171Var.f33014a) && this.f33015b == c171Var.f33015b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f33015b) + (this.f33014a.hashCode() * 31);
    }
}
