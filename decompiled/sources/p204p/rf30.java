package p204p;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class rf30 extends of30 {

    /* JADX INFO: renamed from: e */
    public long f198503e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ tf30 f198504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf30(tf30 tf30Var, ph30 ph30Var, long j) {
        super(tf30Var, ph30Var);
        this.f198504f = tf30Var;
        this.f198503e = j;
        if (j == 0) {
            m66811a(sn20.f210780b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM31136g;
        if (this.f164630c) {
            return;
        }
        if (this.f198503e != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM31136g = c0f1.m31136g(this, 100);
            } catch (IOException unused) {
                zM31136g = false;
            }
            if (!zM31136g) {
                this.f198504f.f219840b.mo27261b();
                m66811a(tf30.f219838f);
            }
        }
        this.f164630c = true;
    }

    @Override // p204p.of30, p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount < 0: ").toString());
        }
        if (this.f164630c) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f198503e;
        if (j2 == 0) {
            return -1L;
        }
        long jMo27348g1 = super.mo27348g1(npaVar, Math.min(j2, j));
        if (jMo27348g1 == -1) {
            this.f198504f.f219840b.mo27261b();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m66811a(tf30.f219838f);
            throw protocolException;
        }
        long j3 = this.f198503e - jMo27348g1;
        this.f198503e = j3;
        if (j3 == 0) {
            m66811a(sn20.f210780b);
        }
        return jMo27348g1;
    }
}
