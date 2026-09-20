package p204p;

import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class c3b {

    /* JADX INFO: renamed from: a */
    public final w2b f33625a;

    /* JADX INFO: renamed from: b */
    public final long f33626b;

    /* JADX INFO: renamed from: c */
    public final int f33627c;

    /* JADX INFO: renamed from: d */
    public sjo f33628d;

    /* JADX INFO: renamed from: e */
    public long f33629e;

    /* JADX INFO: renamed from: f */
    public File f33630f;

    /* JADX INFO: renamed from: g */
    public OutputStream f33631g;

    /* JADX INFO: renamed from: h */
    public long f33632h;

    /* JADX INFO: renamed from: i */
    public long f33633i;

    /* JADX INFO: renamed from: j */
    public cdx0 f33634j;

    public c3b(w2b w2bVar) {
        w2bVar.getClass();
        this.f33625a = w2bVar;
        this.f33626b = 5242880L;
        this.f33627c = 20480;
    }

    /* JADX INFO: renamed from: a */
    public final void m31374a() {
        OutputStream outputStream = this.f33631g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            h0b1.m46313h(this.f33631g);
            this.f33631g = null;
            File file = this.f33630f;
            this.f33630f = null;
            w2b w2bVar = this.f33625a;
            long j = this.f33632h;
            ob21 ob21Var = (ob21) w2bVar;
            synchronized (ob21Var) {
                boolean z = true;
                c95.m31855u(!ob21Var.f163524i);
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    pb21 pb21VarM69510c = pb21.m69510c(file, j, ob21Var.f163518c);
                    pb21VarM69510c.getClass();
                    w4b w4bVarM56065C = ob21Var.f163518c.m56065C(pb21VarM69510c.f108643a);
                    w4bVarM56065C.getClass();
                    c95.m31855u(w4bVarM56065C.m87184g(pb21VarM69510c.f108644b, pb21VarM69510c.f108645c));
                    long jM56929a = kmj.m56929a(w4bVarM56065C.m87180c());
                    if (jM56929a != -1) {
                        if (pb21VarM69510c.f108644b + pb21VarM69510c.f108645c > jM56929a) {
                            z = false;
                        }
                        c95.m31855u(z);
                    }
                    if (ob21Var.f163519d == null) {
                        ob21Var.m66589b(pb21VarM69510c);
                        ob21Var.f163518c.m56090e0();
                        ob21Var.notifyAll();
                        return;
                    }
                    try {
                        ob21Var.f163519d.m63895C(pb21VarM69510c.f108645c, file.getName(), pb21VarM69510c.f108648f);
                        ob21Var.m66589b(pb21VarM69510c);
                        try {
                            ob21Var.f163518c.m56090e0();
                            ob21Var.notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new Cache$CacheException(e);
                        }
                    } catch (IOException e2) {
                        throw new Cache$CacheException(e2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th) {
            h0b1.m46313h(this.f33631g);
            this.f33631g = null;
            File file2 = this.f33630f;
            this.f33630f = null;
            file2.delete();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m31375b(sjo sjoVar) {
        File fileM69512e;
        long j = sjoVar.f209891g;
        long jMin = j != -1 ? Math.min(j - this.f33633i, this.f33629e) : -1L;
        w2b w2bVar = this.f33625a;
        String str = sjoVar.f209892h;
        String str2 = h0b1.f86200a;
        long j2 = sjoVar.f209890f + this.f33633i;
        ob21 ob21Var = (ob21) w2bVar;
        synchronized (ob21Var) {
            try {
                c95.m31855u(!ob21Var.f163524i);
                ob21Var.m66591d();
                w4b w4bVarM56065C = ob21Var.f163518c.m56065C(str);
                w4bVarM56065C.getClass();
                c95.m31855u(w4bVarM56065C.m87184g(j2, jMin));
                if (!ob21Var.f163516a.exists()) {
                    ob21.m66586e(ob21Var.f163516a);
                    ob21Var.m66599n();
                }
                ob21Var.f163517b.mo31124b(ob21Var, jMin);
                File file = new File(ob21Var.f163516a, Integer.toString(ob21Var.f163521f.nextInt(10)));
                if (!file.exists()) {
                    ob21.m66586e(file);
                }
                fileM69512e = pb21.m69512e(file, w4bVarM56065C.f247760a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f33630f = fileM69512e;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f33630f);
        if (this.f33627c > 0) {
            cdx0 cdx0Var = this.f33634j;
            if (cdx0Var == null) {
                this.f33634j = new cdx0(fileOutputStream, this.f33627c);
            } else {
                cdx0Var.m32467a(fileOutputStream);
            }
            this.f33631g = this.f33634j;
        } else {
            this.f33631g = fileOutputStream;
        }
        this.f33632h = 0L;
    }
}
