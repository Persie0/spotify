package p204p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.comscore.streaming.ContentType;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.mobius.Next;
import com.spotify.playbacknative.AudioDriver;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qvf1 {

    /* JADX INFO: renamed from: a */
    public static final f150 f193008a = new f150(27);

    /* JADX INFO: renamed from: b */
    public static final rcg f193009b = new rcg(2);

    /* JADX INFO: renamed from: c */
    public static sd40 f193010c;

    /* JADX INFO: renamed from: d */
    public static sd40 f193011d;

    /* JADX INFO: renamed from: A */
    public static final ro80 m73996A(List list, List list2) {
        int iM31820L = c95.m31820L(i6f.m49804T(list2, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj : list2) {
            linkedHashMap.put(((d351) obj).f44774a, obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d351 d351Var = (d351) it.next();
            String str = d351Var.f44774a;
            String str2 = d351Var.f44774a;
            linkedHashSet.add(str);
            d351 d351Var2 = (d351) linkedHashMap.get(str2);
            if (d351Var2 != null) {
                ArrayList arrayListM43700N0 = g6f.m43700N0(d351Var2.f44776c, d351Var.f44776c);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListM43700N0) {
                    if (hashSet.add(((k251) obj2).f118494a)) {
                        arrayList2.add(obj2);
                    }
                }
                d351Var = new d351(str2, arrayList2, d351Var.f44775b);
            }
            arrayList.add(d351Var);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (!linkedHashSet.contains(((d351) obj3).f44774a)) {
                arrayList3.add(obj3);
            }
        }
        ro80 ro80VarM44508o = geg1.m44508o();
        ro80VarM44508o.addAll(arrayList);
        ro80VarM44508o.addAll(arrayList3);
        return geg1.m44506m(ro80VarM44508o);
    }

    /* JADX INFO: renamed from: B */
    public static String m73997B(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i7, i3);
                    i2 -= i3 - i7;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: C */
    public static String m73998C(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM74026w = m74026w(str2);
        if (iArrM74026w[0] != -1) {
            sb.append(str2);
            m73997B(sb, iArrM74026w[1], iArrM74026w[2]);
            return sb.toString();
        }
        int[] iArrM74026w2 = m74026w(str);
        if (iArrM74026w[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM74026w2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM74026w[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM74026w2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrM74026w[1];
        if (i != 0) {
            int i2 = iArrM74026w2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return m73997B(sb, iArrM74026w[1] + i2, i2 + iArrM74026w[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrM74026w2[1]);
            sb.append(str2);
            int i3 = iArrM74026w2[1];
            return m73997B(sb, i3, iArrM74026w[2] + i3);
        }
        int i4 = iArrM74026w2[0] + 2;
        int i5 = iArrM74026w2[1];
        if (i4 >= i5 || i5 != iArrM74026w2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM74026w2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrM74026w2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return m73997B(sb, iArrM74026w2[1], i6 + iArrM74026w[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrM74026w2[1];
        return m73997B(sb, i7, iArrM74026w[2] + i7 + 1);
    }

    /* JADX INFO: renamed from: D */
    public static Uri m73999D(String str, String str2) {
        return Uri.parse(m73998C(str, str2));
    }

    /* JADX INFO: renamed from: E */
    public static final float m74000E(int i) {
        float f = i / 255.0f;
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4f);
    }

    /* JADX INFO: renamed from: F */
    public static final ObjectAnimator m74001F(View view, float f, float f2, long j, PathInterpolator pathInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
        objectAnimatorOfFloat.setStartDelay(j);
        objectAnimatorOfFloat.setDuration(667L);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: G */
    public static Next m74002G(yuf0 yuf0Var, tof0 tof0Var) {
        d850 d850Var = tof0Var.f222252a;
        yuf0 yuf0VarM94655c = yuf0.m94655c(yuf0Var, ash0.f19458a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, -9, AudioDriver.SPOTIFY_MAX_VOLUME);
        if (fem.m41467p(yuf0Var)) {
            return Next.m15607i(yuf0VarM94655c, Collections.singleton(new lmf0(new vhr(2))));
        }
        return wj50.m88271j(yuf0Var.f276347T0, e2r0.f55505a) ? Next.m15607i(yuf0VarM94655c, Collections.singleton(new tlf0(yuf0Var.f276343P0, d850Var))) : Next.m15607i(yuf0VarM94655c, Collections.singleton(new ylf0(d850Var, false)));
    }

    /* JADX INFO: renamed from: H */
    public static boolean m74003H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static final void m74004a(int i, String str, wwu wwuVar, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1918419337);
        int i2 = ((i & 8) == 0 ? xq00Var.m91766g(wwuVar) : xq00Var.m91770i(wwuVar) ? 4 : 2) | i | (xq00Var.m91766g(str) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fyf fyfVarM75772x = rkk.m75772x(-7923220, new qba(wwuVar, str, 1, (byte) 0), xq00Var);
            float f = leu.m58816b(xq00Var).f117230b.f224758a;
            j4m0 j4m0Var = new j4m0(f, f, f, f);
            float f2 = leu.m58816b(xq00Var).f117235g.f159606d;
            cxh0 cxh0Var = cxh0.f43038a;
            m74006c(fyfVarM75772x, str, eh00Var, j4m0Var, mi21.m61834r(f2, cxh0Var), null, xq00Var, (i2 & ContentType.LONG_FORM_ON_DEMAND) | 6 | (i2 & 896), 32);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new r5e(wwuVar, str, eh00Var, fxh0Var2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m74005b(String str, String str2, eh00 eh00Var, fxh0 fxh0Var, udu uduVar, xq00 xq00Var, int i, int i2) {
        int i3;
        udu uduVar2;
        int i4;
        boolean z;
        fxh0 fxh0Var2;
        udu uduVar3;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var3;
        udu uduVar4;
        fxh0 fxh0Var4;
        xq00Var.m91775k0(-466545540);
        int i5 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
        } else {
            i3 = i5 | (xq00Var.m91770i(fxh0Var) ? 2048 : 1024);
        }
        if ((i2 & 16) == 0) {
            uduVar2 = uduVar;
            int i7 = xq00Var.m91770i(uduVar) ? 16384 : 8192;
            i4 = i3 | i7;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0 || xq00Var.m91735E()) {
                    if (i6 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        fxh0Var4 = fxh0Var3;
                        uduVar4 = sdu.f208086a;
                    } else {
                        uduVar4 = uduVar2;
                        fxh0Var4 = fxh0Var3;
                    }
                } else {
                    xq00Var.m91757b0();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    uduVar4 = uduVar2;
                    fxh0Var4 = fxh0Var;
                }
                xq00Var.m91790s();
                fyf fyfVarM75772x = rkk.m75772x(1431087857, new yx9(str, 16), xq00Var);
                float f = leu.m58816b(xq00Var).f117230b.f224761d;
                float f2 = leu.m58816b(xq00Var).f117230b.f224761d;
                j4m0 j4m0Var = new j4m0(f, f2, f, f2);
                lxu lxuVar = leu.m58816b(xq00Var).f117232d;
                nxu nxuVar = leu.m58816b(xq00Var).f117235g;
                txu txuVar = leu.m58816b(xq00Var).f117230b;
                if71 if71Var = leu.m58818d(xq00Var).f64971g;
                int i8 = (i4 & ContentType.LONG_FORM_ON_DEMAND) | 6 | (i4 & 896);
                int i9 = i4 << 3;
                m74006c(fyfVarM75772x, str2, eh00Var, j4m0Var, fxh0Var4, uduVar4, xq00Var, i8 | (57344 & i9) | (i9 & 458752), 0);
                fxh0Var2 = fxh0Var4;
                uduVar3 = uduVar4;
            } else {
                xq00Var.m91757b0();
                fxh0Var2 = fxh0Var;
                uduVar3 = uduVar2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new z41(str, str2, eh00Var, fxh0Var2, uduVar3, i, i2);
            }
        }
        uduVar2 = uduVar;
        i4 = i3 | i7;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    fxh0Var4 = fxh0Var3;
                    uduVar4 = sdu.f208086a;
                } else {
                    uduVar4 = uduVar2;
                    fxh0Var4 = fxh0Var3;
                }
            } else {
                if (i6 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    fxh0Var4 = fxh0Var3;
                    uduVar4 = sdu.f208086a;
                } else {
                    uduVar4 = uduVar2;
                    fxh0Var4 = fxh0Var3;
                }
            }
            xq00Var.m91790s();
            fyf fyfVarM75772x2 = rkk.m75772x(1431087857, new yx9(str, 16), xq00Var);
            float f3 = leu.m58816b(xq00Var).f117230b.f224761d;
            float f4 = leu.m58816b(xq00Var).f117230b.f224761d;
            j4m0 j4m0Var2 = new j4m0(f3, f4, f3, f4);
            lxu lxuVar2 = leu.m58816b(xq00Var).f117232d;
            nxu nxuVar2 = leu.m58816b(xq00Var).f117235g;
            txu txuVar2 = leu.m58816b(xq00Var).f117230b;
            if71 if71Var2 = leu.m58818d(xq00Var).f64971g;
            int i10 = (i4 & ContentType.LONG_FORM_ON_DEMAND) | 6 | (i4 & 896);
            int i11 = i4 << 3;
            m74006c(fyfVarM75772x2, str2, eh00Var, j4m0Var2, fxh0Var4, uduVar4, xq00Var, i10 | (57344 & i11) | (i11 & 458752), 0);
            fxh0Var2 = fxh0Var4;
            uduVar3 = uduVar4;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            uduVar3 = uduVar2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z41(str, str2, eh00Var, fxh0Var2, uduVar3, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m74006c(fyf fyfVar, String str, eh00 eh00Var, j4m0 j4m0Var, fxh0 fxh0Var, udu uduVar, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        udu uduVar2;
        udu uduVar3;
        xq00Var.m91775k0(1618458305);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91770i(j4m0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            fxh0Var2 = fxh0Var;
            i3 |= xq00Var.m91770i(fxh0Var2) ? 16384 : 8192;
        } else {
            fxh0Var2 = fxh0Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                uduVar2 = uduVar;
                int i4 = xq00Var.m91770i(uduVar2) ? 131072 : 65536;
                i3 |= i4;
            } else {
                uduVar2 = uduVar;
            }
            i3 |= i4;
        } else {
            uduVar2 = uduVar;
        }
        if (xq00Var.m91752Y(i3 & 1, (74899 & i3) != 74898)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            } else if ((i2 & 32) != 0) {
                i3 &= -458753;
                uduVar2 = sdu.f208086a;
            }
            udu uduVar4 = uduVar2;
            xq00Var.m91790s();
            if (wl51.m88460J0(str)) {
                throw new IllegalArgumentException("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            }
            peu peuVar = new peu(new t40(str), eh00Var);
            int i5 = i3;
            aiu aiuVar = aiu.f16093c;
            float f = leu.m58816b(xq00Var).f117230b.f224759b;
            float f2 = leu.m58816b(xq00Var).f117230b.f224759b;
            int i6 = i5 >> 3;
            z520.m95426f(peuVar, aiuVar, new xhu(new j4m0(f, f2, f, f2), leu.m58816b(xq00Var).f117232d.f137886b, leu.m58816b(xq00Var).f117235g.f159604b, leu.m58816b(xq00Var).f117230b.f224760c, leu.m58818d(xq00Var).f64974j), fxh0Var2, 0, null, uduVar4, null, null, null, null, false, j4m0Var, rkk.m75772x(-850316004, new vn2(fyfVar, 4), xq00Var), xq00Var, (i6 & 7168) | ((i5 << 3) & 3670016), (i6 & 896) | 3072, 4016);
            uduVar3 = uduVar4;
        } else {
            xq00Var.m91757b0();
            uduVar3 = uduVar2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1745cl(fyfVar, str, eh00Var, j4m0Var, fxh0Var, uduVar3, i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m74007d(int i) {
        if ((m74000E(Color.blue(i)) * 0.0722f) + (m74000E(Color.green(i)) * 0.7152f) + (m74000E(Color.red(i)) * 0.2126f) >= 0.12f) {
            return i;
        }
        return Color.argb(255, (int) (((255 - Color.red(i)) * 0.2f) + Color.red(i)), (int) (((255 - Color.green(i)) * 0.2f) + Color.green(i)), (int) (((255 - Color.blue(i)) * 0.2f) + Color.blue(i)));
    }

    /* JADX INFO: renamed from: e */
    public static final ValueAnimator m74008e(long j, PathInterpolator pathInterpolator, List list) {
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(j);
        valueAnimatorOfFloat.setDuration(667L);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        valueAnimatorOfFloat.addListener(new gey0(i, list));
        valueAnimatorOfFloat.addUpdateListener(new fey0(i, list));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: f */
    public static vym m74009f(hfx hfxVar, lfx lfxVar, dcm0 dcm0Var, w2a1 w2a1Var) {
        hfxVar.getClass();
        dcm0Var.getClass();
        w2a1Var.getClass();
        return new vym(hfxVar, lfxVar, dcm0Var);
    }

    /* JADX INFO: renamed from: g */
    public static void m74010g(String str, Object obj, String str2) {
        if (Log.isLoggable(m74025v(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m74011h(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m74025v(str), 3)) {
            String.format(str2, objArr);
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m74012i(String str) {
        if (bm51.m29803n0(str, "spotify:mosaic:", false)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        try {
            return new String(Base64.decode(Uri.decode(str), 0), vuc.f244913a);
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m74013j(Animator animator) {
        if (animator instanceof AnimatorSet) {
            for (Animator animator2 : ((AnimatorSet) animator).getChildAnimations()) {
                wj50.m88279p(animator2);
                m74013j(animator2);
            }
        }
        animator.removeAllListeners();
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animator.cancel();
    }

    /* JADX INFO: renamed from: k */
    public static final float m74014k(Integer num, View view) {
        return TypedValue.applyDimension(1, num.floatValue(), view.getContext().getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: l */
    public static void m74015l(String str) {
        Log.isLoggable(m74025v(str), 6);
    }

    /* JADX INFO: renamed from: m */
    public static ObjectAnimator m74016m(ParagraphView paragraphView, long j, long j2, PathInterpolator pathInterpolator, int i) {
        if ((i & 8) != 0) {
            j2 = 0;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(paragraphView, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: n */
    public static ObjectAnimator m74017n(View view, PathInterpolator pathInterpolator) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setStartDelay(333L);
        objectAnimatorOfFloat.setDuration(333L);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: o */
    public static a150 m74018o(int i, long j) {
        long j2 = i;
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? a150.f11336d : a150.f11335c;
        }
        if (j4 < -31557014167219200L) {
            return a150.f11335c;
        }
        if (j4 > 31556889864403199L) {
            return a150.f11336d;
        }
        long j5 = j2 % 1000000000;
        return new a150((int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)), j4);
    }

    /* JADX INFO: renamed from: p */
    public static final fiz m74019p(vmz vmzVar) {
        return vmzVar.m86026c("age_assurance_account_warning_timestamp", "");
    }

    /* JADX INFO: renamed from: q */
    public static final fiz m74020q(vmz vmzVar) {
        return vmzVar.m86024a("should-assure-age-social", false);
    }

    /* JADX INFO: renamed from: r */
    public static List m74021r(String str) {
        if (!m74029z(str)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int iEnd = 0;
        if (!bm51.m29803n0(str, "spotify:mosaic:", false)) {
            str = m74012i(str);
        }
        String strSubstring = str.substring(15);
        Pattern patternCompile = Pattern.compile(":");
        wl51.m88474X0(0);
        Matcher matcher = patternCompile.matcher(strSubstring);
        if (!matcher.find()) {
            return geg1.m44518y(strSubstring.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(strSubstring.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(strSubstring.subSequence(iEnd, strSubstring.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static final fiz m74022s(vmz vmzVar) {
        return mvl0.m62953p(new rxp0(vmzVar.m86026c("estimated-age", "-1"), 8));
    }

    /* JADX INFO: renamed from: t */
    public static a150 m74023t() {
        return a150.f11336d;
    }

    /* JADX INFO: renamed from: u */
    public static a150 m74024u() {
        return a150.f11335c;
    }

    /* JADX INFO: renamed from: v */
    public static String m74025v(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    /* JADX INFO: renamed from: w */
    public static int[] m74026w(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX INFO: renamed from: x */
    public static void m74027x(String str, Serializable serializable) {
        if (Log.isLoggable(m74025v("CctTransportBackend"), 4)) {
            String.format(str, serializable);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final Map m74028y(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x151 x151Var = (x151) it.next();
            f251 f251Var = x151Var.f257070c;
            pqm0 pqm0Var = f251Var != null ? new pqm0(new c251(x151Var.f257068a), f251Var) : null;
            if (pqm0Var != null) {
                arrayList.add(pqm0Var);
            }
        }
        return kkc0.m56705r0(arrayList);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m74029z(String str) {
        return str != null && (bm51.m29803n0(str, "spotify:mosaic:", false) || bm51.m29803n0(m74012i(str), "spotify:mosaic:", false));
    }
}
