package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class xu21 extends FrameLayout.LayoutParams {

    /* JADX INFO: renamed from: a */
    public final vu21 f265985a;

    /* JADX INFO: renamed from: b */
    public final nfu f265986b;

    public xu21(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        nfu nfuVarM30737i = bfu.f26784b;
        this.f265986b = nfuVarM30737i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l2u0.f129081a, 0, 0);
        this.f265985a = (vu21) bk5.m29587J0(typedArrayObtainStyledAttributes.getInt(0, -1), vu21.values());
        TypedValue typedValue = new TypedValue();
        typedArrayObtainStyledAttributes.getValue(1, typedValue);
        if (typedValue.type == 16) {
            nfu nfuVar = (nfu) g6f.m43747t0(typedArrayObtainStyledAttributes.getInt(1, -1), bx3.m30738j());
            if (nfuVar != null) {
                nfuVarM30737i = nfuVar;
            }
        } else {
            String string = typedArrayObtainStyledAttributes.getString(1);
            if (string != null) {
                nfuVarM30737i = bx3.m30737i(string);
            }
        }
        this.f265986b = nfuVarM30737i;
        typedArrayObtainStyledAttributes.recycle();
    }
}
