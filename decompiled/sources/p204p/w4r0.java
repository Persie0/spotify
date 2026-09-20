package p204p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: classes9.dex */
public final class w4r0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ofx f247874a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c5r0 f247875b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4r0(ofx ofxVar, c5r0 c5r0Var) {
        super(2);
        this.f247874a = ofxVar;
        this.f247875b = c5r0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        ofx ofxVar = this.f247874a;
        ((jex) ofxVar.f164921d).m53119k(str, DismissedEntity.Type.MARKED_AS_PLAYED);
        this.f247875b.f34267m.m67577a((String) obj2, new v4r0(ofxVar, str));
        return w2a1.f247311a;
    }
}
