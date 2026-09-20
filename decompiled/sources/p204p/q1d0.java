package p204p;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1d0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f184296a = 0;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }
}
