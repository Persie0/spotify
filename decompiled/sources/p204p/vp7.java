package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vp7 {

    /* JADX INFO: renamed from: a */
    public final zew f243607a;

    /* JADX INFO: renamed from: b */
    public final String f243608b;

    /* JADX INFO: renamed from: c */
    public final String f243609c;

    public vp7(zew zewVar, String str, String str2) {
        this.f243607a = zewVar;
        this.f243608b = str;
        this.f243609c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp7)) {
            return false;
        }
        vp7 vp7Var = (vp7) obj;
        return this.f243607a == vp7Var.f243607a && wj50.m88271j(this.f243608b, vp7Var.f243608b) && wj50.m88271j(this.f243609c, vp7Var.f243609c);
    }

    public final int hashCode() {
        return this.f243609c.hashCode() + s571.m77243b(this.f243607a.hashCode() * 31, 31, this.f243608b);
    }
}
