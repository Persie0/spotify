package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes2.dex */
public final class yoe1 {
    /* JADX INFO: renamed from: a */
    public static LayerDrawable m94279a(Context context, Drawable drawable, int i, ColorStateList colorStateList, float f) {
        Drawable drawableM60389y = lzj.m60389y(context, i);
        wj50.m88279p(drawableM60389y);
        if (colorStateList != null) {
            drawableM60389y = drawableM60389y.mutate();
            svg1.m79459M(drawableM60389y, colorStateList);
        }
        return new LayerDrawable(new Drawable[]{drawable, new s10(new n540(drawableM60389y, 1), f, 0, 1)});
    }

    /* JADX INFO: renamed from: b */
    public final LayerDrawable m94280b(Context context) {
        return m94279a(context, xqg1.m91876y(context), R.drawable.encore_icon_heart_active_24, lzj.m60387w(context, R.color.white), 0.375f);
    }

    /* JADX INFO: renamed from: c */
    public final LayerDrawable m94281c(Context context) {
        ColorDrawable colorDrawable = new ColorDrawable(lzj.m60386v(context, R.color.local_files_background));
        z4b1 z4b1VarM95341a = z4b1.m95341a(context.getResources(), R.drawable.ic_local_files, context.getTheme());
        z4b1VarM95341a.mutate();
        return new LayerDrawable(new Drawable[]{colorDrawable, new s10(z4b1VarM95341a, 0.375f, 0, 1)});
    }

    /* JADX INFO: renamed from: d */
    public final LayerDrawable m94282d(Context context) {
        Drawable drawableM60389y = lzj.m60389y(context, R.drawable.yourlibrary_new_episodes_background);
        wj50.m88279p(drawableM60389y);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.baseTextBrightAccent});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return m94279a(context, drawableM60389y, R.drawable.encore_icon_notifications_active_24, colorStateList, 0.435f);
    }

    /* JADX INFO: renamed from: e */
    public final LayerDrawable m94283e(Context context) {
        return new LayerDrawable(new Drawable[]{lzj.m60389y(context, R.drawable.your_episodes_background), new s10(z4b1.m95341a(context.getResources(), R.drawable.ic_your_episodes, context.getTheme()), 0.375f, 0, 1)});
    }
}
