package p204p;

import android.content.Context;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class hi91 implements ai91 {

    /* JADX INFO: renamed from: e */
    public static final fv31 f91751e;

    /* JADX INFO: renamed from: f */
    public static final fv31 f91752f;

    /* JADX INFO: renamed from: g */
    public static final fv31 f91753g;

    /* JADX INFO: renamed from: h */
    public static final fv31 f91754h;

    /* JADX INFO: renamed from: i */
    public static final fv31 f91755i;

    /* JADX INFO: renamed from: j */
    public static final fv31 f91756j;

    /* JADX INFO: renamed from: a */
    public final vnb f91757a;

    /* JADX INFO: renamed from: b */
    public final Context f91758b;

    /* JADX INFO: renamed from: c */
    public final FlowableElementAtSingle f91759c;

    /* JADX INFO: renamed from: d */
    public final hb11 f91760d = j0g1.m52092t(0, 4, 0, 4);

    static {
        si5 si5Var = fv31.f73628b;
        f91751e = si5Var.m78183U("TrialSignifierDisplayStorage.downloads_snackbar");
        f91752f = si5Var.m78183U("TrialSignifierDisplayStorage.offline_banner");
        f91753g = si5Var.m78183U("TrialSignifierDisplayStorage.audio_quality_banner");
        f91754h = si5Var.m78183U("TrialSignifierDisplayStorage.jam_banner");
        f91755i = si5Var.m78183U("TrialSignifierDisplayStorage.queue_banner");
        f91756j = si5Var.m78183U("TrialSignifierDisplayStorage.shuffle_snackbar");
    }

    public hi91(vnb vnbVar, Context context, FlowableElementAtSingle flowableElementAtSingle) {
        this.f91757a = vnbVar;
        this.f91758b = context;
        this.f91759c = flowableElementAtSingle;
    }

    /* JADX INFO: renamed from: b */
    public static fv31 m47627b(ji91 ji91Var) {
        int iOrdinal = ji91Var.ordinal();
        if (iOrdinal == 0) {
            return f91751e;
        }
        if (iOrdinal == 1) {
            return f91752f;
        }
        if (iOrdinal == 2) {
            return f91753g;
        }
        if (iOrdinal == 3) {
            return f91754h;
        }
        if (iOrdinal == 4) {
            return f91755i;
        }
        if (iOrdinal == 5) {
            return f91756j;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m47628a(ji91 ji91Var, ibk ibkVar) {
        bi91 bi91Var;
        fv31 fv31VarM47627b;
        if (ibkVar instanceof bi91) {
            bi91Var = (bi91) ibkVar;
            int i = bi91Var.f27371d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bi91Var.f27371d = i - Integer.MIN_VALUE;
            } else {
                bi91Var = new bi91(this, ibkVar);
            }
        } else {
            bi91Var = new bi91(this, ibkVar);
        }
        Object objM47629c = bi91Var.f27369b;
        int i2 = bi91Var.f27371d;
        if (i2 == 0) {
            bga.m29073P(objM47629c);
            fv31VarM47627b = m47627b(ji91Var);
            bi91Var.f27368a = fv31VarM47627b;
            bi91Var.f27371d = 1;
            objM47629c = m47629c(bi91Var);
            Object obj = yuk.f276404a;
            if (objM47629c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fv31VarM47627b = bi91Var.f27368a;
            bga.m29073P(objM47629c);
        }
        return qyg1.m74178H(!((hv31) objM47629c).mo48713h(fv31VarM47627b, false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m47629c(ibk ibkVar) {
        fi91 fi91Var;
        if (ibkVar instanceof fi91) {
            fi91Var = (fi91) ibkVar;
            int i = fi91Var.f69817c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fi91Var.f69817c = i - Integer.MIN_VALUE;
            } else {
                fi91Var = new fi91(this, ibkVar);
            }
        } else {
            fi91Var = new fi91(this, ibkVar);
        }
        Object objM96567o = fi91Var.f69815a;
        int i2 = fi91Var.f69817c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            fi91Var.f69817c = 1;
            objM96567o = zn91.m96567o(this.f91759c, fi91Var);
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
        return this.f91757a.mo35842b(this.f91758b, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r6.f91760d.emit(r1, r0) == r4) goto L22;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47630d(ji91 ji91Var, ibk ibkVar) {
        gi91 gi91Var;
        ji91 ji91Var2;
        fv31 fv31Var;
        if (ibkVar instanceof gi91) {
            gi91Var = (gi91) ibkVar;
            int i = gi91Var.f80107e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gi91Var.f80107e = i - Integer.MIN_VALUE;
            } else {
                gi91Var = new gi91(this, ibkVar);
            }
        } else {
            gi91Var = new gi91(this, ibkVar);
        }
        Object obj = gi91Var.f80105c;
        int i2 = gi91Var.f80107e;
        Object obj2 = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                fv31Var = gi91Var.f80104b;
                ji91Var2 = gi91Var.f80103a;
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj);
        fv31 fv31VarM47627b = m47627b(ji91Var);
        gi91Var.f80103a = ji91Var;
        gi91Var.f80104b = fv31VarM47627b;
        gi91Var.f80107e = 1;
        Object objM47629c = m47629c(gi91Var);
        if (objM47629c != obj2) {
            ji91Var2 = ji91Var;
            fv31Var = fv31VarM47627b;
            obj = objM47629c;
        }
        return obj2;
        lv31 lv31VarEdit = ((hv31) obj).edit();
        lv31VarEdit.m60048a(fv31Var, true);
        lv31VarEdit.m60054g();
        gi91Var.f80103a = null;
        gi91Var.f80104b = null;
        gi91Var.f80107e = 2;
    }
}
