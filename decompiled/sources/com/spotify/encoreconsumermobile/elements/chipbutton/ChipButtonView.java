package com.spotify.encoreconsumermobile.elements.chipbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gh00;
import p204p.ikc0;
import p204p.n20;
import p204p.oqs;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/chipbutton/ChipButtonView;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_chipbutton-chipbutton"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ChipButtonView extends StateListAnimatorButton implements oqs {
    public ChipButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        setOnClickListener(new n20(4, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        ikc0.m50942n(obj);
        throw null;
    }

    public ChipButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChipButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setBackground(context.getDrawable(R.drawable.chip_button_background));
        int dimension = (int) getResources().getDimension(R.dimen.chip_button_vertical_padding);
        int dimension2 = (int) getResources().getDimension(R.dimen.chip_button_horizontal_padding);
        setPadding(dimension2, dimension, dimension2, dimension);
        setGravity(17);
        setTextColor(context.getColor(R.color.white));
    }

    public /* synthetic */ ChipButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
