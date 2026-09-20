package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class lvt0 extends ConstraintLayout implements oqs {

    /* JADX INFO: renamed from: R0 */
    public final x1p0 f137386R0;

    /* JADX INFO: renamed from: S0 */
    public final int f137387S0;

    /* JADX INFO: renamed from: T0 */
    public final int f137388T0;

    /* JADX INFO: renamed from: U0 */
    public final FrameLayout f137389U0;

    /* JADX INFO: renamed from: V0 */
    public int f137390V0;

    public lvt0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.quickscroll_layout, this);
        int i = R.id.quickscroll_handle_arrow_down;
        SpotifyIconView spotifyIconView = (SpotifyIconView) vie1.m85629k(this, R.id.quickscroll_handle_arrow_down);
        if (spotifyIconView != null) {
            i = R.id.quickscroll_handle_arrow_up;
            SpotifyIconView spotifyIconView2 = (SpotifyIconView) vie1.m85629k(this, R.id.quickscroll_handle_arrow_up);
            if (spotifyIconView2 != null) {
                i = R.id.quickscroll_handle_background;
                ImageView imageView = (ImageView) vie1.m85629k(this, R.id.quickscroll_handle_background);
                if (imageView != null) {
                    i = R.id.quickscroll_handle_group;
                    if (((Group) vie1.m85629k(this, R.id.quickscroll_handle_group)) != null) {
                        i = R.id.quickscroll_handle_vertical_bottom_guideline;
                        if (((Guideline) vie1.m85629k(this, R.id.quickscroll_handle_vertical_bottom_guideline)) != null) {
                            i = R.id.quickscroll_handle_vertical_top_guideline;
                            if (((Guideline) vie1.m85629k(this, R.id.quickscroll_handle_vertical_top_guideline)) != null) {
                                i = R.id.quickscroll_label;
                                TextView textView = (TextView) vie1.m85629k(this, R.id.quickscroll_label);
                                if (textView != null) {
                                    i = R.id.quickscroll_label_container;
                                    FrameLayout frameLayout = (FrameLayout) vie1.m85629k(this, R.id.quickscroll_label_container);
                                    if (frameLayout != null) {
                                        this.f137386R0 = new x1p0(this, spotifyIconView, spotifyIconView2, imageView, textView, frameLayout);
                                        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.quickscroll_handle_size);
                                        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.quickscroll_handle_margin_end);
                                        this.f137387S0 = dimensionPixelSize;
                                        this.f137388T0 = dimensionPixelSize + dimensionPixelSize2;
                                        this.f137389U0 = frameLayout;
                                        imageView.setBackground(imageView.getBackground());
                                        n3d0 n3d0Var = new n3d0();
                                        n3d0Var.m63600k(getResources().getDimension(R.dimen.quickscroll_label_elevation));
                                        imx0 imx0Var = new imx0();
                                        imx0 imx0Var2 = new imx0();
                                        imx0 imx0Var3 = new imx0();
                                        imx0 imx0Var4 = new imx0();
                                        crs crsVar = new crs(0);
                                        crs crsVar2 = new crs(0);
                                        crs crsVar3 = new crs(0);
                                        crs crsVar4 = new crs(0);
                                        float dimension = getResources().getDimension(R.dimen.quickscroll_indicator_border_radius);
                                        C2281q5 c2281q5 = new C2281q5(dimension);
                                        C2281q5 c2281q6 = new C2281q5(dimension);
                                        C2281q5 c2281q7 = new C2281q5(dimension);
                                        C2281q5 c2281q8 = new C2281q5(dimension);
                                        dh01 dh01Var = new dh01();
                                        dh01Var.f48937a = imx0Var;
                                        dh01Var.f48938b = imx0Var2;
                                        dh01Var.f48939c = imx0Var3;
                                        dh01Var.f48940d = imx0Var4;
                                        dh01Var.f48941e = c2281q5;
                                        dh01Var.f48942f = c2281q6;
                                        dh01Var.f48943g = c2281q7;
                                        dh01Var.f48944h = c2281q8;
                                        dh01Var.f48945i = crsVar;
                                        dh01Var.f48946j = crsVar2;
                                        dh01Var.f48947k = crsVar3;
                                        dh01Var.f48948l = crsVar4;
                                        n3d0Var.setShapeAppearanceModel(dh01Var);
                                        n3d0Var.m63605p();
                                        n3d0Var.m63603n(context.getColor(R.color.opacity_black_50));
                                        n3d0Var.m63604o();
                                        n3d0Var.m63601l(lzj.m60387w(context, R.color.white));
                                        textView.setBackground(n3d0Var);
                                        setAlpha(0.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    private final void setArrowColors(int i) {
        int color = getContext().getColor(i);
        x1p0 x1p0Var = this.f137386R0;
        ((SpotifyIconView) x1p0Var.f257249d).setColor(color);
        ((SpotifyIconView) x1p0Var.f257248c).setColor(color);
    }

    private final void setTextColor(int i) {
        x1p0 x1p0Var = this.f137386R0;
        ((TextView) x1p0Var.f257251f).setTextColor(((lvt0) x1p0Var.f257247b).getContext().getColor(i));
    }

    public final int getHandleHeight() {
        return this.f137387S0;
    }

    public final int getHandleWidth() {
        return this.f137388T0;
    }

    public final FrameLayout getLabelContainer() {
        return this.f137389U0;
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(hvt0 hvt0Var) {
        String str = hvt0Var.f95792b;
        int i = hvt0Var.f95791a;
        int i2 = this.f137390V0;
        x1p0 x1p0Var = this.f137386R0;
        if (i != i2) {
            this.f137390V0 = i;
            int iM38547C = edb.m38547C(i);
            if (iM38547C == 0) {
                ((ImageView) x1p0Var.f257250e).getBackground().setTint(getContext().getColor(R.color.quickscroll_background_dark));
                ((TextView) x1p0Var.f257251f).getBackground().setTint(getContext().getColor(R.color.quickscroll_background_dark));
                setArrowColors(R.color.quickscroll_arrows_dark);
                setTextColor(R.color.quickscroll_textcolor_dark);
            } else {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ImageView) x1p0Var.f257250e).getBackground().setTint(getContext().getColor(R.color.quickscroll_background_light));
                ((TextView) x1p0Var.f257251f).getBackground().setTint(getContext().getColor(R.color.quickscroll_background_light));
                setArrowColors(R.color.quickscroll_arrows_light);
                setTextColor(R.color.quickscroll_textcolor_light);
            }
        }
        TextView textView = (TextView) x1p0Var.f257251f;
        TextView textView2 = (TextView) x1p0Var.f257251f;
        textView.setVisibility((str == null || str.length() == 0) ? 4 : 0);
        boolean zM88271j = wj50.m88271j(textView2.getText(), str);
        textView2.setText(str);
        if (zM88271j) {
            return;
        }
        textView2.requestLayout();
    }
}
