package p204p;

import android.content.Context;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class un9 implements nwt {

    /* JADX INFO: renamed from: a */
    public final Context f232097a;

    /* JADX INFO: renamed from: b */
    public final String f232098b;

    /* JADX INFO: renamed from: c */
    public final go9 f232099c;

    /* JADX INFO: renamed from: d */
    public final b9v0 f232100d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f232101e;

    /* JADX INFO: renamed from: f */
    public final q831 f232102f;

    /* JADX INFO: renamed from: g */
    public final m47 f232103g;

    /* JADX INFO: renamed from: h */
    public final kq80 f232104h;

    /* JADX INFO: renamed from: i */
    public final ub80 f232105i;

    /* JADX INFO: renamed from: j */
    public final wg61 f232106j;

    /* JADX INFO: renamed from: k */
    public final fiz f232107k;

    /* JADX INFO: renamed from: l */
    public final ot21 f232108l;

    public un9(Context context, String str, go9 go9Var, b9v0 b9v0Var, slm slmVar, q831 q831Var, m47 m47Var, kq80 kq80Var, hc80 hc80Var) {
        this.f232097a = context;
        this.f232098b = str;
        this.f232099c = go9Var;
        this.f232100d = b9v0Var;
        this.f232101e = slmVar;
        this.f232102f = q831Var;
        this.f232103g = m47Var;
        this.f232104h = kq80Var;
        ub80 ub80VarM58232p = l5h1.m58232p(hc80Var.getLifecycle());
        this.f232105i = ub80VarM58232p;
        x0h1.m89578u(ub80VarM58232p, null, 0, new on9(this, null, 0), 3);
        this.f232106j = new wg61(new rn9(this, 0));
        this.f232107k = mvl0.m62953p(new j22(((tq80) kq80Var).m81306d(), 10));
        this.f232108l = new ot21(3, new rn9(this, 2));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (r7.m83537r(r8, r0) == r1) goto L51;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m83536f(un9 un9Var, ibk ibkVar) {
        qn9 qn9Var;
        ty80 ty80Var;
        Iterator<E> it;
        Object next;
        cxz0 cxz0Var;
        ybv ybvVar;
        Map map;
        String str;
        go9 go9Var;
        if (ibkVar instanceof qn9) {
            qn9Var = (qn9) ibkVar;
            int i = qn9Var.f190536c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn9Var.f190536c = i - Integer.MIN_VALUE;
            } else {
                qn9Var = new qn9(un9Var, ibkVar);
            }
        } else {
            qn9Var = new qn9(un9Var, ibkVar);
        }
        Object objM86757v = qn9Var.f190534a;
        Object obj = yuk.f276404a;
        int i2 = qn9Var.f190536c;
        fbk fbkVar = null;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            gh00 pn9Var = new pn9(un9Var, fbkVar, 1);
            qn9Var.f190536c = 1;
            if (un9Var.m83537r(pn9Var, qn9Var) != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(objM86757v);
        } else if (i2 == 2) {
            bga.m29073P(objM86757v);
            ty80Var = (ty80) objM86757v;
            if (ty80Var != null && (ybvVar = ty80Var.f224877f) != null && (map = ybvVar.f271272q) != null && (str = (String) map.get("social_prompting_session_id")) != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    go9Var = un9Var.f232099c;
                    if (go9Var.f82915j == null) {
                        go9Var.f82915j = "blend-social-prompting-".concat(str);
                    }
                }
            }
            it = ((k3z) un9Var.f232099c.f82912g.f158717a.getValue()).f119027a.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((cxz0) next).f43123d != 2);
            cxz0Var = (cxz0) next;
            if (cxz0Var != null) {
                gh00 gs3Var = new gs3(un9Var, cxz0Var, fbkVar, 7);
                qn9Var.f190536c = 3;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86757v);
        }
        return w2a1.f247311a;
        kmx kmxVarM81306d = ((tq80) un9Var.f232104h).m81306d();
        qn9Var.f190536c = 2;
        objM86757v = vyf1.m86757v(kmxVarM81306d, qn9Var);
        if (objM86757v != obj) {
            ty80Var = (ty80) objM86757v;
            if (ty80Var != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    go9Var = un9Var.f232099c;
                    if (go9Var.f82915j == null) {
                        go9Var.f82915j = "blend-social-prompting-".concat(str);
                    }
                }
            }
            it = ((k3z) un9Var.f232099c.f82912g.f158717a.getValue()).f119027a.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((cxz0) next).f43123d != 2);
            cxz0Var = (cxz0) next;
            if (cxz0Var != null) {
                gh00 gs3Var2 = new gs3(un9Var, cxz0Var, fbkVar, 7);
                qn9Var.f190536c = 3;
            }
            return w2a1.f247311a;
        }
        return obj;
    }

    @Override // p204p.mu21
    /* JADX INFO: renamed from: d */
    public final ot21 mo24876d() {
        return this.f232108l;
    }

    @Override // p204p.nwt, p204p.mu21
    public final fiz getShow() {
        return this.f232107k;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m83537r(gh00 gh00Var, ibk ibkVar) {
        tn9 tn9Var;
        if (ibkVar instanceof tn9) {
            tn9Var = (tn9) ibkVar;
            int i = tn9Var.f221910c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn9Var.f221910c = i - Integer.MIN_VALUE;
            } else {
                tn9Var = new tn9(this, ibkVar);
            }
        } else {
            tn9Var = new tn9(this, ibkVar);
        }
        Object obj = tn9Var.f221908a;
        int i2 = tn9Var.f221910c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                tn9Var.f221910c = 1;
                Object objInvoke = gh00Var.invoke(tn9Var);
                Object obj2 = yuk.f276404a;
                if (objInvoke == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            this.f232102f.m72305j(new g631(null, this.f232097a.getString(R.string.blend_social_prompting_error), null, null, null, null, null, null, false));
        }
        return w2a1.f247311a;
    }
}
