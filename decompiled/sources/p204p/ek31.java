package p204p;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class ek31 extends ln6 {

    /* JADX INFO: renamed from: n */
    public final Socket f60346n;

    public ek31(Socket socket) {
        this.f60346n = socket;
    }

    @Override // p204p.ln6
    /* JADX INFO: renamed from: k */
    public final IOException mo39258k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p204p.ln6
    /* JADX INFO: renamed from: l */
    public final void mo39259l() {
        Socket socket = this.f60346n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!yze1.m94986a(e)) {
                throw e;
            }
            yze1.f277793a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            yze1.f277793a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
