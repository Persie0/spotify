package p204p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: classes9.dex */
public final class aji0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ofx f16280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cji0 f16281b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aji0(ofx ofxVar, cji0 cji0Var) {
        super(2);
        this.f16280a = ofxVar;
        this.f16281b = cji0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        ofx ofxVar = this.f16280a;
        ((jex) ofxVar.f164921d).m53119k(str, DismissedEntity.Type.MARKED_AS_PLAYED);
        ((opp) this.f16281b.f38598h).m67577a((String) obj2, new zii0(ofxVar, str));
        return w2a1.f247311a;
    }
}
