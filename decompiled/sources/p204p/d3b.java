package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d3b implements qio {

    /* JADX INFO: renamed from: a */
    public w2b f44831a;

    /* JADX INFO: renamed from: b */
    public i2v f44832b = new i2v(12);

    /* JADX INFO: renamed from: c */
    public v3b f44833c = v3b.f236822n;

    /* JADX INFO: renamed from: d */
    public boolean f44834d;

    /* JADX INFO: renamed from: e */
    public qio f44835e;

    /* JADX INFO: renamed from: a */
    public final e3b m34813a(uio uioVar, int i) {
        c3b c3bVarM85806i;
        w2b w2bVar = this.f44831a;
        w2bVar.getClass();
        if (this.f44834d || uioVar == null) {
            c3bVarM85806i = null;
        } else {
            vk9 vk9Var = new vk9(3);
            vk9Var.m85815w(w2bVar);
            c3bVarM85806i = vk9Var.m85806i();
        }
        return new e3b(w2bVar, uioVar, this.f44832b.mo30418p0(), c3bVarM85806i, this.f44833c, i);
    }

    @Override // p204p.qio
    /* JADX INFO: renamed from: p0 */
    public final uio mo30418p0() {
        qio qioVar = this.f44835e;
        return m34813a(qioVar != null ? qioVar.mo30418p0() : null, 0);
    }
}
