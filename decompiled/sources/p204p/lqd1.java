package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public final class lqd1 implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public static final lqd1 f136013a = new lqd1();

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        jqd1 jqd1Var = (jqd1) obj;
        Exception exc = (Exception) obj2;
        String message = exc != null ? exc.getMessage() : null;
        if (message == null) {
            message = "";
        }
        Logger.m3966b("WhatsappOtpReceiver", "WhatsApp OTP error: " + jqd1Var + " " + message);
        hb11 hb11Var = mqd1.f146255a;
        String message2 = exc != null ? exc.getMessage() : null;
        mqd1.f146257c.mo46962a(jqd1Var + " " + (message2 != null ? message2 : ""));
    }
}
