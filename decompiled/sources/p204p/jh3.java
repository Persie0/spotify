package p204p;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.compose.material3.internal.AnchoredDragFinishedSignal;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class jh3 {

    /* JADX INFO: renamed from: a */
    public static sd40 f112320a;

    /* JADX INFO: renamed from: a */
    public static final rgc0 m53310a(gh00 gh00Var) {
        fes fesVar = new fes();
        gh00Var.invoke(fesVar);
        return new rgc0(fesVar.f68824a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m53311b(eh00 eh00Var, th00 th00Var, ibk ibkVar) {
        nr3 nr3Var;
        if (ibkVar instanceof nr3) {
            nr3Var = (nr3) ibkVar;
            int i = nr3Var.f157436b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nr3Var.f157436b = i - Integer.MIN_VALUE;
            } else {
                nr3Var = new nr3(ibkVar);
            }
        } else {
            nr3Var = new nr3(ibkVar);
        }
        Object obj = nr3Var.f157435a;
        int i2 = nr3Var.f157436b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                ur3 ur3Var = new ur3(eh00Var, th00Var, null, 1);
                nr3Var.f157436b = 1;
                Object objM56684z = kk40.m56684z(ur3Var, nr3Var);
                yuk yukVar = yuk.f276404a;
                if (objM56684z == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m53312c(ujx ujxVar, long j, mb61 mb61Var) {
        hqb hqbVar = new hqb(1, seg1.m77914f(mb61Var));
        hqbVar.m48222q();
        hqbVar.mo42415l(new tjx(ujxVar.m83297b(new long[]{j}, true, new gd5(j, hqbVar, 12)), ujxVar, 1));
        return hqbVar.m48221p();
    }

    /* JADX INFO: renamed from: d */
    public static final void m53313d(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(s571.m77246e(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public static CameraUnavailableException m53314e(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        return new CameraUnavailableException(cameraAccessExceptionCompat);
    }

    /* JADX INFO: renamed from: f */
    public static final w4a0 m53315f(vl21 vl21Var, h1d0 h1d0Var) {
        if (vl21Var instanceof ul21) {
            return new zc50(((ul21) vl21Var).f231418a, 2);
        }
        if (vl21Var instanceof tl21) {
            return new u4a0(new zmy(h1d0Var, vl21Var, null, 29), bk5.m29613h0(new v4a0[0]));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    public static final fxh0 m53316g(fxh0 fxh0Var, zu0 zu0Var, th00 th00Var) {
        return fxh0Var.mo34315F(new hes(zu0Var, th00Var));
    }

    /* JADX INFO: renamed from: h */
    public static Context m53317h(Context context) {
        int iM25787r;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (iM25787r = AbstractC1665af.m25787r(context)) != AbstractC1665af.m25787r(applicationContext)) {
            applicationContext = AbstractC1665af.m25775f(applicationContext, iM25787r);
        }
        if (i >= 30) {
            String strM32844f = ci11.m32844f(context);
            if (!Objects.equals(strM32844f, ci11.m32844f(applicationContext))) {
                return ci11.m32840b(applicationContext, strM32844f);
            }
        }
        return applicationContext;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: i */
    public static final List m53318i(f5u f5uVar) {
        List list;
        a6u a6uVar = (a6u) f5uVar.f66177g.get("clicked");
        return (a6uVar == null || (list = a6uVar.f12869a) == null) ? lau.f131415a : list;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: j */
    public static final List m53319j(f5u f5uVar) {
        List list;
        a6u a6uVar = (a6u) f5uVar.f66177g.get("viewed");
        return (a6uVar == null || (list = a6uVar.f12869a) == null) ? lau.f131415a : list;
    }

    /* JADX INFO: renamed from: k */
    public static final ph3 m53320k(ph3 ph3Var, List list) {
        fa80 fa80Var = ph3Var.f177455c;
        return ph3.m69935g(ph3Var, null, null, new fa80(kkc0.m56700m0(fa80Var.f67458a, Collections.singletonMap(rx20.f203471a, list))), 3);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m53321l(Context context) {
        return context.isDeviceProtectedStorage();
    }

    /* JADX INFO: renamed from: m */
    public static final void m53322m(AbstractSet abstractSet, ph3 ph3Var) {
        jz80 jz80Var = ph3Var.f177454b;
        dw50 dw50Var = jz80Var.f117620c;
        fa80 fa80Var = ph3Var.f177455c;
        Boolean bool = (Boolean) fa80Var.m41144c(a6q0.f12841a);
        Boolean bool2 = (Boolean) fa80Var.m41144c(oo50.f167466a);
        if (bool == null || bool2 == null) {
            return;
        }
        if ((dw50Var instanceof i6a0) || (dw50Var instanceof xv50)) {
            abstractSet.add(new yd3(eem.m38688s(jz80Var.f117620c), bool.booleanValue() && !bool2.booleanValue(), qxg1.m74136t(eem.m38689t(jz80Var.f117620c), qpv0.f191387a.mo54112b(f980.class))));
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Object m53323n(vq50 vq50Var, b2q0 b2q0Var, mb61 mb61Var) {
        boolean z = vq50Var instanceof gq50;
        w2a1 w2a1Var = w2a1.f247311a;
        if (z) {
            gq50 gq50Var = (gq50) vq50Var;
            Object objM96565n = zn91.m96565n(b2q0Var.m27969d(gq50Var.f83354d, true, gq50Var.f83353c, gq50Var.f83351a, gq50Var.f83352b, "", gq50Var.f83355e, "", null), mb61Var);
            if (objM96565n == yuk.f276404a) {
                return objM96565n;
            }
        } else if (vq50Var instanceof iq50) {
            b2q0Var.m27966a(((iq50) vq50Var).f104637e, null);
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: o */
    public static final void m53324o(tm4 tm4Var, es3 es3Var) {
        boolean zM54969D = k0e1.m54969D();
        if (zM54969D) {
            try {
                tm4Var.getClass();
                Trace.beginSection(k0e1.m54980O("ReschedulingWork"));
            } finally {
                if (zM54969D) {
                    Trace.endSection();
                }
            }
        }
        es3Var.invoke();
    }

    /* JADX INFO: renamed from: p */
    public static final ph3 m53325p(ph3 ph3Var, String str) {
        Iterable iterable = (List) ph3Var.f177455c.m41144c(rx20.f203471a);
        if (iterable == null) {
            iterable = lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!wj50.m88271j(((ghv) obj).getId(), str)) {
                arrayList.add(obj);
            }
        }
        return m53320k(ph3Var, arrayList);
    }
}
