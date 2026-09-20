package p204p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class v09 extends EncoreTextView {
    public v09(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0, 4, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.textAppearance, R.attr.textColor});
        ru21 ru21Var = new ru21(typedArrayObtainStyledAttributes.getResourceId(0, R.style.TextAppearance.Material), typedArrayObtainStyledAttributes.getColor(1, 0));
        typedArrayObtainStyledAttributes.recycle();
        if (ru21Var.m76410a() == 16974317) {
            setTextAppearance(i);
        }
        if (ru21Var.m76411b() != 0) {
            setTextColor(ru21Var.m76411b());
        }
    }
}
