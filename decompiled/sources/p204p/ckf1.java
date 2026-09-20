package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.comscore.android.ConnectivityType;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.lang.reflect.Array;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ckf1 {

    /* JADX INFO: renamed from: a */
    public static final String[] f38985a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b */
    public static final int[] f38986b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f38987c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d */
    public static final int[] f38988d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e */
    public static final int[] f38989e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f */
    public static final int[] f38990f = {32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g */
    public static final int[] f38991g = {8000, pxb.AUDIO_CONTENT_SAMPLING_RATE, 24000, 32000, ConnectivityType.UNKNOWN, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: h */
    public static sd40 f38992h;

    /* JADX INFO: renamed from: i */
    public static sd40 f38993i;

    /* JADX INFO: renamed from: A */
    public static String m33150A(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX INFO: renamed from: B */
    public static final Boolean m33151B(Resources resources, String str) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m33152a(String str) {
        y400 y400Var = ki41.f122790a;
        y400 y400Var2 = ki41.f122790a;
        qti0 qti0VarM73841e = qti0.m73841e(str);
        y400 y400Var3 = y400.f269047c;
        jfg1.m53199v(qti0VarM73841e).f269048a.m95303c();
    }

    /* JADX INFO: renamed from: b */
    public static final vfe m33153b(String str) {
        y400 y400Var = ki41.f122790a;
        return new vfe(ki41.f122794e, qti0.m73841e(str));
    }

    /* JADX INFO: renamed from: c */
    public static final vfe m33154c(String str) {
        y400 y400Var = ki41.f122790a;
        return new vfe(ki41.f122790a, qti0.m73841e(str));
    }

    /* JADX INFO: renamed from: d */
    public static final vfe m33155d(String str) {
        y400 y400Var = ki41.f122790a;
        return new vfe(ki41.f122792c, qti0.m73841e(str));
    }

    /* JADX INFO: renamed from: e */
    public static final void m33156e(String str) {
        y400 y400Var = ki41.f122790a;
        y400 y400Var2 = ki41.f122790a;
        qti0 qti0VarM73841e = qti0.m73841e(str);
        y400 y400Var3 = y400.f269047c;
        jfg1.m53199v(qti0VarM73841e).f269048a.m95303c();
    }

    /* JADX INFO: renamed from: f */
    public static final vfe m33157f() {
        y400 y400Var = ki41.f122790a;
        return new vfe(ki41.f122793d, qti0.m73841e("EnumEntries"));
    }

    /* JADX INFO: renamed from: g */
    public static final LinkedHashMap m33158g(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iM31820L = c95.m31820L(i6f.m49804T(setEntrySet, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM31820L);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: h */
    public static final Locale m33159h(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (wj50.m88271j(localeForLanguageTag.toLanguageTag(), "und")) {
            System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    /* JADX INFO: renamed from: i */
    public static final vfe m33160i(qti0 qti0Var) {
        y400 y400Var = ki41.f122790a;
        vfe vfeVar = ki41.f122798i;
        return new vfe(vfeVar.f240966a, qti0.m73841e(qti0Var.m73845c().concat(vfeVar.m85358f().m73845c())));
    }

    /* JADX INFO: renamed from: j */
    public static final void m33161j(String str) {
        y400 y400Var = ki41.f122790a;
        y400 y400Var2 = ki41.f122790a;
        qti0 qti0VarM73841e = qti0.m73841e(str);
        y400 y400Var3 = y400.f269047c;
        jfg1.m53199v(qti0VarM73841e).f269048a.m95303c();
    }

    /* JADX INFO: renamed from: k */
    public static final vfe m33162k(String str) {
        y400 y400Var = ki41.f122790a;
        return new vfe(ki41.f122791b, qti0.m73841e(str));
    }

    /* JADX INFO: renamed from: l */
    public static final void m33163l() {
        y400 y400Var = ki41.f122790a;
        y400 y400Var2 = ki41.f122790a;
        qti0 qti0VarM73841e = qti0.m73841e("Sequence");
        y400 y400Var3 = y400.f269047c;
        jfg1.m53199v(qti0VarM73841e).f269048a.m95303c();
    }

    /* JADX INFO: renamed from: m */
    public static final vfe m33164m(vfe vfeVar) {
        y400 y400Var = ki41.f122790a;
        return new vfe(ki41.f122790a, qti0.m73841e("U".concat(vfeVar.m85358f().m73845c())));
    }

    /* JADX INFO: renamed from: n */
    public static lx9 m33165n(b7l0 b7l0Var, hc80 hc80Var, gh00 gh00Var, int i) {
        if ((i & 1) != 0) {
            hc80Var = null;
        }
        lx9 lx9Var = new lx9(gh00Var);
        if (hc80Var != null) {
            b7l0Var.m28385a(hc80Var, lx9Var);
            return lx9Var;
        }
        b7l0Var.m28386b(lx9Var);
        return lx9Var;
    }

    /* JADX INFO: renamed from: o */
    public static final dp40 m33166o(fp40 fp40Var, float f, float f2, cp40 cp40Var, String str, xq00 xq00Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        int i3 = i << 3;
        return m33167p(fp40Var, fValueOf, fValueOf2, geg1.f79120a, cp40Var, str, xq00Var, (i & 1022) | (57344 & i3) | (i3 & 458752), 0);
    }

    /* JADX INFO: renamed from: p */
    public static final dp40 m33167p(fp40 fp40Var, Number number, Number number2, tm91 tm91Var, cp40 cp40Var, String str, xq00 xq00Var, int i, int i2) {
        fp40 fp40Var2;
        Object obj;
        Object objM91750T = xq00Var.m91750T();
        ia7 ia7Var = t6x0.f217647t;
        if (objM91750T == ia7Var) {
            fp40Var2 = fp40Var;
            dp40 dp40Var = new dp40(fp40Var2, number, number2, tm91Var, cp40Var);
            obj = number2;
            xq00Var.m91793t0(dp40Var);
            objM91750T = dp40Var;
        } else {
            fp40Var2 = fp40Var;
            obj = number2;
        }
        dp40 dp40Var2 = (dp40) objM91750T;
        boolean z = true;
        boolean z2 = ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && xq00Var.m91770i(number)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && xq00Var.m91770i(obj)) || (i & 384) == 256);
        if ((((57344 & i) ^ 24576) <= 16384 || !xq00Var.m91770i(cp40Var)) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM91750T2 = xq00Var.m91750T();
        if (z3 || objM91750T2 == ia7Var) {
            tq00 tq00Var = new tq00(number, dp40Var2, obj, cp40Var, 1);
            xq00Var.m91793t0(tq00Var);
            objM91750T2 = tq00Var;
        }
        hz40.m49245q((eh00) objM91750T2, xq00Var);
        boolean zM91770i = xq00Var.m91770i(fp40Var2);
        Object objM91750T3 = xq00Var.m91750T();
        if (zM91770i || objM91750T3 == ia7Var) {
            objM91750T3 = new C1926h6(23, fp40Var2, dp40Var2);
            xq00Var.m91793t0(objM91750T3);
        }
        hz40.m49233e(dp40Var2, (gh00) objM91750T3, xq00Var);
        return dp40Var2;
    }

    /* JADX INFO: renamed from: q */
    public static final int m33168q(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return 0;
        }
        return i == 0 ? 1 : 2;
    }

    /* JADX INFO: renamed from: r */
    public static long m33169r(int i, int i2) {
        int i3 = -1;
        int i4 = i2 == 0 ? -1 : x8m.f259185a[edb.m38547C(i2)];
        if (i4 != -1) {
            i3 = 1;
            if (i4 == 1) {
                i3 = 0;
            } else if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (((long) i) << 32) | (((long) i3) & 4294967295L);
    }

    /* JADX INFO: renamed from: s */
    public static Object m33170s(ViewGroup viewGroup, boolean z) {
        Object c6x0Var;
        ViewGroup viewGroup2 = viewGroup;
        while (!wj50.m88271j(viewGroup2.getTag(), Integer.valueOf(R.id.now_playing_container_tag))) {
            ViewParent parent = viewGroup2.getParent();
            viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 == null) {
                viewGroup2 = null;
                break;
            }
        }
        if (viewGroup2 == null) {
            try {
                throw new IllegalStateException("Failed to find parent");
            } catch (Throwable th) {
                c6x0 c6x0Var2 = new c6x0(th);
                Throwable thM77348a = s6x0.m77348a(c6x0Var2);
                if (thM77348a != null) {
                    na6.m63972t("Failed to check required views", new IllegalArgumentException(thM77348a.getMessage()));
                }
                return c6x0Var2;
            }
        }
        if (viewGroup2.getWidth() <= 0 || viewGroup2.getHeight() <= 0) {
            return new c6x0(new IllegalStateException("Root dimensions not available"));
        }
        try {
            c6x0Var = m33171t(viewGroup2, viewGroup, z);
        } catch (Throwable th2) {
            c6x0Var = new c6x0(th2);
        }
        Throwable thM77348a2 = s6x0.m77348a(c6x0Var);
        if (thM77348a2 != null) {
            na6.m63972t("Failed to check required views", new IllegalArgumentException(thM77348a2.getMessage()));
        }
        return c6x0Var;
    }

    /* JADX INFO: renamed from: t */
    public static fzx0 m33171t(ViewGroup viewGroup, ViewGroup viewGroup2, boolean z) {
        Resources resources = viewGroup2.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.playback_controls_margin) + resources.getDimensionPixelSize(R.dimen.spacer_8);
        View viewFindViewById = viewGroup.findViewById(R.id.carousel_item_safe_barrier_top);
        if (viewFindViewById == null) {
            throw new IllegalStateException("Failed to find carousel_item_safe_barrier_top");
        }
        View viewFindViewById2 = viewGroup.findViewById(R.id.carousel_item_safe_barrier_bottom);
        if (viewFindViewById2 == null) {
            throw new IllegalStateException("Failed to find carousel_item_safe_barrier_bottom");
        }
        boolean zEquals = n5h1.m63733i((int) (viewGroup.getWidth() / viewGroup2.getContext().getResources().getDisplayMetrics().density), (int) (viewGroup.getHeight() / viewGroup2.getContext().getResources().getDisplayMetrics().density)).f266947a.equals(byd1.f32165d);
        double width = (((double) viewGroup2.getWidth()) - (((double) (viewFindViewById2.getY() - (viewFindViewById.getY() + viewFindViewById.getHeight()))) * 0.75d)) / ((double) 2);
        if (!z && zEquals) {
            dimensionPixelSize = Math.max(dimensionPixelSize, (int) width);
        }
        int bottom = viewFindViewById.getBottom() - viewGroup2.getTop();
        if (bottom < 0) {
            bottom = 0;
        }
        int bottom2 = viewGroup2.getBottom() - viewFindViewById2.getTop();
        return new fzx0(dimensionPixelSize, dimensionPixelSize, bottom, bottom2 >= 0 ? bottom2 : 0);
    }

    /* JADX INFO: renamed from: u */
    public static vcg0 m33172u(Integer num, st91 st91Var) {
        return new vcg0(num, st91Var);
    }

    /* JADX INFO: renamed from: v */
    public static int m33173v(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f38986b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f38987c[i4 - 1] : f38988d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f38989e[i4 - 1] : f38990f[i4 - 1];
        } else {
            i6 = f38991g[i4 - 1];
        }
        if (i2 == 3) {
            return m5p0.m60873e(i6, 144, i7, i8);
        }
        return m5p0.m60873e(i3 == 1 ? 72 : 144, i6, i7, i8);
    }

    /* JADX INFO: renamed from: w */
    public static Object m33174w(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: x */
    public static final fp40 m33175x(int i, String str, xq00 xq00Var) {
        Object objM91750T = xq00Var.m91750T();
        if (objM91750T == t6x0.f217647t) {
            objM91750T = new fp40();
            xq00Var.m91793t0(objM91750T);
        }
        fp40 fp40Var = (fp40) objM91750T;
        fp40Var.m42323a(0, xq00Var);
        return fp40Var;
    }

    /* JADX INFO: renamed from: y */
    public static Object[] m33176y(int i, Object[] objArr) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: z */
    public static final int m33177z(h2r0 h2r0Var) {
        if (h2r0Var instanceof g2r0) {
            return yjf1.m93882b0(((g2r0) h2r0Var).f76001a);
        }
        if (h2r0Var.equals(e2r0.f55505a)) {
            return R.string.mixing_transition_auto;
        }
        if (h2r0Var.equals(f2r0.f65259a)) {
            return R.string.mixing_transition_custom;
        }
        throw new NoWhenBranchMatchedException();
    }
}
