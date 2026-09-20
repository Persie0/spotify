package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mqf1 implements wrf1 {

    /* JADX INFO: renamed from: a */
    public final wrf1[] f146280a;

    public mqf1(wrf1... wrf1VarArr) {
        this.f146280a = wrf1VarArr;
    }

    @Override // p204p.wrf1
    public final ytf1 zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            wrf1 wrf1Var = this.f146280a[i];
            if (wrf1Var.zzc(cls)) {
                return wrf1Var.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p204p.wrf1
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f146280a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
