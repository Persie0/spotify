package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sr8 implements uh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f213255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f213256b;

    public /* synthetic */ sr8(Context context, int i) {
        this.f213255a = context;
        this.f213256b = i;
    }

    @Override // p204p.uh00
    public final Object apply(Object obj) {
        int i;
        int i2;
        Drawable drawable = (Drawable) obj;
        vc41 vc41Var = vc41.CHECK;
        Context context = this.f213255a;
        int color = context.getColor(R.color.white);
        int color2 = context.getColor(R.color.blue_light);
        Resources resources = context.getResources();
        int i3 = this.f213256b;
        if (i3 == 1) {
            i = R.dimen.badge_small_size;
        } else if (i3 == 2) {
            i = R.dimen.badge_medium_size;
        } else {
            if (i3 != 3) {
                throw null;
            }
            i = R.dimen.badge_large_size;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        Resources resources2 = context.getResources();
        if (i3 == 1) {
            i2 = R.dimen.badge_small_margin;
        } else if (i3 == 2) {
            i2 = R.dimen.badge_medium_margin;
        } else {
            if (i3 != 3) {
                throw null;
            }
            i2 = R.dimen.badge_large_margin;
        }
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(i2);
        tc41 tc41Var = new tc41(context, vc41Var, dimensionPixelSize * 0.6f);
        tc41Var.m80417b(color);
        sde sdeVar = new sde(tc41Var, 0.6f);
        sdeVar.f208000e = ColorStateList.valueOf(color2);
        sdeVar.f207999d.setColor(color2);
        sdeVar.f208002g = color2;
        sdeVar.m77832a();
        sdeVar.invalidateSelf();
        int i4 = rr8.f201978g;
        qr8 qr8Var = new qr8();
        qr8Var.f191759a = dimensionPixelSize2;
        qr8Var.f191760b = dimensionPixelSize2;
        return new rr8(drawable, sdeVar, qr8Var);
    }
}
