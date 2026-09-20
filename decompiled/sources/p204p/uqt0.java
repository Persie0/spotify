package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class uqt0 implements jt50 {

    /* JADX INFO: renamed from: a */
    public final m600 f233109a;

    /* JADX INFO: renamed from: b */
    public final psp f233110b;

    /* JADX INFO: renamed from: c */
    public final nbm0 f233111c;

    public uqt0(m600 m600Var, psp pspVar, nbm0 nbm0Var) {
        this.f233109a = m600Var;
        this.f233110b = pspVar;
        this.f233111c = nbm0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public final Object m83814d(int i, nw80 nw80Var, ibk ibkVar) {
        tqt0 tqt0Var;
        if (ibkVar instanceof tqt0) {
            tqt0Var = (tqt0) ibkVar;
            int i2 = tqt0Var.f222886c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tqt0Var.f222886c = i2 - Integer.MIN_VALUE;
            } else {
                tqt0Var = new tqt0(this, ibkVar);
            }
        } else {
            tqt0Var = new tqt0(this, ibkVar);
        }
        Object obj = tqt0Var.f222884a;
        int i3 = tqt0Var.f222886c;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                String str = nw80Var.f159049c;
                m600 m600Var = this.f233109a;
                kv91 kv91Var = (kv91) m600Var.f140329b;
                st91 st91Var = (st91) m600Var.f140330c;
                Integer numValueOf = Integer.valueOf(i);
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-playlist-entity-item-list-item";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                yt91VarM50626j.f276049c = numValueOf;
                yt91VarM50626j.f276050d = str;
                zt91 zt91VarM94607a = yt91VarM50626j.m94607a();
                dv91 dv91Var = new dv91("swipe", 1);
                String string = str.toString();
                String str2 = "";
                if (string == null) {
                    string = "";
                }
                z650 z650Var = kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", string)), zt91VarM94607a, st91Var, System.currentTimeMillis()), null).f46380a;
                psp pspVar = this.f233110b;
                String str3 = nw80Var.f159049c;
                kbm0 kbm0Var = this.f233111c.get();
                String str4 = kbm0Var != null ? kbm0Var.f121231a : null;
                if (str4 != null) {
                    str2 = str4;
                }
                CompletableObserveOn completableObserveOnM70885b = pspVar.m70885b(str3, str2, 2, z650Var.f279709a);
                tqt0Var.f222886c = 1;
                Object objM96565n = zn91.m96565n(completableObserveOnM70885b, tqt0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "QueueInteractionImpl failed to swap.", new Object[0]);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.jt50
    /* JADX INFO: renamed from: i */
    public final Enum mo33214i(vs50 vs50Var, ibk ibkVar) {
        sqt0 sqt0Var;
        if (ibkVar instanceof sqt0) {
            sqt0Var = (sqt0) ibkVar;
            int i = sqt0Var.f213161c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sqt0Var.f213161c = i - Integer.MIN_VALUE;
            } else {
                sqt0Var = new sqt0(this, ibkVar);
            }
        } else {
            sqt0Var = new sqt0(this, ibkVar);
        }
        Object obj = sqt0Var.f213159a;
        int i2 = sqt0Var.f213161c;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (!(vs50Var instanceof os50)) {
                return it50.f105436a;
            }
            os50 os50Var = (os50) vs50Var;
            int i3 = os50Var.f168746a;
            nw80 nw80Var = os50Var.f168747b;
            sqt0Var.f213161c = 1;
            Object objM83814d = m83814d(i3, nw80Var, sqt0Var);
            yuk yukVar = yuk.f276404a;
            if (objM83814d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return it50.f105437b;
    }
}
