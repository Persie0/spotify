package p204p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class cuw0 extends euw0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f42242b;

    /* JADX INFO: renamed from: c */
    public final Object f42243c;

    /* JADX INFO: renamed from: d */
    public final Object f42244d;

    public cuw0(ayd0 ayd0Var, File file) {
        this.f42242b = 0;
        this.f42243c = ayd0Var;
        this.f42244d = file;
    }

    @Override // p204p.euw0
    /* JADX INFO: renamed from: a */
    public final long mo33952a() {
        switch (this.f42242b) {
            case 0:
                return ((File) this.f42244d).length();
            default:
                return ((File) ((cuw0) this.f42243c).f42244d).length();
        }
    }

    @Override // p204p.euw0
    /* JADX INFO: renamed from: b */
    public final ayd0 mo33953b() {
        switch (this.f42242b) {
            case 0:
                return (ayd0) this.f42243c;
            default:
                return (ayd0) ((cuw0) this.f42243c).f42243c;
        }
    }

    @Override // p204p.euw0
    /* JADX INFO: renamed from: d */
    public final void mo33954d(fqa fqaVar) throws IOException {
        switch (this.f42242b) {
            case 0:
                ow40 ow40VarM44800k = gif1.m44800k((File) this.f42244d);
                try {
                    fqaVar.mo42404H(ow40VarM44800k);
                    ow40VarM44800k.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n0e1.m63430g(ow40VarM44800k, th);
                        throw th2;
                    }
                }
            default:
                tuu0 tuu0Var = new tuu0(new v5y0(fqaVar, new snx0(this, 4)));
                ((cuw0) this.f42243c).mo33954d(tuu0Var);
                tuu0Var.flush();
                return;
        }
    }

    public cuw0(cuw0 cuw0Var) {
        this.f42242b = 1;
        this.f42243c = cuw0Var;
        this.f42244d = new PublishSubject();
    }
}
