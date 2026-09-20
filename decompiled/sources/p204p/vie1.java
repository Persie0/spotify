package p204p;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.graphics.Brush;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class vie1 {

    /* JADX INFO: renamed from: a */
    public static volatile Integer f241687a = null;

    /* JADX INFO: renamed from: b */
    public static final char[] f241688b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: c */
    public static final Object f241689c = new Object();

    /* JADX INFO: renamed from: d */
    public static boolean f241690d = false;

    /* JADX INFO: renamed from: e */
    public static int f241691e = 0;

    /* JADX INFO: renamed from: f */
    public static sd40 f241692f = null;

    /* JADX INFO: renamed from: g */
    public static int f241693g = 3;

    /* JADX INFO: renamed from: A */
    public static String m85612A(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m85635q(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m85635q(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: B */
    public static final void m85613B(List list, vbn0 vbn0Var) {
        Path path;
        ucn0 ucn0Var;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        Path path2;
        float f9;
        float f10;
        float f11;
        List list2 = list;
        uk4 uk4Var = (uk4) vbn0Var;
        Path path3 = uk4Var.f231212a;
        Path path4 = uk4Var.f231212a;
        int i = path3.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        uk4Var.m83309n();
        uk4Var.m83310o(i);
        ucn0 ucn0Var2 = list2.isEmpty() ? ccn0.f36584c : (ucn0) list2.get(0);
        int size = list2.size();
        float f12 = 0.0f;
        int i2 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (i2 < size) {
            ucn0 ucn0Var3 = (ucn0) list2.get(i2);
            if (ucn0Var3 instanceof ccn0) {
                uk4Var.m83301f();
                path = path4;
                size = size;
                f12 = f12;
                i2 = i2;
                ucn0Var = ucn0Var3;
                f13 = f17;
                f15 = f13;
                f14 = f18;
                f16 = f14;
            } else {
                if (ucn0Var3 instanceof ocn0) {
                    ocn0 ocn0Var = (ocn0) ucn0Var3;
                    float f19 = ocn0Var.f163964c;
                    f15 += f19;
                    float f20 = ocn0Var.f163965d;
                    f16 += f20;
                    path4.rMoveTo(f19, f20);
                    path = path4;
                    f17 = f15;
                    f18 = f16;
                } else if (ucn0Var3 instanceof gcn0) {
                    gcn0 gcn0Var = (gcn0) ucn0Var3;
                    float f21 = gcn0Var.f78624c;
                    float f22 = gcn0Var.f78625d;
                    uk4Var.m83305j(f21, f22);
                    f16 = f22;
                    f18 = f16;
                    path = path4;
                    f15 = f21;
                    f17 = f15;
                } else {
                    if (ucn0Var3 instanceof ncn0) {
                        ncn0 ncn0Var = (ncn0) ucn0Var3;
                        float f23 = ncn0Var.f152563d;
                        float f24 = ncn0Var.f152562c;
                        path4.rLineTo(f24, f23);
                        f15 += f24;
                        f16 += f23;
                    } else if (ucn0Var3 instanceof fcn0) {
                        fcn0 fcn0Var = (fcn0) ucn0Var3;
                        float f25 = fcn0Var.f68161d;
                        float f26 = fcn0Var.f68160c;
                        uk4Var.m83304i(f26, f25);
                        f15 = f26;
                        path = path4;
                        f16 = f25;
                    } else if (ucn0Var3 instanceof mcn0) {
                        float f27 = ((mcn0) ucn0Var3).f142209c;
                        path4.rLineTo(f27, f12);
                        f15 += f27;
                    } else if (ucn0Var3 instanceof ecn0) {
                        float f28 = ((ecn0) ucn0Var3).f58361c;
                        uk4Var.m83304i(f28, f16);
                        f15 = f28;
                    } else if (ucn0Var3 instanceof scn0) {
                        float f29 = ((scn0) ucn0Var3).f207771c;
                        path4.rLineTo(f12, f29);
                        f16 += f29;
                    } else if (ucn0Var3 instanceof tcn0) {
                        float f30 = ((tcn0) ucn0Var3).f219118c;
                        uk4Var.m83304i(f15, f30);
                        f16 = f30;
                    } else {
                        if (ucn0Var3 instanceof lcn0) {
                            lcn0 lcn0Var = (lcn0) ucn0Var3;
                            path4.rCubicTo(lcn0Var.f131955c, lcn0Var.f131956d, lcn0Var.f131957e, lcn0Var.f131958f, lcn0Var.f131959g, lcn0Var.f131960h);
                            path2 = path4;
                            f9 = lcn0Var.f131957e + f15;
                            f10 = lcn0Var.f131958f + f16;
                            f15 += lcn0Var.f131959g;
                            f11 = lcn0Var.f131960h;
                        } else {
                            Path path5 = path4;
                            if (ucn0Var3 instanceof dcn0) {
                                dcn0 dcn0Var = (dcn0) ucn0Var3;
                                uk4Var.m83302g(dcn0Var.f47585c, dcn0Var.f47586d, dcn0Var.f47587e, dcn0Var.f47588f, dcn0Var.f47589g, dcn0Var.f47590h);
                                f3 = dcn0Var.f47587e;
                                f4 = dcn0Var.f47588f;
                                f5 = dcn0Var.f47589g;
                                f6 = dcn0Var.f47590h;
                            } else if (ucn0Var3 instanceof qcn0) {
                                if (ucn0Var2.f229088a) {
                                    f7 = f15 - f13;
                                    f8 = f16 - f14;
                                } else {
                                    f7 = f12;
                                    f8 = f7;
                                }
                                qcn0 qcn0Var = (qcn0) ucn0Var3;
                                path5.rCubicTo(f7, f8, qcn0Var.f187389c, qcn0Var.f187390d, qcn0Var.f187391e, qcn0Var.f187392f);
                                path2 = path5;
                                f9 = qcn0Var.f187389c + f15;
                                f10 = qcn0Var.f187390d + f16;
                                f15 += qcn0Var.f187391e;
                                f11 = qcn0Var.f187392f;
                            } else if (ucn0Var3 instanceof icn0) {
                                if (ucn0Var2.f229088a) {
                                    float f31 = 2;
                                    f15 = (f15 * f31) - f13;
                                    f16 = (f31 * f16) - f14;
                                }
                                icn0 icn0Var = (icn0) ucn0Var3;
                                uk4Var.m83302g(f15, f16, icn0Var.f100848c, icn0Var.f100849d, icn0Var.f100850e, icn0Var.f100851f);
                                f3 = icn0Var.f100848c;
                                f4 = icn0Var.f100849d;
                                f5 = icn0Var.f100850e;
                                f6 = icn0Var.f100851f;
                            } else {
                                if (ucn0Var3 instanceof pcn0) {
                                    pcn0 pcn0Var = (pcn0) ucn0Var3;
                                    float f32 = pcn0Var.f176178f;
                                    float f33 = pcn0Var.f176177e;
                                    float f34 = pcn0Var.f176176d;
                                    float f35 = pcn0Var.f176175c;
                                    path5.rQuadTo(f35, f34, f33, f32);
                                    float f36 = f35 + f15;
                                    f14 = f34 + f16;
                                    f15 += f33;
                                    f16 += f32;
                                    f13 = f36;
                                } else if (ucn0Var3 instanceof hcn0) {
                                    hcn0 hcn0Var = (hcn0) ucn0Var3;
                                    float f37 = hcn0Var.f89850f;
                                    float f38 = hcn0Var.f89849e;
                                    f14 = hcn0Var.f89848d;
                                    float f39 = hcn0Var.f89847c;
                                    path5.quadTo(f39, f14, f38, f37);
                                    f16 = f37;
                                    f15 = f38;
                                    path = path5;
                                    size = size;
                                    f12 = f12;
                                    i2 = i2;
                                    ucn0Var = ucn0Var3;
                                    f13 = f39;
                                } else if (ucn0Var3 instanceof rcn0) {
                                    if (ucn0Var2.f229089b) {
                                        f = f15 - f13;
                                        f2 = f16 - f14;
                                    } else {
                                        f = f12;
                                        f2 = f;
                                    }
                                    rcn0 rcn0Var = (rcn0) ucn0Var3;
                                    float f40 = rcn0Var.f197900d;
                                    float f41 = rcn0Var.f197899c;
                                    path5.rQuadTo(f, f2, f41, f40);
                                    float f42 = f + f15;
                                    float f43 = f2 + f16;
                                    f15 += f41;
                                    f16 += f40;
                                    f13 = f42;
                                    f14 = f43;
                                } else if (ucn0Var3 instanceof jcn0) {
                                    if (ucn0Var2.f229089b) {
                                        float f44 = 2;
                                        f15 = (f15 * f44) - f13;
                                        f16 = (f44 * f16) - f14;
                                    }
                                    jcn0 jcn0Var = (jcn0) ucn0Var3;
                                    float f45 = jcn0Var.f111150d;
                                    float f46 = jcn0Var.f111149c;
                                    path5.quadTo(f15, f16, f46, f45);
                                    path = path5;
                                    size = size;
                                    f12 = f12;
                                    i2 = i2;
                                    f13 = f15;
                                    f14 = f16;
                                    ucn0Var = ucn0Var3;
                                    f15 = f46;
                                    f16 = f45;
                                } else if (ucn0Var3 instanceof kcn0) {
                                    kcn0 kcn0Var = (kcn0) ucn0Var3;
                                    float f47 = kcn0Var.f121516h + f15;
                                    float f48 = kcn0Var.f121517i + f16;
                                    path = path5;
                                    i2 = i2;
                                    f12 = 0.0f;
                                    size = size;
                                    uk4Var = uk4Var;
                                    m85625g(uk4Var, f15, f16, f47, f48, kcn0Var.f121511c, kcn0Var.f121512d, kcn0Var.f121513e, kcn0Var.f121514f, kcn0Var.f121515g);
                                    f13 = f47;
                                    f15 = f13;
                                    f14 = f48;
                                    f16 = f14;
                                    ucn0Var = ucn0Var3;
                                } else {
                                    path = path5;
                                    size = size;
                                    f12 = f12;
                                    i2 = i2;
                                    if (!(ucn0Var3 instanceof bcn0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bcn0 bcn0Var = (bcn0) ucn0Var3;
                                    float f49 = bcn0Var.f25924i;
                                    float f50 = bcn0Var.f25923h;
                                    ucn0Var = ucn0Var3;
                                    uk4Var = uk4Var;
                                    m85625g(uk4Var, f15, f16, f50, f49, bcn0Var.f25918c, bcn0Var.f25919d, bcn0Var.f25920e, bcn0Var.f25921f, bcn0Var.f25922g);
                                    f14 = f49;
                                    f16 = f14;
                                    f13 = f50;
                                    f15 = f13;
                                }
                                path = path5;
                            }
                            f15 = f5;
                            f16 = f6;
                            path = path5;
                            size = size;
                            f12 = f12;
                            i2 = i2;
                            ucn0Var = ucn0Var3;
                            f13 = f3;
                            f14 = f4;
                        }
                        f16 += f11;
                        f14 = f10;
                        path = path2;
                        size = size;
                        f12 = f12;
                        i2 = i2;
                        ucn0Var = ucn0Var3;
                        f13 = f9;
                    }
                    path = path4;
                }
                ucn0Var = ucn0Var3;
            }
            i2++;
            list2 = list;
            path4 = path;
            size = size;
            ucn0Var2 = ucn0Var;
            f12 = f12;
        }
    }

    /* JADX INFO: renamed from: C */
    public static m12 m85614C(Object obj) {
        return new m12(obj.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: D */
    public static String m85615D(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: E */
    public static String m85616E(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* JADX INFO: renamed from: F */
    public static void m85617F(String str) {
        m85634p(5, m85616E(str));
    }

    /* JADX INFO: renamed from: G */
    public static void m85618G(String str) {
        m85634p(5, m85616E(str));
    }

    /* JADX INFO: renamed from: a */
    public static final Object m85619a(qho qhoVar) {
        if (qhoVar instanceof oho) {
            return ((oho) qhoVar).f165512a;
        }
        throw new IllegalStateException("Kodiak expected the DataResult to be loaded, but it wasn't.\nPlease ensure you requested the data in your DataElement.\nIf you're not using List Content, make sure the host surface filters out unloaded elements.\nDataResult: " + qhoVar);
    }

    /* JADX INFO: renamed from: b */
    public static final void m85620b(int i, StringBuilder sb) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(g6f.m43753y0(arrayList, ",", null, null, null, 62));
    }

    /* JADX INFO: renamed from: c */
    public static final ktz0 m85621c(i82 i82Var, ktz0 ktz0Var) {
        ktz0 ktz0VarM85621c;
        if (wj50.m88271j(ktz0Var.getKind(), ntz0.f158457z0)) {
            ktz0 ktz0VarM87005j = w1h1.m87005j(i82Var, ktz0Var);
            if (ktz0VarM87005j != null && (ktz0VarM85621c = m85621c(i82Var, ktz0VarM87005j)) != null) {
                return ktz0VarM85621c;
            }
        } else if (ktz0Var.mo51606d()) {
            return m85621c(i82Var, ktz0Var.mo33225h(0));
        }
        return ktz0Var;
    }

    /* JADX INFO: renamed from: d */
    public static int m85622d(Context context) {
        long j;
        int i;
        int i2;
        long jM37389u = dyu.m37389u(context);
        int i3 = 2011;
        if (jM37389u != -1) {
            if (jM37389u <= 805306368) {
                return dyu.m37386r() <= 1 ? 2009 : 2010;
            }
            if (jM37389u > 1073741824) {
                if (jM37389u <= 1610612736) {
                    if (dyu.m37384p() < 1800000) {
                    }
                } else if (jM37389u > 2147483648L) {
                    if (jM37389u <= 3221225472L) {
                        return 2014;
                    }
                    return jM37389u <= 5368709120L ? 2015 : 2016;
                }
                return 2013;
            }
            if (dyu.m37384p() < 1300000) {
                return 2011;
            }
            return 2012;
        }
        ArrayList arrayList = new ArrayList();
        int iM37386r = dyu.m37386r();
        if (iM37386r < 1) {
            j = -1;
            i = -1;
        } else if (iM37386r == 1) {
            j = -1;
            i = 2008;
        } else {
            j = -1;
            i = iM37386r <= 3 ? 2011 : 2012;
        }
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
        long jM37384p = dyu.m37384p();
        if (jM37384p == j) {
            i2 = -1;
        } else if (jM37384p <= 528000) {
            i2 = 2008;
        } else if (jM37384p <= 620000) {
            i2 = 2009;
        } else if (jM37384p <= 1020000) {
            i2 = 2010;
        } else if (jM37384p <= 1220000) {
            i2 = 2011;
        } else if (jM37384p <= 1520000) {
            i2 = 2012;
        } else {
            i2 = jM37384p <= 2020000 ? 2013 : 2014;
        }
        if (i2 != -1) {
            arrayList.add(Integer.valueOf(i2));
        }
        long jM37389u2 = dyu.m37389u(context);
        if (jM37389u2 <= 0) {
            i3 = -1;
        } else if (jM37389u2 <= 201326592) {
            i3 = 2008;
        } else if (jM37389u2 <= 304087040) {
            i3 = 2009;
        } else if (jM37389u2 <= 536870912) {
            i3 = 2010;
        } else if (jM37389u2 > 1073741824) {
            if (jM37389u2 <= 1610612736) {
                i3 = 2012;
            } else {
                i3 = jM37389u2 <= 2147483648L ? 2013 : 2014;
            }
        }
        if (i3 != -1) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = arrayList.size() / 2;
        int i4 = size - 1;
        return ((((Integer) arrayList.get(size)).intValue() - ((Integer) arrayList.get(i4)).intValue()) / 2) + ((Integer) arrayList.get(i4)).intValue();
    }

    /* JADX INFO: renamed from: e */
    public static ObjectAnimator m85623e(View view, rb91 rb91Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, bqc1 bqc1Var) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) rb91Var.f197534b.getTag(R.id.transition_position);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        cc91 cc91Var = new cc91(view, rb91Var.f197534b, translationX, translationY);
        bqc1Var.m95486b(cc91Var);
        objectAnimatorOfPropertyValuesHolder.addListener(cc91Var);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: f */
    public static void m85624f(String str) {
        m85634p(3, m85616E(str));
    }

    /* JADX INFO: renamed from: g */
    public static final void m85625g(vbn0 vbn0Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            m85625g(vbn0Var, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d16 * dSqrt2;
        double d24 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        double d29 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * d29) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d30 = dAtan3;
        double d31 = -d10;
        double d32 = d31 * dCos2;
        double d33 = d6 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d6 * dCos2;
        double d37 = (dCos3 * d36) + (dSin3 * d35);
        double d38 = d30 / ((double) iCeil);
        double d39 = dAtan2;
        double d40 = d34;
        int i = 0;
        double d41 = d;
        double d42 = d37;
        double d43 = d2;
        while (i < iCeil) {
            double d44 = d39 + d38;
            double dSin4 = Math.sin(d44);
            double dCos4 = Math.cos(d44);
            int i2 = i;
            double d45 = (((d10 * dCos2) * dCos4) + d27) - (d33 * dSin4);
            int i3 = iCeil;
            double d46 = (d36 * dSin4) + (d10 * dSin2 * dCos4) + d28;
            double d47 = (d32 * dSin4) - (d33 * dCos4);
            double d48 = (dCos4 * d36) + (dSin4 * d35);
            double d49 = d44 - d39;
            double dTan = Math.tan(d49 / d18);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d29) - ((double) 1)) * Math.sin(d49)) / ((double) 3);
            ((uk4) vbn0Var).m83302g((float) ((d40 * dSqrt3) + d41), (float) ((d42 * dSqrt3) + d43), (float) (d45 - (dSqrt3 * d47)), (float) (d46 - (dSqrt3 * d48)), (float) d45, (float) d46);
            dSin2 = dSin2;
            d41 = d45;
            i = i2 + 1;
            d27 = d27;
            d29 = d29;
            d39 = d44;
            d42 = d48;
            d40 = d47;
            d43 = d46;
            iCeil = i3;
            d10 = d5;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m85626h(String str) {
        m85634p(6, m85616E(str));
    }

    /* JADX INFO: renamed from: i */
    public static void m85627i(String str) {
        m85634p(6, m85616E(str));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m85628j(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static View m85629k(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static Object m85630l(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* JADX INFO: renamed from: m */
    public static final pf40 m85631m(List list) {
        if (list != null) {
            return list instanceof pf40 ? (pf40) list : pf40.m69791p(g6f.m43737o0(list));
        }
        kf40 kf40Var = pf40.f176960b;
        return wsv0.f254763e;
    }

    /* JADX INFO: renamed from: n */
    public static final xf40 m85632n(Map map) {
        if (map == null) {
            return btv0.f30940g;
        }
        if (map instanceof xf40) {
            return xf40.m90451c(map);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return xf40.m90451c(linkedHashMap);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m85633o(String str) {
        return m85634p(3, m85616E(str));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m85634p(int i, String str) {
        return f241693g <= i || Log.isLoggable(str, i);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m85635q(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public static final Object m85636r(kd31 kd31Var, ibk ibkVar) {
        h760 h760Var;
        Object c6x0Var;
        if (ibkVar instanceof h760) {
            h760Var = (h760) ibkVar;
            int i = h760Var.f88354b;
            if ((i & Integer.MIN_VALUE) != 0) {
                h760Var.f88354b = i - Integer.MIN_VALUE;
            } else {
                h760Var = new h760(ibkVar);
            }
        } else {
            h760Var = new h760(ibkVar);
        }
        Object objInvoke = h760Var.f88353a;
        int i2 = h760Var.f88354b;
        try {
            if (i2 == 0) {
                bga.m29073P(objInvoke);
                h760Var.f88354b = 1;
                objInvoke = kd31Var.invoke(h760Var);
                Object obj = yuk.f276404a;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objInvoke);
            }
            c6x0Var = (g760) objInvoke;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        return thM77348a == null ? (g760) c6x0Var : new c760(thM77348a);
    }

    /* JADX INFO: renamed from: s */
    public static int m85637s(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(s571.m77247f(i3, "PROTOCOL_ERROR padding ", i, " > remaining length "));
    }

    /* JADX INFO: renamed from: t */
    public static String m85638t(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    StringBuilder sbM38572u = edb.m38572u("<", str2, " threw ");
                    sbM38572u.append(e.getClass().getName());
                    sbM38572u.append(">");
                    string = sbM38572u.toString();
                }
            }
            objArr[i2] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public static final wg01 m85639u(wg01 wg01Var, wg01 wg01Var2, float f) {
        float fM88249I = wj50.m88249I(wg01Var.m88002f(), wg01Var2.m88002f(), f);
        float fM88249I2 = wj50.m88249I(wg01Var.m88003g(), wg01Var2.m88003g(), f);
        long jM88001e = wg01Var.m88001e();
        long jM88001e2 = wg01Var2.m88001e();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(wj50.m88249I(acs.m25482a(jM88001e), acs.m25482a(jM88001e2), f))) << 32) | (((long) Float.floatToRawIntBits(wj50.m88249I(acs.m25483b(jM88001e), acs.m25483b(jM88001e2), f))) & 4294967295L);
        long jM75456z = rfg1.m75456z(f, wg01Var.m88000d(), wg01Var2.m88000d());
        Object objM51049a = ily.m51049a(wg01Var.m87999c(), wg01Var2.m87999c(), f);
        return new wg01(fM88249I, fM88249I2, jFloatToRawIntBits, jM75456z, objM51049a instanceof Brush ? (Brush) objM51049a : null, wj50.m88249I(wg01Var.m87997a(), wg01Var2.m87997a(), f), f < 0.5f ? wg01Var.m87998b() : wg01Var2.m87998b());
    }

    /* JADX INFO: renamed from: v */
    public static kzs0 m85640v() {
        return new kzs0(qhj.f188789c);
    }

    /* JADX INFO: renamed from: w */
    public static String m85641w(int i, String str) {
        if (i <= 1) {
            c95.m31842h("invalid count: %s", i, i >= 0);
            return i == 0 ? "" : str;
        }
        int length = str.length();
        long j = ((long) length) * ((long) i);
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArrayIndexOutOfBoundsException(edb.m38561j(j, "Required array size too large: "));
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length >= i3) {
                System.arraycopy(cArr, 0, cArr, length, i3);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    /* JADX INFO: renamed from: x */
    public static final Observable m85642x(juk jukVar, th00 th00Var) {
        if (jukVar.mo26595B(gk40.f80712X0) == null) {
            return Observable.create(new w790(jukVar, th00Var, 3));
        }
        throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + jukVar).toString());
    }

    /* JADX INFO: renamed from: y */
    public static final lfe1 m85643y(fk60 fk60Var, ktz0 ktz0Var) {
        k0e1 kind = ktz0Var.getKind();
        if (kind instanceof v8q0) {
            return lfe1.POLY_OBJ;
        }
        if (!wj50.m88271j(kind, in51.f103871A0)) {
            if (!wj50.m88271j(kind, jn51.f114021z0)) {
                return lfe1.OBJ;
            }
            ktz0 ktz0VarM85621c = m85621c(fk60Var.f70478b, ktz0Var.mo33225h(0));
            k0e1 kind2 = ktz0VarM85621c.getKind();
            if ((kind2 instanceof aer0) || wj50.m88271j(kind2, otz0.f170119z0)) {
                return lfe1.MAP;
            }
            if (!fk60Var.f70477a.f189467d) {
                throw fpg1.m42349e(ktz0VarM85621c);
            }
        }
        return lfe1.LIST;
    }

    /* JADX INFO: renamed from: z */
    public static int m85644z(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: H */
    public abstract void mo74054H(int i, byte[] bArr, int i2);
}
