package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;

/* JADX INFO: loaded from: classes2.dex */
public final class yha1 implements rha1 {

    /* JADX INFO: renamed from: e */
    public static final fv31 f272798e;

    /* JADX INFO: renamed from: f */
    public static final fv31 f272799f;

    /* JADX INFO: renamed from: g */
    public static final fv31 f272800g;

    /* JADX INFO: renamed from: a */
    public final FlowableElementAtSingle f272801a;

    /* JADX INFO: renamed from: b */
    public final wb11 f272802b;

    /* JADX INFO: renamed from: c */
    public final Context f272803c;

    /* JADX INFO: renamed from: d */
    public final xre f272804d;

    static {
        si5 si5Var = fv31.f73628b;
        f272798e = si5Var.m78183U("UpsellOfferStorageImpl.CTA_TEXT_KEY");
        f272799f = si5Var.m78183U("UpsellOfferStorageImpl.CTA_EXPIRATION_KEY");
        f272800g = si5Var.m78183U("UpsellOfferStorageImpl.CTA_RENEW_AFTER_KEY");
    }

    public yha1(FlowableElementAtSingle flowableElementAtSingle, wb11 wb11Var, Context context, xre xreVar) {
        this.f272801a = flowableElementAtSingle;
        this.f272802b = wb11Var;
        this.f272803c = context;
        this.f272804d = xreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m93626a(ibk ibkVar) {
        sha1 sha1Var;
        if (ibkVar instanceof sha1) {
            sha1Var = (sha1) ibkVar;
            int i = sha1Var.f209155c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sha1Var.f209155c = i - Integer.MIN_VALUE;
            } else {
                sha1Var = new sha1(this, ibkVar);
            }
        } else {
            sha1Var = new sha1(this, ibkVar);
        }
        Object objM93629d = sha1Var.f209153a;
        int i2 = sha1Var.f209155c;
        if (i2 == 0) {
            bga.m29073P(objM93629d);
            sha1Var.f209155c = 1;
            objM93629d = m93629d(sha1Var);
            Object obj = yuk.f276404a;
            if (objM93629d == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93629d);
        }
        lv31 lv31VarEdit = ((hv31) objM93629d).edit();
        lv31VarEdit.m60053f(f272799f);
        lv31VarEdit.m60053f(f272798e);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m93627b(ibk ibkVar) {
        tha1 tha1Var;
        if (ibkVar instanceof tha1) {
            tha1Var = (tha1) ibkVar;
            int i = tha1Var.f220384c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tha1Var.f220384c = i - Integer.MIN_VALUE;
            } else {
                tha1Var = new tha1(this, ibkVar);
            }
        } else {
            tha1Var = new tha1(this, ibkVar);
        }
        Object objM93629d = tha1Var.f220382a;
        int i2 = tha1Var.f220384c;
        if (i2 == 0) {
            bga.m29073P(objM93629d);
            tha1Var.f220384c = 1;
            objM93629d = m93629d(tha1Var);
            Object obj = yuk.f276404a;
            if (objM93629d == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93629d);
        }
        hv31 hv31Var = (hv31) objM93629d;
        long jMo48712g = hv31Var.mo48712g(f272799f, -1L);
        String strMo48710e = hv31Var.mo48710e(f272798e, null);
        if (strMo48710e != null && strMo48710e.length() != 0) {
            if (jMo48712g != -1) {
                ((wy3) this.f272804d).getClass();
                if (jMo48712g <= System.currentTimeMillis()) {
                }
            }
            return strMo48710e;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m93628c(ibk ibkVar) {
        uha1 uha1Var;
        if (ibkVar instanceof uha1) {
            uha1Var = (uha1) ibkVar;
            int i = uha1Var.f230403c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uha1Var.f230403c = i - Integer.MIN_VALUE;
            } else {
                uha1Var = new uha1(this, ibkVar);
            }
        } else {
            uha1Var = new uha1(this, ibkVar);
        }
        Object objM93629d = uha1Var.f230401a;
        int i2 = uha1Var.f230403c;
        if (i2 == 0) {
            bga.m29073P(objM93629d);
            uha1Var.f230403c = 1;
            objM93629d = m93629d(uha1Var);
            Object obj = yuk.f276404a;
            if (objM93629d == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM93629d);
        }
        return qyg1.m74181K(((hv31) objM93629d).mo48712g(f272800g, -1L));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m93629d(ibk ibkVar) {
        vha1 vha1Var;
        if (ibkVar instanceof vha1) {
            vha1Var = (vha1) ibkVar;
            int i = vha1Var.f241454c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vha1Var.f241454c = i - Integer.MIN_VALUE;
            } else {
                vha1Var = new vha1(this, ibkVar);
            }
        } else {
            vha1Var = new vha1(this, ibkVar);
        }
        Object obj = vha1Var.f241452a;
        int i2 = vha1Var.f241454c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        SingleSource map = this.f272801a.map(new vaa1(this, 1));
        vha1Var.f241454c = 1;
        Object objM96567o = zn91.m96567o(map, vha1Var);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m93630e(String str, Long l, ibk ibkVar) {
        wha1 wha1Var;
        long jLongValue;
        Object objM93629d;
        if (ibkVar instanceof wha1) {
            wha1Var = (wha1) ibkVar;
            int i = wha1Var.f251298e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wha1Var.f251298e = i - Integer.MIN_VALUE;
            } else {
                wha1Var = new wha1(this, ibkVar);
            }
        } else {
            wha1Var = new wha1(this, ibkVar);
        }
        Object obj = wha1Var.f251296c;
        int i2 = wha1Var.f251298e;
        if (i2 == 0) {
            bga.m29073P(obj);
            jLongValue = (l == null || l.longValue() <= 0) ? -1L : l.longValue();
            wha1Var.f251294a = str;
            wha1Var.f251295b = jLongValue;
            wha1Var.f251298e = 1;
            objM93629d = m93629d(wha1Var);
            Object obj2 = yuk.f276404a;
            if (objM93629d == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = wha1Var.f251295b;
            String str2 = wha1Var.f251294a;
            bga.m29073P(obj);
            objM93629d = obj;
            jLongValue = j;
            str = str2;
        }
        lv31 lv31VarEdit = ((hv31) objM93629d).edit();
        lv31VarEdit.m60051d(f272798e, str);
        lv31VarEdit.m60050c(f272799f, jLongValue);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m93631f(long j, ibk ibkVar) {
        xha1 xha1Var;
        if (ibkVar instanceof xha1) {
            xha1Var = (xha1) ibkVar;
            int i = xha1Var.f261504d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xha1Var.f261504d = i - Integer.MIN_VALUE;
            } else {
                xha1Var = new xha1(this, ibkVar);
            }
        } else {
            xha1Var = new xha1(this, ibkVar);
        }
        Object objM93629d = xha1Var.f261502b;
        int i2 = xha1Var.f261504d;
        if (i2 == 0) {
            bga.m29073P(objM93629d);
            xha1Var.f261501a = j;
            xha1Var.f261504d = 1;
            objM93629d = m93629d(xha1Var);
            Object obj = yuk.f276404a;
            if (objM93629d == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = xha1Var.f261501a;
            bga.m29073P(objM93629d);
        }
        lv31 lv31VarEdit = ((hv31) objM93629d).edit();
        lv31VarEdit.m60050c(f272800g, j);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }
}
