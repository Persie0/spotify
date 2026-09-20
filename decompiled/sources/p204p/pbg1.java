package p204p;

import android.content.Context;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class pbg1 extends AbstractC1806e9 {

    /* JADX INFO: renamed from: c */
    public final c8g0 f175843c;

    public pbg1(c8g0 c8g0Var) {
        super(11);
        this.f175843c = c8g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // p204p.AbstractC1806e9
    /* JADX INFO: renamed from: L0 */
    public final Object mo38153L0(Object obj) {
        c8g0 c8g0Var = this.f175843c;
        if (obj != null) {
            throw new ClassCastException();
        }
        Context contextM31789b = c8g0Var.m31789b();
        String str = true != uif1.m83201a() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
        synchronized (w9h1.class) {
            byte b = (byte) (((byte) 1) | 2);
            int i = 3;
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            p8h1 p8h1Var = new p8h1(str);
            synchronized (w9h1.class) {
                try {
                    if (w9h1.f249180a == null) {
                        w9h1.f249180a = new epg1(i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i2 = wrg1.f254357a;
            if (aos.m26613a(contextM31789b, "com.google.mlkit.dynamite.barcode") <= 0) {
                vj10.f241854b.getClass();
                if (wo10.m88616b(contextM31789b) < 204500000) {
                    throw null;
                }
            }
            c8g0 c8g0Var2 = this.f175843c;
            new AtomicInteger(0);
            new AtomicBoolean(false);
            new s831();
            new LinkedList();
            ig31.m50507y(c8g0Var2, "MlKitContext can not be null");
            ig31.m50507y(null, "BarcodeScannerOptions can not be null");
            throw null;
        }
        int i3 = wrg1.f254357a;
        if (aos.m26613a(contextM31789b, "com.google.mlkit.dynamite.barcode") <= 0) {
            vj10.f241854b.getClass();
            if (wo10.m88616b(contextM31789b) < 204500000) {
                throw null;
            }
        }
        c8g0 c8g0Var3 = this.f175843c;
        new AtomicInteger(0);
        new AtomicBoolean(false);
        new s831();
        new LinkedList();
        ig31.m50507y(c8g0Var3, "MlKitContext can not be null");
        ig31.m50507y(null, "BarcodeScannerOptions can not be null");
        throw null;
    }
}
