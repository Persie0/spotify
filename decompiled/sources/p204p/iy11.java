package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class iy11 implements dqk0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ky11 f106819b;

    public /* synthetic */ iy11(ky11 ky11Var, int i) {
        this.f106818a = i;
        this.f106819b = ky11Var;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        switch (this.f106818a) {
            case 0:
                boolean z = ((do3) obj) != null;
                ky11 ky11Var = this.f106819b;
                ky11Var.f127630g.m39516c(ky11.f127616P0[2], ky11Var, Boolean.valueOf(z));
                break;
            default:
                a0r0 a0r0Var = (a0r0) obj;
                zzq0 zzq0Var = a0r0Var != null ? a0r0Var.f11158a : null;
                ky11 ky11Var2 = this.f106819b;
                ky11Var2.f127619N0 = zzq0Var;
                ky11Var2.f127624a.setIsOverlapped((a0r0Var != null ? a0r0Var.f11158a : null) instanceof wzq0);
                break;
        }
    }
}
