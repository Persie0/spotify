package p204p;

import android.content.Context;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;

/* JADX INFO: loaded from: classes9.dex */
public final class p6k extends u8w {

    /* JADX INFO: renamed from: c */
    public final v0k f174420c;

    public p6k(Context context) {
        super(context);
        this.f174420c = v0k.f236030Z0;
    }

    @Override // p204p.u8w
    /* JADX INFO: renamed from: a */
    public final View mo30581a() {
        return new ContextMenuButton(getContext(), null, 0, 6, null);
    }

    @Override // p204p.u8w
    public gh00 getActionModelExtractor() {
        return this.f174420c;
    }
}
