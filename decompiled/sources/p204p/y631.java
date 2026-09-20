package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class y631 {

    /* JADX INFO: renamed from: a */
    public final a731 f269600a;

    /* JADX INFO: renamed from: b */
    public final hqb f269601b;

    public y631(a731 a731Var, hqb hqbVar) {
        this.f269600a = a731Var;
        this.f269601b = hqbVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m92858a() {
        hqb hqbVar = this.f269601b;
        if (hqbVar.isActive()) {
            hqbVar.resumeWith(i931.f99895a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y631.class != obj.getClass()) {
            return false;
        }
        y631 y631Var = (y631) obj;
        return wj50.m88271j(this.f269600a, y631Var.f269600a) && this.f269601b.equals(y631Var.f269601b);
    }

    public final int hashCode() {
        return this.f269601b.hashCode() + (this.f269600a.hashCode() * 31);
    }
}
