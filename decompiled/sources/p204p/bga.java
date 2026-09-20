package p204p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.os.StrictMode;
import android.util.TypedValue;
import com.comscore.streaming.ContentFeedType;
import com.facebook.FacebookException;
import com.google.android.gms.tasks.Task;
import com.spotify.player.model.PlayerState;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bga {

    /* JADX INFO: renamed from: a */
    public static volatile er70 f26893a;

    /* JADX INFO: renamed from: b */
    public static volatile cac f26894b = cac.PRODUCTION;

    /* JADX INFO: renamed from: A */
    public static final pgo m29058A(dcm0 dcm0Var) {
        return (pgo) dcm0Var.m35667e(pgo.class);
    }

    /* JADX INFO: renamed from: B */
    public static final q040 m29059B(r4m0 r4m0Var) {
        q040 q040Var = (q040) ((g480) r4m0Var.mo24326a().mo15684j0(q040.class)).mo31538a();
        if (q040Var != null) {
            return q040Var;
        }
        throw new IllegalStateException("Page must provide an Identifier property.");
    }

    /* JADX INFO: renamed from: C */
    public static jfa0 m29060C(Configuration configuration) {
        return jfa0.m53163d(vtg1.m86389p(configuration));
    }

    /* JADX INFO: renamed from: D */
    public static final r7i0 m29061D(dcm0 dcm0Var) {
        return (r7i0) dcm0Var.m35664b(r7i0.class);
    }

    /* JADX INFO: renamed from: E */
    public static final t9p0 m29062E(dcm0 dcm0Var) {
        return (t9p0) dcm0Var.m35664b(t9p0.class);
    }

    /* JADX INFO: renamed from: F */
    public static final qu91 m29063F(dcm0 dcm0Var) {
        return (qu91) dcm0Var.m35664b(qu91.class);
    }

    /* JADX INFO: renamed from: G */
    public static final kv91 m29064G(dcm0 dcm0Var) {
        return (kv91) dcm0Var.m35664b(kv91.class);
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m29065H(o2x0 o2x0Var) {
        n2x0 n2x0Var = o2x0Var.f161171a;
        n2x0 n2x0Var2 = n2x0Var.f149866t;
        if (n2x0Var2 == null) {
            return false;
        }
        b3b b3bVarM27218a = n2x0Var.f149857a.m27218a();
        if (b3bVarM27218a.f23005j && b3bVarM27218a.f23003h == Integer.MAX_VALUE) {
            return true;
        }
        if (n2x0Var2 == null) {
            return false;
        }
        b3b b3bVar = b3b.f22994n;
        int i = z520.m95443w(n2x0Var2.f149862f).f22998c;
        if (i != -1) {
            return System.currentTimeMillis() <= TimeUnit.SECONDS.toMillis((long) i) + n2x0Var2.f149856Z;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0038  */
    /* JADX INFO: renamed from: I */
    public static boolean m29066I(n2x0 n2x0Var, auw0 auw0Var) {
        String strM78534b;
        int i = n2x0Var.f149860d;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i == 307) {
                strM78534b = n2x0Var.f149862f.m78534b("Expires");
                if (strM78534b == null) {
                    strM78534b = null;
                }
                if (strM78534b == null && n2x0Var.m63571a().f22998c == -1 && !n2x0Var.m63571a().f23001f && !n2x0Var.m63571a().f23000e) {
                    return false;
                }
            } else if (i != 308 && i != 404 && i != 405) {
                switch (i) {
                    case 300:
                    case ContentFeedType.EAST_HD /* 301 */:
                        break;
                    case ContentFeedType.WEST_HD /* 302 */:
                        strM78534b = n2x0Var.f149862f.m78534b("Expires");
                        if (strM78534b == null) {
                            strM78534b = null;
                        }
                        if (strM78534b == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return (n2x0Var.m63571a().f22997b || auw0Var.m27218a().f22997b) ? false : true;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m29067J(int i, boolean z, boolean z2) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return z;
        }
        if (iM38547C == 1) {
            return z2;
        }
        if (iM38547C == 2) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: K */
    public static final float m29068K(float f, float f2, float f3) {
        return (f2 * f3) + ((1.0f - f3) * f);
    }

    /* JADX INFO: renamed from: L */
    public static final fxh0 m29069L(fxh0 fxh0Var, gh00 gh00Var) {
        return fxh0Var.mo34315F(new j4l0(gh00Var, true));
    }

    /* JADX INFO: renamed from: M */
    public static final fxh0 m29070M(fxh0 fxh0Var, float f, float f2) {
        return fxh0Var.mo34315F(new e4l0(f, f2));
    }

    /* JADX INFO: renamed from: N */
    public static fxh0 m29071N(fxh0 fxh0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return m29070M(fxh0Var, f, f2);
    }

    /* JADX INFO: renamed from: O */
    public static PorterDuff.Mode m29072O(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* JADX INFO: renamed from: P */
    public static final void m29073P(Object obj) {
        if (obj instanceof c6x0) {
            throw ((c6x0) obj).f34640a;
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final int m29074Q(PlayerState playerState, String str) {
        if (tgv.m80788i(str) || tgv.m80787h(str)) {
            return 3;
        }
        boolean z = (tgv.m80789j(str) || tgv.m80785f(str)) ? false : true;
        if (str.equals(hdi.m47210B(playerState)) || ((z && str.equals(playerState.contextUri())) || (tgv.m80783d(str) && str.equals(playerState.contextUri())))) {
            return playerState.isPaused() ? 2 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: R */
    public static y7h1 m29075R(List list) {
        if (list == null || list.isEmpty()) {
            return m29102x(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        y7h1 y7h1Var = new y7h1();
        x9f1 x9f1Var = new x9f1(list.size(), y7h1Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            dkr dkrVar = gv61.f84649b;
            task.mo1512d(dkrVar, x9f1Var);
            task.mo1511c(dkrVar, x9f1Var);
            task.mo1509a(dkrVar, x9f1Var);
        }
        return y7h1Var;
    }

    /* JADX INFO: renamed from: S */
    public static final Iterator m29076S(Iterator it, int i, int i2, boolean z, boolean z2) {
        return !it.hasNext() ? kau.f120963a : g0b1.m43277s(new xr21(i, i2, it, z2, z, null));
    }

    /* JADX INFO: renamed from: T */
    public static Object m29077T(Task task) throws ExecutionException {
        if (task.mo1518j()) {
            return task.mo1515g();
        }
        if (((y7h1) task).f270088d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo1514f());
    }

    /* JADX INFO: renamed from: U */
    public static Object m29078U(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m29079a(hhr hhrVar, xq00 xq00Var, int i) {
        hhr hhrVar2;
        xq00 xq00Var2;
        hhr hhrVar3 = hhrVar;
        xq00 xq00Var3 = xq00Var;
        Object obj = t6x0.f217647t;
        xq00Var3.m91775k0(294589392);
        int i2 = i | (xq00Var3.m91766g(hhrVar3) ? 4 : 2);
        if ((i2 & 3) == 2 && xq00Var3.m91738H()) {
            xq00Var3.m91757b0();
            hhrVar2 = hhrVar3;
            xq00Var2 = xq00Var3;
        } else {
            c8y0 c8y0VarM59893o = ltf1.m59893o(xq00Var3);
            kqi0 kqi0VarM77671j = sam.m77671j(hhrVar3.m47608k(), xq00Var3, 0);
            List list = (List) kqi0VarM77671j.getValue();
            boolean zBooleanValue = ((Boolean) xq00Var3.m91774k(pz40.f183596a)).booleanValue();
            boolean zM91766g = xq00Var3.m91766g(list);
            Object objM91750T = xq00Var3.m91750T();
            Object obj2 = objM91750T;
            if (zM91766g || objM91750T == obj) {
                gb31 gb31VarM77685x = sam.m77685x();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (zBooleanValue ? true : ((uxi0) obj3).f234942h.f163857d.m41223a(fb80.f67753d)) {
                        arrayList.add(obj3);
                    }
                }
                gb31VarM77685x.addAll(arrayList);
                xq00Var3.m91793t0(gb31VarM77685x);
                obj2 = gb31VarM77685x;
            }
            gb31 gb31Var = (gb31) obj2;
            m29084f(gb31Var, (List) kqi0VarM77671j.getValue(), xq00Var3, 0);
            kqi0 kqi0VarM77671j2 = sam.m77671j(hhrVar3.m47609l(), xq00Var3, 0);
            Object objM91750T2 = xq00Var3.m91750T();
            if (objM91750T2 == obj) {
                objM91750T2 = sam.m77685x();
                xq00Var3.m91793t0(objM91750T2);
            }
            gb31 gb31Var2 = (gb31) objM91750T2;
            xq00Var3.m91771i0(1361037007);
            ListIterator listIterator = gb31Var.listIterator();
            xq00 xq00Var4 = xq00Var3;
            while (true) {
                e030 e030Var = (e030) listIterator;
                if (!e030Var.hasNext()) {
                    break;
                }
                uxi0 uxi0Var = (uxi0) e030Var.next();
                ghr ghrVar = (ghr) uxi0Var.f234936b;
                boolean zM91770i = ((i2 & 14) == 4) | xq00Var4.m91770i(uxi0Var);
                Object objM91750T3 = xq00Var4.m91750T();
                if (zM91770i || objM91750T3 == obj) {
                    objM91750T3 = new ahr(0, hhrVar3, uxi0Var);
                    xq00Var4.m91793t0(objM91750T3);
                }
                eh00 eh00Var = (eh00) objM91750T3;
                lhr lhrVarM44755o = ghrVar.m44755o();
                hhr hhrVar4 = hhrVar3;
                c8y0 c8y0Var = c8y0VarM59893o;
                fyf fyfVarM75772x = rkk.m75772x(1129586364, new w5k(uxi0Var, hhrVar3, c8y0VarM59893o, gb31Var2, ghrVar, 9), xq00Var4);
                xq00 xq00Var5 = xq00Var4;
                epv0.m39681a(eh00Var, lhrVarM44755o, fyfVarM75772x, xq00Var5, 384, 0);
                hhrVar3 = hhrVar4;
                gb31Var2 = gb31Var2;
                xq00Var4 = xq00Var5;
                c8y0VarM59893o = c8y0Var;
            }
            hhrVar2 = hhrVar3;
            xq00 xq00Var6 = xq00Var4;
            gb31 gb31Var3 = gb31Var2;
            xq00Var6.m91788r(false);
            Set set = (Set) kqi0VarM77671j2.getValue();
            boolean zM91766g2 = xq00Var6.m91766g(kqi0VarM77671j2) | ((i2 & 14) == 4);
            Object objM91750T4 = xq00Var6.m91750T();
            if (zM91766g2 || objM91750T4 == obj) {
                objM91750T4 = new shh(kqi0VarM77671j2, hhrVar2, gb31Var3, (fbk) null);
                xq00Var6.m91793t0(objM91750T4);
            }
            hz40.m49236h(set, gb31Var3, (th00) objM91750T4, xq00Var6);
            xq00Var2 = xq00Var6;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yyq(hhrVar2, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m29080b(boolean z, eh00 eh00Var, fxh0 fxh0Var, boolean z2, voi0 voi0Var, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        int i4;
        boolean z3;
        boolean z4;
        voi0 voi0Var2;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var3;
        voi0 voi0VarM66157n;
        fxh0 fxh0Var4;
        int i5;
        boolean z5;
        n3u0 n3u0Var;
        long jM63648b;
        xq00Var.m91775k0(-2007444714);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91768h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var.m91770i(fxh0Var2) ? 256 : 128;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                i4 = i3 | 11264;
            }
            if ((i4 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z3)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0 || xq00Var.m91735E()) {
                    if (i6 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    voi0VarM66157n = o2z0.m66157n(xq00Var);
                    fxh0Var4 = fxh0Var3;
                    i5 = i4 & (-57345);
                    z5 = true;
                } else {
                    xq00Var.m91757b0();
                    z5 = z2;
                    voi0VarM66157n = voi0Var;
                    i5 = i4 & (-57345);
                    fxh0Var4 = fxh0Var2;
                }
                xq00Var.m91790s();
                n3u0Var = new n3u0(leu.m58815a(xq00Var).f112824b.f138762f, leu.m58815a(xq00Var).f112825c.f221219b, n6f.m63765b(leu.m58815a(xq00Var).f112824b.f138762f, 0.3f, 0.0f, 0.0f, 0.0f, 14), n6f.m63765b(leu.m58815a(xq00Var).f112825c.f221219b, 0.3f, 0.0f, 0.0f, 0.0f, 14));
                fxh0 fxh0VarM61834r = mi21.m61834r(leu.m58816b(xq00Var).f117232d.m60204c(), fxh0Var4);
                if (z) {
                    jM63648b = n3u0Var.m63647a();
                } else {
                    jM63648b = n3u0Var.m63648b();
                }
                voi0Var2 = voi0VarM66157n;
                boolean z6 = z5;
                q3u0.m72128a(z, eh00Var, fpz.m42387b(fxh0VarM61834r, voi0VarM66157n, jM63648b, hmx0.f93097a, new ybs(-6), xq00Var, 0, 16), z6, n3u0Var, voi0Var2, xq00Var, i5 & 7294, 0);
                z4 = z6;
                fxh0Var2 = fxh0Var4;
            } else {
                xq00Var.m91757b0();
                z4 = z2;
                voi0Var2 = voi0Var;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new rw5(z, eh00Var, fxh0Var2, z4, voi0Var2, i, i2);
            }
        }
        i3 |= 384;
        fxh0Var2 = fxh0Var;
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 = i3 | 11264;
        }
        if ((i4 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z3)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                voi0VarM66157n = o2z0.m66157n(xq00Var);
                fxh0Var4 = fxh0Var3;
                i5 = i4 & (-57345);
                z5 = true;
            } else {
                if (i6 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                voi0VarM66157n = o2z0.m66157n(xq00Var);
                fxh0Var4 = fxh0Var3;
                i5 = i4 & (-57345);
                z5 = true;
            }
            xq00Var.m91790s();
            n3u0Var = new n3u0(leu.m58815a(xq00Var).f112824b.f138762f, leu.m58815a(xq00Var).f112825c.f221219b, n6f.m63765b(leu.m58815a(xq00Var).f112824b.f138762f, 0.3f, 0.0f, 0.0f, 0.0f, 14), n6f.m63765b(leu.m58815a(xq00Var).f112825c.f221219b, 0.3f, 0.0f, 0.0f, 0.0f, 14));
            fxh0 fxh0VarM61834r2 = mi21.m61834r(leu.m58816b(xq00Var).f117232d.m60204c(), fxh0Var4);
            if (z) {
                jM63648b = n3u0Var.m63647a();
            } else {
                jM63648b = n3u0Var.m63648b();
            }
            voi0Var2 = voi0VarM66157n;
            boolean z7 = z5;
            q3u0.m72128a(z, eh00Var, fpz.m42387b(fxh0VarM61834r2, voi0VarM66157n, jM63648b, hmx0.f93097a, new ybs(-6), xq00Var, 0, 16), z7, n3u0Var, voi0Var2, xq00Var, i5 & 7294, 0);
            z4 = z7;
            fxh0Var2 = fxh0Var4;
        } else {
            xq00Var.m91757b0();
            z4 = z2;
            voi0Var2 = voi0Var;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rw5(z, eh00Var, fxh0Var2, z4, voi0Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static cwy m29081c(tbn0 tbn0Var, ywy ywyVar, String str, bvu0 bvu0Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            bvu0Var = null;
        }
        return new cwy(tbn0Var, ywyVar, str, bvu0Var);
    }

    /* JADX INFO: renamed from: d */
    public static hu31 m29082d(gqa gqaVar, ywy ywyVar) {
        return new hu31(gqaVar, ywyVar, null);
    }

    /* JADX INFO: renamed from: e */
    public static final long m29083e(int i) {
        long j = (((long) i) << 32) | (((long) 0) & 4294967295L);
        int i2 = ut60.f233805O;
        return j;
    }

    /* JADX INFO: renamed from: f */
    public static final void m29084f(List list, Collection collection, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1537894851);
        if ((((xq00Var.m91770i(list) ? 4 : 2) | i | (xq00Var.m91770i(collection) ? 32 : 16)) & 19) == 18 && xq00Var.m91738H()) {
            xq00Var.m91757b0();
        } else {
            boolean zBooleanValue = ((Boolean) xq00Var.m91774k(pz40.f183596a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                uxi0 uxi0Var = (uxi0) it.next();
                oc80 oc80Var = uxi0Var.f234942h;
                boolean zM91768h = xq00Var.m91768h(zBooleanValue) | xq00Var.m91770i(list) | xq00Var.m91770i(uxi0Var);
                Object objM91750T = xq00Var.m91750T();
                if (zM91768h || objM91750T == t6x0.f217647t) {
                    objM91750T = new u20(uxi0Var, zBooleanValue, list, 9);
                    xq00Var.m91793t0(objM91750T);
                }
                hz40.m49233e(oc80Var, (gh00) objM91750T, xq00Var);
            }
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new apl(list, collection, i, 24);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final fxh0 m29085g(fxh0 fxh0Var, gh00 gh00Var) {
        return fxh0Var.mo34315F(new j4l0(gh00Var, false));
    }

    /* JADX INFO: renamed from: h */
    public static Object m29086h(Task task) throws InterruptedException {
        ig31.m50504v();
        ig31.m50507y(task, "Task must not be null");
        if (task.mo1517i()) {
            return m29077T(task);
        }
        c4d1 c4d1Var = new c4d1(10);
        Executor executor = gv61.f84649b;
        task.mo1512d(executor, c4d1Var);
        task.mo1511c(executor, c4d1Var);
        task.mo1509a(executor, c4d1Var);
        ((CountDownLatch) c4d1Var.f33927b).await();
        return m29077T(task);
    }

    /* JADX INFO: renamed from: i */
    public static Object m29087i(Task task, long j, TimeUnit timeUnit) throws TimeoutException {
        ig31.m50504v();
        ig31.m50507y(task, "Task must not be null");
        ig31.m50507y(timeUnit, "TimeUnit must not be null");
        if (task.mo1517i()) {
            return m29077T(task);
        }
        c4d1 c4d1Var = new c4d1(10);
        Executor executor = gv61.f84649b;
        task.mo1512d(executor, c4d1Var);
        task.mo1511c(executor, c4d1Var);
        task.mo1509a(executor, c4d1Var);
        if (((CountDownLatch) c4d1Var.f33927b).await(j, timeUnit)) {
            return m29077T(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX INFO: renamed from: j */
    public static final fxh0 m29088j(fxh0 fxh0Var, float f, ch01 ch01Var) {
        boolean z;
        int i;
        if (ch01Var != null) {
            i = 0;
            z = true;
        } else {
            z = false;
            i = 3;
        }
        float f2 = 0;
        return ((ybs.m93300a(f, f2) <= 0 || ybs.m93300a(f, f2) <= 0) && !z) ? fxh0Var : l0y0.m57831m(fxh0Var, new v3a(f, f, i, ch01Var, z));
    }

    /* JADX INFO: renamed from: k */
    public static y7h1 m29089k(Executor executor, Callable callable) {
        ig31.m50507y(executor, "Executor must not be null");
        y7h1 y7h1Var = new y7h1();
        executor.execute(new RunnableC2650zh(y7h1Var, callable, false, 13));
        return y7h1Var;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m29090l(String str, boolean z, boolean z2) {
        return tgv.m80789j(str) && z && !z2;
    }

    /* JADX INFO: renamed from: m */
    public static void m29091m(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM36619s = dq60.m36619s(i, i2, "startIndex: ", ", endIndex: ", ", size: ");
            sbM36619s.append(i3);
            throw new IndexOutOfBoundsException(sbM36619s.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(s571.m77247f(i, "startIndex: ", i2, " > endIndex: "));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m29092n(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m29093o(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbM36619s = dq60.m36619s(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            sbM36619s.append(i3);
            throw new IndexOutOfBoundsException(sbM36619s.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(s571.m77247f(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m29094p(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException((i != i2 ? edb.m38560i(i, i2, "Both size ", " and step ", " must be greater than zero.") : edb.m38563l("size ", i, " must be greater than zero.")).toString());
        }
    }

    /* JADX INFO: renamed from: q */
    public static byte m29095q(long j) {
        c95.m31840f(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    /* JADX INFO: renamed from: r */
    public static final float m29096r(float f, float f2, float f3) {
        return Math.min(f3, Math.max(f2, f));
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m29097s(AbstractList abstractList, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(abstractList, 10));
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            arrayList.add(new gx10(httpURLConnection, null, null, new e8y(facebookException)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static gx10 m29098t(dx10 dx10Var, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        C1893gd c1893gd;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            e8y e8yVarM80909r = ti5.m80909r(jSONObject, obj2);
            if (e8yVarM80909r != null) {
                e8yVarM80909r.toString();
                if (e8yVarM80909r.f57305b == 190 && (c1893gd = dx10Var.f53822a) != null) {
                    Date date = C1893gd.f78679Y;
                    if (c1893gd.equals(okg1.m67200x())) {
                        if (e8yVarM80909r.f57306c != 493) {
                            okg1.m67176D(null);
                        } else {
                            C1893gd c1893gdM67200x = okg1.m67200x();
                            if (c1893gdM67200x != null && !new Date().after(c1893gdM67200x.f78682a)) {
                                okg1.m67199w();
                            }
                        }
                    }
                }
                return new gx10(httpURLConnection, null, null, e8yVarM80909r);
            }
            Object objM63378r = n0b1.m63378r("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
            if (objM63378r instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) objM63378r;
                jSONObject2.toString();
                return new gx10(httpURLConnection, jSONObject2, null, null);
            }
            if (objM63378r instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objM63378r;
                jSONArray.toString();
                return new gx10(httpURLConnection, null, jSONArray, null);
            }
            obj = JSONObject.NULL;
        }
        if (obj != JSONObject.NULL) {
            throw new FacebookException("Got unexpected object type in response, class: ".concat(obj.getClass().getSimpleName()));
        }
        obj.toString();
        return new gx10(httpURLConnection, null, null, null);
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList m29099u(InputStream inputStream, HttpURLConnection httpURLConnection, fx10 fx10Var) throws JSONException, IOException {
        Object obj;
        String strM63349H = n0b1.m63349H(inputStream);
        iq3 iq3Var = tra0.f223025b;
        iq3.m51332s(hsa0.f94647b);
        Object objNextValue = new JSONTokener(strM63349H).nextValue();
        int size = fx10Var.f74220b.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            fx10Var.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", objNextValue);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e) {
                arrayList.add(new gx10(httpURLConnection, null, null, new e8y(e)));
                obj = objNextValue;
            } catch (JSONException e2) {
                arrayList.add(new gx10(httpURLConnection, null, null, new e8y(e2)));
                obj = objNextValue;
            }
        } else {
            obj = objNextValue;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2.length() == size) {
                int length = jSONArray2.length();
                for (int i = 0; i < length; i++) {
                    try {
                        arrayList.add(m29098t((dx10) fx10Var.get(i), httpURLConnection, ((JSONArray) obj).get(i), objNextValue));
                    } catch (FacebookException e3) {
                        arrayList.add(new gx10(httpURLConnection, null, null, new e8y(e3)));
                    } catch (JSONException e4) {
                        arrayList.add(new gx10(httpURLConnection, null, null, new e8y(e4)));
                    }
                }
                iq3 iq3Var2 = tra0.f223025b;
                iq3.m51332s(hsa0.f94646a);
                return arrayList;
            }
        }
        throw new FacebookException("Unexpected number of results");
    }

    /* JADX INFO: renamed from: v */
    public static float m29100v(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: w */
    public static y7h1 m29101w(Exception exc) {
        y7h1 y7h1Var = new y7h1();
        y7h1Var.m92995p(exc);
        return y7h1Var;
    }

    /* JADX INFO: renamed from: x */
    public static y7h1 m29102x(Object obj) {
        y7h1 y7h1Var = new y7h1();
        y7h1Var.m92996q(obj);
        return y7h1Var;
    }

    /* JADX INFO: renamed from: y */
    public static final cq6 m29103y(dcm0 dcm0Var) {
        return (cq6) dcm0Var.m35664b(cq6.class);
    }

    /* JADX INFO: renamed from: z */
    public static final ago m29104z(dcm0 dcm0Var) {
        return (ago) dcm0Var.m35664b(ago.class);
    }
}
