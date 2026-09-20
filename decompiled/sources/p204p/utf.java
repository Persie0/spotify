package p204p;

import android.util.Size;
import com.google.android.recaptcha.internal.zzao;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class utf implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233907a;

    /* JADX INFO: renamed from: b */
    public final boolean f233908b;

    public /* synthetic */ utf(boolean z, int i) {
        this.f233907a = i;
        this.f233908b = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int i = this.f233907a;
        boolean z = this.f233908b;
        switch (i) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
                return z ? iSignum * (-1) : iSignum;
            default:
                int[] iArr = {1238241306, 1544407528, 274970277, -295806647, -1552805835, 183382075, 57564258, 871328242, 247849492};
                int i2 = 0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = iArr[2];
                int i6 = iArr[3];
                int i7 = iArr[4];
                int i8 = iArr[5];
                int i9 = iArr[6];
                int i10 = iArr[7];
                int iM79992g = t3d1.m79992g((i4 & (~i3)) | i5, (i3 & i6) | i7, i8, i9);
                int i11 = i10 % 247849492;
                ghf1 ghf1Var = (ghf1) obj;
                ghf1 ghf1Var2 = (ghf1) obj2;
                int i12 = ghf1Var.f79918g;
                if (i12 != ghf1Var2.f79918g) {
                    throw new IllegalArgumentException();
                }
                int i13 = i11 ^ iM79992g;
                try {
                    if (i12 == 0) {
                        throw null;
                    }
                    switch (i12 + i13) {
                        case 1:
                            if (!z) {
                                throw new IllegalArgumentException();
                            }
                            if (ghf1Var.m44744l() == ghf1Var2.m44744l()) {
                                return 0;
                            }
                            break;
                        case 2:
                            return Long.compare(ghf1Var.m44745m(), ghf1Var2.m44745m());
                        case 3:
                            h6h1 h6h1VarM44746n = ghf1Var.m44746n();
                            h6h1 h6h1VarM44746n2 = ghf1Var2.m44746n();
                            int i14 = 0;
                            while (true) {
                                length = h6h1VarM44746n.f88099a.length;
                                if (i2 < length && i14 < h6h1VarM44746n2.f88099a.length) {
                                    int iCompare = Integer.compare(h6h1.m46725f(h6h1VarM44746n.m46727b(i2)), h6h1.m46725f(h6h1VarM44746n2.m46727b(i14)));
                                    if (iCompare != 0) {
                                        return iCompare;
                                    }
                                    i2++;
                                    i14++;
                                }
                            }
                            return Integer.compare(length, h6h1VarM44746n2.f88099a.length);
                        case 4:
                            List listM44747o = ghf1Var.m44747o();
                            List listM44747o2 = ghf1Var2.m44747o();
                            Iterator it = ((ArrayList) listM44747o).iterator();
                            Iterator it2 = ((ArrayList) listM44747o2).iterator();
                            while (it.hasNext()) {
                                if (it2.hasNext()) {
                                    int iCompare2 = compare(it.next(), it2.next());
                                    if (iCompare2 != 0) {
                                        return iCompare2;
                                    }
                                }
                                break;
                            }
                            return it2.hasNext() ? -1 : 0;
                        case 5:
                            if (!z) {
                                throw new IllegalArgumentException();
                            }
                            if (ghf1Var.m44748p() == ghf1Var2.m44748p()) {
                                return 0;
                            }
                            break;
                            break;
                        case 6:
                            return Double.compare(ghf1Var.m44749q(), ghf1Var2.m44749q());
                        default:
                            return 0;
                    }
                    return 1;
                } catch (zzao e) {
                    throw new AssertionError(u2h1.m82254a("CEiv6BFfPnitUE+D"), e);
                }
        }
    }
}
