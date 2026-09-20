package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.RecoveryKeyContext;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: p.y0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C2596y0 extends AbstractC2633z0 {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ int f267826X = 0;

    /* JADX INFO: renamed from: i */
    public final txi f267827i;

    /* JADX INFO: renamed from: t */
    public final C2632z f267828t;

    public C2596y0(String str) {
        RecoveryKeyContext recoveryKeyContextDecode;
        ClientOptions clientOptions = new ClientOptions(str);
        super(clientOptions, new C1761d0());
        C2632z c2632z = new C2632z(this);
        this.f267828t = c2632z;
        txi txiVar = new txi(this, c2632z, this.f7164h);
        this.f267827i = txiVar;
        C1724c0 c1724c0 = new C1724c0(c2632z, 1);
        synchronized (txiVar) {
            txiVar.f23778a.put(c1724c0, new a5x(txiVar, c1724c0));
        }
        if (!tx8.m81895j(clientOptions.recover) && (recoveryKeyContextDecode = RecoveryKeyContext.decode(clientOptions.recover)) != null) {
            for (Map.Entry<String, String> entry : recoveryKeyContextDecode.getChannelSerials().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                C2632z c2632z2 = this.f267828t;
                c2632z2.getClass();
                mmc mmcVarM94998a = null;
                try {
                    mmcVarM94998a = c2632z2.m94998a(key, null);
                } catch (AblyException unused) {
                }
                if (mmcVarM94998a != null) {
                    mmcVarM94998a.f28788g.channelSerial = value;
                }
            }
            this.f267827i.f224711g.f246141s = recoveryKeyContextDecode.getMsgSerial();
        }
        if (clientOptions.autoConnect) {
            this.f267827i.f224711g.m86788f();
        }
    }

    @Override // io.ably.lib.rest.AbstractC1406a
    /* JADX INFO: renamed from: a */
    public final void mo23276a(ErrorInfo errorInfo) {
        vyi vyiVar = this.f267827i.f224711g;
        txi txiVar = vyiVar.f246126d;
        Locale locale = Locale.ROOT;
        tx8.m81894i("p.vyi", "onAuthError: (" + errorInfo.code + ") " + errorInfo.message);
        if (errorInfo.statusCode == 403) {
            wzi wziVar = txiVar.f224707c;
            wzi wziVar2 = wzi.failed;
            yzi yziVar = new yzi(wziVar, wziVar2, errorInfo);
            txiVar.f224707c = wziVar2;
            txiVar.m28214b(new Object[]{yziVar}, vxi.f245758h);
            return;
        }
        int iOrdinal = vyiVar.f246136n.f215253a.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            vyiVar.m86783a(new uyi(vyiVar, errorInfo));
        } else if (vyiVar.f246139q != null) {
            vyiVar.m86797q(null, new tyi(wzi.disconnected, errorInfo, null));
        }
    }

    @Override // io.ably.lib.rest.AbstractC1406a
    /* JADX INFO: renamed from: c */
    public final void mo23277c(String str, boolean z) {
        vyi vyiVar = this.f267827i.f224711g;
        vyiVar.getClass();
        oyi oyiVar = new oyi(vyiVar);
        try {
            int iOrdinal = vyiVar.f246136n.f215253a.ordinal();
            if (iOrdinal == 1) {
                tx8.m81897l("p.vyi", "onAuthUpdated: closing connecting transport");
                vyiVar.m86797q(null, new tyi(wzi.disconnected, new ErrorInfo("Aborting incomplete connection with superseded auth params", 503, 80003), null));
                vyiVar.m86788f();
            } else if (iOrdinal != 2) {
                vyiVar.m86788f();
            } else {
                try {
                    ProtocolMessage protocolMessage = new ProtocolMessage(ProtocolMessage.Action.auth);
                    protocolMessage.auth = new ProtocolMessage.AuthDetails(str);
                    vyiVar.m86798r(protocolMessage, false, null);
                } catch (AblyException unused) {
                    tx8.m81897l("p.vyi", "onAuthUpdated: closing transport after send failure");
                    ((yld1) vyiVar.f246139q).m94159d();
                }
            }
            if (z) {
                boolean z2 = true;
                while (z2) {
                    ErrorInfo errorInfoM68501b = oyi.m68501b(oyiVar);
                    wzi wziVar = vyiVar.f246136n.f215253a;
                    int iOrdinal2 = wziVar.ordinal();
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 == 2) {
                            tx8.m81897l("p.vyi", "onAuthUpdated: got connected");
                            z2 = false;
                        } else if (iOrdinal2 != 3) {
                            tx8.m81897l("p.vyi", "onAuthUpdated: throwing exception");
                            throw AblyException.fromErrorInfo(errorInfoM68501b);
                        }
                    }
                    tx8.m81897l("p.vyi", "onAuthUpdated: " + wziVar);
                }
            }
            oyi.m68502c(oyiVar);
        } catch (Throwable th) {
            oyi.m68502c(oyiVar);
            throw th;
        }
    }

    @Override // io.ably.lib.rest.AbstractC1406a, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (Exception e) {
            tx8.m81890e("p.y0", "There was an exception releasing client instance base resources.", e);
        }
        txi txiVar = this.f267827i;
        txiVar.f224708d = null;
        vyi vyiVar = txiVar.f224711g;
        vyiVar.getClass();
        vyiVar.m86797q(null, new tyi(wzi.closing, null, null));
    }
}
