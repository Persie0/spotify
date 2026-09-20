package p204p;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ow40 implements wt31 {

    /* JADX INFO: renamed from: a */
    public final InputStream f170639a;

    /* JADX INFO: renamed from: b */
    public final au71 f170640b;

    public ow40(InputStream inputStream, au71 au71Var) {
        this.f170639a = inputStream;
        this.f170640b = au71Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f170639a.close();
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) throws IOException {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount < 0: ").toString());
        }
        try {
            this.f170640b.mo27166f();
            gfz0 gfz0VarM65296G = npaVar.m65296G(1);
            int i = this.f170639a.read(gfz0VarM65296G.f79489a, gfz0VarM65296G.f79491c, (int) Math.min(j, 8192 - gfz0VarM65296G.f79491c));
            if (i != -1) {
                gfz0VarM65296G.f79491c += i;
                long j2 = i;
                npaVar.f156904b += j2;
                return j2;
            }
            if (gfz0VarM65296G.f79490b != gfz0VarM65296G.f79491c) {
                return -1L;
            }
            npaVar.f156903a = gfz0VarM65296G.m44640a();
            kgz0.m56374a(gfz0VarM65296G);
            return -1L;
        } catch (AssertionError e) {
            if (yze1.m94986a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return this.f170640b;
    }

    public final String toString() {
        return "source(" + this.f170639a + ')';
    }
}
