package p204p;

import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n8b0 implements x9b0 {
    @Override // p204p.x9b0
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        n8b0 n8b0Var = LottieAnimationView.f1466R0;
        qlo qloVar = x0b1.f256851a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        sra0.m79110d("Unable to load composition.", th);
    }
}
