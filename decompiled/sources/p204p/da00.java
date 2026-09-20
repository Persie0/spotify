package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class da00 implements w561 {

    /* JADX INFO: renamed from: a */
    public final Context f46946a;

    /* JADX INFO: renamed from: b */
    public final String f46947b;

    /* JADX INFO: renamed from: c */
    public final ov50 f46948c;

    /* JADX INFO: renamed from: d */
    public final boolean f46949d;

    /* JADX INFO: renamed from: e */
    public final boolean f46950e;

    /* JADX INFO: renamed from: f */
    public final wg61 f46951f = new wg61(new mo4(this, 23));

    /* JADX INFO: renamed from: g */
    public boolean f46952g;

    public da00(Context context, String str, ov50 ov50Var, boolean z, boolean z2) {
        this.f46946a = context;
        this.f46947b = str;
        this.f46948c = ov50Var;
        this.f46949d = z;
        this.f46950e = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        wg61 wg61Var = this.f46951f;
        if (wg61Var.m88008a()) {
            ((ca00) wg61Var.getValue()).close();
        }
    }

    @Override // p204p.w561
    public final String getDatabaseName() {
        return this.f46947b;
    }

    @Override // p204p.w561
    public final u561 getWritableDatabase() {
        return ((ca00) this.f46951f.getValue()).m31984a(true);
    }

    @Override // p204p.w561
    public final void setWriteAheadLoggingEnabled(boolean z) {
        wg61 wg61Var = this.f46951f;
        if (wg61Var.m88008a()) {
            ((ca00) wg61Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.f46952g = z;
    }
}
