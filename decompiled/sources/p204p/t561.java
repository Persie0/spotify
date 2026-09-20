package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class t561 implements yyx0 {

    /* JADX INFO: renamed from: a */
    public final u561 f217224a;

    public t561(u561 u561Var) {
        this.f217224a = u561Var;
    }

    @Override // p204p.yyx0
    /* JADX INFO: renamed from: G1 */
    public final ezx0 mo63454G1(String str) {
        u561 u561Var = this.f217224a;
        if (u561Var.isOpen()) {
            return ujg1.m83275p(u561Var, str);
        }
        mif1.m61859L(21, "connection is closed");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f217224a.close();
    }

    @Override // p204p.yyx0
    /* JADX INFO: renamed from: w */
    public final boolean mo63456w() {
        return this.f217224a.mo82396w();
    }
}
