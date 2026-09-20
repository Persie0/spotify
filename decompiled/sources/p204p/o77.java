package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.encoremobile.component.icons.IconExclamationCircle;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class o77 extends FrameLayout {

    /* JADX INFO: renamed from: L0 */
    public final Drawable f162474L0;

    /* JADX INFO: renamed from: M0 */
    public final Drawable f162475M0;

    /* JADX INFO: renamed from: a */
    public final ImageView f162476a;

    /* JADX INFO: renamed from: b */
    public final AppCompatTextView f162477b;

    /* JADX INFO: renamed from: c */
    public final IconExclamationCircle f162478c;

    /* JADX INFO: renamed from: d */
    public final Drawable f162479d;

    /* JADX INFO: renamed from: e */
    public ViewPropertyAnimator f162480e;

    /* JADX INFO: renamed from: f */
    public n77 f162481f;

    /* JADX INFO: renamed from: g */
    public final ColorStateList f162482g;

    /* JADX INFO: renamed from: h */
    public final ColorStateList f162483h;

    /* JADX INFO: renamed from: i */
    public final ColorStateList f162484i;

    /* JADX INFO: renamed from: t */
    public final Drawable f162485t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o77(Context context) {
        super(context, null, 0);
        Drawable drawable = null;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.animated_av_button, this);
        this.f162476a = (ImageView) viewGroup.findViewById(R.id.av_icon);
        this.f162477b = (AppCompatTextView) viewGroup.findViewById(R.id.av_label);
        this.f162478c = (IconExclamationCircle) viewGroup.findViewById(R.id.av_verification_badge);
        Drawable drawable2 = context.getDrawable(R.drawable.av_rounded_background);
        this.f162479d = drawable2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.spacer_8);
        this.f162482g = ColorStateList.valueOf(vtg1.m86386m(getContext(), R.attr.overMediaBackgroundBase, 0));
        this.f162483h = ColorStateList.valueOf(vtg1.m86386m(getContext(), R.attr.baseBackgroundTintedHighlight, 0));
        this.f162484i = ColorStateList.valueOf(vtg1.m86386m(getContext(), R.attr.baseBackgroundTintedBase, 0));
        Drawable drawable3 = context.getDrawable(R.drawable.encore_icon_video_16);
        if (drawable3 != null) {
            drawable3.setTintList(lzj.m60387w(context, R.color.av_btn_white));
        } else {
            drawable3 = null;
        }
        this.f162485t = drawable3;
        Drawable drawable4 = context.getDrawable(R.drawable.encore_icon_playlist_16);
        if (drawable4 != null) {
            drawable4.setTintList(lzj.m60387w(context, R.color.av_btn_white));
        } else {
            drawable4 = null;
        }
        this.f162474L0 = drawable4;
        Drawable drawable5 = context.getDrawable(R.drawable.encore_icon_podcasts_16);
        if (drawable5 != null) {
            drawable5.setTintList(lzj.m60387w(context, R.color.av_btn_white));
            drawable = drawable5;
        }
        this.f162475M0 = drawable;
        setBackground(drawable2);
        setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
    }
}
