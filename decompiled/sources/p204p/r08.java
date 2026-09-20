package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r08 {

    /* JADX INFO: renamed from: a */
    public final v761 f194396a;

    /* JADX INFO: renamed from: b */
    public final v761 f194397b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f194398c;

    public r08(v761 v761Var, v761 v761Var2, ArrayList arrayList) {
        if (v761Var == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f194396a = v761Var;
        if (v761Var2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f194397b = v761Var2;
        this.f194398c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r08)) {
            return false;
        }
        r08 r08Var = (r08) obj;
        return this.f194396a.equals(r08Var.f194396a) && this.f194397b.equals(r08Var.f194397b) && this.f194398c.equals(r08Var.f194398c);
    }

    public final int hashCode() {
        return ((((this.f194396a.hashCode() ^ 1000003) * 1000003) ^ this.f194397b.hashCode()) * 1000003) ^ this.f194398c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f194396a + ", secondarySurfaceEdge=" + this.f194397b + ", outConfigs=" + this.f194398c + "}";
    }
}
