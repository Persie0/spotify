package com.spotify.encoreconsumermobile.elements.markasplayed;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gh00;
import p204p.lzj;
import p204p.n20;
import p204p.oqs;
import p204p.pkc0;
import p204p.tc41;
import p204p.vc41;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/markasplayed/MarkAsPlayedButtonView;", "", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_markasplayed-markasplayed"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MarkAsPlayedButtonView extends StateListAnimatorImageButton implements oqs {
    public MarkAsPlayedButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        setOnClickListener(new n20(17, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        setContentDescription(getContext().getResources().getString(R.string.mark_as_played_content_description, ((pkc0) obj).f178430a));
    }

    public MarkAsPlayedButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MarkAsPlayedButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        tc41 tc41Var = new tc41(context, vc41.CHECK, context.getResources().getDimension(R.dimen.mark_as_played_button_view_size));
        tc41Var.m80418c(lzj.m60387w(context, R.color.encore_accessory));
        setImageDrawable(tc41Var);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public /* synthetic */ MarkAsPlayedButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
