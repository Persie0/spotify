package p204p;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class kwy extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final FileOutputStream f127267a;

    /* JADX INFO: renamed from: b */
    public final h15 f127268b;

    /* JADX INFO: renamed from: c */
    public final String f127269c;

    /* JADX INFO: renamed from: d */
    public final boolean f127270d;

    /* JADX INFO: renamed from: e */
    public final mxy f127271e;

    public kwy(FileOutputStream fileOutputStream, h15 h15Var, String str, boolean z, mxy mxyVar) {
        this.f127267a = fileOutputStream;
        this.f127268b = h15Var;
        this.f127269c = str;
        this.f127270d = z;
        this.f127271e = mxyVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f127267a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f127267a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws Exception {
        Exception exc;
        w2a1 w2a1Var;
        mxy mxyVar = this.f127271e;
        Object obj = mxyVar.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f127267a.write(i);
            w2a1Var = w2a1.f247311a;
            exc = null;
        } catch (Exception e) {
            exc = e;
            w2a1Var = null;
        }
        q0b1 q0b1Var = new q0b1(w2a1Var, jCurrentTimeMillis - System.currentTimeMillis(), exc);
        long jM71808b = q0b1Var.m71808b();
        Exception excM71809c = q0b1Var.m71809c();
        if (this.f127270d) {
            String str = this.f127269c;
            new h751(2, mxyVar.m63116L(str), excM71809c == null ? 1 : 0, new Date(), jM71808b, excM71809c != null ? new f751("failed to write data at ".concat(str), 1) : null);
            this.f127268b.getClass();
        }
        if (excM71809c != null) {
            throw excM71809c;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws Exception {
        Exception exc;
        w2a1 w2a1Var;
        mxy mxyVar = this.f127271e;
        Object obj = mxyVar.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f127267a.write(bArr);
            w2a1Var = w2a1.f247311a;
            exc = null;
        } catch (Exception e) {
            exc = e;
            w2a1Var = null;
        }
        q0b1 q0b1Var = new q0b1(w2a1Var, jCurrentTimeMillis - System.currentTimeMillis(), exc);
        long jM71808b = q0b1Var.m71808b();
        Exception excM71809c = q0b1Var.m71809c();
        if (this.f127270d) {
            String str = this.f127269c;
            new h751(2, mxyVar.m63116L(str), excM71809c == null ? bArr.length : 0, new Date(), jM71808b, excM71809c != null ? new f751("failed to write data at ".concat(str), 1) : null);
            this.f127268b.getClass();
        }
        if (excM71809c != null) {
            throw excM71809c;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws Exception {
        Exception exc;
        w2a1 w2a1Var;
        mxy mxyVar = this.f127271e;
        Object obj = mxyVar.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.f127267a.write(bArr, i, i2);
            w2a1Var = w2a1.f247311a;
            exc = null;
        } catch (Exception e) {
            exc = e;
            w2a1Var = null;
        }
        q0b1 q0b1Var = new q0b1(w2a1Var, jCurrentTimeMillis - System.currentTimeMillis(), exc);
        long jM71808b = q0b1Var.m71808b();
        Exception excM71809c = q0b1Var.m71809c();
        if (this.f127270d) {
            String str = this.f127269c;
            new h751(2, mxyVar.m63116L(str), excM71809c == null ? bArr.length : 0, new Date(), jM71808b, excM71809c != null ? new f751("failed to write data at ".concat(str), 1) : null);
            this.f127268b.getClass();
        }
        if (excM71809c != null) {
            throw excM71809c;
        }
    }
}
