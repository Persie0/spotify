package p204p;

import android.content.Context;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;

/* JADX INFO: loaded from: classes9.dex */
public final class bv1 extends u8w {

    /* JADX INFO: renamed from: c */
    public final av1 f31248c;

    public bv1(Context context) {
        super(context);
        this.f31248c = av1.f20064h;
    }

    @Override // p204p.u8w
    /* JADX INFO: renamed from: a */
    public final View mo30581a() {
        return new AddToButtonView(getContext(), null, 0, 6, null);
    }

    @Override // p204p.u8w
    public nr60 getActionModelExtractor() {
        return this.f31248c;
    }
}
