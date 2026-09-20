package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rly0 extends jkc1 {

    /* JADX INFO: renamed from: a */
    public final oxo f200396a;

    /* JADX INFO: renamed from: b */
    public boolean f200397b = true;

    public rly0(oxo oxoVar) {
        this.f200396a = oxoVar;
    }

    @Override // p204p.jkc1
    /* JADX INFO: renamed from: a */
    public final void mo26274a(int i) {
        boolean z = i == 0;
        if (this.f200397b != z) {
            this.f200396a.invoke();
            this.f200397b = z;
        }
    }
}
