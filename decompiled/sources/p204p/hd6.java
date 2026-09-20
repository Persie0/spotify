package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hd6 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public static final hd6 f90028h = new hd6(1, id6.class, "toAssistedCurationSavedState", "toAssistedCurationSavedState(Lcom/spotify/assistedcuration/page/domain/model/AssistedCurationModel;)Landroid/os/Bundle;", 1);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        gg6 gg6Var = (gg6) obj;
        Bundle bundle = new Bundle();
        bundle.putString("assisted_curation_selected_card_id", gg6Var.f79538c);
        bundle.putParcelable("assisted_curation_mode", gg6Var.f79536a);
        return bundle;
    }
}
