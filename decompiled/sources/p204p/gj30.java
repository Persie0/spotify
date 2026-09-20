package p204p;

import android.content.res.Resources;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class gj30 {

    /* JADX INFO: renamed from: a */
    public final int f80340a;

    /* JADX INFO: renamed from: b */
    public final int f80341b;

    /* JADX INFO: renamed from: c */
    public final int f80342c;

    /* JADX INFO: renamed from: d */
    public final int f80343d;

    /* JADX INFO: renamed from: e */
    public final int f80344e;

    /* JADX INFO: renamed from: f */
    public final float f80345f;

    public gj30(Resources resources) {
        this.f80340a = resources.getDimensionPixelSize(R.dimen.hub_card_default_text_area);
        this.f80341b = resources.getDimensionPixelSize(R.dimen.hub_card_normal_image_height);
        this.f80342c = resources.getDimensionPixelSize(R.dimen.hub_card_small_image_height);
        this.f80343d = resources.getDimensionPixelSize(R.dimen.hub_carousel_item_spacing);
        this.f80344e = resources.getDimensionPixelSize(R.dimen.category_card_max_height);
        this.f80345f = resources.getFraction(R.fraction.category_card_width_to_height_ratio, 1, 1);
    }
}
