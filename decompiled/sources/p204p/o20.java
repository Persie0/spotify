package p204p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import com.spotify.music.R;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o20 extends StateListAnimatorButton implements oqs {

    /* JADX INFO: renamed from: f */
    public final AttributeSet f160898f;

    /* JADX INFO: renamed from: g */
    public final int f160899g;

    /* JADX INFO: renamed from: h */
    public final int f160900h;

    public o20(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f160898f = attributeSet;
        this.f160899g = i;
        this.f160900h = i2;
    }

    private final void setAppearance(tta ttaVar) {
        int i;
        if (getBtnTintList() != -1) {
            ColorStateList colorStateListM60387w = lzj.m60387w(getContext(), getBtnTintList());
            WeakHashMap weakHashMap = mec1.f142677a;
            cec1.m32546j(this, colorStateListM60387w);
        }
        int iOrdinal = ttaVar.ordinal();
        if (iOrdinal == 0) {
            i = R.style.TextAppearance_Encore_BodyMediumBold;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.style.TextAppearance_Encore_BodySmallBold;
        }
        setTextAppearance(i);
        if (getTextTintList() != -1) {
            setTextColor(lzj.m60387w(getContext(), getTextTintList()));
        } else {
            if (getTextColorAttr() == -1) {
                throw new IllegalStateException("Either textTintList or textColorAttr must be defined");
            }
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(getTextColorAttr(), typedValue, true);
            setTextColor(typedValue.data);
        }
    }

    private final void setButtonSize(tta ttaVar) {
        setDimensions(ttaVar);
        setAppearance(ttaVar);
    }

    private final void setDimensions(tta ttaVar) {
        int i;
        int i2;
        Resources resources = getContext().getResources();
        int iOrdinal = ttaVar.ordinal();
        if (iOrdinal == 0) {
            i = R.dimen.encore_action_button_height_large;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.dimen.encore_action_button_height_small;
        }
        setMinimumHeight(resources.getDimensionPixelSize(i));
        Resources resources2 = getContext().getResources();
        int iOrdinal2 = ttaVar.ordinal();
        if (iOrdinal2 == 0) {
            i2 = R.dimen.encore_action_button_horizontal_padding_large;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.dimen.encore_action_button_horizontal_padding_small;
        }
        int dimensionPixelSize = resources2.getDimensionPixelSize(i2);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        setOnClickListener(new n20(0, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        setText((String) obj);
    }

    /* JADX INFO: renamed from: getActionButtonBackground$src_main_java_com_spotify_encoremobile_buttons_buttons */
    public abstract int getActionButtonBackground();

    /* JADX INFO: renamed from: getBtnTintList$src_main_java_com_spotify_encoremobile_buttons_buttons */
    public abstract int getBtnTintList();

    /* JADX INFO: renamed from: getTextColorAttr$src_main_java_com_spotify_encoremobile_buttons_buttons */
    public abstract int getTextColorAttr();

    /* JADX INFO: renamed from: getTextTintList$src_main_java_com_spotify_encoremobile_buttons_buttons */
    public abstract int getTextTintList();

    /* JADX INFO: renamed from: j */
    public final void m66091j() {
        setGravity(17);
        setSingleLine(true);
        setBackground(ihf1.m50639w(getContext(), getActionButtonBackground()));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(this.f160898f, f2u0.f65266a, this.f160899g, this.f160900h);
        setButtonSize(tta.values()[typedArrayObtainStyledAttributes.getInt(0, 0)]);
        typedArrayObtainStyledAttributes.recycle();
    }
}
