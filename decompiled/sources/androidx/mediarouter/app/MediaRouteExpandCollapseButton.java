package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;
import p204p.m9f;

/* JADX INFO: loaded from: classes3.dex */
class MediaRouteExpandCollapseButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: d */
    public final AnimationDrawable f1140d;

    /* JADX INFO: renamed from: e */
    public final AnimationDrawable f1141e;

    /* JADX INFO: renamed from: f */
    public final String f1142f;

    /* JADX INFO: renamed from: g */
    public final String f1143g;

    /* JADX INFO: renamed from: h */
    public boolean f1144h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f1145i;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1145i = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX WARN: Code duplicated, block: B:9:0x0044  */
    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        TypedValue typedValue;
        int color;
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_expand);
        this.f1140d = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_collapse);
        this.f1141e = animationDrawable2;
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.colorPrimary});
            color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color == 0) {
                typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                if (typedValue.resourceId != 0) {
                    color = context.getResources().getColor(typedValue.resourceId);
                } else {
                    color = typedValue.data;
                }
            }
        } else {
            typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
            if (typedValue.resourceId != 0) {
                color = context.getResources().getColor(typedValue.resourceId);
            } else {
                color = typedValue.data;
            }
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(m9f.m61217e(-1, color) < 3.0d ? -570425344 : -1, PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.f1142f = string;
        this.f1143g = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new ViewOnClickListenerC0109a(this));
    }
}
