package p204p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: classes9.dex */
public final class z5e0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ofx f279549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5e0(ofx ofxVar) {
        super(1);
        this.f279549a = ofxVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ((jex) this.f279549a.f164921d).m53121m((String) obj, DismissedEntity.Type.EXPLICIT_FEEDBACK);
        return w2a1.f247311a;
    }
}
