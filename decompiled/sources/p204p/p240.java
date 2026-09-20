package p204p;

import android.content.SharedPreferences;
import android.util.Base64;
import com.comscore.streaming.ContentType;
import io.ably.lib.rest.Auth;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class p240 {

    /* JADX INFO: renamed from: c */
    public static final String[] f173238c = {Auth.WILDCARD_CLIENTID, "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f173239a;

    /* JADX INFO: renamed from: b */
    public final String f173240b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public p240(faz fazVar) {
        fazVar.m41197a();
        this.f173239a = fazVar.f67665a.getSharedPreferences("com.google.android.gms.appid", 0);
        fazVar.m41197a();
        bbz bbzVar = fazVar.f67667c;
        String str = bbzVar.f25686e;
        if (str == null) {
            fazVar.m41197a();
            str = bbzVar.f25683b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f173240b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m68880a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f173239a) {
            String strEncodeToString = null;
            String string = this.f173239a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                e.toString();
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + ContentType.LONG_FORM_ON_DEMAND) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return strEncodeToString;
        }
    }
}
