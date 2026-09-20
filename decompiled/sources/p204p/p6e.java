package p204p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class p6e extends EncoreButton implements oqs {

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ int f174348V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6e(Context context, int i) {
        super(context, null, R.attr.encoreButtonPrimarySmall, null, 8, null);
        this.f174348V0 = i;
        switch (i) {
            case 1:
                super(context, null, R.attr.encoreButtonPrimarySmall, null, 8, null);
                setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                setBackgroundColor(vtg1.m86386m(context, R.attr.baseBackgroundTintedHighlight, 0));
                setTextAppearance(R.style.TextAppearance_Encore_BodySmallBold);
                setTextColor(vtg1.m86386m(context, R.attr.baseTextBase, 0));
                setIcon(context.getDrawable(R.drawable.encore_icon_chevron_right));
                setIconGravity(3);
                setIconSize((int) getResources().getDimension(R.dimen.encore_nav_chip_icon_size));
                setIconTint(lzj.m60387w(context, R.color.encore_nav_chip_icon_color));
                setIconPadding((int) getResources().getDimension(R.dimen.encore_nav_chip_icon_padding));
                break;
            default:
                setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                setBackgroundColor(vtg1.m86386m(context, R.attr.baseBackgroundTintedHighlight, 0));
                setTextAppearance(R.style.TextAppearance_Encore_BodySmallBold);
                setTextColor(vtg1.m86386m(context, R.attr.baseTextBase, 0));
                setIcon(context.getDrawable(R.drawable.encore_icon_x));
                setIconGravity(3);
                setIconSize((int) getResources().getDimension(R.dimen.encore_choice_chip_icon_size));
                setIconTint(lzj.m60387w(context, R.color.solid_white_200));
                setIconPadding((int) getResources().getDimension(R.dimen.encore_choice_chip_icon_padding));
                break;
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        switch (this.f174348V0) {
            case 0:
                setOnClickListener(new n20(5, gh00Var));
                break;
            default:
                setOnClickListener(new n20(19, gh00Var));
                break;
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        switch (this.f174348V0) {
            case 0:
                throw ei6.m39072i(obj);
            default:
                ikc0.m50942n(obj);
                throw null;
        }
    }
}
