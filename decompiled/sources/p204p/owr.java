package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class owr implements yob {

    /* JADX INFO: renamed from: a */
    public final hwr f170772a;

    public owr(hwr hwrVar) {
        this.f170772a = hwrVar;
    }

    @Override // p204p.yob
    /* JADX INFO: renamed from: a */
    public final void mo28626a(Throwable th) {
        this.f170772a.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f170772a + ']';
    }
}
