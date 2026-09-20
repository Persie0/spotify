package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class cny implements Connectable {

    /* JADX INFO: renamed from: a */
    public final yg0 f40123a;

    /* JADX INFO: renamed from: b */
    public final chj0 f40124b;

    /* JADX INFO: renamed from: c */
    public final q831 f40125c;

    /* JADX INFO: renamed from: d */
    public final woy f40126d;

    /* JADX INFO: renamed from: e */
    public final kv91 f40127e;

    /* JADX INFO: renamed from: f */
    public final luk f40128f;

    public cny(yg0 yg0Var, chj0 chj0Var, q831 q831Var, woy woyVar, kv91 kv91Var, luk lukVar) {
        this.f40123a = yg0Var;
        this.f40124b = chj0Var;
        this.f40125c = q831Var;
        this.f40126d = woyVar;
        this.f40127e = kv91Var;
        this.f40128f = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public static final void m33472a(int i, Consumer consumer, cny cnyVar, gh00 gh00Var, gh00 gh00Var2) {
        q831 q831Var = cnyVar.f40125c;
        na6.m63963k(true, "Invalid resource ID provided: %s", Integer.valueOf(i));
        na6.m63963k(true, "Invalid resource ID provided: %s", null);
        Integer numValueOf = Integer.valueOf(i);
        na6.m63963k(true, "Invalid resource ID provided: %s", numValueOf);
        q831Var.m72305j(new g631(null, "", numValueOf, null, Integer.valueOf(R.string.taste_profile_feedback_note_try_again), new bny(i, consumer, cnyVar, gh00Var, gh00Var2), null, null, false));
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        rmy rmyVar = new rmy(this, consumer);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(sly.class), c1037x558fa59a.m15633a(rmyVar));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(gmy.class), new C1037x558fa59a().m15633a(new smy(this, consumer)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(tly.class), new C1037x558fa59a().m15633a(new tmy(this, consumer)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(emy.class), new C1037x558fa59a().m15633a(new vmy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(yly.class), new C1037x558fa59a().m15633a(new wmy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(dmy.class), new C1037x558fa59a().m15633a(new imy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(bmy.class), new C1037x558fa59a().m15633a(new jmy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(fmy.class), new C1037x558fa59a().m15633a(new kmy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(zly.class), new C1037x558fa59a().m15633a(new lmy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(xly.class), new C1037x558fa59a().m15633a(new mmy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(amy.class), new C1037x558fa59a().m15633a(new nmy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(vly.class), new C1033x3ae6ae8e().m15631a(new ymy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(wly.class), new C1037x558fa59a().m15633a(new omy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(cmy.class), new C1037x558fa59a().m15633a(new pmy(this)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(uly.class), new C1037x558fa59a().m15633a(new qmy(this)));
        return new C1044a(this.f40128f, coroutinesSubtypeEffectHandlerBuilderM42464h).mo3269P(consumer);
    }
}
