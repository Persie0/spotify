package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class spw0 implements tpw0 {

    /* JADX INFO: renamed from: a */
    public final String f212964a;

    /* JADX INFO: renamed from: b */
    public final ffj0 f212965b;

    public spw0(String str, ffj0 ffj0Var) {
        this.f212964a = str;
        this.f212965b = ffj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spw0)) {
            return false;
        }
        spw0 spw0Var = (spw0) obj;
        return wj50.m88271j(this.f212964a, spw0Var.f212964a) && this.f212965b == spw0Var.f212965b;
    }

    public final int hashCode() {
        String str = this.f212964a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ffj0 ffj0Var = this.f212965b;
        return iHashCode + (ffj0Var != null ? ffj0Var.hashCode() : 0);
    }
}
