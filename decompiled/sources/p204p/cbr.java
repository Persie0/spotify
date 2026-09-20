package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class cbr {

    /* JADX INFO: renamed from: a */
    public final Flowable f36185a;

    /* JADX INFO: renamed from: b */
    public final zar f36186b;

    /* JADX INFO: renamed from: c */
    public final abr f36187c;

    /* JADX INFO: renamed from: d */
    public final z9r f36188d;

    /* JADX INFO: renamed from: e */
    public final dn4 f36189e;

    /* JADX INFO: renamed from: f */
    public final xre f36190f;

    /* JADX INFO: renamed from: g */
    public long f36191g;

    public cbr(Flowable flowable, zar zarVar, abr abrVar, z9r z9rVar, dn4 dn4Var, xre xreVar) {
        this.f36185a = flowable;
        this.f36186b = zarVar;
        this.f36187c = abrVar;
        this.f36188d = z9rVar;
        this.f36189e = dn4Var;
        this.f36190f = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m32191a(Set set, Enum r6) {
        Object next;
        Set setSingleton;
        nzv nzvVar = fg8.f69247f;
        C2042k7 c2042k7 = new C2042k7(nzvVar, 0);
        do {
            if (!c2042k7.hasNext()) {
                next = null;
                break;
            }
            next = c2042k7.next();
        } while (!wj50.m88271j(((fg8) next).name(), r6.name()));
        fg8 fg8Var = (fg8) next;
        if (fg8Var == null) {
            return false;
        }
        int iOrdinal = fg8Var.ordinal();
        fg8 fg8Var2 = fg8.f69242a;
        if (iOrdinal == 0) {
            setSingleton = Collections.singleton(fg8Var2);
        } else if (iOrdinal == 1) {
            setSingleton = s601.m77310m0(fg8.f69243b, fg8Var2);
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setSingleton = g6f.m43736n1(nzvVar);
        }
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (setSingleton.contains((fg8) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: b */
    public final Object m32192b(gj9 gj9Var, Set set, ibk ibkVar) {
        bbr bbrVar;
        Set set2;
        yc8 yc8Var;
        String strM93334a;
        xre xreVar = this.f36190f;
        dn4 dn4Var = this.f36189e;
        if (ibkVar instanceof bbr) {
            bbrVar = (bbr) ibkVar;
            int i = bbrVar.f25642e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bbrVar.f25642e = i - Integer.MIN_VALUE;
            } else {
                bbrVar = new bbr(this, ibkVar);
            }
        } else {
            bbrVar = new bbr(this, ibkVar);
        }
        Object objM48283p = bbrVar.f25640c;
        int i2 = bbrVar.f25642e;
        try {
            if (i2 == 0) {
                bga.m29073P(objM48283p);
                Flowable flowable = this.f36185a;
                bbrVar.f25638a = gj9Var;
                bbrVar.f25639b = set;
                bbrVar.f25642e = 1;
                objM48283p = hqg1.m48283p(flowable, bbrVar);
                yuk yukVar = yuk.f276404a;
                if (objM48283p == yukVar) {
                    return yukVar;
                }
                set2 = set;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Set set3 = bbrVar.f25639b;
                gj9 gj9Var2 = bbrVar.f25638a;
                bga.m29073P(objM48283p);
                set2 = set3;
                gj9Var = gj9Var2;
            }
            PlayerState playerState = (PlayerState) objM48283p;
            this.f36186b.m95805a(gj9Var.m44868a().m87530a(), gj9Var.m44868a().m87532c(), set2, hqg1.m48277j(playerState), hqg1.m48275h(playerState), hqg1.m48276i(playerState));
            if (dn4Var.m36452g() && m32191a(set2, dn4Var.m36448c())) {
                abr abrVar = this.f36187c;
                uud1 uud1VarM44869b = gj9Var.m44869b();
                hqg1.m48277j(playerState);
                boolean zM48275h = hqg1.m48275h(playerState);
                hqg1.m48276i(playerState);
                abrVar.getClass();
                x0h1.m89578u(abrVar.f14171d, null, 0, new fop(abrVar, new msj0(new C1668ai(zM48275h, abrVar, uud1VarM44869b, 10), crs.f41386V0), (fbk) null, 23), 3);
            }
            if (dn4Var.m36453h() && m32191a(set2, dn4Var.m36455j()) && gj9Var.m44868a().m87531b().contains(aar.m25272a())) {
                ((wy3) xreVar).getClass();
                if (System.currentTimeMillis() - this.f36191g >= dn4Var.m36454i()) {
                    z9r z9rVar = this.f36188d;
                    String strM87530a = gj9Var.m44868a().m87530a();
                    nc8 nc8VarM25272a = aar.m25272a();
                    byte[] bArr = {1};
                    qi9 qi9Var = (qi9) ((Map) z9rVar.f280863h.getValue()).get(strM87530a);
                    if (qi9Var != null && (yc8Var = qi9Var.f188963a) != null && (strM93334a = yc8Var.m93334a()) != null) {
                        z9rVar.f280858c.f230382a.accept(new sh8(strM93334a, nc8VarM25272a, bArr));
                    }
                    ((wy3) xreVar).getClass();
                    this.f36191g = System.currentTimeMillis();
                }
            }
        } catch (Exception e) {
            Logger.m3967c(e, "DevicePredictability: proximity logging failed", new Object[0]);
        }
        return w2a1.f247311a;
    }
}
