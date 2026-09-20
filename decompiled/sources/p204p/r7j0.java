package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class r7j0 implements ofm0, x7l0 {

    /* JADX INFO: renamed from: a */
    public final o7m f196599a;

    /* JADX INFO: renamed from: b */
    public final hk90 f196600b = new hk90();

    public r7j0(o7m o7mVar) {
        this.f196599a = o7mVar;
    }

    @Override // p204p.x7l0
    /* JADX INFO: renamed from: b */
    public final void mo24810b(String str, i500 i500Var) {
        xoi0 xoi0Var = this.f196600b.f92388a;
        zzq0 zzq0VarMo31750k = this.f196599a.mo31750k();
        if (zzq0VarMo31750k == null) {
            zzq0VarMo31750k = uzq0.f235620a;
        }
        xoi0Var.mo33104m(new a0r0(zzq0VarMo31750k));
    }

    @Override // p204p.ofm0
    /* JADX INFO: renamed from: j0 */
    public final jfm0 mo15684j0(Class cls) {
        hk90 hk90Var = cls.equals(a0r0.class) ? this.f196600b : null;
        hk90 hk90Var2 = hk90Var != null ? hk90Var : null;
        return hk90Var2 == null ? new hk90() : hk90Var2;
    }
}
