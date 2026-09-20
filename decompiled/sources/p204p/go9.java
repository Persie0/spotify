package p204p;

import com.spotify.blend.socialprompting.dataimpl.BlendSocialPromptingGenerationErrorException;
import com.spotify.blend.socialprompting.dataimpl.BlendSocialPromptingGenerationTimeoutException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class go9 {

    /* JADX INFO: renamed from: a */
    public final String f82906a;

    /* JADX INFO: renamed from: b */
    public final a99 f82907b;

    /* JADX INFO: renamed from: c */
    public final yz80 f82908c;

    /* JADX INFO: renamed from: d */
    public final g5t0 f82909d;

    /* JADX INFO: renamed from: e */
    public final String f82910e;

    /* JADX INFO: renamed from: f */
    public final zv41 f82911f;

    /* JADX INFO: renamed from: g */
    public final nuu0 f82912g;

    /* JADX INFO: renamed from: h */
    public final zv41 f82913h;

    /* JADX INFO: renamed from: i */
    public final nuu0 f82914i;

    /* JADX INFO: renamed from: j */
    public volatile String f82915j;

    /* JADX INFO: renamed from: k */
    public tf60 f82916k;

    public go9(String str, a99 a99Var, yz80 yz80Var, g5t0 g5t0Var) {
        this.f82906a = str;
        this.f82907b = a99Var;
        this.f82908c = yz80Var;
        this.f82909d = g5t0Var;
        Set set = dd41.f47702f;
        this.f82910e = r46.m74726U(str).m35710h();
        lv21 lv21Var = lv21.f137205b;
        zv41 zv41VarM52819d = jag1.m52819d(new k3z(lv21Var, lv21Var));
        this.f82911f = zv41VarM52819d;
        this.f82912g = bzf1.m31021m(zv41VarM52819d);
        zv41 zv41VarM52819d2 = jag1.m52819d(qv41.f192868a);
        this.f82913h = zv41VarM52819d2;
        this.f82914i = bzf1.m31021m(zv41VarM52819d2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m45326a(go9 go9Var, String str, ibk ibkVar) {
        xn9 xn9Var;
        if (ibkVar instanceof xn9) {
            xn9Var = (xn9) ibkVar;
            int i = xn9Var.f263562c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xn9Var.f263562c = i - Integer.MIN_VALUE;
            } else {
                xn9Var = new xn9(go9Var, ibkVar);
            }
        } else {
            xn9Var = new xn9(go9Var, ibkVar);
        }
        Object obj = xn9Var.f263560a;
        int i2 = xn9Var.f263562c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                bo9 bo9Var = new bo9(go9Var, str, null, 0);
                xn9Var.f263562c = 1;
                Object objM76978s = s1h1.m76978s(300000L, bo9Var, xn9Var);
                yuk yukVar = yuk.f276404a;
                if (objM76978s == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        } catch (TimeoutCancellationException unused) {
            throw new BlendSocialPromptingGenerationTimeoutException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (p204p.kk40.m56684z(r7, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r15 == r0) goto L24;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m45327b(go9 go9Var, String str, ibk ibkVar) {
        co9 co9Var;
        go9 go9Var2;
        go9Var.getClass();
        if (ibkVar instanceof co9) {
            co9Var = (co9) ibkVar;
            int i = co9Var.f40209c;
            if ((i & Integer.MIN_VALUE) != 0) {
                co9Var.f40209c = i - Integer.MIN_VALUE;
            } else {
                co9Var = new co9(go9Var, ibkVar);
            }
        } else {
            co9Var = new co9(go9Var, ibkVar);
        }
        co9 co9Var2 = co9Var;
        Object objM63321r = co9Var2.f40207a;
        yuk yukVar = yuk.f276404a;
        int i2 = co9Var2.f40209c;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM63321r);
            if (str != null) {
                String strConcat = "blend-social-prompting-".concat(str);
                String str2 = go9Var.f82915j;
                go9Var.f82915j = strConcat;
                go9Var2 = go9Var;
                C1977ig c1977ig = new C1977ig(str2, strConcat, go9Var2, fbkVar, 28);
                co9Var2.f40209c = 1;
            } else {
                go9Var2 = go9Var;
                go9Var2.f82915j = null;
                yz80 yz80Var = go9Var2.f82908c;
                String str3 = go9Var2.f82906a;
                co9Var2.f40209c = 2;
                objM63321r = ((n090) yz80Var).m63321r(str3, "blend-social-prompting", false, true, co9Var2);
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(objM63321r);
            go9Var2 = go9Var;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM63321r);
            go9Var2 = go9Var;
            ((p2x0) objM63321r).m68971d();
        }
        zv41 zv41Var = go9Var2.f82913h;
        qv41 qv41Var = qv41.f192869b;
        zv41Var.getClass();
        zv41Var.m97091m(null, qv41Var);
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m45328c(go9 go9Var, String str, ibk ibkVar) {
        do9 do9Var;
        Object next;
        if (ibkVar instanceof do9) {
            do9Var = (do9) ibkVar;
            int i = do9Var.f50991d;
            if ((i & Integer.MIN_VALUE) != 0) {
                do9Var.f50991d = i - Integer.MIN_VALUE;
            } else {
                do9Var = new do9(go9Var, ibkVar);
            }
        } else {
            do9Var = new do9(go9Var, ibkVar);
        }
        Object objM25093l = do9Var.f50989b;
        int i2 = do9Var.f50991d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM25093l);
                a99 a99Var = go9Var.f82907b;
                String str2 = go9Var.f82910e;
                do9Var.f50988a = str;
                do9Var.f50991d = 1;
                objM25093l = a99Var.m25093l(str2, do9Var);
                yuk yukVar = yuk.f276404a;
                if (objM25093l == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = do9Var.f50988a;
                bga.m29073P(objM25093l);
            }
            k3z k3zVar = (k3z) objM25093l;
            go9Var.f82911f.m97090l(k3zVar);
            Iterator<E> it = k3zVar.f119027a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wj50.m88271j(((cxz0) next).f43120a, str));
            cxz0 cxz0Var = (cxz0) next;
            int i3 = cxz0Var != null ? cxz0Var.f43123d : 0;
            int i4 = i3 == 0 ? -1 : vn9.f243026a[edb.m38547C(i3)];
            if (i4 != 1) {
                return Boolean.valueOf(i4 == 2);
            }
            throw new BlendSocialPromptingGenerationErrorException();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m45329d(gh00 gh00Var, ibk ibkVar) throws Exception {
        eo9 eo9Var;
        if (ibkVar instanceof eo9) {
            eo9Var = (eo9) ibkVar;
            int i = eo9Var.f61345c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eo9Var.f61345c = i - Integer.MIN_VALUE;
            } else {
                eo9Var = new eo9(this, ibkVar);
            }
        } else {
            eo9Var = new eo9(this, ibkVar);
        }
        Object obj = eo9Var.f61343a;
        int i2 = eo9Var.f61345c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj;
            }
            bga.m29073P(obj);
            eo9Var.f61345c = 1;
            Object objInvoke = gh00Var.invoke(eo9Var);
            Object obj2 = yuk.f276404a;
            return objInvoke == obj2 ? obj2 : objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            zv41 zv41Var = this.f82913h;
            zv41Var.getClass();
            zv41Var.m97091m(null, qv41.f192869b);
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m45330e(gh00 gh00Var, ibk ibkVar) {
        fo9 fo9Var;
        Throwable th;
        tf60 tf60Var;
        if (ibkVar instanceof fo9) {
            fo9Var = (fo9) ibkVar;
            int i = fo9Var.f71475d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fo9Var.f71475d = i - Integer.MIN_VALUE;
            } else {
                fo9Var = new fo9(this, ibkVar);
            }
        } else {
            fo9Var = new fo9(this, ibkVar);
        }
        Object obj = fo9Var.f71473b;
        int i2 = fo9Var.f71475d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tf60Var = fo9Var.f71472a;
            try {
                bga.m29073P(obj);
                if (this.f82916k == tf60Var) {
                    this.f82916k = null;
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (this.f82916k == tf60Var) {
                    this.f82916k = null;
                }
                throw th;
            }
        }
        bga.m29073P(obj);
        tf60 tf60VarM73186B = qlg1.m73186B(fo9Var.getContext());
        tf60 tf60Var2 = this.f82916k;
        if (tf60Var2 != null) {
            tf60Var2.mo26601e(null);
        }
        this.f82916k = tf60VarM73186B;
        try {
            fo9Var.f71472a = tf60VarM73186B;
            fo9Var.f71475d = 1;
            Object objM45329d = m45329d(gh00Var, fo9Var);
            Object obj2 = yuk.f276404a;
            if (objM45329d == obj2) {
                return obj2;
            }
            obj = objM45329d;
            tf60Var = tf60VarM73186B;
            if (this.f82916k == tf60Var) {
                this.f82916k = null;
            }
            return obj;
        } catch (Throwable th3) {
            th = th3;
            tf60Var = tf60VarM73186B;
            if (this.f82916k == tf60Var) {
                this.f82916k = null;
            }
            throw th;
        }
    }
}
