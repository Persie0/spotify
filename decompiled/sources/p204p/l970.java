package p204p;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l970 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f131021a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public static z94 m58496a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (z94 z94Var : f131021a) {
            synchronized (z94Var) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return z94Var;
            }
        }
        throw new GeneralSecurityException(edb.m38564m("No KMS client does support: ", str));
    }
}
