package p204p;

import com.spotify.home.evopage.structureapi.DismissedEntity;
import com.spotify.home.evopage.structureapi.InterfaceC0791a;

/* JADX INFO: loaded from: classes9.dex */
public final class v4r0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ofx f237231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f237232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4r0(ofx ofxVar, String str) {
        super(0);
        this.f237231a = ofxVar;
        this.f237232b = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        InterfaceC0791a interfaceC0791a = this.f237231a.f164921d;
        ((jex) interfaceC0791a).m53121m(this.f237232b, DismissedEntity.Type.MARKED_AS_PLAYED);
        return w2a1.f247311a;
    }
}
