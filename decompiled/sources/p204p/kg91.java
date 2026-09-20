package p204p;

import android.content.Context;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class kg91 implements vf91 {

    /* JADX INFO: renamed from: f */
    public static final fv31 f122330f;

    /* JADX INFO: renamed from: g */
    public static final fv31 f122331g;

    /* JADX INFO: renamed from: h */
    public static final fv31 f122332h;

    /* JADX INFO: renamed from: i */
    public static final fv31 f122333i;

    /* JADX INFO: renamed from: j */
    public static final fv31 f122334j;

    /* JADX INFO: renamed from: k */
    public static final fv31 f122335k;

    /* JADX INFO: renamed from: l */
    public static final fv31 f122336l;

    /* JADX INFO: renamed from: m */
    public static final fv31 f122337m;

    /* JADX INFO: renamed from: a */
    public final vnb f122338a;

    /* JADX INFO: renamed from: b */
    public final Context f122339b;

    /* JADX INFO: renamed from: c */
    public final FlowableElementAtSingle f122340c;

    /* JADX INFO: renamed from: d */
    public final hb11 f122341d = j0g1.m52092t(0, 8, 0, 4);

    /* JADX INFO: renamed from: e */
    public final hb11 f122342e = j0g1.m52092t(0, 8, 0, 4);

    static {
        si5 si5Var = fv31.f73628b;
        f122330f = si5Var.m78183U("OnDemandTrialConfigurationPreferences.key_eligibility");
        f122331g = si5Var.m78183U("OnDemandTrialConfigurationPreferences.key_eligibility_window_end_timestamp");
        f122332h = si5Var.m78183U("OnDemandTrialConfigurationPreferences.key_eligibility_trial_length");
        f122333i = si5Var.m78183U("OnDemandTrialConfigurationPreferences.key_eligibility_is_manual_trial_flow");
        f122334j = si5Var.m78183U("OnDemandTrialConfigurationPreferences.key_trial_end_timestamp");
        f122335k = si5Var.m78183U("OnDemandTrialConfigurationPreferences.key_started_trial_length_days");
        f122336l = si5Var.m78183U("OnDemandTrialConfigurationPreferences.key_should_fetch_trial_end_timestamp");
        f122337m = si5Var.m78183U("OnDemandTrialConfigurationPreferences.key_active_days");
    }

    public kg91(vnb vnbVar, Context context, FlowableElementAtSingle flowableElementAtSingle) {
        this.f122338a = vnbVar;
        this.f122339b = context;
        this.f122340c = flowableElementAtSingle;
    }

    /* JADX INFO: renamed from: d */
    public static List m56311d(hv31 hv31Var) {
        fv31 fv31Var = f122337m;
        Set set = gbu.f78413a;
        Set setMo48707b = hv31Var.mo48707b(fv31Var, set);
        if (setMo48707b != null) {
            set = setMo48707b;
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
        }
        return g6f.m43710X0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m56312a(ibk ibkVar) {
        wf91 wf91Var;
        if (ibkVar instanceof wf91) {
            wf91Var = (wf91) ibkVar;
            int i = wf91Var.f250771c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wf91Var.f250771c = i - Integer.MIN_VALUE;
            } else {
                wf91Var = new wf91(this, ibkVar);
            }
        } else {
            wf91Var = new wf91(this, ibkVar);
        }
        Object objM56315e = wf91Var.f250769a;
        int i2 = wf91Var.f250771c;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            wf91Var.f250771c = 1;
            objM56315e = m56315e(wf91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56315e);
        }
        lv31 lv31VarEdit = ((hv31) objM56315e).edit();
        lv31VarEdit.m60049b(f122335k, -1);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m56313b(ibk ibkVar) {
        xf91 xf91Var;
        if (ibkVar instanceof xf91) {
            xf91Var = (xf91) ibkVar;
            int i = xf91Var.f260875c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xf91Var.f260875c = i - Integer.MIN_VALUE;
            } else {
                xf91Var = new xf91(this, ibkVar);
            }
        } else {
            xf91Var = new xf91(this, ibkVar);
        }
        Object objM56315e = xf91Var.f260873a;
        int i2 = xf91Var.f260875c;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            xf91Var.f260875c = 1;
            objM56315e = m56315e(xf91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56315e);
        }
        lv31 lv31VarEdit = ((hv31) objM56315e).edit();
        lv31VarEdit.m60050c(f122334j, -1L);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m56314c(ibk ibkVar) {
        yf91 yf91Var;
        if (ibkVar instanceof yf91) {
            yf91Var = (yf91) ibkVar;
            int i = yf91Var.f272186c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf91Var.f272186c = i - Integer.MIN_VALUE;
            } else {
                yf91Var = new yf91(this, ibkVar);
            }
        } else {
            yf91Var = new yf91(this, ibkVar);
        }
        Object objM56315e = yf91Var.f272184a;
        int i2 = yf91Var.f272186c;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            yf91Var.f272186c = 1;
            objM56315e = m56315e(yf91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56315e);
        }
        return m56311d((hv31) objM56315e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m56315e(ibk ibkVar) {
        ag91 ag91Var;
        if (ibkVar instanceof ag91) {
            ag91Var = (ag91) ibkVar;
            int i = ag91Var.f15320c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag91Var.f15320c = i - Integer.MIN_VALUE;
            } else {
                ag91Var = new ag91(this, ibkVar);
            }
        } else {
            ag91Var = new ag91(this, ibkVar);
        }
        Object objM96567o = ag91Var.f15318a;
        int i2 = ag91Var.f15320c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            ag91Var.f15320c = 1;
            objM96567o = zn91.m96567o(this.f122340c, ag91Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        String str = (String) objM96567o;
        wj50.m88279p(str);
        return this.f122338a.mo35842b(this.f122339b, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m56316f(ibk ibkVar) {
        bg91 bg91Var;
        if (ibkVar instanceof bg91) {
            bg91Var = (bg91) ibkVar;
            int i = bg91Var.f26892c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bg91Var.f26892c = i - Integer.MIN_VALUE;
            } else {
                bg91Var = new bg91(this, ibkVar);
            }
        } else {
            bg91Var = new bg91(this, ibkVar);
        }
        Object objM56315e = bg91Var.f26890a;
        int i2 = bg91Var.f26892c;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            bg91Var.f26892c = 1;
            objM56315e = m56315e(bg91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56315e);
        }
        return qyg1.m74180J(((hv31) objM56315e).mo48717l(f122335k, -1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m56317g(ibk ibkVar) {
        cg91 cg91Var;
        if (ibkVar instanceof cg91) {
            cg91Var = (cg91) ibkVar;
            int i = cg91Var.f37607c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cg91Var.f37607c = i - Integer.MIN_VALUE;
            } else {
                cg91Var = new cg91(this, ibkVar);
            }
        } else {
            cg91Var = new cg91(this, ibkVar);
        }
        Object objM56315e = cg91Var.f37605a;
        int i2 = cg91Var.f37607c;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            cg91Var.f37607c = 1;
            objM56315e = m56315e(cg91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56315e);
        }
        hv31 hv31Var = (hv31) objM56315e;
        boolean zMo48713h = hv31Var.mo48713h(f122330f, false);
        Long lM74181K = qyg1.m74181K(hv31Var.mo48712g(f122331g, -1L));
        if (lM74181K.longValue() == -1) {
            lM74181K = null;
        }
        Integer numM74180J = qyg1.m74180J(hv31Var.mo48717l(f122332h, -1));
        return new pg91(numM74180J.intValue() != -1 ? numM74180J : null, lM74181K, zMo48713h, hv31Var.mo48713h(f122333i, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m56318h(ibk ibkVar) {
        dg91 dg91Var;
        if (ibkVar instanceof dg91) {
            dg91Var = (dg91) ibkVar;
            int i = dg91Var.f48761c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dg91Var.f48761c = i - Integer.MIN_VALUE;
            } else {
                dg91Var = new dg91(this, ibkVar);
            }
        } else {
            dg91Var = new dg91(this, ibkVar);
        }
        Object objM56315e = dg91Var.f48759a;
        int i2 = dg91Var.f48761c;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            dg91Var.f48761c = 1;
            objM56315e = m56315e(dg91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56315e);
        }
        Long lM74181K = qyg1.m74181K(((hv31) objM56315e).mo48712g(f122334j, -1L));
        if (lM74181K.longValue() == -1) {
            return null;
        }
        return lM74181K;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r6.f122342e.emit(r9, r0) == r4) goto L25;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m56319i(long j, ibk ibkVar) {
        eg91 eg91Var;
        if (ibkVar instanceof eg91) {
            eg91Var = (eg91) ibkVar;
            int i = eg91Var.f59284d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eg91Var.f59284d = i - Integer.MIN_VALUE;
            } else {
                eg91Var = new eg91(this, ibkVar);
            }
        } else {
            eg91Var = new eg91(this, ibkVar);
        }
        Object objM56315e = eg91Var.f59282b;
        int i2 = eg91Var.f59284d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            eg91Var.f59281a = j;
            eg91Var.f59284d = 1;
            objM56315e = m56315e(eg91Var);
            if (objM56315e != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            j = eg91Var.f59281a;
            bga.m29073P(objM56315e);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56315e);
        }
        return w2a1.f247311a;
        hv31 hv31Var = (hv31) objM56315e;
        fv31 fv31Var = f122337m;
        Set set = gbu.f78413a;
        Set setMo48707b = hv31Var.mo48707b(fv31Var, set);
        if (setMo48707b != null) {
            set = setMo48707b;
        }
        Set setM43734m1 = g6f.m43734m1(set);
        setM43734m1.add(String.valueOf(j));
        lv31 lv31VarEdit = hv31Var.edit();
        lv31VarEdit.m60052e(fv31Var, setM43734m1);
        lv31VarEdit.m60054g();
        List listM56311d = m56311d(hv31Var);
        eg91Var.f59281a = j;
        eg91Var.f59284d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m56320j(ibk ibkVar) {
        fg91 fg91Var;
        if (ibkVar instanceof fg91) {
            fg91Var = (fg91) ibkVar;
            int i = fg91Var.f69260c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fg91Var.f69260c = i - Integer.MIN_VALUE;
            } else {
                fg91Var = new fg91(this, ibkVar);
            }
        } else {
            fg91Var = new fg91(this, ibkVar);
        }
        Object objM56315e = fg91Var.f69258a;
        int i2 = fg91Var.f69260c;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            fg91Var.f69260c = 1;
            objM56315e = m56315e(fg91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56315e);
        }
        return qyg1.m74178H(((hv31) objM56315e).mo48713h(f122336l, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m56321k(boolean z, ibk ibkVar) {
        gg91 gg91Var;
        if (ibkVar instanceof gg91) {
            gg91Var = (gg91) ibkVar;
            int i = gg91Var.f79581d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gg91Var.f79581d = i - Integer.MIN_VALUE;
            } else {
                gg91Var = new gg91(this, ibkVar);
            }
        } else {
            gg91Var = new gg91(this, ibkVar);
        }
        Object objM56315e = gg91Var.f79579b;
        int i2 = gg91Var.f79581d;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            gg91Var.f79578a = z;
            gg91Var.f79581d = 1;
            objM56315e = m56315e(gg91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = gg91Var.f79578a;
            bga.m29073P(objM56315e);
        }
        lv31 lv31VarEdit = ((hv31) objM56315e).edit();
        lv31VarEdit.m60048a(f122336l, z);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m56322l(int i, ibk ibkVar) {
        hg91 hg91Var;
        if (ibkVar instanceof hg91) {
            hg91Var = (hg91) ibkVar;
            int i2 = hg91Var.f91097d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hg91Var.f91097d = i2 - Integer.MIN_VALUE;
            } else {
                hg91Var = new hg91(this, ibkVar);
            }
        } else {
            hg91Var = new hg91(this, ibkVar);
        }
        Object objM56315e = hg91Var.f91095b;
        int i3 = hg91Var.f91097d;
        if (i3 == 0) {
            bga.m29073P(objM56315e);
            hg91Var.f91094a = i;
            hg91Var.f91097d = 1;
            objM56315e = m56315e(hg91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = hg91Var.f91094a;
            bga.m29073P(objM56315e);
        }
        lv31 lv31VarEdit = ((hv31) objM56315e).edit();
        lv31VarEdit.m60049b(f122335k, i);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r7.f122341d.emit(r8, r0) == r4) goto L29;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m56323m(pg91 pg91Var, ibk ibkVar) {
        ig91 ig91Var;
        if (ibkVar instanceof ig91) {
            ig91Var = (ig91) ibkVar;
            int i = ig91Var.f101936d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ig91Var.f101936d = i - Integer.MIN_VALUE;
            } else {
                ig91Var = new ig91(this, ibkVar);
            }
        } else {
            ig91Var = new ig91(this, ibkVar);
        }
        Object objM56315e = ig91Var.f101934b;
        int i2 = ig91Var.f101936d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            ig91Var.f101933a = pg91Var;
            ig91Var.f101936d = 1;
            objM56315e = m56315e(ig91Var);
            if (objM56315e != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            pg91Var = ig91Var.f101933a;
            bga.m29073P(objM56315e);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM56315e);
        }
        return w2a1.f247311a;
        lv31 lv31VarEdit = ((hv31) objM56315e).edit();
        lv31VarEdit.m60048a(f122330f, pg91Var.m69871c());
        Long lM69870b = pg91Var.m69870b();
        lv31VarEdit.m60050c(f122331g, lM69870b != null ? lM69870b.longValue() : -1L);
        Integer numM69869a = pg91Var.m69869a();
        lv31VarEdit.m60049b(f122332h, numM69869a != null ? numM69869a.intValue() : -1);
        lv31VarEdit.m60048a(f122333i, pg91Var.m69872d());
        lv31VarEdit.m60054g();
        ig91Var.f101933a = null;
        ig91Var.f101936d = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m56324n(long j, ibk ibkVar) {
        jg91 jg91Var;
        if (ibkVar instanceof jg91) {
            jg91Var = (jg91) ibkVar;
            int i = jg91Var.f112118d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jg91Var.f112118d = i - Integer.MIN_VALUE;
            } else {
                jg91Var = new jg91(this, ibkVar);
            }
        } else {
            jg91Var = new jg91(this, ibkVar);
        }
        Object objM56315e = jg91Var.f112116b;
        int i2 = jg91Var.f112118d;
        if (i2 == 0) {
            bga.m29073P(objM56315e);
            jg91Var.f112115a = j;
            jg91Var.f112118d = 1;
            objM56315e = m56315e(jg91Var);
            Object obj = yuk.f276404a;
            if (objM56315e == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = jg91Var.f112115a;
            bga.m29073P(objM56315e);
        }
        lv31 lv31VarEdit = ((hv31) objM56315e).edit();
        lv31VarEdit.m60050c(f122334j, j);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }
}
