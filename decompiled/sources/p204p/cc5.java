package p204p;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.util.Set;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cc5 {

    /* JADX INFO: renamed from: b */
    public static final bc5 f36311b = new bc5(0);

    /* JADX INFO: renamed from: c */
    public static volatile cc5 f36312c;

    /* JADX INFO: renamed from: a */
    public final wg61 f36313a;

    public cc5(int i) {
        switch (i) {
            case 1:
                this.f36313a = new wg61(dgj.f48814d);
                break;
            default:
                this.f36313a = new wg61(C2087le.f132408g);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public SharedPreferences m32208a() {
        if (p2l.f173365a.contains(this)) {
            return null;
        }
        try {
            return (SharedPreferences) this.f36313a.getValue();
        } catch (Throwable th) {
            p2l.m68953a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m32209b(Activity activity) {
        if (p2l.f173365a.contains(this)) {
            return;
        }
        try {
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            m32210c(activity.getIntent(), data);
        } catch (Throwable th) {
            p2l.m68953a(this, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public void m32210c(Intent intent, Uri uri) {
        String string;
        Set set = p2l.f173365a;
        if (set.contains(this)) {
            return;
        }
        try {
            String string2 = null;
            if (set.contains(this)) {
                string = null;
            } else {
                try {
                    String queryParameter = uri.getQueryParameter("al_applink_data");
                    if (queryParameter == null) {
                        string = null;
                    } else {
                        try {
                            string = new JSONObject(queryParameter).getString("campaign_ids");
                        } catch (Exception unused) {
                            string = null;
                        }
                    }
                } catch (Throwable th) {
                    p2l.m68953a(this, th);
                }
            }
            if (string == null) {
                if (!p2l.f173365a.contains(this)) {
                    try {
                        Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
                        if (bundleExtra != null) {
                            string2 = bundleExtra.getString("campaign_ids");
                        }
                    } catch (Throwable th2) {
                        p2l.m68953a(this, th2);
                    }
                }
                string = string2;
            }
            if (string != null) {
                m32208a().edit().putString("campaign_ids", string).apply();
            }
        } catch (Throwable th3) {
            p2l.m68953a(this, th3);
        }
    }

    /* JADX INFO: renamed from: d */
    public SecretKey m32211d() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        SecretKey secretKey;
        KeyStore.Entry entry = ((KeyStore) this.f36313a.getValue()).getEntry("recck", null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null && (secretKey = secretKeyEntry.getSecretKey()) != null) {
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder("recck", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        return keyGenerator.generateKey();
    }
}
