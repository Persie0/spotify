package p204p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: classes7.dex */
public final class vwq0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ofx f245534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wwq0 f245535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwq0(ofx ofxVar, wwq0 wwq0Var) {
        super(2);
        this.f245534a = ofxVar;
        this.f245535b = wwq0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        ofx ofxVar = this.f245534a;
        ((jex) ofxVar.f164921d).m53119k(str, DismissedEntity.Type.MARKED_AS_PLAYED);
        this.f245535b.f255817g.m67577a((String) obj2, new uwq0(ofxVar, str));
        return w2a1.f247311a;
    }
}
