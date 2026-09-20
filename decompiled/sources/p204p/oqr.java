package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class oqr extends v400 {

    /* JADX INFO: renamed from: b */
    public boolean f168371b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wqr f168372c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pqr f168373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqr(wt31 wt31Var, wqr wqrVar, pqr pqrVar) {
        super(wt31Var);
        this.f168372c = wqrVar;
        this.f168373d = pqrVar;
    }

    @Override // p204p.v400, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f168371b) {
            return;
        }
        this.f168371b = true;
        wqr wqrVar = this.f168372c;
        pqr pqrVar = this.f168373d;
        synchronized (wqrVar) {
            int i = pqrVar.f180403h - 1;
            pqrVar.f180403h = i;
            if (i == 0 && pqrVar.f180401f) {
                wqrVar.m88785p(pqrVar);
            }
        }
    }
}
