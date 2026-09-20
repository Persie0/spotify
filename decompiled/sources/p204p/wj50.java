package p204p;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import com.spotify.wear.wearabledatalayer.LoginTimeoutException;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wj50 {

    /* JADX INFO: renamed from: a */
    public static final Object[] f251849a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final StackTraceElement[] f251850b = new StackTraceElement[0];

    /* JADX INFO: renamed from: c */
    public static boolean f251851c = true;

    /* JADX INFO: renamed from: d */
    public static Field f251852d;

    /* JADX INFO: renamed from: e */
    public static boolean f251853e;

    /* JADX INFO: renamed from: A */
    public static final void m88246A(DrawScope drawScope, rx10 rx10Var) {
        rx10Var.m76594c(drawScope.mo291d1().m31107v(), drawScope.mo291d1().m31109x());
    }

    /* JADX INFO: renamed from: B */
    public static final float m88247B(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / ((long) 3))) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: C */
    public static final int m88248C(lbb lbbVar) {
        return lbbVar.mo32242k().size();
    }

    /* JADX INFO: renamed from: I */
    public static final float m88249I(float f, float f2, float f3) {
        return (f3 * f2) + ((1 - f3) * f);
    }

    /* JADX INFO: renamed from: J */
    public static final int m88250J(int i, int i2, float f) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }

    /* JADX INFO: renamed from: P */
    public static final Object m88251P(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX INFO: renamed from: Q */
    public static ccx0 m88252Q(z4l0 z4l0Var, String str, nd70 nd70Var, s0i0 s0i0Var, Scheduler scheduler) {
        rth rthVar = new rth();
        rthVar.m76393n(pka1.f178421b);
        rthVar.m76389j(str);
        ph30 ph30VarM76382c = rthVar.m76382c();
        C2529wd c2529wd = new C2529wd();
        c2529wd.m87801s(ph30VarM76382c);
        Objects.requireNonNull(z4l0Var, "client == null");
        c2529wd.f250160a = z4l0Var;
        if (scheduler == null) {
            throw new NullPointerException("scheduler == null");
        }
        ((ArrayList) c2529wd.f250163d).add(new lwx0(scheduler, false));
        c2529wd.m87798o(yul0.m94658d());
        c2529wd.m87798o(yul0.m94657c());
        c2529wd.m87798o(s0i0Var);
        c2529wd.m87798o(nd70Var);
        return c2529wd.m87802t();
    }

    /* JADX INFO: renamed from: R */
    public static void m88253R(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88254a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final long m88255a0(long j, float f) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public static final void m88256b(int i, int i2, long j, ob3 ob3Var, vh00 vh00Var, xq00 xq00Var, fxh0 fxh0Var, if71 if71Var) {
        int i3;
        ob3 ob3Var2;
        if71 if71Var2;
        long j2;
        long j3;
        if71 if71Var3;
        ob3 ob3Var3;
        fxh0 fxh0Var2;
        fxh0 fxh0Var3;
        xq00Var.m91775k0(-1005619908);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(vh00Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                ob3Var2 = ob3Var;
                int i5 = xq00Var.m91770i(ob3Var2) ? 256 : 128;
                i3 |= i5;
            } else {
                ob3Var2 = ob3Var;
            }
            i3 |= i5;
        } else {
            ob3Var2 = ob3Var;
        }
        int i6 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                if71Var2 = if71Var;
                int i7 = xq00Var.m91770i(if71Var2) ? 16384 : 8192;
                i6 |= i7;
            } else {
                if71Var2 = if71Var;
            }
            i6 |= i7;
        } else {
            if71Var2 = if71Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j2 = j;
                int i8 = xq00Var.m91764f(j2) ? 131072 : 65536;
                i6 |= i8;
            } else {
                j2 = j;
            }
            i6 |= i8;
        } else {
            j2 = j;
        }
        if (xq00Var.m91752Y(i6 & 1, (74899 & i6) != 74898)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                fxh0 fxh0Var4 = i4 != 0 ? cxh0.f43038a : fxh0Var;
                if ((i2 & 4) != 0) {
                    ob3Var2 = d7f0.f46166e;
                    i6 &= -897;
                }
                if ((i2 & 16) != 0) {
                    if71Var2 = leu.m58818d(xq00Var).f64971g;
                    i6 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    j2 = leu.m58815a(xq00Var).f112824b.f138757a;
                    i6 &= -458753;
                }
                fxh0Var3 = fxh0Var4;
            } else {
                xq00Var.m91757b0();
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                }
                if ((i2 & 16) != 0) {
                    i6 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i6 &= -458753;
                }
                fxh0Var3 = fxh0Var;
            }
            ob3 ob3Var4 = ob3Var2;
            if71 if71Var4 = if71Var2;
            long j4 = j2;
            xq00Var.m91790s();
            if (vh00Var != null) {
                xq00Var.m91771i0(-1025447479);
                m88257c(((i6 >> 3) & 65534) | ((i6 << 15) & 458752), 0, j4, ob3Var4, vh00Var, xq00Var, fxh0Var3, if71Var4);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1025296602);
                xq00Var.m91788r(false);
            }
            j3 = j4;
            ob3Var3 = ob3Var4;
            fxh0Var2 = fxh0Var3;
            if71Var3 = if71Var4;
        } else {
            xq00Var.m91757b0();
            j3 = j2;
            if71Var3 = if71Var2;
            ob3Var3 = ob3Var2;
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vzu(vh00Var, fxh0Var2, ob3Var3, if71Var3, j3, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m88257c(int i, int i2, long j, ob3 ob3Var, vh00 vh00Var, xq00 xq00Var, fxh0 fxh0Var, if71 if71Var) {
        int i3;
        ob3 ob3Var2;
        if71 if71Var2;
        long j2;
        fxh0 fxh0Var2;
        long j3;
        fxh0 fxh0Var3;
        xq00Var.m91775k0(-1763625924);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                ob3Var2 = ob3Var;
                int i5 = xq00Var.m91770i(ob3Var2) ? 32 : 16;
                i3 |= i5;
            } else {
                ob3Var2 = ob3Var;
            }
            i3 |= i5;
        } else {
            ob3Var2 = ob3Var;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= xq00Var.m91768h(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                if71Var2 = if71Var;
                int i6 = xq00Var.m91770i(if71Var2) ? 2048 : 1024;
                i3 |= i6;
            } else {
                if71Var2 = if71Var;
            }
            i3 |= i6;
        } else {
            if71Var2 = if71Var;
        }
        if ((i & 24576) == 0) {
            j2 = j;
            i3 |= ((i2 & 16) == 0 && xq00Var.m91764f(j2)) ? 16384 : 8192;
        } else {
            j2 = j;
        }
        if ((196608 & i) == 0) {
            i3 |= xq00Var.m91770i(vh00Var) ? 131072 : 65536;
        }
        if (xq00Var.m91752Y(i3 & 1, (74899 & i3) != 74898)) {
            xq00Var.m91761d0();
            if ((i & 1) == 0 || xq00Var.m91735E()) {
                fxh0Var3 = i4 != 0 ? cxh0.f43038a : fxh0Var;
                if ((i2 & 2) != 0) {
                    ob3Var2 = d7f0.f46166e;
                    i3 &= -113;
                }
                if ((i2 & 8) != 0) {
                    if71Var2 = leu.m58818d(xq00Var).f64971g;
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    j2 = leu.m58815a(xq00Var).f112824b.f138757a;
                    i3 &= -57345;
                }
            } else {
                xq00Var.m91757b0();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                fxh0Var3 = fxh0Var;
            }
            long j4 = j2;
            if71 if71Var3 = if71Var2;
            xq00Var.m91790s();
            int i7 = i3 >> 9;
            bjg1.m29464m(if71Var3, j4, rkk.m75772x(-962608056, new frp(fxh0Var3, ob3Var2, vh00Var, 28), xq00Var), xq00Var, (i7 & 14) | 384 | (i7 & ContentType.LONG_FORM_ON_DEMAND), 0);
            fxh0Var2 = fxh0Var3;
            if71Var2 = if71Var3;
            j3 = j4;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            j3 = j2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vzu(fxh0Var2, ob3Var2, if71Var2, j3, vh00Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static String m88258c0(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: d */
    public static final void m88259d(int i, String str, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        fxh0 fxh0Var2;
        long j;
        xq00Var.m91775k0(-1700715475);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i | 48 | (xq00Var.m91768h(z) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                xq00Var.m91771i0(1994972593);
                j = leu.m58815a(xq00Var).f112824b.f138757a;
            } else {
                xq00Var.m91771i0(1994973588);
                j = leu.m58815a(xq00Var).f112824b.f138758b;
            }
            xq00Var.m91788r(false);
            float f = leu.m58816b(xq00Var).f117230b.f224760c;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25932d(str, zsf1.m96832C(cxh0Var, 0.0f, f, 0.0f, 0.0f, 13), if71.m50418a(leu.m58818d(xq00Var).f64974j, 0L, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, null, 0, 16744447), j, null, null, 2, false, new ol80(2), 0, null, xq00Var, (i2 & 14) | 1572864, 0, 1712);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new vih(str, fxh0Var2, z, i);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static void m88260d0(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(s571.m77251j("lateinit property ", str, " has not been initialized"));
        m88253R(uninitializedPropertyAccessException, wj50.class.getName());
        throw uninitializedPropertyAccessException;
    }

    /* JADX INFO: renamed from: e */
    public static final void m88261e(bs21 bs21Var, fyf fyfVar, xq00 xq00Var, int i) {
        xq00Var.m91775k0(994750566);
        int i2 = (xq00Var.m91766g(bs21Var) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            kqi0 kqi0VarM77671j = null;
            xv41 xv41VarMo30345a = bs21Var != null ? bs21Var.mo30345a() : null;
            if (xv41VarMo30345a == null) {
                xq00Var.m91771i0(-660099253);
            } else {
                xq00Var.m91771i0(-1822408842);
                kqi0VarM77671j = sam.m77671j(xv41VarMo30345a, xq00Var, 0);
            }
            xq00Var.m91788r(false);
            if (kqi0VarM77671j == null || ((Boolean) kqi0VarM77671j.getValue()).booleanValue()) {
                xq00Var.m91771i0(-660017412);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-660051047);
                fyfVar.mo24510D0(rkk.m75772x(1392786726, new du21(bs21Var, 0), xq00Var), xq00Var, 54);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gq3(bs21Var, fyfVar, i, 10);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final Object[] m88262e0(Collection collection) {
        int size = collection.size();
        Object[] objArr = f251849a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m88263f(n1z0 n1z0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        pqm0 pqm0Var;
        fmx0 fmx0VarM47993b;
        Uri uri;
        wwu wwuVar;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(878711945);
        int i2 = i | (xq00Var2.m91766g(n1z0Var) ? 4 : 2) | 48;
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            int iM38547C = edb.m38547C(n1z0Var.m63528a());
            if (iM38547C == 0) {
                xq00Var2.m91771i0(1893151295);
                float f = leu.m58816b(xq00Var2).f117235g.f159608f;
                pqm0 pqm0Var2 = new pqm0(new ybs(f), new ybs(f));
                xq00Var2.m91788r(false);
                pqm0Var = pqm0Var2;
            } else {
                if (iM38547C != 1) {
                    throw lq51.m59703i(-1601500440, xq00Var2, false);
                }
                xq00Var2.m91771i0(1893320586);
                pqm0Var = new pqm0(new ybs(ltf1.m59890l(R.dimen.video_row_cover_wide_art_width, xq00Var2)), new ybs(ltf1.m59890l(R.dimen.video_row_cover_wide_art_height, xq00Var2)));
                xq00Var2.m91788r(false);
            }
            float f2 = ((ybs) pqm0Var.f180350a).f271238a;
            float f3 = ((ybs) pqm0Var.f180351b).f271238a;
            wb9 wb9Var = d7f0.f46166e;
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(pmg1.m70357p(xq00Var2));
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            fxh0 fxh0VarM61835s = mi21.m61835s(cxh0Var, f2, f3);
            int iM38547C2 = edb.m38547C(n1z0Var.m63531d());
            if (iM38547C2 == 0) {
                xq00Var2.m91771i0(-2029233306);
                fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var2).f117234f.m63114a());
                xq00Var2.m91788r(false);
            } else {
                if (iM38547C2 != 1) {
                    throw lq51.m59703i(-2029234324, xq00Var2, false);
                }
                xq00Var2.m91771i0(-2029230887);
                xq00Var2.m91788r(false);
                fmx0VarM47993b = hmx0.f93097a;
            }
            fxh0 fxh0VarM94367e = yqg1.m94367e(r9g1.m75068p(fxh0VarM61835s, fmx0VarM47993b), n1z0Var.m63533f());
            String strM63532e = n1z0Var.m63532e();
            if (strM63532e == null || (uri = Uri.parse(strM63532e)) == null) {
                uri = Uri.EMPTY;
            }
            Uri uri2 = uri;
            m88279p(uri2);
            switch (edb.m38547C(n1z0Var.m63530c())) {
                case 0:
                    wwuVar = bnu.f28922c;
                    break;
                case 1:
                    wwuVar = nnu.f156491c;
                    break;
                case 2:
                    wwuVar = pnu.f179531c;
                    break;
                case 3:
                    wwuVar = qnu.f190701c;
                    break;
                case 4:
                    wwuVar = cuu.f42218c;
                    break;
                case 5:
                    wwuVar = ynu.f274505c;
                    break;
                case 6:
                    wwuVar = yqu.f275297c;
                    break;
                case 7:
                    wwuVar = ytu.f276219c;
                    break;
                case 8:
                    wwuVar = cuu.f42218c;
                    break;
                case 9:
                    wwuVar = bwu.f31733c;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            cxu cxuVar = new cxu(k2z0.m55216r(wwuVar, 0L, 0L, xq00Var2, 8, 30));
            xq00Var2 = xq00Var;
            l0y0.m57821c(uri2, qgj.f188480a, fxh0VarM94367e, null, null, null, r101.f194645M0, null, null, cxuVar, false, false, xq00Var2, 1075314736, 0, 3512);
            if (n1z0Var.m63529b().length() > 0) {
                xq00Var2.m91771i0(1621217846);
                fxh0Var2 = cxh0Var;
                v3d1.m84544e(n1z0Var.m63529b(), 18, zsf1.m96865y(leu.m58816b(xq00Var2).f117230b.f224759b, pha.f177517a.mo66945a(fxh0Var2, wb9Var)), 1, xq00Var2, 24624, 8);
                xq00Var2.m91788r(false);
            } else {
                fxh0Var2 = cxh0Var;
                xq00Var2.m91771i0(1621460979);
                xq00Var2.m91788r(false);
            }
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gex0(n1z0Var, fxh0Var2, i, 10);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final Object[] m88264f0(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m88265g(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    /* JADX INFO: renamed from: g0 */
    public static final double m88266g0(int i) {
        return (((double) ((i >>> 31) << 30)) * ((double) 2)) + ((double) (Integer.MAX_VALUE & i));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m88267h(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    /* JADX INFO: renamed from: h0 */
    public static final double m88268h0(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m88269i(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m88270i0(int i, int i2) {
        String strM54054M;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM54054M = jq60.m54054M("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(s571.m77248g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                }
                strM54054M = jq60.m54054M("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM54054M);
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m88271j(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m88272j0(int i, int i2, int i3) {
        String strM88274k0;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM88274k0 = m88274k0(i, i3, "start index");
            } else {
                strM88274k0 = (i2 < 0 || i2 > i3) ? m88274k0(i2, i3, "end index") : jq60.m54054M("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM88274k0);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Object m88273k(y7h1 y7h1Var, ibk ibkVar) throws Exception {
        if (!y7h1Var.mo1517i()) {
            hqb hqbVar = new hqb(1, seg1.m77914f(ibkVar));
            hqbVar.m48222q();
            y7h1Var.m92991l(dkr.f50013b, new qb70(hqbVar));
            return hqbVar.m48221p();
        }
        Exception excMo1514f = y7h1Var.mo1514f();
        if (excMo1514f != null) {
            throw excMo1514f;
        }
        if (!y7h1Var.f270088d) {
            return y7h1Var.mo1515g();
        }
        throw new CancellationException("Task " + y7h1Var + " was cancelled normally.");
    }

    /* JADX INFO: renamed from: k0 */
    public static String m88274k0(int i, int i2, String str) {
        if (i < 0) {
            return jq60.m54054M("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return jq60.m54054M("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(s571.m77248g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
    }

    /* JADX INFO: renamed from: l */
    public static void m88275l(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m88276m(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m88277n(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    /* JADX INFO: renamed from: o */
    public static void m88278o(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m88279p(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m88253R(nullPointerException, wj50.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: q */
    public static void m88280q(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m88281r(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m88282u(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: v */
    public static int m88283v(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:15:0x002f, B:22:0x0047, B:55:0x00f8, B:56:0x00fd, B:58:0x0101, B:61:0x0114, B:25:0x0054, B:42:0x00ce, B:45:0x00d3, B:46:0x00d8), top: B:66:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0101 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:15:0x002f, B:22:0x0047, B:55:0x00f8, B:56:0x00fd, B:58:0x0101, B:61:0x0114, B:25:0x0054, B:42:0x00ce, B:45:0x00d3, B:46:0x00d8), top: B:66:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0114 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:15:0x002f, B:22:0x0047, B:55:0x00f8, B:56:0x00fd, B:58:0x0101, B:61:0x0114, B:25:0x0054, B:42:0x00ce, B:45:0x00d3, B:46:0x00d8), top: B:66:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r15 == r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0111, code lost:
    
        if (r15 == r7) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [p.vzx] */
    /* JADX WARN: Type inference failed for: r11v1, types: [p.m12] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [p.m12] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [p.m12] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v8, types: [p.m12] */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m88284w(vzx vzxVar, eh00 eh00Var, Long l, vh00 vh00Var, ibk ibkVar) throws Throwable {
        upi upiVar;
        Object objM96567o;
        Object obj;
        uzx uzxVar;
        ?? M49526x;
        uzx uzxVar2;
        ?? r11;
        Object obj2;
        vh00 vh00Var2;
        eh00 eh00Var2;
        ?? r12;
        Object obj3;
        e301 e301Var;
        ?? r13;
        Object objMo24510D0;
        Object objInvoke;
        ?? r14;
        if (ibkVar instanceof upi) {
            upiVar = (upi) ibkVar;
            int i = upiVar.f232703g;
            if ((i & Integer.MIN_VALUE) != 0) {
                upiVar.f232703g = i - Integer.MIN_VALUE;
            } else {
                upiVar = new upi(ibkVar);
            }
        } else {
            upiVar = new upi(ibkVar);
        }
        Object obj4 = upiVar.f232702f;
        int i2 = upiVar.f232703g;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            vh00Var = upiVar.f232699c;
                            l = upiVar.f232698b;
                            eh00Var = upiVar.f232697a;
                            bga.m29073P(obj4);
                            obj = obj4;
                        } else if (i2 == 2) {
                            m12 m12Var = upiVar.f232701e;
                            uzxVar2 = upiVar.f232700d;
                            vh00Var2 = upiVar.f232699c;
                            eh00Var2 = upiVar.f232697a;
                            bga.m29073P(obj4);
                            r12 = m12Var;
                            obj3 = obj4;
                            e301Var = (e301) obj3;
                            if (e301Var != null) {
                                throw new LoginTimeoutException();
                            }
                            r13 = r12;
                            if (e301Var.f55572b) {
                                upiVar.f232697a = null;
                                upiVar.f232698b = null;
                                upiVar.f232699c = null;
                                upiVar.f232700d = null;
                                upiVar.f232701e = r13;
                                upiVar.f232703g = 4;
                                objMo24510D0 = vh00Var2.mo24510D0(uzxVar2, e301Var, upiVar);
                            } else {
                                r14 = r13;
                                objInvoke = eh00Var2.invoke();
                            }
                        } else if (i2 == 3) {
                            m12 m12Var2 = upiVar.f232701e;
                            uzxVar2 = upiVar.f232700d;
                            vh00Var2 = upiVar.f232699c;
                            eh00Var2 = upiVar.f232697a;
                            bga.m29073P(obj4);
                            r11 = m12Var2;
                            obj2 = obj4;
                            m88279p(obj2);
                            e301Var = (e301) obj2;
                            r13 = r11;
                            if (e301Var.f55572b) {
                                upiVar.f232697a = null;
                                upiVar.f232698b = null;
                                upiVar.f232699c = null;
                                upiVar.f232700d = null;
                                upiVar.f232701e = r13;
                                upiVar.f232703g = 4;
                                objMo24510D0 = vh00Var2.mo24510D0(uzxVar2, e301Var, upiVar);
                            } else {
                                r14 = r13;
                                objInvoke = eh00Var2.invoke();
                            }
                        } else {
                            if (i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            m12 m12Var3 = upiVar.f232701e;
                            bga.m29073P(obj4);
                            r14 = m12Var3;
                            objInvoke = obj4;
                        }
                        r14 = r13;
                        objInvoke = objMo24510D0;
                        M49526x = objMo24510D0;
                        r14.m60494H();
                        return objInvoke;
                    }
                    bga.m29073P(obj4);
                    String str = SpotifyWearableListenerService.f6950Q0;
                    Single singleM23327A = vzxVar.m86914a(bjf1.m29410r()).m23327A();
                    upiVar.f232697a = eh00Var;
                    upiVar.f232698b = l;
                    upiVar.f232699c = vh00Var;
                    upiVar.f232703g = 1;
                    objM96567o = zn91.m96567o(singleM23327A, upiVar);
                    Single singleM23327A2 = uzxVar.f235651a.f246561a.m23360y(xwe.f266649Q0).m23327A();
                    if (l != null) {
                        long jLongValue = l.longValue();
                        rrd rrdVar = new rrd((FlowableElementAtSingle) singleM23327A2, fbkVar, 10);
                        upiVar.f232697a = eh00Var;
                        upiVar.f232698b = null;
                        upiVar.f232699c = vh00Var;
                        upiVar.f232700d = uzxVar;
                        upiVar.f232701e = M49526x;
                        upiVar.f232703g = 2;
                        Object objM76980u = s1h1.m76980u(jLongValue, rrdVar, upiVar);
                        M49526x = M49526x;
                        if (objM76980u != yukVar) {
                            eh00 eh00Var3 = eh00Var;
                            uzxVar2 = uzxVar;
                            r12 = M49526x;
                            obj3 = objM76980u;
                            vh00Var2 = vh00Var;
                            eh00Var2 = eh00Var3;
                            e301Var = (e301) obj3;
                            if (e301Var != null) {
                                throw new LoginTimeoutException();
                            }
                            r13 = r12;
                            if (e301Var.f55572b) {
                                upiVar.f232697a = null;
                                upiVar.f232698b = null;
                                upiVar.f232699c = null;
                                upiVar.f232700d = null;
                                upiVar.f232701e = r13;
                                upiVar.f232703g = 4;
                                objMo24510D0 = vh00Var2.mo24510D0(uzxVar2, e301Var, upiVar);
                            } else {
                                r14 = r13;
                                objInvoke = eh00Var2.invoke();
                            }
                            r14 = r13;
                            objInvoke = objMo24510D0;
                            M49526x = objMo24510D0;
                            r14.m60494H();
                            return objInvoke;
                        }
                    } else {
                        upiVar.f232697a = eh00Var;
                        upiVar.f232698b = null;
                        upiVar.f232699c = vh00Var;
                        upiVar.f232700d = uzxVar;
                        upiVar.f232701e = M49526x;
                        upiVar.f232703g = 3;
                        Object objM96567o2 = zn91.m96567o(singleM23327A2, upiVar);
                        if (objM96567o2 != yukVar) {
                            M49526x = M49526x;
                            eh00 eh00Var4 = eh00Var;
                            uzxVar2 = uzxVar;
                            r11 = M49526x;
                            obj2 = objM96567o2;
                            vh00Var2 = vh00Var;
                            eh00Var2 = eh00Var4;
                            m88279p(obj2);
                            e301Var = (e301) obj2;
                            r13 = r11;
                            if (e301Var.f55572b) {
                                upiVar.f232697a = null;
                                upiVar.f232698b = null;
                                upiVar.f232699c = null;
                                upiVar.f232700d = null;
                                upiVar.f232701e = r13;
                                upiVar.f232703g = 4;
                                objMo24510D0 = vh00Var2.mo24510D0(uzxVar2, e301Var, upiVar);
                            } else {
                                r14 = r13;
                                objInvoke = eh00Var2.invoke();
                            }
                            r14 = r13;
                            objInvoke = objMo24510D0;
                            M49526x = objMo24510D0;
                            r14.m60494H();
                            return objInvoke;
                        }
                    }
                    M49526x = M49526x;
                    r14 = r13;
                    objInvoke = objMo24510D0;
                    M49526x = objMo24510D0;
                    obj = objM96567o;
                    return yukVar;
                } catch (Throwable th) {
                    th = th;
                    vzxVar = M49526x;
                    vzxVar.m60494H();
                    throw th;
                }
                M49526x.m60511Z();
            } catch (Throwable th2) {
                th = th2;
            }
            obj = objM96567o;
            uzxVar = (uzx) obj;
            String str2 = SpotifyWearableListenerService.f6950Q0;
            M49526x = uzxVar.f235651a.f246563c.m49526x(bjf1.m29404l());
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m88285x(ywy ywyVar, tbn0 tbn0Var) {
        ywyVar.getClass();
        if (whg1.m88141n(ywyVar, tbn0Var)) {
            return;
        }
        try {
            ywyVar.mo40347k(tbn0Var, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m88286y(ywy ywyVar, tbn0 tbn0Var) throws IOException {
        try {
            IOException iOException = null;
            for (tbn0 tbn0Var2 : ywyVar.mo40345g(tbn0Var)) {
                try {
                    if (whg1.m88142o(ywyVar, tbn0Var2).f116737b) {
                        m88286y(ywyVar, tbn0Var2);
                    }
                    ywyVar.mo40344f(tbn0Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: D */
    public abstract int mo48805D();

    /* JADX INFO: renamed from: E */
    public abstract Context mo48806E();

    /* JADX INFO: renamed from: F */
    public float mo39655F(View view) {
        if (f251851c) {
            try {
                return b0b1.m27755b(view);
            } catch (NoSuchMethodError unused) {
                f251851c = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo48807G();

    /* JADX INFO: renamed from: H */
    public boolean mo65978H() {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo48808K();

    /* JADX INFO: renamed from: M */
    public abstract boolean mo48809M(int i, KeyEvent keyEvent);

    /* JADX INFO: renamed from: N */
    public boolean mo65980N(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: O */
    public boolean mo65981O() {
        return false;
    }

    /* JADX INFO: renamed from: S */
    public abstract void mo48810S(boolean z);

    /* JADX INFO: renamed from: T */
    public abstract void mo48811T(boolean z);

    /* JADX INFO: renamed from: U */
    public abstract void mo48812U();

    /* JADX INFO: renamed from: V */
    public abstract void mo48813V(tc41 tc41Var);

    /* JADX INFO: renamed from: W */
    public abstract void mo48814W(boolean z);

    /* JADX INFO: renamed from: X */
    public void mo39656X(View view, float f) {
        if (f251851c) {
            try {
                b0b1.m27758e(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f251851c = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: Y */
    public void mo36566Y(View view, int i) {
        if (!f251853e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f251852d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f251853e = true;
        }
        Field field = f251852d;
        if (field != null) {
            try {
                f251852d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo48815Z(CharSequence charSequence);

    /* JADX INFO: renamed from: b0 */
    public g50 mo48816b0(etq etqVar) {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo65983s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public abstract boolean mo48821t();

    /* JADX INFO: renamed from: z */
    public abstract void mo48822z(boolean z);

    /* JADX INFO: renamed from: L */
    public void mo65979L() {
    }
}
