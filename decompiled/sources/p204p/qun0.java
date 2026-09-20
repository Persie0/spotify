package p204p;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class qun0 implements iw51 {

    /* JADX INFO: renamed from: a */
    public final l2n0 f192742a = new l2n0();

    /* JADX INFO: renamed from: b */
    public final l2n0 f192743b = new l2n0();

    /* JADX INFO: renamed from: c */
    public final pun0 f192744c = new pun0();

    /* JADX INFO: renamed from: d */
    public Inflater f192745d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    @Override // p204p.iw51
    /* JADX INFO: renamed from: g */
    public final void mo27086g(byte[] bArr, int i, int i2, hw51 hw51Var, v8j v8jVar) {
        l2n0 l2n0Var;
        b0m b0mVar;
        int i3;
        int i4;
        int iM57917E;
        l2n0 l2n0Var2;
        int i5;
        int i6;
        int iM57920H;
        l2n0 l2n0Var3 = this.f192742a;
        l2n0Var3.m57928P(bArr, i + i2);
        l2n0Var3.m57930R(i);
        if (this.f192745d == null) {
            this.f192745d = new Inflater();
        }
        Inflater inflater = this.f192745d;
        String str = h0b1.f86200a;
        if (l2n0Var3.m57932a() > 0 && l2n0Var3.m57942n() == 120) {
            l2n0 l2n0Var4 = this.f192743b;
            if (h0b1.m46287O(l2n0Var3, l2n0Var4, inflater)) {
                l2n0Var3.m57928P(l2n0Var4.f129054a, l2n0Var4.f129056c);
            }
        }
        pun0 pun0Var = this.f192744c;
        int i7 = 0;
        pun0Var.f181504d = 0;
        int[] iArr = pun0Var.f181502b;
        l2n0 l2n0Var5 = pun0Var.f181501a;
        pun0Var.f181505e = 0;
        pun0Var.f181506f = 0;
        pun0Var.f181507g = 0;
        pun0Var.f181508h = 0;
        pun0Var.f181509i = 0;
        l2n0Var5.m57927O(0);
        pun0Var.f181503c = false;
        ArrayList arrayList = new ArrayList();
        while (l2n0Var3.m57932a() >= 3) {
            int i8 = l2n0Var3.f129056c;
            int iM57917E2 = l2n0Var3.m57917E();
            int iM57924L = l2n0Var3.m57924L();
            int i9 = l2n0Var3.f129055b + iM57924L;
            if (i9 > i8) {
                l2n0Var3.m57930R(i8);
                i3 = i7;
                l2n0Var2 = l2n0Var3;
                b0mVar = null;
            } else {
                char c = 128;
                if (iM57917E2 != 128) {
                    switch (iM57917E2) {
                        case 20:
                            if (iM57924L % 5 == 2) {
                                l2n0Var3.m57931S(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iM57924L / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iM57917E3 = l2n0Var3.m57917E();
                                    char c2 = c;
                                    double dM57917E = l2n0Var3.m57917E();
                                    double dM57917E2 = l2n0Var3.m57917E() - 128;
                                    double dM57917E3 = l2n0Var3.m57917E() - 128;
                                    iArr[iM57917E3] = h0b1.m46317j((int) ((dM57917E3 * 1.772d) + dM57917E), 0, 255) | (l2n0Var3.m57917E() << 24) | (h0b1.m46317j((int) ((1.402d * dM57917E2) + dM57917E), 0, 255) << 16) | (h0b1.m46317j((int) ((dM57917E - (0.34414d * dM57917E3)) - (dM57917E2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    l2n0Var3 = l2n0Var3;
                                }
                                l2n0Var = l2n0Var3;
                                pun0Var.f181503c = true;
                            } else {
                                l2n0Var = l2n0Var3;
                            }
                            break;
                        case 21:
                            if (iM57924L >= 4) {
                                l2n0Var3.m57931S(3);
                                int i12 = iM57924L - 4;
                                if (((128 & l2n0Var3.m57917E()) != 0 ? 1 : i7) == 0) {
                                    i5 = l2n0Var5.f129055b;
                                    i6 = l2n0Var5.f129056c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        l2n0Var3.m57943o(i5, l2n0Var5.f129054a, iMin);
                                        l2n0Var5.m57930R(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iM57920H = l2n0Var3.m57920H()) >= 4) {
                                    pun0Var.f181508h = l2n0Var3.m57924L();
                                    pun0Var.f181509i = l2n0Var3.m57924L();
                                    l2n0Var5.m57927O(iM57920H - 4);
                                    i12 = iM57924L - 11;
                                    i5 = l2n0Var5.f129055b;
                                    i6 = l2n0Var5.f129056c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        l2n0Var3.m57943o(i5, l2n0Var5.f129054a, iMin2);
                                        l2n0Var5.m57930R(i5 + iMin2);
                                    }
                                }
                            }
                            l2n0Var = l2n0Var3;
                            break;
                        case 22:
                            if (iM57924L >= 19) {
                                pun0Var.f181504d = l2n0Var3.m57924L();
                                pun0Var.f181505e = l2n0Var3.m57924L();
                                l2n0Var3.m57931S(11);
                                pun0Var.f181506f = l2n0Var3.m57924L();
                                pun0Var.f181507g = l2n0Var3.m57924L();
                            }
                            l2n0Var = l2n0Var3;
                            break;
                        default:
                            l2n0Var = l2n0Var3;
                            break;
                    }
                    i3 = 0;
                    b0mVar = null;
                } else {
                    l2n0Var = l2n0Var3;
                    if (pun0Var.f181504d == 0 || pun0Var.f181505e == 0 || pun0Var.f181508h == 0 || pun0Var.f181509i == 0 || (i4 = l2n0Var5.f129056c) == 0 || l2n0Var5.f129055b != i4 || !pun0Var.f181503c) {
                        b0mVar = null;
                    } else {
                        l2n0Var5.m57930R(0);
                        int i13 = pun0Var.f181508h * pun0Var.f181509i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iM57917E4 = l2n0Var5.m57917E();
                            if (iM57917E4 != 0) {
                                iM57917E = i14 + 1;
                                iArr2[i14] = iArr[iM57917E4];
                            } else {
                                int iM57917E5 = l2n0Var5.m57917E();
                                if (iM57917E5 != 0) {
                                    iM57917E = ((iM57917E5 & 64) == 0 ? iM57917E5 & 63 : ((iM57917E5 & 63) << 8) | l2n0Var5.m57917E()) + i14;
                                    Arrays.fill(iArr2, i14, iM57917E, (iM57917E5 & 128) == 0 ? iArr[0] : iArr[l2n0Var5.m57917E()]);
                                }
                            }
                            i14 = iM57917E;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, pun0Var.f181508h, pun0Var.f181509i, Bitmap.Config.ARGB_8888);
                        float f = pun0Var.f181506f;
                        float f2 = pun0Var.f181504d;
                        float f3 = f / f2;
                        float f4 = pun0Var.f181507g;
                        float f5 = pun0Var.f181505e;
                        b0mVar = new b0m(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, pun0Var.f181508h / f2, pun0Var.f181509i / f5, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    pun0Var.f181504d = 0;
                    pun0Var.f181505e = 0;
                    pun0Var.f181506f = 0;
                    pun0Var.f181507g = 0;
                    pun0Var.f181508h = 0;
                    pun0Var.f181509i = 0;
                    l2n0Var5.m57927O(0);
                    pun0Var.f181503c = false;
                }
                l2n0Var2 = l2n0Var;
                l2n0Var2.m57930R(i9);
            }
            if (b0mVar != null) {
                arrayList.add(b0mVar);
            }
            l2n0Var3 = l2n0Var2;
            i7 = i3;
        }
        v8jVar.accept(new z0m(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // p204p.iw51
    /* JADX INFO: renamed from: k */
    public final int mo27087k() {
        return 2;
    }
}
