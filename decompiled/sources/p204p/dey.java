package p204p;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class dey extends u400 {

    /* JADX INFO: renamed from: b */
    public final gh00 f48200b;

    /* JADX INFO: renamed from: c */
    public boolean f48201c;

    public dey(ai21 ai21Var, gh00 gh00Var) {
        super(ai21Var);
        this.f48200b = gh00Var;
    }

    @Override // p204p.u400, p204p.ai21
    /* JADX INFO: renamed from: U0 */
    public final void mo25160U0(npa npaVar, long j) throws EOFException {
        if (this.f48201c) {
            npaVar.skip(j);
            return;
        }
        try {
            super.mo25160U0(npaVar, j);
        } catch (IOException e) {
            this.f48201c = true;
            this.f48200b.invoke(e);
        }
    }

    @Override // p204p.u400, p204p.ai21, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f48201c = true;
            this.f48200b.invoke(e);
        }
    }

    @Override // p204p.u400, p204p.ai21, java.io.Flushable
    public final void flush() {
        if (this.f48201c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f48201c = true;
            this.f48200b.invoke(e);
        }
    }
}
