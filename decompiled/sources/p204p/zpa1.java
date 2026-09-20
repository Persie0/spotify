package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class zpa1 extends mic1 {

    /* JADX INFO: renamed from: A */
    public final nuu0 f285035A;

    /* JADX INFO: renamed from: B */
    public final zv41 f285036B;

    /* JADX INFO: renamed from: C */
    public final nuu0 f285037C;

    /* JADX INFO: renamed from: D */
    public final zv41 f285038D;

    /* JADX INFO: renamed from: E */
    public final nuu0 f285039E;

    /* JADX INFO: renamed from: F */
    public final zv41 f285040F;

    /* JADX INFO: renamed from: G */
    public final nuu0 f285041G;

    /* JADX INFO: renamed from: H */
    public final zv41 f285042H;

    /* JADX INFO: renamed from: I */
    public final nuu0 f285043I;

    /* JADX INFO: renamed from: J */
    public final zv41 f285044J;

    /* JADX INFO: renamed from: K */
    public final nuu0 f285045K;

    /* JADX INFO: renamed from: L */
    public final l971 f285046L;

    /* JADX INFO: renamed from: M */
    public final l971 f285047M;

    /* JADX INFO: renamed from: N */
    public final l971 f285048N;

    /* JADX INFO: renamed from: O */
    public String f285049O;

    /* JADX INFO: renamed from: P */
    public boolean f285050P;

    /* JADX INFO: renamed from: Q */
    public final Object f285051Q;

    /* JADX INFO: renamed from: R */
    public final File f285052R;

    /* JADX INFO: renamed from: S */
    public boolean f285053S;

    /* JADX INFO: renamed from: T */
    public Set f285054T;

    /* JADX INFO: renamed from: U */
    public boolean f285055U;

    /* JADX INFO: renamed from: V */
    public boolean f285056V;

    /* JADX INFO: renamed from: W */
    public di41 f285057W;

    /* JADX INFO: renamed from: X */
    public final di41 f285058X;

    /* JADX INFO: renamed from: b */
    public final mc7 f285059b;

    /* JADX INFO: renamed from: c */
    public final q831 f285060c;

    /* JADX INFO: renamed from: d */
    public final luk f285061d;

    /* JADX INFO: renamed from: e */
    public final luk f285062e;

    /* JADX INFO: renamed from: f */
    public final ppa1 f285063f;

    /* JADX INFO: renamed from: g */
    public final vqy f285064g;

    /* JADX INFO: renamed from: h */
    public final b141 f285065h;

    /* JADX INFO: renamed from: i */
    public final u010 f285066i;

    /* JADX INFO: renamed from: j */
    public final qe50 f285067j;

    /* JADX INFO: renamed from: k */
    public final sf60 f285068k;

    /* JADX INFO: renamed from: l */
    public final cqy f285069l;

    /* JADX INFO: renamed from: m */
    public final boolean f285070m;

    /* JADX INFO: renamed from: n */
    public final vf50 f285071n;

    /* JADX INFO: renamed from: o */
    public final String f285072o;

    /* JADX INFO: renamed from: p */
    public final boolean f285073p;

    /* JADX INFO: renamed from: q */
    public final boolean f285074q;

    /* JADX INFO: renamed from: r */
    public final String f285075r;

    /* JADX INFO: renamed from: s */
    public final String f285076s;

    /* JADX INFO: renamed from: t */
    public final zv41 f285077t;

    /* JADX INFO: renamed from: u */
    public final nuu0 f285078u;

    /* JADX INFO: renamed from: v */
    public final zv41 f285079v;

    /* JADX INFO: renamed from: w */
    public final nuu0 f285080w;

    /* JADX INFO: renamed from: x */
    public final zv41 f285081x;

    /* JADX INFO: renamed from: y */
    public final nuu0 f285082y;

    /* JADX INFO: renamed from: z */
    public final zv41 f285083z;

    public zpa1(String str, String str2, mc7 mc7Var, luk lukVar, luk lukVar2, cqy cqyVar, vqy vqyVar, u010 u010Var, qe50 qe50Var, vf50 vf50Var, sf60 sf60Var, q831 q831Var, b141 b141Var, ppa1 ppa1Var, boolean z) {
        String str3;
        String strMo48710e;
        this.f285059b = mc7Var;
        this.f285060c = q831Var;
        this.f285061d = lukVar;
        this.f285062e = lukVar2;
        this.f285063f = ppa1Var;
        this.f285064g = vqyVar;
        this.f285065h = b141Var;
        this.f285066i = u010Var;
        this.f285067j = qe50Var;
        this.f285068k = sf60Var;
        this.f285069l = cqyVar;
        this.f285070m = z;
        this.f285071n = vf50Var;
        this.f285072o = str2;
        this.f285073p = cqyVar == cqy.f41022c;
        boolean z2 = cqyVar == cqy.f41021b && z;
        this.f285074q = z2;
        fbk fbkVar = null;
        this.f285075r = sf60Var != null ? sf60Var.f208477d : null;
        this.f285076s = sf60Var != null ? sf60Var.f208478e : null;
        zv41 zv41VarM52819d = jag1.m52819d(g9a0.f77719a);
        this.f285077t = zv41VarM52819d;
        this.f285078u = bzf1.m31021m(zv41VarM52819d);
        String str4 = "";
        lau lauVar = lau.f131415a;
        zv41 zv41VarM52819d2 = jag1.m52819d(new hpa1(null, "User did not provide any comment", "", lauVar));
        this.f285079v = zv41VarM52819d2;
        this.f285080w = bzf1.m31021m(zv41VarM52819d2);
        zv41 zv41VarM52819d3 = jag1.m52819d(null);
        this.f285081x = zv41VarM52819d3;
        this.f285082y = bzf1.m31021m(zv41VarM52819d3);
        zv41 zv41VarM52819d4 = jag1.m52819d(Float.valueOf(1.0f));
        this.f285083z = zv41VarM52819d4;
        this.f285035A = bzf1.m31021m(zv41VarM52819d4);
        Boolean bool = Boolean.TRUE;
        zv41 zv41VarM52819d5 = jag1.m52819d(bool);
        this.f285036B = zv41VarM52819d5;
        this.f285037C = bzf1.m31021m(zv41VarM52819d5);
        zv41 zv41VarM52819d6 = jag1.m52819d(bool);
        this.f285038D = zv41VarM52819d6;
        this.f285039E = bzf1.m31021m(zv41VarM52819d6);
        zv41 zv41VarM52819d7 = jag1.m52819d(lauVar);
        this.f285040F = zv41VarM52819d7;
        this.f285041G = bzf1.m31021m(zv41VarM52819d7);
        zv41 zv41VarM52819d8 = jag1.m52819d(Boolean.FALSE);
        this.f285042H = zv41VarM52819d8;
        this.f285043I = bzf1.m31021m(zv41VarM52819d8);
        zv41 zv41VarM52819d9 = jag1.m52819d(0);
        this.f285044J = zv41VarM52819d9;
        this.f285045K = bzf1.m31021m(zv41VarM52819d9);
        l971 l971Var = new l971((String) null, 3);
        this.f285046L = l971Var;
        this.f285047M = new l971((String) null, 3);
        if (z2 && (strMo48710e = ((re50) qe50Var).f198286a.mo48710e(re50.f198285b, null)) != null) {
            str4 = strMo48710e;
        }
        this.f285048N = new l971(str4, 2);
        this.f285049O = "No topic selected";
        this.f285051Q = new Object();
        File file = str != null ? new File(str) : null;
        this.f285052R = file;
        this.f285054T = file != null ? Collections.singleton(file) : gbu.f78413a;
        if (file != null) {
            x0h1.m89578u(pic1.m70100a(this), null, 0, new w9a1(this, file, fbkVar, 3), 3);
        }
        this.f285058X = x0h1.m89578u(pic1.m70100a(this), null, 0, new wm81(this, fbkVar, 22), 3);
        m12 m12Var = ppa1Var.f179990a;
        di41 di41Var = ppa1Var.f179999j;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        ppa1Var.f179999j = null;
        ppa1Var.f180001l = null;
        m12Var.m60509X();
        m12Var.m60513b0();
        if (sf60Var == null || (str3 = sf60Var.f208479f) == null) {
            return;
        }
        t571 t571VarM58503g = l971Var.m58503g();
        try {
            t571VarM58503g.append(str3);
            l971Var.m58498b(t571VarM58503g);
        } finally {
            l971Var.m58499c();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m96677e(zpa1 zpa1Var, ro80 ro80Var, ArrayList arrayList, boolean z) {
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (wl51.m88482f1('.', ((File) obj).getName(), "").equals("txt")) {
                    arrayList2.add(obj);
                }
            }
            ro80Var.addAll(arrayList2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m96678f(zpa1 zpa1Var, ro80 ro80Var) {
        synchronized (zpa1Var.f285051Q) {
            try {
                File file = zpa1Var.f285052R;
                if (file != null) {
                    if (zpa1Var.f285053S || !file.exists()) {
                        file = null;
                    }
                    if (file != null) {
                        ro80Var.add(file);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Serializable m96679g(zpa1 zpa1Var, UUID uuid, ibk ibkVar) {
        spa1 spa1Var;
        Serializable c6x0Var;
        if (ibkVar instanceof spa1) {
            spa1Var = (spa1) ibkVar;
            int i = spa1Var.f212792c;
            if ((i & Integer.MIN_VALUE) != 0) {
                spa1Var.f212792c = i - Integer.MIN_VALUE;
            } else {
                spa1Var = new spa1(zpa1Var, ibkVar);
            }
        } else {
            spa1Var = new spa1(zpa1Var, ibkVar);
        }
        Object objM76980u = spa1Var.f212790a;
        int i2 = spa1Var.f212792c;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                vqy vqyVar = zpa1Var.f285064g;
                spa1Var.f212792c = 1;
                az1 az1Var = ((zqy) vqyVar).f285477a;
                az1Var.getClass();
                objM76980u = s1h1.m76980u(10000L, new jr4(az1Var, uuid, fbkVar, 1), spa1Var);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76980u);
            }
            c6x0Var = (String) objM76980u;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to observe queued feedback result", new Object[0]);
        }
        if (c6x0Var instanceof c6x0) {
            return null;
        }
        return c6x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ad A[Catch: all -> 0x00bc, TryCatch #2 {all -> 0x00bc, blocks: (B:50:0x00a7, B:52:0x00ad, B:55:0x00be, B:57:0x00c2, B:58:0x00c7), top: B:72:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c2 A[Catch: all -> 0x00bc, TryCatch #2 {all -> 0x00bc, blocks: (B:50:0x00a7, B:52:0x00ad, B:55:0x00be, B:57:0x00c2, B:58:0x00c7), top: B:72:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7 A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #2 {all -> 0x00bc, blocks: (B:50:0x00a7, B:52:0x00ad, B:55:0x00be, B:57:0x00c2, B:58:0x00c7), top: B:72:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m96680h(zpa1 zpa1Var, List list, gh00 gh00Var, ibk ibkVar) throws Throwable {
        tpa1 tpa1Var;
        List list2;
        nlv0 nlv0Var;
        Throwable th;
        List listM96684l;
        List listM96684l2;
        if (ibkVar instanceof tpa1) {
            tpa1Var = (tpa1) ibkVar;
            int i = tpa1Var.f222475e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpa1Var.f222475e = i - Integer.MIN_VALUE;
            } else {
                tpa1Var = new tpa1(zpa1Var, ibkVar);
            }
        } else {
            tpa1Var = new tpa1(zpa1Var, ibkVar);
        }
        Object obj = tpa1Var.f222473c;
        yuk yukVar = yuk.f276404a;
        int i2 = tpa1Var.f222475e;
        if (i2 == 0) {
            bga.m29073P(obj);
            synchronized (zpa1Var.f285051Q) {
                if (zpa1Var.f285050P) {
                    throw new IllegalStateException("Issue report was closed before it could be enqueued");
                }
                zpa1Var.f285054T = s601.m77309l0(zpa1Var.f285054T, list);
                zpa1Var.f285055U = true;
            }
            nlv0 nlv0Var2 = new nlv0();
            try {
                rnj0 rnj0Var = rnj0.f200934b;
                ry2 ry2Var = new ry2(gh00Var, null, 9);
                tpa1Var.f222471a = list;
                tpa1Var.f222472b = nlv0Var2;
                tpa1Var.f222475e = 1;
                Object objM89557A = x0h1.m89557A(rnj0Var, ry2Var, tpa1Var);
                if (objM89557A == yukVar) {
                    return yukVar;
                }
                list2 = list;
                nlv0Var = nlv0Var2;
                obj = objM89557A;
            } catch (Throwable th2) {
                list2 = list;
                nlv0Var = nlv0Var2;
                th = th2;
                synchronized (zpa1Var.f285051Q) {
                    zpa1Var.f285055U = false;
                    if (nlv0Var.f155174a) {
                        zpa1Var.f285054T = s601.m77305h0(zpa1Var.f285054T, g6f.m43736n1(list2));
                    }
                    if (zpa1Var.f285050P) {
                        listM96684l = zpa1Var.m96684l();
                    } else {
                        listM96684l = lau.f131415a;
                    }
                    zpa1Var.f285065h.m27880m(listM96684l);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nlv0Var = tpa1Var.f222472b;
            list2 = tpa1Var.f222471a;
            try {
                bga.m29073P(obj);
            } catch (Throwable th3) {
                th = th3;
                synchronized (zpa1Var.f285051Q) {
                    try {
                        zpa1Var.f285055U = false;
                        if (nlv0Var.f155174a) {
                            zpa1Var.f285054T = s601.m77305h0(zpa1Var.f285054T, g6f.m43736n1(list2));
                        }
                        if (zpa1Var.f285050P) {
                            listM96684l = zpa1Var.m96684l();
                        } else {
                            listM96684l = lau.f131415a;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                zpa1Var.f285065h.m27880m(listM96684l);
                throw th;
            }
        }
        nlv0Var.f155174a = true;
        synchronized (zpa1Var.f285051Q) {
            try {
                zpa1Var.f285055U = false;
                if (nlv0Var.f155174a) {
                    zpa1Var.f285054T = s601.m77305h0(zpa1Var.f285054T, g6f.m43736n1(list2));
                }
                listM96684l2 = zpa1Var.f285050P ? zpa1Var.m96684l() : lau.f131415a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
        zpa1Var.f285065h.m27880m(listM96684l2);
        return obj;
    }

    /* JADX INFO: renamed from: k */
    public static int m96681k(oqy oqyVar) {
        int i = oqyVar == null ? -1 : rpa1.f201483a[oqyVar.ordinal()];
        if (i == -1) {
            return R.string.user_feedback_no_topic;
        }
        if (i == 1) {
            return R.string.user_feedback_topic_playback_issue;
        }
        if (i == 2) {
            return R.string.user_feedback_topic_offline_issue;
        }
        if (i == 3) {
            return R.string.user_feedback_topic_connect_issue;
        }
        if (i == 4) {
            return R.string.user_feedback_topic_ux_issue;
        }
        if (i == 5) {
            return R.string.user_feedback_topic_other_issue;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.mic1
    /* JADX INFO: renamed from: d */
    public final void mo15620d() {
        List listM96684l;
        synchronized (this.f285051Q) {
            try {
                this.f285050P = true;
                listM96684l = this.f285055U ? lau.f131415a : m96684l();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f285061d.mo30646r(dau.f47107a, new vpa1(0, this, listM96684l));
    }

    /* JADX INFO: renamed from: i */
    public final void m96682i(eh00 eh00Var) {
        List listM96684l;
        synchronized (this.f285051Q) {
            if (this.f285050P || this.f285056V) {
                listM96684l = null;
            } else {
                this.f285050P = true;
                listM96684l = m96684l();
            }
        }
        if (listM96684l == null) {
            return;
        }
        this.f285065h.m27880m(listM96684l);
        this.f285063f.m70547a();
        eh00Var.invoke();
    }

    /* JADX INFO: renamed from: j */
    public final void m96683j(String str, eh00 eh00Var) {
        boolean z;
        String string = this.f285047M.m58500d().f226935c.toString();
        String strM48589a = this.f285074q ? htw0.m48589a(this.f285048N.m58500d().f226935c.toString()) : null;
        if (this.f285074q && (wl51.m88460J0(string) || wl51.m88460J0(str) || strM48589a == null)) {
            return;
        }
        synchronized (this.f285051Q) {
            if (this.f285050P || this.f285056V) {
                z = false;
            } else {
                this.f285056V = true;
                z = true;
            }
        }
        if (z) {
            zv41 zv41Var = this.f285077t;
            w9a0 w9a0Var = w9a0.f249130a;
            zv41Var.getClass();
            zv41Var.m97091m(null, w9a0Var);
            x0h1.m89578u(pic1.m70100a(this), null, 0, new ypa1(this, this.f285074q ? true : ((Boolean) this.f285037C.f158717a.getValue()).booleanValue(), strM48589a, string, str, this.f285074q ? ((Boolean) this.f285039E.f158717a.getValue()).booleanValue() : ((Boolean) this.f285037C.f158717a.getValue()).booleanValue(), eh00Var, null), 3);
        }
    }

    /* JADX INFO: renamed from: l */
    public final List m96684l() {
        List listM43728j1 = g6f.m43728j1(this.f285054T);
        this.f285054T = gbu.f78413a;
        zv41 zv41Var = this.f285040F;
        zv41Var.getClass();
        zv41Var.m97091m(null, lau.f131415a);
        this.f285081x.m97090l(null);
        return listM43728j1;
    }
}
