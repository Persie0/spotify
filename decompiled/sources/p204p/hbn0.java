package p204p;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;

/* JADX INFO: loaded from: classes2.dex */
public final enum hbn0 extends nbn0 {
    @Override // p204p.nbn0
    /* JADX INFO: renamed from: a */
    public final View mo25370a(Context context, AttributeSet attributeSet, int i) {
        return new StateListAnimatorImageButton(context, attributeSet, i);
    }

    @Override // p204p.nbn0
    /* JADX INFO: renamed from: b */
    public final int mo35572b() {
        return R.attr.imageButtonStyle;
    }
}
