package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.ProtocolSerializer;
import org.java_websocket.exceptions.WebsocketNotConnectedException;

/* JADX INFO: loaded from: classes16.dex */
public final class yld1 implements ky30 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f273985h = 0;

    /* JADX INFO: renamed from: b */
    public final jy30 f273986b;

    /* JADX INFO: renamed from: c */
    public final vyi f273987c;

    /* JADX INFO: renamed from: d */
    public final boolean f273988d;

    /* JADX INFO: renamed from: e */
    public String f273989e;

    /* JADX INFO: renamed from: f */
    public iy30 f273990f;

    /* JADX INFO: renamed from: g */
    public xld1 f273991g;

    public yld1(jy30 jy30Var, vyi vyiVar) {
        this.f273986b = jy30Var;
        this.f273987c = vyiVar;
        this.f273988d = jy30Var.f117278a.useBinaryProtocol;
        jy30Var.f117282e = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m94159d() {
        tx8.m81888c("p.yld1", "close()");
        synchronized (this) {
            try {
                xld1 xld1Var = this.f273991g;
                if (xld1Var != null) {
                    if (xld1Var.f263123Z != null) {
                        xld1Var.f263131h.m78459b();
                    }
                    this.f273991g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m94160e(ProtocolMessage protocolMessage) {
        tx8.m81888c("p.yld1", "send(); action = " + protocolMessage.action);
        try {
            if (!this.f273988d) {
                if (tx8.f224599d <= 2) {
                    tx8.m81897l("p.yld1", "send(): ".concat(new String(ProtocolSerializer.writeJSON(protocolMessage))));
                }
                this.f273991g.f263131h.m78470m(ProtocolSerializer.writeJSON(protocolMessage));
                return;
            }
            byte[] bArrWriteMsgpack = ProtocolSerializer.writeMsgpack(protocolMessage);
            if (tx8.f224599d <= 2) {
                ProtocolMessage msgpack = ProtocolSerializer.readMsgpack(bArrWriteMsgpack);
                tx8.m81897l("p.yld1", "send(): " + msgpack.action + ": " + new String(ProtocolSerializer.writeJSON(msgpack)));
            }
            this.f273991g.f263131h.m78470m(bArrWriteMsgpack);
        } catch (WebsocketNotConnectedException e) {
            iy30 iy30Var = this.f273990f;
            if (iy30Var == null) {
                throw AblyException.fromThrowable(e);
            }
            ((vyi) iy30Var).m86796p(this, AblyException.fromThrowable(e).errorInfo);
        } catch (Exception e2) {
            throw AblyException.fromThrowable(e2);
        }
    }

    public final String toString() {
        return yld1.class.getName() + " {" + this.f273989e + "}";
    }
}
