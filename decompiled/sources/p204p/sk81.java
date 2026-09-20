package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes10.dex */
public final class sk81 {

    /* JADX INFO: renamed from: a */
    public final epx f210058a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m78367a(String str, ibk ibkVar) {
        cob1 cob1Var;
        pl6 pl6Var;
        if (ibkVar instanceof cob1) {
            cob1Var = (cob1) ibkVar;
            int i = cob1Var.f40224c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cob1Var.f40224c = i - Integer.MIN_VALUE;
            } else {
                cob1Var = new cob1(this, ibkVar);
            }
        } else {
            cob1Var = new cob1(this, ibkVar);
        }
        Object objM96571q = cob1Var.f40222a;
        int i2 = cob1Var.f40224c;
        if (i2 == 0) {
            bga.m29073P(objM96571q);
            Observable map = ((jpx) this.f210058a).m53978b(new C1668ai("share-video-associations", false, (gh00) new mv81(str, 11))).filter(hkr0.f92484V0).map(new nch1(str, 13));
            cob1Var.f40224c = 1;
            objM96571q = zn91.m96571q(map, 1, null, cob1Var);
            yuk yukVar = yuk.f276404a;
            if (objM96571q == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96571q);
        }
        bob1 bob1Var = (bob1) ((fqx) objM96571q).f72301b;
        if (bob1Var == null || (pl6Var = (pl6) g6f.m43745s0(bob1Var.f29064a)) == null) {
            return null;
        }
        return pl6Var.f178649a;
    }
}
