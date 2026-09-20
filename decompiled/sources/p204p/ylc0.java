package p204p;

import android.content.Context;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.markasplayed.MarkAsPlayedButtonView;

/* JADX INFO: loaded from: classes9.dex */
public final class ylc0 extends u8w {

    /* JADX INFO: renamed from: c */
    public final xfc0 f273978c;

    public ylc0(Context context) {
        super(context);
        this.f273978c = xfc0.f260912Z;
    }

    @Override // p204p.u8w
    /* JADX INFO: renamed from: a */
    public final View mo30581a() {
        return new MarkAsPlayedButtonView(getContext(), null, 0, 6, null);
    }

    @Override // p204p.u8w
    public gh00 getActionModelExtractor() {
        return this.f273978c;
    }
}
