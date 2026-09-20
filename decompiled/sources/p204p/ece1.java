package p204p;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class ece1 implements InterfaceC2207oa, a9f1 {
    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        int iOrdinal = ((ihi) obj).f102296c.ordinal();
        if (iOrdinal != 1) {
            switch (iOrdinal) {
                case 49:
                case 50:
                case 51:
                case 52:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // p204p.a9f1
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Object mo24339b(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
