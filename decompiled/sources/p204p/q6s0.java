package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q6s0 extends euw0 {

    /* JADX INFO: renamed from: b */
    public final byte[] f185912b;

    /* JADX INFO: renamed from: c */
    public final ayd0 f185913c;

    /* JADX INFO: renamed from: d */
    public final gh00 f185914d;

    public q6s0(byte[] bArr, ayd0 ayd0Var, gh00 gh00Var) {
        this.f185912b = bArr;
        this.f185913c = ayd0Var;
        this.f185914d = gh00Var;
    }

    @Override // p204p.euw0
    /* JADX INFO: renamed from: a */
    public final long mo33952a() {
        return this.f185912b.length;
    }

    @Override // p204p.euw0
    /* JADX INFO: renamed from: b */
    public final ayd0 mo33953b() {
        return this.f185913c;
    }

    @Override // p204p.euw0
    /* JADX INFO: renamed from: d */
    public final void mo33954d(fqa fqaVar) {
        int i = 0;
        while (true) {
            byte[] bArr = this.f185912b;
            if (i >= bArr.length) {
                return;
            }
            int iMin = Math.min(65536, bArr.length - i);
            fqaVar.mo42410v0(i, bArr, iMin);
            fqaVar.flush();
            i += iMin;
            this.f185914d.invoke(Long.valueOf(i));
        }
    }
}
