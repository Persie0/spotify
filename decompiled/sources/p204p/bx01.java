package p204p;

import android.content.Context;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.share.ShareButton;

/* JADX INFO: loaded from: classes9.dex */
public final class bx01 extends u8w {

    /* JADX INFO: renamed from: c */
    public final mo01 f31762c;

    public bx01(Context context) {
        super(context);
        this.f31762c = mo01.f145519U0;
    }

    @Override // p204p.u8w
    /* JADX INFO: renamed from: a */
    public final View mo30581a() {
        return new ShareButton(getContext(), null, 0, 6, null);
    }

    @Override // p204p.u8w
    public gh00 getActionModelExtractor() {
        return this.f31762c;
    }
}
