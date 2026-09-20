package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qnp implements zb80 {

    /* JADX INFO: renamed from: a */
    public final onp f190674a;

    /* JADX INFO: renamed from: b */
    public final zb80 f190675b;

    public qnp(onp onpVar, zb80 zb80Var) {
        this.f190674a = onpVar;
        this.f190675b = zb80Var;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        int i = pnp.f179453a[ta80Var.ordinal()];
        onp onpVar = this.f190674a;
        switch (i) {
            case 1:
                onpVar.onCreate(hc80Var);
                break;
            case 2:
                onpVar.onStart(hc80Var);
                break;
            case 3:
                onpVar.onResume(hc80Var);
                break;
            case 4:
                onpVar.onPause(hc80Var);
                break;
            case 5:
                onpVar.onStop(hc80Var);
                break;
            case 6:
                onpVar.onDestroy(hc80Var);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        zb80 zb80Var = this.f190675b;
        if (zb80Var != null) {
            zb80Var.mo26206y(hc80Var, ta80Var);
        }
    }
}
