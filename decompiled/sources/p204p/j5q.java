package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class j5q {

    /* JADX INFO: renamed from: a */
    public final kkx0 f109065a;

    /* JADX INFO: renamed from: b */
    public final c9k f109066b;

    /* JADX INFO: renamed from: c */
    public final hb11 f109067c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f109068d;

    /* JADX INFO: renamed from: e */
    public final luu0 f109069e;

    public j5q(kkx0 kkx0Var, luk lukVar) {
        this.f109065a = kkx0Var;
        this.f109066b = kk40.m56661c(opo.m67570t(njg1.m64613f(), lukVar).mo26608y(new g12(efy.f59152X0, 2)));
        hb11 hb11VarM52092t = j0g1.m52092t(1, 10, 0, 4);
        this.f109067c = hb11VarM52092t;
        this.f109068d = new ConcurrentHashMap();
        this.f109069e = bzf1.m31020l(hb11VarM52092t);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m52472a(j5q j5qVar, Set set, ibk ibkVar) {
        i5q i5qVar;
        j5qVar.getClass();
        if (ibkVar instanceof i5q) {
            i5qVar = (i5q) ibkVar;
            int i = i5qVar.f99008d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i5qVar.f99008d = i - Integer.MIN_VALUE;
            } else {
                i5qVar = new i5q(j5qVar, ibkVar);
            }
        } else {
            i5qVar = new i5q(j5qVar, ibkVar);
        }
        Object obj = i5qVar.f99006b;
        int i2 = i5qVar.f99008d;
        gbu gbuVar = gbu.f78413a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Set set2 = i5qVar.f99005a;
                bga.m29073P(obj);
                return set2;
            }
            bga.m29073P(obj);
            if (set.isEmpty()) {
                return gbuVar;
            }
            g5q g5qVar = new g5q(j5qVar, set, null, 1);
            i5qVar.f99005a = set;
            i5qVar.f99008d = 1;
            Object objM76978s = s1h1.m76978s(10000L, g5qVar, i5qVar);
            yuk yukVar = yuk.f276404a;
            return objM76978s == yukVar ? yukVar : set;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Default save location revert failed", new Object[0]);
            return gbuVar;
        }
    }
}
