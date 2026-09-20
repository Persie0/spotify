package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ev9 implements nv9 {

    /* JADX INFO: renamed from: a */
    public final mzq f63183a;

    /* JADX INFO: renamed from: b */
    public final String f63184b;

    public ev9(mzq mzqVar, String str) {
        this.f63183a = mzqVar;
        this.f63184b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev9)) {
            return false;
        }
        ev9 ev9Var = (ev9) obj;
        return this.f63183a == ev9Var.f63183a && wj50.m88271j(this.f63184b, ev9Var.f63184b);
    }

    public final int hashCode() {
        int iHashCode = this.f63183a.hashCode() * 31;
        String str = this.f63184b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
