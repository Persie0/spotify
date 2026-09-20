package p204p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.MobiusCoroutines;

/* JADX INFO: loaded from: classes7.dex */
public final class vsi0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wsi0 f244447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsi0(wsi0 wsi0Var) {
        super(1);
        this.f244447a = wsi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        tsi0 tsi0Var = this.f244447a.f254640b;
        ssi0 ssi0Var = new ssi0();
        rsi0 rsi0Var = tsi0Var.f223325a;
        return Mobius.m15582d(ssi0Var, new C1044a(rsi0Var.f202332a, fr0.m42464h(MobiusCoroutines.f5725a)));
    }
}
