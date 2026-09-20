package p204p;

import java.security.Provider;
import java.util.List;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
public final class d1e1 implements a9f1 {
    /* JADX INFO: renamed from: a */
    public static final String m34630a(String str) {
        List listM88477a1 = wl51.m88477a1(str, new String[]{"."}, 0, 6);
        String str2 = listM88477a1.size() == 1 ? (String) listM88477a1.get(0) : (String) g6f.m43687A0(listM88477a1);
        return str2.length() <= 127 ? str2 : wl51.m88489m1(127, str2);
    }

    @Override // p204p.a9f1
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Object mo24339b(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
