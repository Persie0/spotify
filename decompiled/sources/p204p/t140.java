package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t140 {

    /* JADX INFO: renamed from: a */
    public final String f216153a;

    /* JADX INFO: renamed from: b */
    public final String f216154b;

    public t140(String str, String str2) {
        this.f216153a = str;
        this.f216154b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t140)) {
            return false;
        }
        t140 t140Var = (t140) obj;
        return wj50.m88271j(this.f216153a, t140Var.f216153a) && wj50.m88271j(this.f216154b, t140Var.f216154b);
    }

    public final int hashCode() {
        return this.f216154b.hashCode() + (this.f216153a.hashCode() * 31);
    }
}
