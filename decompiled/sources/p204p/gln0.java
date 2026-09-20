package p204p;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class gln0 extends RelativeLayout.LayoutParams implements eln0 {

    /* JADX INFO: renamed from: a */
    public dln0 f81119a;

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i, 0);
        ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i2, 0);
    }
}
