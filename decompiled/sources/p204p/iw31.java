package p204p;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iw31 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106334a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f106334a) {
            case 0:
                jw31 jw31Var = (jw31) obj;
                jw31 jw31Var2 = (jw31) obj2;
                int iCompare = Integer.compare(jw31Var2.f116568a, jw31Var.f116568a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = jw31Var2.f116570c.compareTo(jw31Var.f116570c);
                return iCompareTo != 0 ? iCompareTo : jw31Var2.f116571d.compareTo(jw31Var.f116571d);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i = 0; i < Math.min(bArr.length, bArr2.length); i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                return 0;
            case 2:
                return Integer.compare(((lpd1) obj).f135743a.f145991b, ((lpd1) obj2).f135743a.f145991b);
            default:
                return Long.compare(((kpd1) obj).f125038b, ((kpd1) obj2).f125038b);
        }
    }
}
