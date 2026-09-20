package p204p;

import android.view.View;
import com.spotify.home.evopage.structureapi.DismissedEntity;
import com.spotify.home.evopage.structureapi.InterfaceC0791a;

/* JADX INFO: loaded from: classes7.dex */
public final class wpv0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ofx f253847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f253848b;

    public wpv0(ofx ofxVar, String str) {
        this.f253847a = ofxVar;
        this.f253848b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0791a interfaceC0791a = this.f253847a.f164921d;
        ((jex) interfaceC0791a).m53121m(this.f253848b, DismissedEntity.Type.INLINE_CARD);
    }
}
