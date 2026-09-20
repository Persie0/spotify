package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class eel0 {

    /* JADX INFO: renamed from: a */
    public final String f58812a;

    /* JADX INFO: renamed from: b */
    public final l4x f58813b;

    /* JADX INFO: renamed from: c */
    public final Boolean f58814c;

    public eel0(String str, l4x l4xVar, Boolean bool) {
        this.f58812a = str;
        this.f58813b = l4xVar;
        this.f58814c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eel0)) {
            return false;
        }
        eel0 eel0Var = (eel0) obj;
        return wj50.m88271j(this.f58812a, eel0Var.f58812a) && wj50.m88271j(this.f58813b, eel0Var.f58813b) && wj50.m88271j(this.f58814c, eel0Var.f58814c);
    }

    public final int hashCode() {
        int iHashCode = this.f58812a.hashCode() * 31;
        l4x l4xVar = this.f58813b;
        int iHashCode2 = (iHashCode + (l4xVar == null ? 0 : l4xVar.hashCode())) * 31;
        Boolean bool = this.f58814c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
