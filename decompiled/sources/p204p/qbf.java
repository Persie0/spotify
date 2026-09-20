package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qbf implements mn71 {

    /* JADX INFO: renamed from: a */
    public final mn71[] f187080a;

    public qbf(mn71... mn71VarArr) {
        this.f187080a = mn71VarArr;
    }

    @Override // p204p.mn71
    /* JADX INFO: renamed from: a */
    public final void mo62186a(boolean z) {
        for (int i = 0; i < 2; i++) {
            this.f187080a[i].mo62186a(z);
        }
    }

    @Override // p204p.mn71
    /* JADX INFO: renamed from: b */
    public final void mo62187b(mm71 mm71Var) {
        for (int i = 0; i < 2; i++) {
            this.f187080a[i].mo62187b(mm71Var);
        }
    }

    @Override // p204p.mn71
    public final void setEnabled(boolean z) {
        for (int i = 0; i < 2; i++) {
            this.f187080a[i].setEnabled(z);
        }
    }
}
