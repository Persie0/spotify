package p204p;

import android.os.Bundle;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class v0d1 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final z9j0 f235970a;

    /* JADX INFO: renamed from: b */
    public final y0i0 f235971b;

    /* JADX INFO: renamed from: c */
    public final yz80 f235972c;

    /* JADX INFO: renamed from: d */
    public final j2d1 f235973d;

    /* JADX INFO: renamed from: e */
    public final luk f235974e;

    /* JADX INFO: renamed from: f */
    public final C1044a f235975f;

    public v0d1(z9j0 z9j0Var, y0i0 y0i0Var, yz80 yz80Var, j2d1 j2d1Var, luk lukVar, luk lukVar2) {
        this.f235970a = z9j0Var;
        this.f235971b = y0i0Var;
        this.f235972c = yz80Var;
        this.f235973d = j2d1Var;
        this.f235974e = lukVar;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        s0d1 s0d1Var = new s0d1(this);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(k0d1.class), c1037x558fa59a.m15633a(s0d1Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(l0d1.class), new C1037x558fa59a().m15633a(new u0d1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(i0d1.class), new C1037x558fa59a().m15633a(new o0d1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(j0d1.class), new C1037x558fa59a().m15633a(new p0d1(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(m0d1.class), new C1037x558fa59a().m15633a(new q0d1(this)));
        this.f235975f = new C1044a(lukVar2, coroutinesSubtypeEffectHandlerBuilderM42464h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m84375b(v0d1 v0d1Var, i0d1 i0d1Var, ibk ibkVar) throws Throwable {
        n0d1 n0d1Var;
        if (ibkVar instanceof n0d1) {
            n0d1Var = (n0d1) ibkVar;
            int i = n0d1Var.f149032d;
            if ((i & Integer.MIN_VALUE) != 0) {
                n0d1Var.f149032d = i - Integer.MIN_VALUE;
            } else {
                n0d1Var = new n0d1(v0d1Var, ibkVar);
            }
        } else {
            n0d1Var = new n0d1(v0d1Var, ibkVar);
        }
        Object obj = n0d1Var.f149030b;
        int i2 = n0d1Var.f149032d;
        if (i2 == 0) {
            bga.m29073P(obj);
            String str = i0d1Var.f97211b;
            n0d1Var.f149029a = i0d1Var;
            n0d1Var.f149032d = 1;
            Object objM84376c = v0d1Var.m84376c(str, n0d1Var);
            Object obj2 = yuk.f276404a;
            if (objM84376c == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i0d1Var = n0d1Var.f149029a;
            bga.m29073P(obj);
        }
        Bundle bundleM70529j = pp91.m70529j(new pqm0("voting-share-page-playlist-id", i0d1Var.f97210a), new pqm0("voting-share-page-episode-id", i0d1Var.f97212c), new pqm0("voting-share-page-episode-partition", i0d1Var.f97213d));
        String strM38564m = edb.m38564m("spotify:voting:share:", i0d1Var.f97210a);
        z9j0 z9j0Var = v0d1Var.f235970a;
        y0i0 y0i0Var = v0d1Var.f235971b;
        z9j0Var.mo47342b(strM38564m, ((kv91) ((h4t0) y0i0Var.f267991d).get()).mo57453r(((cbh0) y0i0Var.f267989b).m32163j().m72857a(strM38564m), null), bundleM70529j);
        return w2a1.f247311a;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return this.f235975f.mo3269P(consumer);
    }

    /* JADX INFO: renamed from: c */
    public final Object m84376c(String str, ibk ibkVar) throws Throwable {
        Object objM89557A = x0h1.m89557A(this.f235974e, new o8t0(this, str, null, 7), ibkVar);
        return objM89557A == yuk.f276404a ? objM89557A : w2a1.f247311a;
    }
}
