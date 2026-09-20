package p204p;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jd20 {

    /* JADX INFO: renamed from: a */
    public static final String f111224a = cul.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    public static final MessageDigest f111225b;

    static {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            Log.isLoggable(f111224a, 3);
            messageDigest = null;
        }
        f111225b = messageDigest;
    }
}
