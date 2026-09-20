package p204p;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p3x0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final o3x0 f173765a;

    static {
        npa npaVar = new npa();
        iva ivaVar = iva.f106177d;
        ivaVar.mo51760s(npaVar, ivaVar.mo51747d());
        f173765a = new o3x0(null, ivaVar.f106178a.length, npaVar);
    }

    /* JADX INFO: renamed from: C1 */
    public abstract gqa mo28080C1();

    /* JADX INFO: renamed from: a */
    public final InputStream m69091a() {
        return mo28080C1().mo45416H1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: c */
    public final byte[] m69092c() throws IOException {
        long jMo28081e = mo28081e();
        if (jMo28081e > 2147483647L) {
            throw new IOException(edb.m38561j(jMo28081e, "Cannot buffer entire body for content length: "));
        }
        gqa gqaVarMo28080C1 = mo28080C1();
        byte[] th = null;
        try {
            byte[] bArrMo45419P0 = gqaVarMo28080C1.mo45419P0();
            try {
                gqaVarMo28080C1.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = bArrMo45419P0;
        } catch (Throwable th3) {
            th = th3;
            if (gqaVarMo28080C1 != null) {
                try {
                    gqaVarMo28080C1.close();
                } catch (Throwable th4) {
                    y85.m93061f(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (jMo28081e == -1 || jMo28081e == length) {
            return th;
        }
        throw new IOException("Content-Length (" + jMo28081e + ") and stream length (" + length + ") disagree");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a0f1.m24341b(mo28080C1());
    }

    /* JADX INFO: renamed from: e */
    public abstract long mo28081e();

    /* JADX INFO: renamed from: f */
    public abstract ayd0 mo28082f();

    /* JADX WARN: Code duplicated, block: B:7:0x0013 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:24:0x0005 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: g */
    public final String m69093g() {
        Charset charsetM27513a;
        gqa gqaVarMo28080C1 = mo28080C1();
        String th = null;
        try {
            ayd0 ayd0VarMo28082f = mo28082f();
            if (ayd0VarMo28082f != null) {
                urv0 urv0Var = ayd0.f21209e;
                charsetM27513a = ayd0VarMo28082f.m27513a(null);
                if (charsetM27513a == null) {
                    charsetM27513a = vuc.f244913a;
                }
            } else {
                charsetM27513a = vuc.f244913a;
            }
            String strMo45422b1 = gqaVarMo28080C1.mo45422b1(c0f1.m31135f(gqaVarMo28080C1, charsetM27513a));
            try {
                gqaVarMo28080C1.close();
            } catch (Throwable th2) {
                th = th2;
            }
            th = th;
            th = strMo45422b1;
        } catch (Throwable th3) {
            th = th3;
            if (gqaVarMo28080C1 != null) {
                try {
                    gqaVarMo28080C1.close();
                } catch (Throwable th4) {
                    y85.m93061f(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
