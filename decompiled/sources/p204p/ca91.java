package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ca91 {

    /* JADX INFO: renamed from: a */
    public final String f35787a;

    /* JADX INFO: renamed from: b */
    public final boolean f35788b;

    public ca91(String str, boolean z) {
        this.f35787a = str;
        this.f35788b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca91)) {
            return false;
        }
        ca91 ca91Var = (ca91) obj;
        return wj50.m88271j(this.f35787a, ca91Var.f35787a) && this.f35788b == ca91Var.f35788b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35788b) + (this.f35787a.hashCode() * 31);
    }
}
