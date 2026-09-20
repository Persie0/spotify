package p204p;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yze1 {

    /* JADX INFO: renamed from: a */
    public static final Logger f277793a = Logger.getLogger("okio.Okio");

    /* JADX INFO: renamed from: a */
    public static final boolean m94986a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? wl51.m88496t0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
