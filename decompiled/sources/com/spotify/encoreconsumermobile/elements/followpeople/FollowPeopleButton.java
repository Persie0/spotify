package com.spotify.encoreconsumermobile.elements.followpeople;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.C2652zj;
import p204p.gh00;
import p204p.n20;
import p204p.oqs;
import p204p.pqm0;
import p204p.wg61;
import p204p.x09;
import p204p.zwz;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/followpeople/FollowPeopleButton;", "Lcom/spotify/legacyglue/widgetstate/StateListAnimatorImageButton;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", x09.f256832d, "Lp/w2a1;", "setEnabled", "(Z)V", "Landroid/graphics/drawable/Drawable;", "e", "Lp/fr70;", "getFollowPeopleIcon", "()Landroid/graphics/drawable/Drawable;", "followPeopleIcon", "src_main_java_com_spotify_encoreconsumermobile_elements_followpeople-followpeople"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class FollowPeopleButton extends StateListAnimatorImageButton implements oqs {

    /* JADX INFO: renamed from: d */
    public zwz f3660d;

    /* JADX INFO: renamed from: e */
    public final wg61 f3661e;

    /* JADX INFO: renamed from: f */
    public final wg61 f3662f;

    public FollowPeopleButton(Context context) {
        this(context, null, 0, 6, null);
    }

    private final Drawable getFollowPeopleIcon() {
        return (Drawable) this.f3661e.getValue();
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(zwz zwzVar) {
        this.f3660d = zwzVar;
        pqm0 pqm0Var = zwzVar.f287116a ? new pqm0((Drawable) this.f3662f.getValue(), Integer.valueOf(R.string.follow_people_button_unfollow_description)) : new pqm0(getFollowPeopleIcon(), Integer.valueOf(R.string.follow_people_button_follow_description));
        Drawable drawable = (Drawable) pqm0Var.f180350a;
        int iIntValue = ((Number) pqm0Var.f180351b).intValue();
        setImageDrawable(drawable);
        setContentDescription(getResources().getString(iIntValue, zwzVar.f287117b));
        setEnabled(zwzVar.f287118c);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        setOnClickListener(new n20(16, gh00Var));
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        int i;
        zwz zwzVar;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (enabled || ((zwzVar = this.f3660d) != null && zwzVar.f287116a)) {
                super.setEnabled(true);
                i = 255;
            } else {
                super.setEnabled(false);
                i = 76;
            }
            drawable.setAlpha(i);
        }
    }

    public FollowPeopleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FollowPeopleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3661e = new wg61(new C2652zj(context, 27));
        this.f3662f = new wg61(new C2652zj(context, 28));
    }

    public /* synthetic */ FollowPeopleButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
