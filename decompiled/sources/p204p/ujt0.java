package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ujt0 implements yjt0 {

    /* JADX INFO: renamed from: a */
    public final String f231117a;

    /* JADX INFO: renamed from: b */
    public final String f231118b;

    public ujt0(String str, String str2) {
        this.f231117a = str;
        this.f231118b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujt0)) {
            return false;
        }
        ujt0 ujt0Var = (ujt0) obj;
        return wj50.m88271j(this.f231117a, ujt0Var.f231117a) && wj50.m88271j(this.f231118b, ujt0Var.f231118b);
    }

    public final int hashCode() {
        return s571.m77243b(this.f231117a.hashCode() * 31, 31, this.f231118b);
    }
}
