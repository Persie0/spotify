package com.spotify.encoreconsumermobile.elements.heart;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gh00;
import p204p.ikc0;
import p204p.n20;
import p204p.oqs;
import p204p.phf1;
import p204p.r9b0;
import p204p.x09;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R \u0010\u001f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0014¨\u0006 "}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/heart/AnimatedHeartButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", x09.f256832d, "Lp/w2a1;", "setEnabled", "(Z)V", "Lp/r9b0;", "d", "Lp/r9b0;", "getActiveHeart", "()Lp/r9b0;", "getActiveHeart$annotations", "()V", "activeHeart", "e", "getHeart", "getHeart$annotations", "heart", "f", "getNudge", "getNudge$annotations", "nudge", "src_main_java_com_spotify_encoreconsumermobile_elements_heart-heart"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AnimatedHeartButton extends AppCompatImageButton implements oqs {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final r9b0 activeHeart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final r9b0 heart;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final r9b0 nudge;

    public AnimatedHeartButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void getActiveHeart$annotations() {
    }

    public static /* synthetic */ void getHeart$annotations() {
    }

    public static /* synthetic */ void getNudge$annotations() {
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        setOnClickListener(new n20(this, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        ikc0.m50942n(obj);
        throw null;
    }

    public final r9b0 getActiveHeart() {
        return this.activeHeart;
    }

    public final r9b0 getHeart() {
        return this.heart;
    }

    public final r9b0 getNudge() {
        return this.nudge;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setAlpha(enabled ? 1.0f : 0.5f);
    }

    public AnimatedHeartButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AnimatedHeartButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.activeHeart = phf1.m69997p(context, R.raw.heart_positive_white);
        this.heart = phf1.m69997p(context, R.raw.heart_undo_white);
        this.nudge = phf1.m69997p(context, R.raw.heart_nudge);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public /* synthetic */ AnimatedHeartButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
