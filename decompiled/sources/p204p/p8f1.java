package p204p;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p8f1 implements c2h1 {

    /* JADX INFO: renamed from: a */
    public final e7h1 f174956a;

    public p8f1(e7h1 e7h1Var) {
        this.f174956a = e7h1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    @Override // p204p.c2h1
    /* JADX INFO: renamed from: a */
    public final void mo31325a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        List list;
        e7h1 e7h1Var = this.f174956a;
        HashMap map = e7h1Var.f56938a;
        ?? g741Var = (List) map.get(e7h1.f56937b);
        if (bArr.length >= 5) {
            int length = bArr.length;
            list = (List) map.get(new f9f1(bArr, 5 > length ? length : 5));
        } else {
            list = null;
        }
        if (g741Var == 0 && list == null) {
            g741Var = new ArrayList();
        } else if (g741Var == 0) {
            g741Var = list;
        } else if (list != null) {
            g741Var = new g741(e7h1Var, list, g741Var);
        }
        Iterator it = g741Var.iterator();
        while (it.hasNext()) {
            try {
                ((q8f1) it.next()).f186313a.mo31325a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
