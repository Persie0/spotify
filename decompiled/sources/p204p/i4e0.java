package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i4e0 {

    /* JADX INFO: renamed from: a */
    public final r1y f98514a;

    /* JADX INFO: renamed from: b */
    public final e4e0 f98515b;

    public i4e0(r1y r1yVar, e4e0 e4e0Var) {
        this.f98514a = r1yVar;
        this.f98515b = e4e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4e0)) {
            return false;
        }
        i4e0 i4e0Var = (i4e0) obj;
        return wj50.m88271j(this.f98514a, i4e0Var.f98514a) && wj50.m88271j(this.f98515b, i4e0Var.f98515b);
    }

    public final int hashCode() {
        return this.f98515b.hashCode() + (this.f98514a.hashCode() * 31);
    }
}
