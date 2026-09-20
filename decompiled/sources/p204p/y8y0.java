package p204p;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class y8y0 implements zb80, Closeable {

    /* JADX INFO: renamed from: a */
    public final String f270415a;

    /* JADX INFO: renamed from: b */
    public final x8y0 f270416b;

    /* JADX INFO: renamed from: c */
    public boolean f270417c;

    public y8y0(String str, x8y0 x8y0Var) {
        this.f270415a = str;
        this.f270416b = x8y0Var;
    }

    /* JADX INFO: renamed from: a */
    public final x8y0 m93134a() {
        return this.f270416b;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        if (ta80Var == ta80.ON_DESTROY) {
            this.f270417c = false;
            hc80Var.getLifecycle().mo31988d(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
