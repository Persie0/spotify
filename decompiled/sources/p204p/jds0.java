package p204p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: classes9.dex */
public final class jds0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ofx f111390a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jds0(ofx ofxVar) {
        super(1);
        this.f111390a = ofxVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ((jex) this.f111390a.f164921d).m53121m((String) obj, DismissedEntity.Type.EXPLICIT_FEEDBACK);
        return w2a1.f247311a;
    }
}
