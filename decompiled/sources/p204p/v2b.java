package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v2b extends u400 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x2b f236597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qp4 f236598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2b(x2b x2bVar, qp4 qp4Var, ai21 ai21Var) {
        super(ai21Var);
        this.f236597b = x2bVar;
        this.f236598c = qp4Var;
    }

    @Override // p204p.u400, p204p.ai21, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x2b x2bVar = this.f236597b;
        qp4 qp4Var = this.f236598c;
        synchronized (x2bVar) {
            if (qp4Var.f191123a) {
                return;
            }
            qp4Var.f191123a = true;
            super.close();
            ((nqr) this.f236598c.f191124b).m65454b();
        }
    }
}
