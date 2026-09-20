package p204p;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class u3b implements wt31 {

    /* JADX INFO: renamed from: a */
    public boolean f226310a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gqa f226311b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qp4 f226312c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tuu0 f226313d;

    public u3b(gqa gqaVar, qp4 qp4Var, tuu0 tuu0Var) {
        this.f226311b = gqaVar;
        this.f226312c = qp4Var;
        this.f226313d = tuu0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zM31136g;
        if (!this.f226310a) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM31136g = c0f1.m31136g(this, 100);
            } catch (IOException unused) {
                zM31136g = false;
            }
            if (!zM31136g) {
                this.f226310a = true;
                this.f226312c.m73421e();
            }
        }
        this.f226311b.close();
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) throws Throwable {
        try {
            long jMo27348g1 = this.f226311b.mo27348g1(npaVar, j);
            tuu0 tuu0Var = this.f226313d;
            if (jMo27348g1 != -1) {
                npaVar.m65308g(tuu0Var.f223924b, npaVar.f156904b - jMo27348g1, jMo27348g1);
                tuu0Var.m81592a();
                return jMo27348g1;
            }
            if (!this.f226310a) {
                this.f226310a = true;
                tuu0Var.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.f226310a) {
                throw e;
            }
            this.f226310a = true;
            this.f226312c.m73421e();
            throw e;
        }
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return this.f226311b.mo27349m();
    }
}
