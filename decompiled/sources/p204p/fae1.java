package p204p;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes7.dex */
public final class fae1 implements a9f1, s4h1 {
    @Override // p204p.a9f1
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Object mo24339b(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }

    @Override // p204p.s4h1
    public Object zza(Object obj) {
        String str = (String) ((y071) obj).f226861b;
        return str == null ? "" : str;
    }
}
