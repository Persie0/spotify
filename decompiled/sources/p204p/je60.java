package p204p;

import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes11.dex */
public abstract class je60 extends UploadDataSink {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f111469a = new AtomicInteger(3);

    /* JADX INFO: renamed from: b */
    public final ie60 f111470b;

    /* JADX INFO: renamed from: c */
    public final Executor f111471c;

    /* JADX INFO: renamed from: d */
    public final lfa1 f111472d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f111473e;

    /* JADX INFO: renamed from: f */
    public long f111474f;

    /* JADX INFO: renamed from: g */
    public long f111475g;

    /* JADX INFO: renamed from: h */
    public int f111476h;

    public je60(Executor executor, Executor executor2, lfa1 lfa1Var) {
        this.f111470b = new ie60(this, executor);
        this.f111471c = executor2;
        this.f111472d = new lfa1(lfa1Var, 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m53081a(ke60 ke60Var, String str) {
        why0.m88178a("JavaUploadDataSinkBase#executeOnExecutor ".concat(str));
        try {
            this.f111471c.execute(new zaz(7, str, ke60Var));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m53082b(ve60 ve60Var, String str) {
        try {
            why0.m88178a("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor ".concat(str));
            try {
                this.f111470b.execute(new zq4(this, str, ve60Var, 23));
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RejectedExecutionException e) {
            mo53083c(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo53083c(Exception exc);

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        mo53083c(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        AtomicInteger atomicInteger = this.f111469a;
        if (!atomicInteger.compareAndSet(0, 2)) {
            throw new IllegalStateException(s571.m77246e(atomicInteger.get(), "onReadSucceeded() called when not awaiting a read result; in state: "));
        }
        m53081a(new ke60(((se60) this).f208223m, new cqp(this, z, 2), 2), "onReadSucceeded");
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        mo53083c(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.f111469a;
        if (!atomicInteger.compareAndSet(1, 2)) {
            throw new IllegalStateException(s571.m77246e(atomicInteger.get(), "onRewindSucceeded() called when not awaiting a rewind; in state: "));
        }
        m53081a(new ke60(((se60) this).f208223m, new he60(this, 0), 2), "startRead");
    }
}
