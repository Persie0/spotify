package p204p;

import com.spotify.home.evopage.mobius.Event;

/* JADX INFO: loaded from: classes2.dex */
public final class sfx implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rlv0 f208651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ufx f208652b;

    public sfx(rlv0 rlv0Var, ufx ufxVar) {
        this.f208651a = rlv0Var;
        this.f208652b = ufxVar;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        knm0 knm0Var = (knm0) obj;
        boolean z = knm0Var instanceof hnm0;
        rlv0 rlv0Var = this.f208651a;
        if (z) {
            Object obj2 = rlv0Var.f200373a;
            if ((obj2 instanceof jnm0) || (obj2 instanceof inm0)) {
                this.f208652b.f229911c.m53120l(Event.PageBecameFocused.INSTANCE);
            }
        }
        rlv0Var.f200373a = knm0Var;
        return w2a1.f247311a;
    }
}
