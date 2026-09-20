package p204p;

import com.google.android.recaptcha.internal.zzagk;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class fnd1 implements u4h1, z7g1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ fnd1 f71266a = new fnd1();

    @Override // p204p.u4h1
    /* JADX INFO: renamed from: a */
    public kuf1 mo24429a(ynd1 ynd1Var) throws GeneralSecurityException {
        x6h1 x6h1Var = e8f1.f57186a;
        String str = (String) ynd1Var.f274437a;
        if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str)));
        }
        try {
            s9f1 s9f1Var = (s9f1) ynd1Var.f274438b;
            haf1 haf1Var = haf1.f89214b;
            int i = m9f1.f141300a;
            x8h1 x8h1VarM90207z = x8h1.m90207z(s9f1Var, haf1.f89214b);
            if (x8h1VarM90207z.m90210w() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            z8h1 z8h1VarM90212y = x8h1VarM90207z.m90212y();
            if (z8h1VarM90212y.m95604w() == 0) {
                return lbh1.m58663u(tbh1.m80395u(e8f1.m38100b((t1h1) ynd1Var.f274440d), f9f1.m41055a(z8h1VarM90212y.m95605x().m77584y()), (Integer) ynd1Var.f274441e), new kkc1(f9f1.m41055a(x8h1VarM90207z.m90211x().m77584y()), 9));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzagk unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    @Override // p204p.z7g1
    public t9g1 zzb(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // p204p.z7g1
    public boolean zzc(Class cls) {
        return false;
    }
}
