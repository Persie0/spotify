package p204p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: classes9.dex */
public final class u4r0 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ofx f226789a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c5r0 f226790b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4r0(ofx ofxVar, c5r0 c5r0Var) {
        super(2);
        this.f226789a = ofxVar;
        this.f226790b = c5r0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        ofx ofxVar = this.f226789a;
        ((jex) ofxVar.f164921d).m53119k(str, DismissedEntity.Type.MARKED_AS_PLAYED);
        this.f226790b.f34267m.m67577a((String) obj2, new t4r0(ofxVar, str));
        return w2a1.f247311a;
    }
}
