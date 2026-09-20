package p204p;

import android.content.Context;
import java.security.KeyStore;
import java.security.KeyStoreException;

/* JADX INFO: renamed from: p.rp */
/* JADX INFO: loaded from: classes18.dex */
public final class C2346rp extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1786dq f201394a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2346rp(C1786dq c1786dq) {
        super(0);
        this.f201394a = c1786dq;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        C1786dq c1786dq = this.f201394a;
        C2141mv c2141mv = c1786dq.f51771c;
        try {
            return c2141mv.m62883a();
        } catch (Exception e) {
            C1786dq.m36589e(e, "Account Switching preferences could not be created first time");
            if (!(e instanceof KeyStoreException)) {
                return null;
            }
            try {
                Context context = c1786dq.f51769a;
                try {
                    context.getSharedPreferences("accountswitching_encrypted_sharedprefs", 0).edit().clear().apply();
                    context.deleteSharedPreferences("accountswitching_encrypted_sharedprefs");
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    keyStore.deleteEntry("_androidx_security_master_key_");
                } catch (Exception e2) {
                    C1786dq.m36589e(e2, "Account Switching failed to delete shared preferences file");
                }
                return c2141mv.m62883a();
            } catch (Exception e3) {
                C1786dq.m36589e(e3, "Account Switching could not recreate shared preferences");
                return null;
            }
        }
    }
}
