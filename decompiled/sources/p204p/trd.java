package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class trd implements nrd {

    /* JADX INFO: renamed from: d */
    public static final fv31 f223044d = fv31.f73628b.m78183U("martini_chat_session_last_user_takeover_at_ms");

    /* JADX INFO: renamed from: a */
    public final Flowable f223045a;

    /* JADX INFO: renamed from: b */
    public final Single f223046b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f223047c = new AtomicBoolean(false);

    public trd(Flowable flowable, Single single, xre xreVar) {
        this.f223045a = flowable;
        this.f223046b = single;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m81344a(trd trdVar, ibk ibkVar) {
        qrd qrdVar;
        if (ibkVar instanceof qrd) {
            qrdVar = (qrd) ibkVar;
            int i = qrdVar.f191820c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qrdVar.f191820c = i - Integer.MIN_VALUE;
            } else {
                qrdVar = new qrd(trdVar, ibkVar);
            }
        } else {
            qrdVar = new qrd(trdVar, ibkVar);
        }
        Object objM96567o = qrdVar.f191818a;
        int i2 = qrdVar.f191820c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            Single single = trdVar.f223046b;
            qrdVar.f191820c = 1;
            objM96567o = zn91.m96567o(single, qrdVar);
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
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60050c(f223044d, System.currentTimeMillis());
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m81345b(ibk ibkVar) {
        prd prdVar;
        if (ibkVar instanceof prd) {
            prdVar = (prd) ibkVar;
            int i = prdVar.f180555c;
            if ((i & Integer.MIN_VALUE) != 0) {
                prdVar.f180555c = i - Integer.MIN_VALUE;
            } else {
                prdVar = new prd(this, ibkVar);
            }
        } else {
            prdVar = new prd(this, ibkVar);
        }
        Object objM96567o = prdVar.f180553a;
        int i2 = prdVar.f180555c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            prdVar.f180555c = 1;
            objM96567o = zn91.m96567o(this.f223046b, prdVar);
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
        return qyg1.m74181K(((hv31) objM96567o).mo48712g(f223044d, 0L));
    }
}
