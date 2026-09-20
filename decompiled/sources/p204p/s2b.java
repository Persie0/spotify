package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class s2b extends v400 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f204954b = 1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ p3x0 f204955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2b(v4l0 v4l0Var, gqa gqaVar) {
        super(gqaVar);
        this.f204955c = v4l0Var;
    }

    @Override // p204p.v400, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f204954b) {
            case 0:
                ((t2b) this.f204955c).f216471b.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // p204p.v400, p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public long mo27348g1(npa npaVar, long j) throws IOException {
        switch (this.f204954b) {
            case 1:
                try {
                    return super.mo27348g1(npaVar, j);
                } catch (IOException e) {
                    ((v4l0) this.f204955c).f237203d = e;
                    throw e;
                }
            default:
                return super.mo27348g1(npaVar, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2b(wt31 wt31Var, t2b t2bVar) {
        super(wt31Var);
        this.f204955c = t2bVar;
    }
}
