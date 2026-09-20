package p204p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class vq2 {

    /* JADX INFO: renamed from: a */
    public final Flowable f243859a;

    /* JADX INFO: renamed from: b */
    public final Single f243860b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f243861c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f243862d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public volatile PlayerState f243863e;

    public vq2(Flowable flowable, Single single, xre xreVar) {
        this.f243859a = flowable;
        this.f243860b = single;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m86181a(vq2 vq2Var, PlayerState playerState, ibk ibkVar) {
        uq2 uq2Var;
        boolean zContains;
        int i;
        boolean andSet;
        int i2;
        boolean z;
        long jCurrentTimeMillis;
        AtomicBoolean atomicBoolean = vq2Var.f243862d;
        if (ibkVar instanceof uq2) {
            uq2Var = (uq2) ibkVar;
            int i3 = uq2Var.f232911f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uq2Var.f232911f = i3 - Integer.MIN_VALUE;
            } else {
                uq2Var = new uq2(vq2Var, ibkVar);
            }
        } else {
            uq2Var = new uq2(vq2Var, ibkVar);
        }
        Object obj = uq2Var.f232909d;
        int i4 = uq2Var.f232911f;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i4 == 0) {
            bga.m29073P(obj);
            zContains = htc0.m48577a().contains(playerState.playOrigin().featureIdentifier());
            i = (zContains && playerState.isPlaying() && !playerState.isPaused()) ? 1 : 0;
            if (i != 0) {
                atomicBoolean.set(true);
                uq2Var.f232906a = zContains;
                uq2Var.f232908c = i;
                uq2Var.f232911f = 1;
                if (vq2Var.m86183c(uq2Var) == obj2) {
                    return obj2;
                }
                return w2a1Var;
            }
            andSet = atomicBoolean.getAndSet(false);
            if (!zContains) {
                uq2Var.f232906a = zContains;
                uq2Var.f232908c = i;
                uq2Var.f232907b = andSet;
                uq2Var.f232911f = 2;
                if (vq2Var.m86183c(uq2Var) != obj2) {
                    return w2a1Var;
                }
            } else if (andSet) {
                jCurrentTimeMillis = System.currentTimeMillis();
                uq2Var.f232906a = zContains;
                uq2Var.f232908c = i;
                uq2Var.f232907b = andSet;
                uq2Var.f232911f = 4;
                if (vq2Var.m86186f(jCurrentTimeMillis, uq2Var) != obj2) {
                    return w2a1Var;
                }
            } else {
                uq2Var.f232906a = zContains;
                uq2Var.f232908c = i;
                uq2Var.f232907b = andSet;
                uq2Var.f232911f = 3;
                Object objM86184d = vq2Var.m86184d(uq2Var);
                if (objM86184d != obj2) {
                    i2 = i;
                    z = andSet;
                    obj = objM86184d;
                }
            }
            return obj2;
        }
        if (i4 == 1) {
            bga.m29073P(obj);
            return w2a1Var;
        }
        if (i4 == 2) {
            bga.m29073P(obj);
            return w2a1Var;
        }
        if (i4 != 3) {
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        z = uq2Var.f232907b;
        i2 = uq2Var.f232908c;
        zContains = uq2Var.f232906a;
        bga.m29073P(obj);
        if (((Number) obj).longValue() <= 0) {
            andSet = z;
            i = i2;
            jCurrentTimeMillis = System.currentTimeMillis();
            uq2Var.f232906a = zContains;
            uq2Var.f232908c = i;
            uq2Var.f232907b = andSet;
            uq2Var.f232911f = 4;
            if (vq2Var.m86186f(jCurrentTimeMillis, uq2Var) != obj2) {
                return obj2;
            }
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m86182b(ibk ibkVar) {
        qq2 qq2Var;
        PlayerState playerState;
        if (ibkVar instanceof qq2) {
            qq2Var = (qq2) ibkVar;
            int i = qq2Var.f191434d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qq2Var.f191434d = i - Integer.MIN_VALUE;
            } else {
                qq2Var = new qq2(this, ibkVar);
            }
        } else {
            qq2Var = new qq2(this, ibkVar);
        }
        Object obj = qq2Var.f191432b;
        Object obj2 = yuk.f276404a;
        int i2 = qq2Var.f191434d;
        if (i2 == 0) {
            bga.m29073P(obj);
            PlayerState playerState2 = this.f243863e;
            if (playerState2 == null) {
                return null;
            }
            if (!htc0.m48577a().contains(playerState2.playOrigin().featureIdentifier())) {
                return nq2.f157106a;
            }
            if (playerState2.isPlaying() && !playerState2.isPaused()) {
                return nq2.f157107b;
            }
            qq2Var.f191431a = playerState2;
            qq2Var.f191434d = 1;
            Object objM86184d = m86184d(qq2Var);
            if (objM86184d == obj2) {
                return obj2;
            }
            playerState = playerState2;
            obj = objM86184d;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            playerState = qq2Var.f191431a;
            bga.m29073P(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue > 0) {
            return new oq2(jLongValue);
        }
        long jTimestamp = playerState.timestamp();
        if (jTimestamp > 0) {
            return new oq2(jTimestamp);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m86183c(ibk ibkVar) {
        rq2 rq2Var;
        if (ibkVar instanceof rq2) {
            rq2Var = (rq2) ibkVar;
            int i = rq2Var.f201721c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rq2Var.f201721c = i - Integer.MIN_VALUE;
            } else {
                rq2Var = new rq2(this, ibkVar);
            }
        } else {
            rq2Var = new rq2(this, ibkVar);
        }
        Object objM96567o = rq2Var.f201719a;
        int i2 = rq2Var.f201721c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            rq2Var.f201721c = 1;
            objM96567o = zn91.m96567o(this.f243860b, rq2Var);
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
        lv31VarEdit.m60053f(wq2.m88731a());
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m86184d(ibk ibkVar) {
        sq2 sq2Var;
        if (ibkVar instanceof sq2) {
            sq2Var = (sq2) ibkVar;
            int i = sq2Var.f212989c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sq2Var.f212989c = i - Integer.MIN_VALUE;
            } else {
                sq2Var = new sq2(this, ibkVar);
            }
        } else {
            sq2Var = new sq2(this, ibkVar);
        }
        Object objM96567o = sq2Var.f212987a;
        int i2 = sq2Var.f212989c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            sq2Var.f212989c = 1;
            objM96567o = zn91.m96567o(this.f243860b, sq2Var);
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
        return qyg1.m74181K(((hv31) objM96567o).mo48712g(wq2.m88731a(), 0L));
    }

    /* JADX INFO: renamed from: e */
    public final Boolean m86185e(String str) {
        if (wl51.m88460J0(str)) {
            return qyg1.m74178H(false);
        }
        PlayerState playerState = this.f243863e;
        if (playerState == null) {
            return qyg1.m74178H(false);
        }
        if (!htc0.m48577a().contains(playerState.playOrigin().featureIdentifier())) {
            return qyg1.m74178H(false);
        }
        String str2 = (String) playerState.contextMetadata().get("martini_conversation_id");
        if (str2 == null || wl51.m88460J0(str2)) {
            str2 = null;
        }
        return qyg1.m74178H(wj50.m88271j(str2, str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m86186f(long j, ibk ibkVar) {
        tq2 tq2Var;
        if (ibkVar instanceof tq2) {
            tq2Var = (tq2) ibkVar;
            int i = tq2Var.f222658d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tq2Var.f222658d = i - Integer.MIN_VALUE;
            } else {
                tq2Var = new tq2(this, ibkVar);
            }
        } else {
            tq2Var = new tq2(this, ibkVar);
        }
        Object objM96567o = tq2Var.f222656b;
        int i2 = tq2Var.f222658d;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            tq2Var.f222655a = j;
            tq2Var.f222658d = 1;
            objM96567o = zn91.m96567o(this.f243860b, tq2Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = tq2Var.f222655a;
            bga.m29073P(objM96567o);
        }
        lv31 lv31VarEdit = ((hv31) objM96567o).edit();
        lv31VarEdit.m60050c(wq2.m88731a(), j);
        lv31VarEdit.m60054g();
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public final void m86187g(xuk xukVar) {
        if (this.f243861c.compareAndSet(false, true)) {
            x0h1.m89578u(xukVar, null, 0, new C1819em(this, null, 22), 3);
        }
    }
}
