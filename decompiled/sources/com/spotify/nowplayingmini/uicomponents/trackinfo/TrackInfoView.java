package com.spotify.nowplayingmini.uicomponents.trackinfo;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.queued.QueuedBadgeView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.b3u0;
import p204p.dg81;
import p204p.g6f;
import p204p.gh00;
import p204p.h6f;
import p204p.mec1;
import p204p.tg81;
import p204p.ug81;
import p204p.usa;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/nowplayingmini/uicomponents/trackinfo/TrackInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "styledAttrs", "Lp/w2a1;", "setAppearance", "(Landroid/content/res/TypedArray;)V", "src_main_java_com_spotify_nowplayingmini_uicomponents-uicomponents"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TrackInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: R0 */
    public final TextView f6342R0;

    /* JADX INFO: renamed from: S0 */
    public final TextView f6343S0;

    /* JADX INFO: renamed from: T0 */
    public final EnhancedBadgeView f6344T0;

    /* JADX INFO: renamed from: U0 */
    public final QueuedBadgeView f6345U0;

    /* JADX INFO: renamed from: V0 */
    public final View f6346V0;

    /* JADX INFO: renamed from: W0 */
    public gh00 f6347W0;

    public TrackInfoView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final void setAppearance(TypedArray styledAttrs) {
        this.f6342R0.setTextAppearance(styledAttrs.getResourceId(1, R.style.TextAppearance_TrackInfoTitle));
        this.f6343S0.setTextAppearance(styledAttrs.getResourceId(0, R.style.TextAppearance_TrackInfoSubtitle));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: x */
    public final void m16005x(dg81 dg81Var) {
        ?? r0 = dg81Var.f48751b;
        boolean z = dg81Var.f48753d;
        boolean z2 = dg81Var.f48752c;
        String str = dg81Var.f48750a;
        TextView textView = this.f6342R0;
        if (!str.contentEquals(textView.getText())) {
            textView.setText(str);
            mec1.m61564p(textView, new usa(12));
        }
        textView.setContentDescription(g6f.m43753y0(g6f.m43737o0(h6f.m46715L(str, z2 ? getContext().getString(R.string.nowplayingmini_recommended_track_content_description) : null, z ? getContext().getString(R.string.nowplayingmini_queued_track_content_description) : null)), ", ", null, null, null, 62));
        String str2 = (String) r0.invoke(getContext());
        TextView textView2 = this.f6343S0;
        if (!str2.contentEquals(textView2.getText())) {
            textView2.setText((CharSequence) r0.invoke(getContext()));
            mec1.m61564p(textView2, new usa(12));
        }
        this.f6344T0.setVisibility(z2 ? 0 : 8);
        this.f6345U0.setVisibility(z ? 0 : 8);
        this.f6346V0.setVisibility(dg81Var.f48754e ? 0 : 8);
    }

    public TrackInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrackInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6347W0 = ug81.f230035b;
        View.inflate(context, R.layout.nowplayingmini_track_info_view, this);
        TextView textView = (TextView) findViewById(R.id.track_info_view_title);
        this.f6342R0 = textView;
        TextView textView2 = (TextView) findViewById(R.id.track_info_view_subtitle);
        this.f6343S0 = textView2;
        this.f6344T0 = (EnhancedBadgeView) findViewById(R.id.track_info_view_enhanced_badge);
        this.f6345U0 = (QueuedBadgeView) findViewById(R.id.track_info_view_queued_badge);
        this.f6346V0 = findViewById(R.id.track_info_view_kallax_icon);
        textView.setSelected(true);
        textView2.setSelected(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3u0.f23134a, i, 0);
        setAppearance(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        textView.setOnClickListener(new tg81(this, 0));
        textView2.setOnClickListener(new tg81(this, 1));
    }

    public /* synthetic */ TrackInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
