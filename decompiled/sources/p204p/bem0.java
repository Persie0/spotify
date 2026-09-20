package p204p;

import android.content.Context;
import com.google.protobuf.Duration;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$PageMatchItemData;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItem;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class bem0 implements ndm0 {

    /* JADX INFO: renamed from: f */
    public static final fv31 f26390f;

    /* JADX INFO: renamed from: g */
    public static final fv31 f26391g;

    /* JADX INFO: renamed from: h */
    public static final fv31 f26392h;

    /* JADX INFO: renamed from: i */
    public static final fv31 f26393i;

    /* JADX INFO: renamed from: j */
    public static final fv31 f26394j;

    /* JADX INFO: renamed from: a */
    public final Context f26395a;

    /* JADX INFO: renamed from: b */
    public final vnb f26396b;

    /* JADX INFO: renamed from: c */
    public final t4f f26397c;

    /* JADX INFO: renamed from: d */
    public final xre f26398d;

    /* JADX INFO: renamed from: e */
    public final xif0 f26399e;

    static {
        si5 si5Var = fv31.f73628b;
        f26390f = si5Var.m78183U("page-match-onboarding");
        f26391g = si5Var.m78183U("page-match-outbound-onboarding");
        f26392h = si5Var.m78183U("page-match-outbound-flow-completed");
        f26393i = si5Var.m78183U("page-match-gradient-event-number");
        f26394j = si5Var.m78183U("page-match-gradient-tap-timestamp");
    }

    public bem0(Context context, fiz fizVar, vnb vnbVar, t4f t4fVar, xre xreVar) {
        this.f26395a = context;
        this.f26396b = vnbVar;
        this.f26397c = t4fVar;
        this.f26398d = xreVar;
        this.f26399e = new xif0(26, fizVar, this);
    }

    /* JADX INFO: renamed from: a */
    public final Object m28947a(long j, String str, ibk ibkVar) {
        r4f r4fVarM6889s = CollectionPlatformItemsRequest.m6889s();
        r4fVarM6889s.m74750t(r5f.PAGE_MATCH);
        q4f q4fVarM6881s = CollectionPlatformItem.m6881s();
        q4fVarM6881s.m72158q(str);
        f4f f4fVarM6822v = CollectionItemdata$ItemData.m6822v();
        g4f g4fVarM6829q = CollectionItemdata$PageMatchItemData.m6829q();
        bks bksVarM1929s = Duration.m1929s();
        bksVarM1929s.m29723q(j);
        g4fVarM6829q.m43528m(bksVarM1929s);
        f4fVarM6822v.m40729m(g4fVarM6829q);
        q4fVarM6881s.m72157m(f4fVarM6822v);
        r4fVarM6889s.m74747q(q4fVarM6881s);
        Object objM96565n = zn91.m96565n(this.f26397c.m80060a((CollectionPlatformItemsRequest) r4fVarM6889s.build()).ignoreElement(), ibkVar);
        return objM96565n == yuk.f276404a ? objM96565n : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m28948b(ibk ibkVar) {
        wdm0 wdm0Var;
        if (ibkVar instanceof wdm0) {
            wdm0Var = (wdm0) ibkVar;
            int i = wdm0Var.f250311c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wdm0Var.f250311c = i - Integer.MIN_VALUE;
            } else {
                wdm0Var = new wdm0(this, ibkVar);
            }
        } else {
            wdm0Var = new wdm0(this, ibkVar);
        }
        Object objM86757v = wdm0Var.f250309a;
        int i2 = wdm0Var.f250311c;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            wdm0Var.f250311c = 1;
            objM86757v = vyf1.m86757v(this.f26399e, wdm0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86757v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86757v);
        }
        hv31 hv31Var = (hv31) objM86757v;
        if (hv31Var != null) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60048a(f26392h, true);
            lv31VarEdit.m60054g();
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m28949c(ibk ibkVar) {
        xdm0 xdm0Var;
        if (ibkVar instanceof xdm0) {
            xdm0Var = (xdm0) ibkVar;
            int i = xdm0Var.f260509c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xdm0Var.f260509c = i - Integer.MIN_VALUE;
            } else {
                xdm0Var = new xdm0(this, ibkVar);
            }
        } else {
            xdm0Var = new xdm0(this, ibkVar);
        }
        Object objM86757v = xdm0Var.f260507a;
        int i2 = xdm0Var.f260509c;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            xdm0Var.f260509c = 1;
            objM86757v = vyf1.m86757v(this.f26399e, xdm0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86757v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86757v);
        }
        hv31 hv31Var = (hv31) objM86757v;
        if (hv31Var != null) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60048a(f26390f, true);
            lv31VarEdit.m60054g();
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m28950d(ibk ibkVar) {
        ydm0 ydm0Var;
        if (ibkVar instanceof ydm0) {
            ydm0Var = (ydm0) ibkVar;
            int i = ydm0Var.f271787c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ydm0Var.f271787c = i - Integer.MIN_VALUE;
            } else {
                ydm0Var = new ydm0(this, ibkVar);
            }
        } else {
            ydm0Var = new ydm0(this, ibkVar);
        }
        Object objM86757v = ydm0Var.f271785a;
        int i2 = ydm0Var.f271787c;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            ydm0Var.f271787c = 1;
            objM86757v = vyf1.m86757v(this.f26399e, ydm0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86757v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86757v);
        }
        hv31 hv31Var = (hv31) objM86757v;
        if (hv31Var != null) {
            lv31 lv31VarEdit = hv31Var.edit();
            lv31VarEdit.m60048a(f26391g, true);
            lv31VarEdit.m60054g();
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m28951e(int i, ibk ibkVar) {
        zdm0 zdm0Var;
        if (ibkVar instanceof zdm0) {
            zdm0Var = (zdm0) ibkVar;
            int i2 = zdm0Var.f281769d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zdm0Var.f281769d = i2 - Integer.MIN_VALUE;
            } else {
                zdm0Var = new zdm0(this, ibkVar);
            }
        } else {
            zdm0Var = new zdm0(this, ibkVar);
        }
        Object objM86757v = zdm0Var.f281767b;
        int i3 = zdm0Var.f281769d;
        if (i3 == 0) {
            bga.m29073P(objM86757v);
            zdm0Var.f281766a = i;
            zdm0Var.f281769d = 1;
            objM86757v = vyf1.m86757v(this.f26399e, zdm0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86757v == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = zdm0Var.f281766a;
            bga.m29073P(objM86757v);
        }
        hv31 hv31Var = (hv31) objM86757v;
        w2a1 w2a1Var = w2a1.f247311a;
        if (hv31Var != null) {
            lv31 lv31VarEdit = hv31Var.edit();
            ((wy3) this.f26398d).getClass();
            lv31VarEdit.m60050c(f26394j, System.currentTimeMillis());
            if (i > 0) {
                lv31VarEdit.m60049b(f26393i, i);
            }
            lv31VarEdit.m60054g();
        }
        return w2a1Var;
    }
}
