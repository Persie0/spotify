package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.text.font.FontWeight;
import com.google.firebase.components.DependencyCycleException;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0e1 {

    /* JADX INFO: renamed from: A */
    public static final agy f117994A;

    /* JADX INFO: renamed from: B */
    public static final agy f117995B;

    /* JADX INFO: renamed from: C */
    public static final agy f117996C;

    /* JADX INFO: renamed from: D */
    public static final agy f117997D;

    /* JADX INFO: renamed from: E */
    public static final agy f117998E;

    /* JADX INFO: renamed from: F */
    public static final agy f117999F;

    /* JADX INFO: renamed from: G */
    public static final agy f118000G;

    /* JADX INFO: renamed from: H */
    public static final agy f118001H;

    /* JADX INFO: renamed from: I */
    public static final agy f118002I;

    /* JADX INFO: renamed from: J */
    public static final agy f118003J;

    /* JADX INFO: renamed from: K */
    public static final agy f118004K;

    /* JADX INFO: renamed from: L */
    public static final agy f118005L;

    /* JADX INFO: renamed from: M */
    public static final agy f118006M;

    /* JADX INFO: renamed from: N */
    public static final agy f118007N;

    /* JADX INFO: renamed from: O */
    public static final agy f118008O;

    /* JADX INFO: renamed from: P */
    public static final agy f118009P;

    /* JADX INFO: renamed from: Q */
    public static final agy f118010Q;

    /* JADX INFO: renamed from: R */
    public static final agy f118011R;

    /* JADX INFO: renamed from: S */
    public static final agy f118012S;

    /* JADX INFO: renamed from: T */
    public static final agy f118013T;

    /* JADX INFO: renamed from: U */
    public static final agy f118014U;

    /* JADX INFO: renamed from: V */
    public static final agy f118015V;

    /* JADX INFO: renamed from: W */
    public static final agy f118016W;

    /* JADX INFO: renamed from: X */
    public static final agy f118017X;

    /* JADX INFO: renamed from: Y */
    public static final agy f118018Y;

    /* JADX INFO: renamed from: Z */
    public static final agy f118019Z;

    /* JADX INFO: renamed from: a0 */
    public static final agy f118020a0;

    /* JADX INFO: renamed from: b0 */
    public static final agy f118022b0;

    /* JADX INFO: renamed from: c0 */
    public static final agy f118024c0;

    /* JADX INFO: renamed from: d */
    public static final agy f118025d;

    /* JADX INFO: renamed from: d0 */
    public static final agy f118026d0;

    /* JADX INFO: renamed from: e */
    public static final agy f118027e;

    /* JADX INFO: renamed from: e0 */
    public static final agy f118028e0;

    /* JADX INFO: renamed from: f */
    public static final agy f118029f;

    /* JADX INFO: renamed from: f0 */
    public static final agy f118030f0;

    /* JADX INFO: renamed from: g */
    public static final agy f118031g;

    /* JADX INFO: renamed from: g0 */
    public static final agy f118032g0;

    /* JADX INFO: renamed from: h */
    public static final agy f118033h;

    /* JADX INFO: renamed from: h0 */
    public static final agy f118034h0;

    /* JADX INFO: renamed from: i */
    public static final agy f118035i;

    /* JADX INFO: renamed from: i0 */
    public static final agy f118036i0;

    /* JADX INFO: renamed from: j */
    public static final agy f118037j;

    /* JADX INFO: renamed from: j0 */
    public static final agy f118038j0;

    /* JADX INFO: renamed from: k */
    public static final agy f118039k;

    /* JADX INFO: renamed from: k0 */
    public static final agy f118040k0;

    /* JADX INFO: renamed from: l */
    public static final agy f118041l;

    /* JADX INFO: renamed from: l0 */
    public static final agy f118042l0;

    /* JADX INFO: renamed from: m */
    public static final agy f118043m;

    /* JADX INFO: renamed from: m0 */
    public static final agy f118044m0;

    /* JADX INFO: renamed from: n */
    public static final agy f118045n;

    /* JADX INFO: renamed from: n0 */
    public static final agy f118046n0;

    /* JADX INFO: renamed from: o */
    public static final agy f118047o;

    /* JADX INFO: renamed from: o0 */
    public static final agy f118048o0;

    /* JADX INFO: renamed from: p */
    public static final agy f118049p;

    /* JADX INFO: renamed from: p0 */
    public static final agy f118050p0;

    /* JADX INFO: renamed from: q */
    public static final agy f118051q;

    /* JADX INFO: renamed from: q0 */
    public static final agy f118052q0;

    /* JADX INFO: renamed from: r */
    public static final agy f118053r;

    /* JADX INFO: renamed from: r0 */
    public static final agy f118054r0;

    /* JADX INFO: renamed from: s */
    public static final agy f118055s;

    /* JADX INFO: renamed from: s0 */
    public static final byte[] f118056s0;

    /* JADX INFO: renamed from: t */
    public static final agy f118057t;

    /* JADX INFO: renamed from: t0 */
    public static sd40 f118058t0;

    /* JADX INFO: renamed from: u */
    public static final agy f118059u;

    /* JADX INFO: renamed from: u0 */
    public static long f118060u0;

    /* JADX INFO: renamed from: v */
    public static final agy f118061v;

    /* JADX INFO: renamed from: v0 */
    public static Method f118062v0;

    /* JADX INFO: renamed from: w */
    public static final agy f118063w;

    /* JADX INFO: renamed from: w0 */
    public static Method f118064w0;

    /* JADX INFO: renamed from: x */
    public static final agy f118065x;

    /* JADX INFO: renamed from: x0 */
    public static Method f118066x0;

    /* JADX INFO: renamed from: y */
    public static final agy f118067y;

    /* JADX INFO: renamed from: y0 */
    public static Method f118068y0;

    /* JADX INFO: renamed from: z */
    public static final agy f118069z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118070a;

    /* JADX INFO: renamed from: b */
    public static final agy f118021b = new agy("ads");

    /* JADX INFO: renamed from: c */
    public static final agy f118023c = new agy("album");

    static {
        new agy("android-auto");
        new agy("app_integration");
        f118025d = new agy("artist");
        new agy("avrcp");
        f118027e = new agy("blend");
        f118029f = new agy("browse");
        f118031g = new agy("campfire");
        f118033h = new agy("collection");
        f118035i = new agy("collection-album");
        f118037j = new agy("collection-albums");
        f118039k = new agy("collection-artist");
        f118041l = new agy("collection-artists");
        f118043m = new agy("collection-playlists");
        f118045n = new agy("collection-radio");
        f118047o = new agy("collection-songs");
        f118049p = new agy("collection-podcasts");
        f118051q = new agy("collection-podcasts-downloads");
        f118053r = new agy("collection-podcasts-episodes");
        f118055s = new agy("collection-podcasts-following");
        f118057t = new agy("comments-card");
        f118059u = new agy("comments-sheet");
        f118061v = new agy("concert-campaigns");
        f118063w = new agy("creator-artist-biography");
        f118065x = new agy("custom-shortcuts");
        f118067y = new agy("settings-languages-music");
        new agy("external-integration-service");
        f118069z = new agy("find");
        f117994A = new agy("find-in-show");
        f117995B = new agy("free-tier-collection");
        f117996C = new agy("free-tier-track");
        new agy("google-clock");
        f117997D = new agy("home");
        f117998E = new agy("concerts-entity");
        f117999F = new agy("infinite-playback");
        f118000G = new agy("licenses");
        f118001H = new agy("live-room-now-playing-bar");
        f118002I = new agy("made-for-you-hub");
        f118003J = new agy("marquee");
        new agy("media-resumption");
        f118004K = new agy("mini-player");
        f118005L = new agy("music-playback-speed");
        f118006M = new agy("notification-settings");
        f118007N = new agy("nowplaying");
        f118008O = new agy("nowplayingmini");
        f118009P = new agy("playlist");
        f118010Q = new agy("play-queue");
        f118011R = new agy("podcast-charts-uris");
        f118012S = new agy("podcast-charts-root");
        f118013T = new agy("podcast-settings");
        f118014U = new agy("podcast-new-episode-notifications");
        f118015V = new agy("podcast-sponsors");
        f118016W = new agy("premium-account-management");
        f118017X = new agy("premium-destination");
        f118018Y = new agy("create-menu");
        f118019Z = new agy("lyrics-fullscreen");
        f118020a0 = new agy("quicksilver");
        f118022b0 = new agy("radio");
        f118024c0 = new agy("readalong");
        f118026d0 = new agy("remoteconfiguration");
        f118028e0 = new agy("root");
        f118030f0 = new agy("search");
        f118032g0 = new agy("settings");
        f118034h0 = new agy("show");
        f118036i0 = new agy("spotify-go");
        f118038j0 = new agy("spoton");
        f118040k0 = new agy("your-library");
        f118042l0 = new agy("user-profile");
        f118044m0 = new agy("user-profiles");
        new agy("waze");
        f118046n0 = new agy("your-episodes");
        f118048o0 = new agy("your-episodes-settings");
        f118050p0 = new agy("endless-feed");
        f118052q0 = new agy("listeningstats");
        f118054r0 = new agy("unknown");
        new cgy("debug");
        new dgy();
        f118056s0 = new byte[0];
    }

    public /* synthetic */ k0e1(int i) {
        this.f118070a = i;
    }

    /* JADX INFO: renamed from: A */
    public static final void m54966A(EditText editText) {
        editText.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: B */
    public static int m54967B(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public static final int m54968C(zj5 zj5Var, Object obj, int i) {
        int i2 = zj5Var.f283362c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM41459g = fem.m41459g(i2, i, zj5Var.f283360a);
            if (iM41459g < 0 || wj50.m88271j(obj, zj5Var.f283361b[iM41459g])) {
                return iM41459g;
            }
            int i3 = iM41459g + 1;
            while (i3 < i2 && zj5Var.f283360a[i3] == i) {
                if (wj50.m88271j(obj, zj5Var.f283361b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM41459g - 1; i4 >= 0 && zj5Var.f283360a[i4] == i; i4--) {
                if (wj50.m88271j(obj, zj5Var.f283361b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m54969D() {
        if (Build.VERSION.SDK_INT >= 29) {
            return qa81.m72419c();
        }
        try {
            if (f118062v0 == null) {
                f118060u0 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f118062v0 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f118062v0.invoke(null, Long.valueOf(f118060u0))).booleanValue();
        } catch (Exception e) {
            m55003z(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: E */
    public static jbb m54970E(juk jukVar, th00 th00Var) {
        return n5h1.m63736l(new w790(jukVar, th00Var, 0));
    }

    /* JADX INFO: renamed from: F */
    public static final String m54971F(int i, int i2, Object[] objArr, xq00 xq00Var) {
        return ((Resources) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f503c)).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: G */
    public static final void m54972G(TextView textView, boolean z, TextView textView2, int i) {
        textView.setVisibility(z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar = (h6j) layoutParams;
        if (z) {
            i = 0;
        }
        h6jVar.f88104B = i;
        textView2.setLayoutParams(h6jVar);
    }

    /* JADX INFO: renamed from: H */
    public static final void m54973H(ImageView imageView, boolean z, boolean z2) {
        imageView.setVisibility((z && z2) ? 0 : 8);
        if (imageView.getVisibility() == 0) {
            imageView.setImageResource(R.drawable.encore_icon_verified_check_active_16);
            imageView.setColorFilter(lzj.m60386v(imageView.getContext(), R.color.powder_green_185));
        }
    }

    /* JADX INFO: renamed from: I */
    public static int m54974I(long j) {
        if (j > 2147483647L) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: J */
    public static void m54975J(int i, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            qa81.m72420d(i, m54980O(str));
            return;
        }
        String strM54980O = m54980O(str);
        try {
            if (f118068y0 == null) {
                f118068y0 = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f118068y0.invoke(null, Long.valueOf(f118060u0), strM54980O, Integer.valueOf(i));
        } catch (Exception e) {
            m55003z(e);
        }
    }

    /* JADX INFO: renamed from: K */
    public static final void m54976K(EditText editText) {
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager == null || inputMethodManager.showSoftInput(editText, 1)) {
            return;
        }
        inputMethodManager.toggleSoftInput(2, 0);
    }

    /* JADX INFO: renamed from: L */
    public static final String m54977L(int i, xq00 xq00Var) {
        return ((Resources) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f503c)).getString(i);
    }

    /* JADX INFO: renamed from: M */
    public static final String m54978M(int i, Object[] objArr, xq00 xq00Var) {
        return ((Resources) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f503c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: N */
    public static int[] m54979N(Collection collection) {
        if (collection instanceof jl50) {
            return ((jl50) collection).m53651a();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: O */
    public static String m54980O(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    /* JADX INFO: renamed from: P */
    public static Integer m54981P(String str) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                int iM92695a = y2b0.m92695a(str.charAt(i));
                if (iM92695a >= 0 && iM92695a < 10) {
                    long j = -iM92695a;
                    long j2 = 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        int iM92695a2 = y2b0.m92695a(str.charAt(i2));
                        if (iM92695a2 >= 0 && iM92695a2 < 10 && j >= j3) {
                            long j4 = j * j2;
                            long j5 = iM92695a2;
                            if (j4 >= j5 - Long.MIN_VALUE) {
                                j = j4 - j5;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    /* JADX INFO: renamed from: a */
    public static final long m54982a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static g1x0 m54983b(k000 k000Var) {
        FontWeight fontWeight = FontWeight.f524b;
        return new g1x0(R.font.spotify_mix, jcg1.m52995o(), k000Var);
    }

    /* JADX INFO: renamed from: c */
    public static g1x0 m54984c(int i, FontWeight fontWeight) {
        return new g1x0(i, fontWeight, new k000(new h000[0]));
    }

    /* JADX INFO: renamed from: d */
    public static final yab m54985d(ObservableSource observableSource) {
        return nxf1.m65827f(new o8t0(observableSource, (fbk) null, 2));
    }

    /* JADX INFO: renamed from: e */
    public static final Flowable m54986e(fiz fizVar, juk jukVar) {
        d0k[] d0kVarArr = bmu0.f28619a;
        j1a1 j1a1Var = xsr.f265652b;
        j1a1Var.getClass();
        return Flowable.m23311G(new kiz(fizVar, cct.m32296A(j1a1Var, jukVar)));
    }

    /* JADX INFO: renamed from: f */
    public static List m54987f(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new jl50(iArr);
    }

    /* JADX INFO: renamed from: g */
    public static final Observable m54988g(fiz fizVar, juk jukVar) {
        return Observable.create(new evl0(jukVar, fizVar));
    }

    /* JADX INFO: renamed from: i */
    public static void m54990i(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            qa81.m72417a(m54980O(str), i);
            return;
        }
        String strM54980O = m54980O(str);
        try {
            if (f118064w0 == null) {
                f118064w0 = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f118064w0.invoke(null, Long.valueOf(f118060u0), strM54980O, Integer.valueOf(i));
        } catch (Exception e) {
            m55003z(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final String m54991j(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    /* JADX INFO: renamed from: k */
    public static int m54992k(long j) {
        int i = (int) j;
        c95.m31840f(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* JADX INFO: renamed from: l */
    public static n2x0 m54993l(kvu0 kvu0Var, auw0 auw0Var, String str, n2x0 n2x0Var) {
        n2x0 n2x0VarM95164a;
        ztw0 ztw0VarM27219b = auw0Var.m27219b();
        ztw0VarM27219b.f286277c.m77929c("client-token", str);
        z1x0 z1x0VarM63572c = kvu0Var.m57489b(new auw0(ztw0VarM27219b)).m63572c();
        if (n2x0Var != null) {
            z1x0 z1x0VarM63572c2 = n2x0Var.m63572c();
            z1x0VarM63572c2.f278428g = p3x0.f173765a;
            n2x0VarM95164a = z1x0VarM63572c2.m95164a();
        } else {
            n2x0VarM95164a = null;
        }
        z1x0VarM63572c.f278432k = n2x0VarM95164a;
        return z1x0VarM63572c.m95164a();
    }

    /* JADX INFO: renamed from: m */
    public static int m54994m(int i, int i2) {
        c95.m31841g("min (%s) must be less than or equal to max (%s)", i2, 1073741823, i2 <= 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }

    /* JADX INFO: renamed from: o */
    public static View m54995o(Context context, Class cls, int i) {
        return m54996p(context, (nbn0) obn0.f163685c.get(cls), null, i);
    }

    /* JADX INFO: renamed from: p */
    public static View m54996p(Context context, nbn0 nbn0Var, AttributeSet attributeSet, int i) {
        nbn0Var.getClass();
        if (i == 0) {
            i = nbn0Var.mo35572b();
        }
        View viewMo25370a = nbn0Var.mo25370a(context, attributeSet, i);
        if ((viewMo25370a instanceof TextView) && !(viewMo25370a instanceof EncoreTextView)) {
            g000.m43251a((TextView) viewMo25370a, context);
        }
        return viewMo25370a;
    }

    /* JADX INFO: renamed from: q */
    public static void m54997q(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (gem gemVar : (Set) it2.next()) {
                        for (btq btqVar : gemVar.f79149a.f214422c) {
                            if (btqVar.f30913c == 0) {
                                Set<gem> set = (Set) map.get(new hem(btqVar.f30911a, btqVar.f30912b == 2));
                                if (set != null) {
                                    for (gem gemVar2 : set) {
                                        gemVar.f79150b.add(gemVar2);
                                        gemVar2.f79151c.add(gemVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<gem> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (gem gemVar3 : hashSet) {
                    if (gemVar3.f79151c.isEmpty()) {
                        hashSet2.add(gemVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    gem gemVar4 = (gem) hashSet2.iterator().next();
                    hashSet2.remove(gemVar4);
                    i++;
                    for (gem gemVar5 : gemVar4.f79150b) {
                        gemVar5.f79151c.remove(gemVar4);
                        if (gemVar5.f79151c.isEmpty()) {
                            hashSet2.add(gemVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (gem gemVar6 : hashSet) {
                    if (!gemVar6.f79151c.isEmpty() && !gemVar6.f79150b.isEmpty()) {
                        arrayList2.add(gemVar6.f79149a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            svf svfVar = (svf) it.next();
            gem gemVar7 = new gem(svfVar);
            for (eht0 eht0Var : svfVar.f214421b) {
                boolean z = svfVar.f214424e == 0;
                hem hemVar = new hem(eht0Var, !z);
                if (!map.containsKey(hemVar)) {
                    map.put(hemVar, new HashSet());
                }
                Set set2 = (Set) map.get(hemVar);
                if (!set2.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + eht0Var + ".");
                }
                set2.add(gemVar7);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m54998r(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            qa81.m72418b(m54980O(str), i);
            return;
        }
        String strM54980O = m54980O(str);
        try {
            if (f118066x0 == null) {
                f118066x0 = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f118066x0.invoke(null, Long.valueOf(f118060u0), strM54980O, Integer.valueOf(i));
        } catch (Exception e) {
            m55003z(e);
        }
    }

    /* JADX INFO: renamed from: u */
    public static int m54999u(byte[] bArr) {
        c95.m31841g("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
        return m55000v(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    /* JADX INFO: renamed from: v */
    public static int m55000v(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* JADX INFO: renamed from: w */
    public static final f0e1 m55001w(i1e1 i1e1Var) {
        return new f0e1(i1e1Var.f97499a, i1e1Var.f97518t);
    }

    /* JADX INFO: renamed from: y */
    public static final agy m55002y(i500 i500Var) {
        Object obj;
        agy agyVarMo13039l;
        if (i500Var != null) {
            if (!i500Var.m49727z0() || !i500Var.f98716q1.f163857d.m41223a(fb80.f67752c)) {
                obj = i500Var;
                obj = null;
            }
            if (obj != null) {
                e600 e600Var = obj instanceof e600 ? (e600) obj : null;
                if (e600Var != null) {
                    th50 th50VarM69237p = p711.m69237p(e600Var);
                    th50 th50Var = th50VarM69237p.equals(uh50.f230369a) ? null : th50VarM69237p;
                    if (th50Var == null || (agyVarMo13039l = th50Var.f220333a) == null) {
                        agyVarMo13039l = e600Var.getF18210S1();
                    }
                    if (agyVarMo13039l != null) {
                        return agyVarMo13039l;
                    }
                }
            }
        }
        return f118028e0;
    }

    /* JADX INFO: renamed from: z */
    public static void m55003z(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: renamed from: Q */
    public abstract void mo55004Q(int i, byte[] bArr, int i2);

    public int hashCode() {
        switch (this.f118070a) {
            case 17:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo55005n(w3t0 w3t0Var);

    /* JADX INFO: renamed from: s */
    public brl0 m55006s(e1e1 e1e1Var) {
        List listM44518y = geg1.m44518y(e1e1Var);
        l0e1 l0e1Var = (l0e1) this;
        if (listM44518y.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new yzd1(l0e1Var, listM44518y).m94985w0();
    }

    /* JADX INFO: renamed from: t */
    public brl0 m55007t(String str, int i, lnl0 lnl0Var) {
        return new yzd1((l0e1) this, str, i, geg1.m44518y(lnl0Var), null).m94985w0();
    }

    public String toString() {
        switch (this.f118070a) {
            case 17:
                String strMo29111F = qpv0.f191387a.mo54112b(getClass()).mo29111F();
                wj50.m88279p(strMo29111F);
                return strMo29111F;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: x */
    public abstract Object mo55008x(w3t0 w3t0Var);
}
