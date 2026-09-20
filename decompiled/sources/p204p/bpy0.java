package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bpy0 {

    /* JADX INFO: renamed from: a */
    public final sr4 f29624a;

    /* JADX INFO: renamed from: b */
    public final String f29625b;

    public bpy0(sr4 sr4Var, String str) {
        this.f29624a = sr4Var;
        this.f29625b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpy0)) {
            return false;
        }
        bpy0 bpy0Var = (bpy0) obj;
        return wj50.m88271j(this.f29624a, bpy0Var.f29624a) && wj50.m88271j(this.f29625b, bpy0Var.f29625b);
    }

    public final int hashCode() {
        return this.f29625b.hashCode() + (this.f29624a.hashCode() * 31);
    }
}
