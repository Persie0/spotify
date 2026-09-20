package p204p;

import com.spotify.home.evopage.mobius.Event;

/* JADX INFO: loaded from: classes2.dex */
public final class hex implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jex f90519a;

    public hex(jex jexVar) {
        this.f90519a = jexVar;
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        jex jexVar = this.f90519a;
        if (!jexVar.f111691R0) {
            jexVar.m53120l(Event.Foregrounded.INSTANCE);
        }
        jexVar.f111691R0 = false;
    }
}
