package com.spotify.encoreconsumermobile.elements.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.d2u0;
import p204p.gh00;
import p204p.iqg1;
import p204p.n20;
import p204p.oqs;
import p204p.v601;
import p204p.vc41;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/settings/SettingsButton;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_settings-settings"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SettingsButton extends StateListAnimatorImageButton implements oqs {
    public SettingsButton(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        setOnClickListener(new n20(22, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        setContentDescription(((v601) obj).f237699a);
    }

    public SettingsButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SettingsButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vc41 vc41Var = vc41.GEARS;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.encore_action_button_icon_size_small);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d2u0.f44672a, i, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, dimensionPixelSize);
        typedArrayObtainStyledAttributes.recycle();
        setImageDrawable(iqg1.m51376r(context, vc41Var, R.color.encore_accessory, dimensionPixelSize2));
    }

    public /* synthetic */ SettingsButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
