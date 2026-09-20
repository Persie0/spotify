package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class spb0 implements tpb0 {

    /* JADX INFO: renamed from: a */
    public final String f212794a;

    /* JADX INFO: renamed from: b */
    public final int f212795b;

    public spb0(String str, int i) {
        this.f212794a = str;
        this.f212795b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spb0)) {
            return false;
        }
        spb0 spb0Var = (spb0) obj;
        return wj50.m88271j(this.f212794a, spb0Var.f212794a) && this.f212795b == spb0Var.f212795b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f212795b) + (this.f212794a.hashCode() * 31);
    }
}
