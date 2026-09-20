package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bvm0 {

    /* JADX INFO: renamed from: a */
    public final jmo f31395a;

    public bvm0(jmo jmoVar) {
        this.f31395a = jmoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvm0) && wj50.m88271j(this.f31395a, ((bvm0) obj).f31395a);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(18, -1997243204, 31);
        jmo jmoVar = this.f31395a;
        return iM62800g + (jmoVar == null ? 0 : jmoVar.hashCode());
    }
}
