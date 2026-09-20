package com.spotify.campaigns.storyscenestemplates.summary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.R;
import kotlin.Metadata;
import p204p.mec1;
import p204p.r361;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/campaigns/storyscenestemplates/summary/SummaryView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/r361;", "data", "Lp/w2a1;", "setUpAccessibility", "(Lp/r361;)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "setData", "getCardTranslationX$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates", "()I", "getCardTranslationX", "src_main_java_com_spotify_campaigns_storyscenestemplates-storyscenestemplates"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SummaryView extends View {

    /* JADX INFO: renamed from: a */
    public float f3123a;

    /* JADX INFO: renamed from: b */
    public float f3124b;

    /* JADX INFO: renamed from: c */
    public float f3125c;

    /* JADX INFO: renamed from: d */
    public final View f3126d;

    /* JADX INFO: renamed from: e */
    public final View f3127e;

    public SummaryView(Context context) {
        this(context, null);
    }

    private final void setUpAccessibility(r361 data) {
        throw null;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.ImageView";
    }

    /* JADX INFO: renamed from: getCardTranslationX$src_main_java_com_spotify_campaigns_storyscenestemplates_storyscenestemplates */
    public final int m4195x2861ba77() {
        return (int) this.f3124b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(this.f3124b, this.f3125c);
        float f = this.f3123a;
        canvas.scale(f, f);
        this.f3126d.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f = i;
        float f2 = i2;
        float fMin = Math.min(f / 540.0f, f2 / 960.0f);
        this.f3123a = fMin;
        this.f3124b = (f - (540.0f * fMin)) / 2.0f;
        this.f3125c = (f2 - (fMin * 960.0f)) / 2.0f;
    }

    @SuppressLint({"SetTextI18n"})
    public final void setData(r361 data) {
        throw null;
    }

    public SummaryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SummaryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.summary_scene_card_item, (ViewGroup) new FrameLayout(context), false);
        this.f3126d = viewInflate;
        this.f3127e = mec1.m61562n(viewInflate, R.id.summary_card_background);
        TextView[] textViewArr = {mec1.m61562n(viewInflate, R.id.summary_card_left_data_one), mec1.m61562n(viewInflate, R.id.summary_card_left_data_two), mec1.m61562n(viewInflate, R.id.summary_card_left_data_three), mec1.m61562n(viewInflate, R.id.summary_card_left_data_four), mec1.m61562n(viewInflate, R.id.summary_card_left_data_five)};
        TextView[] textViewArr2 = {mec1.m61562n(viewInflate, R.id.summary_card_right_data_one), mec1.m61562n(viewInflate, R.id.summary_card_right_data_two), mec1.m61562n(viewInflate, R.id.summary_card_right_data_three), mec1.m61562n(viewInflate, R.id.summary_card_right_data_four), mec1.m61562n(viewInflate, R.id.summary_card_right_data_five)};
    }
}
