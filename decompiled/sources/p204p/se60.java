package p204p;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.impl.CallbackExceptionImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class se60 extends je60 {

    /* JADX INFO: renamed from: i */
    public final HttpURLConnection f208219i;

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f208220j;

    /* JADX INFO: renamed from: k */
    public WritableByteChannel f208221k;

    /* JADX INFO: renamed from: l */
    public OutputStream f208222l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ ue60 f208223m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se60(ue60 ue60Var, Executor executor, te60 te60Var, HttpURLConnection httpURLConnection, lfa1 lfa1Var) {
        super(executor, te60Var, lfa1Var);
        this.f208223m = ue60Var;
        this.f208220j = new AtomicBoolean(false);
        this.f208219i = httpURLConnection;
    }

    @Override // p204p.je60
    /* JADX INFO: renamed from: c */
    public final void mo53083c(Exception exc) {
        this.f208223m.m82893b(new CallbackExceptionImpl("Exception received from UploadDataProvider", exc));
    }
}
