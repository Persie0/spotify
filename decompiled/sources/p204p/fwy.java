package p204p;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import p196j$.p198io.DesugarInputStream;
import p196j$.p198io.InputStreamRetargetInterface;

/* JADX INFO: loaded from: classes.dex */
public final class fwy extends InputStream implements InputStreamRetargetInterface {

    /* JADX INFO: renamed from: a */
    public final FileInputStream f74190a;

    /* JADX INFO: renamed from: b */
    public final h15 f74191b;

    /* JADX INFO: renamed from: c */
    public final String f74192c;

    /* JADX INFO: renamed from: d */
    public final boolean f74193d;

    /* JADX INFO: renamed from: e */
    public final mxy f74194e;

    public fwy(FileInputStream fileInputStream, h15 h15Var, String str, boolean z, mxy mxyVar) {
        this.f74190a = fileInputStream;
        this.f74191b = h15Var;
        this.f74192c = str;
        this.f74193d = z;
        this.f74194e = mxyVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f74190a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f74190a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f74190a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f74190a.markSupported();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    @Override // java.io.InputStream
    public final int read() throws Exception {
        Exception exc;
        Integer numValueOf;
        int i;
        mxy mxyVar = this.f74194e;
        Object obj = mxyVar.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            numValueOf = Integer.valueOf(this.f74190a.read());
            exc = null;
        } catch (Exception e) {
            exc = e;
            numValueOf = null;
        }
        q0b1 q0b1Var = new q0b1(numValueOf, jCurrentTimeMillis - System.currentTimeMillis(), exc);
        Integer num = (Integer) q0b1Var.m71807a();
        long jM71808b = q0b1Var.m71808b();
        Exception excM71809c = q0b1Var.m71809c();
        if (this.f74193d) {
            String str = this.f74192c;
            g751 g751VarM63116L = mxyVar.m63116L(str);
            if (excM71809c == null) {
                wj50.m88279p(num);
                if (num.intValue() == -1) {
                    i = 0;
                } else {
                    i = 1;
                }
            } else {
                i = 0;
            }
            new h751(1, g751VarM63116L, i, new Date(), jM71808b, excM71809c != null ? new f751("failed to read data at ".concat(str), 2) : null);
            this.f74191b.getClass();
        }
        if (excM71809c != null) {
            throw excM71809c;
        }
        wj50.m88279p(num);
        return num.intValue();
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.f74190a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws Exception {
        Exception exc;
        Long lValueOf;
        int iLongValue;
        mxy mxyVar = this.f74194e;
        Object obj = mxyVar.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            lValueOf = Long.valueOf(this.f74190a.skip(j));
            exc = null;
        } catch (Exception e) {
            exc = e;
            lValueOf = null;
        }
        q0b1 q0b1Var = new q0b1(lValueOf, jCurrentTimeMillis - System.currentTimeMillis(), exc);
        Long l = (Long) q0b1Var.m71807a();
        long jM71808b = q0b1Var.m71808b();
        Exception excM71809c = q0b1Var.m71809c();
        if (this.f74193d) {
            String str = this.f74192c;
            g751 g751VarM63116L = mxyVar.m63116L(str);
            if (excM71809c != null) {
                iLongValue = 0;
            } else {
                wj50.m88279p(l);
                iLongValue = (int) l.longValue();
            }
            new h751(1, g751VarM63116L, iLongValue, new Date(), jM71808b, excM71809c != null ? new f751("failed to read data at ".concat(str), 2) : null);
            this.f74191b.getClass();
        }
        if (excM71809c != null) {
            throw excM71809c;
        }
        wj50.m88279p(l);
        return l.longValue();
    }

    @Override // java.io.InputStream, p196j$.p198io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws Exception {
        Exception exc;
        Integer numValueOf;
        int iIntValue;
        mxy mxyVar = this.f74194e;
        Object obj = mxyVar.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            numValueOf = Integer.valueOf(this.f74190a.read(bArr));
            exc = null;
        } catch (Exception e) {
            exc = e;
            numValueOf = null;
        }
        q0b1 q0b1Var = new q0b1(numValueOf, jCurrentTimeMillis - System.currentTimeMillis(), exc);
        Integer num = (Integer) q0b1Var.m71807a();
        long jM71808b = q0b1Var.m71808b();
        Exception excM71809c = q0b1Var.m71809c();
        if (this.f74193d) {
            String str = this.f74192c;
            g751 g751VarM63116L = mxyVar.m63116L(str);
            if (excM71809c != null) {
                iIntValue = 0;
            } else {
                wj50.m88279p(num);
                iIntValue = num.intValue();
            }
            new h751(1, g751VarM63116L, iIntValue, new Date(), jM71808b, excM71809c != null ? new f751("failed to read data at ".concat(str), 2) : null);
            this.f74191b.getClass();
        }
        if (excM71809c == null) {
            wj50.m88279p(num);
            return num.intValue();
        }
        throw excM71809c;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Exception {
        Exception exc;
        Integer numValueOf;
        int iIntValue;
        mxy mxyVar = this.f74194e;
        Object obj = mxyVar.f233995a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            numValueOf = Integer.valueOf(this.f74190a.read(bArr, i, i2));
            exc = null;
        } catch (Exception e) {
            exc = e;
            numValueOf = null;
        }
        q0b1 q0b1Var = new q0b1(numValueOf, jCurrentTimeMillis - System.currentTimeMillis(), exc);
        Integer num = (Integer) q0b1Var.m71807a();
        long jM71808b = q0b1Var.m71808b();
        Exception excM71809c = q0b1Var.m71809c();
        if (this.f74193d) {
            String str = this.f74192c;
            g751 g751VarM63116L = mxyVar.m63116L(str);
            if (excM71809c != null) {
                iIntValue = 0;
            } else {
                wj50.m88279p(num);
                iIntValue = num.intValue();
            }
            new h751(1, g751VarM63116L, iIntValue, new Date(), jM71808b, excM71809c != null ? new f751("failed to read data at ".concat(str), 2) : null);
            this.f74191b.getClass();
        }
        if (excM71809c == null) {
            wj50.m88279p(num);
            return num.intValue();
        }
        throw excM71809c;
    }
}
