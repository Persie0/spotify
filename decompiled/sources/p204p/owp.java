package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class owp implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f170750a;

    /* JADX INFO: renamed from: b */
    public final Object f170751b;

    /* JADX INFO: renamed from: c */
    public final Object f170752c;

    /* JADX INFO: renamed from: d */
    public final Object f170753d;

    /* JADX INFO: renamed from: e */
    public final Object f170754e;

    /* JADX INFO: renamed from: f */
    public final Object f170755f;

    public /* synthetic */ owp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f170750a = i;
        this.f170751b = obj;
        this.f170752c = obj2;
        this.f170753d = obj3;
        this.f170754e = obj4;
        this.f170755f = obj5;
    }

    /* JADX INFO: renamed from: a */
    public static void m68178a(o2x0 o2x0Var, mhn0 mhn0Var) {
        if (o2x0Var.f161171a.f149852O0) {
            return;
        }
        Logger.m3966b("[Puffin] PushCrossDeviceFilterUseCase error response " + o2x0Var, new Object[0]);
        mhn0Var.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public Object m68179e(String str, fbk fbkVar) {
        xdt0 xdt0Var;
        String str2;
        int i;
        if (fbkVar instanceof xdt0) {
            xdt0Var = (xdt0) fbkVar;
            int i2 = xdt0Var.f260537e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xdt0Var.f260537e = i2 - Integer.MIN_VALUE;
            } else {
                xdt0Var = new xdt0(this, fbkVar);
            }
        } else {
            xdt0Var = new xdt0(this, fbkVar);
        }
        xdt0 xdt0Var2 = xdt0Var;
        Object obj = xdt0Var2.f260535c;
        int i3 = xdt0Var2.f260537e;
        Object obj2 = w2a1.f247311a;
        Object obj3 = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj);
            if (((n8t0) this.f170754e).m63854a()) {
                int iMo48717l = ((pul) this.f170755f).f181497a.mo48717l(qul.f192739a, 0);
                SingleSource singleSource = (SingleSource) ((ni00) this.f170752c).invoke();
                xdt0Var2.f260533a = str;
                xdt0Var2.f260534b = iMo48717l;
                xdt0Var2.f260537e = 1;
                Object objM96567o = zn91.m96567o(singleSource, xdt0Var2);
                if (objM96567o != obj3) {
                    str2 = str;
                    i = iMo48717l;
                    obj = objM96567o;
                }
                return obj3;
            }
            return obj2;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                bga.m29073P(obj);
                return obj2;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj2;
        }
        i = xdt0Var2.f260534b;
        String str3 = xdt0Var2.f260533a;
        bga.m29073P(obj);
        str2 = str3;
        ta0 ta0Var = (ta0) obj;
        ydt0 ydt0Var = new ydt0(this, i, 1);
        ydt0 ydt0Var2 = new ydt0(this, i, 0);
        if (ta0Var instanceof oa0) {
            xdt0Var2.f260533a = null;
            xdt0Var2.f260534b = i;
            xdt0Var2.f260537e = 2;
            Object objM68182i = m68182i("BLUETOOTH", ((oa0) ta0Var).f163171a.f93686a, str2, ydt0Var, ydt0Var2, xdt0Var2);
            if (objM68182i != obj3) {
                objM68182i = obj2;
            }
            if (objM68182i == obj3) {
                return obj3;
            }
            return obj2;
        }
        if (ta0Var instanceof sa0) {
            xdt0Var2.f260533a = null;
            xdt0Var2.f260534b = i;
            xdt0Var2.f260537e = 3;
            if (m68183j(str2, ydt0Var, ydt0Var2, xdt0Var2) == obj3) {
                return obj3;
            }
        } else if (!ta0Var.equals(pa0.f175333a) && !ta0Var.equals(qa0.f186702a)) {
            throw new NoWhenBranchMatchedException();
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m68180f(d850 d850Var, fbk fbkVar) {
        nwp nwpVar;
        if (fbkVar instanceof nwp) {
            nwpVar = (nwp) fbkVar;
            int i = nwpVar.f159256c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nwpVar.f159256c = i - Integer.MIN_VALUE;
            } else {
                nwpVar = new nwp(this, fbkVar);
            }
        } else {
            nwpVar = new nwp(this, fbkVar);
        }
        Object obj = nwpVar.f159254a;
        int i2 = nwpVar.f159256c;
        if (i2 == 0) {
            bga.m29073P(obj);
            nwpVar.f159256c = 1;
            Object objM68181g = m68181g(d850Var, nwpVar);
            Object obj2 = yuk.f276404a;
            if (objM68181g == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public Object m68181g(d850 d850Var, ibk ibkVar) {
        fbk fbkVar = null;
        if (((hqe1) this.f170753d).m48259r()) {
            qqw qqwVar = (qqw) this.f170752c;
            qqwVar.f191668c.mo46963e();
            di41 di41Var = qqwVar.f191669d;
            if (di41Var == null || !di41Var.isActive()) {
                qqwVar.f191669d = x0h1.m89578u(qqwVar.f191667b, null, 0, new t8s(qqwVar, fbkVar, 21), 3);
            }
            ((dit0) this.f170754e).mo28403a();
        }
        Object objM89557A = x0h1.m89557A((luk) this.f170755f, new qhk(this, d850Var, fbkVar, 23), ibkVar);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m68182i(String str, String str2, String str3, eh00 eh00Var, eh00 eh00Var2, ibk ibkVar) {
        zdt0 zdt0Var;
        if (ibkVar instanceof zdt0) {
            zdt0Var = (zdt0) ibkVar;
            int i = zdt0Var.f281799d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdt0Var.f281799d = i - Integer.MIN_VALUE;
            } else {
                zdt0Var = new zdt0(this, ibkVar);
            }
        } else {
            zdt0Var = new zdt0(this, ibkVar);
        }
        Object objM75178a = zdt0Var.f281797b;
        int i2 = zdt0Var.f281799d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM75178a);
                eh00Var.invoke();
                rbt0 rbt0Var = (rbt0) this.f170751b;
                zdt0Var.f281796a = eh00Var2;
                zdt0Var.f281799d = 1;
                objM75178a = rbt0Var.m75178a(str, str2, str3, zdt0Var);
                yuk yukVar = yuk.f276404a;
                if (objM75178a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eh00Var2 = zdt0Var.f281796a;
                bga.m29073P(objM75178a);
            }
            m68178a((o2x0) objM75178a, new mhn0(22, eh00Var2));
        } catch (IOException unused) {
            eh00Var2.invoke();
            Logger.m3966b("[Puffin] PushCrossDeviceCrossDeviceFilterUseCaseImpl IOException " + this, new Object[0]);
        } catch (Throwable th) {
            eh00Var2.invoke();
            throw th;
        }
        return w2a1.f247311a;
    }

    @Override // p204p.th00
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f170750a) {
            case 0:
                return m68180f((d850) obj, (fbk) obj2);
            default:
                return m68179e((String) obj, (fbk) obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r13 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (m68182i("WIRED", r3, r4, r5, r6, r7) == r8) goto L27;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m68183j(String str, ydt0 ydt0Var, ydt0 ydt0Var2, ibk ibkVar) {
        aet0 aet0Var;
        String str2;
        if (ibkVar instanceof aet0) {
            aet0Var = (aet0) ibkVar;
            int i = aet0Var.f14957f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aet0Var.f14957f = i - Integer.MIN_VALUE;
            } else {
                aet0Var = new aet0(this, ibkVar);
            }
        } else {
            aet0Var = new aet0(this, ibkVar);
        }
        aet0 aet0Var2 = aet0Var;
        Object objM96567o = aet0Var2.f14955d;
        int i2 = aet0Var2.f14957f;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                ydt0Var2 = aet0Var2.f14954c;
                ydt0Var = aet0Var2.f14953b;
                str = aet0Var2.f14952a;
                bga.m29073P(objM96567o);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM96567o);
        if (str != null) {
            Single singleM72253g = ((q6u) ((mqr) this.f170753d).f146344c).m72253g(str);
            aet0Var2.f14952a = str;
            aet0Var2.f14953b = ydt0Var;
            aet0Var2.f14954c = ydt0Var2;
            aet0Var2.f14957f = 1;
            objM96567o = zn91.m96567o(singleM72253g, aet0Var2);
        } else {
            str2 = "GENERIC";
            String str3 = str;
            eh00 eh00Var = ydt0Var;
            eh00 eh00Var2 = ydt0Var2;
            String str4 = str2;
            aet0Var2.f14952a = null;
            aet0Var2.f14953b = null;
            aet0Var2.f14954c = null;
            aet0Var2.f14957f = 2;
        }
        return obj;
        str2 = ((r951) ((m951) objM96567o)).f196919e;
        String str5 = str;
        eh00 eh00Var3 = ydt0Var;
        eh00 eh00Var4 = ydt0Var2;
        String str6 = str2;
        aet0Var2.f14952a = null;
        aet0Var2.f14953b = null;
        aet0Var2.f14954c = null;
        aet0Var2.f14957f = 2;
    }
}
