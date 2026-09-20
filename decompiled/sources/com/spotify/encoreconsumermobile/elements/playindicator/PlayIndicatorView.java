package com.spotify.encoreconsumermobile.elements.playindicator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.edb;
import p204p.flo0;
import p204p.glo0;
import p204p.oqs;
import p204p.r9b0;
import p204p.vko0;
import p204p.wg61;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001b\u0010\u0019\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u001b\u0010\u001c\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000fR\u001b\u0010\u001f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000fR\u001b\u0010\"\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\u000fR\u001b\u0010%\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u000fR\u001b\u0010(\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000fR\u001b\u0010+\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000fR\u001b\u0010.\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u000fR\u001b\u00101\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b0\u0010\u000f¨\u00062"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/playindicator/PlayIndicatorView;", "", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/r9b0;", "d", "Lp/fr70;", "getPlayingDrawable", "()Lp/r9b0;", "playingDrawable", "e", "getWhitePlayingDrawable", "whitePlayingDrawable", "f", "getBlackPlayingDrawable", "blackPlayingDrawable", "g", "getPausedDrawable", "pausedDrawable", "h", "getWhitePausedDrawable", "whitePausedDrawable", "i", "getBlackPausedDrawable", "blackPausedDrawable", "t", "getPlayingToPausedDrawable", "playingToPausedDrawable", "L0", "getWhitePlayingToPausedDrawable", "whitePlayingToPausedDrawable", "M0", "getBlackPlayingToPausedDrawable", "blackPlayingToPausedDrawable", "N0", "getPausedToPlayingDrawable", "pausedToPlayingDrawable", "O0", "getWhitePausedToPlayingDrawable", "whitePausedToPlayingDrawable", "P0", "getBlackPausedToPlayingDrawable", "blackPausedToPlayingDrawable", "src_main_java_com_spotify_encoreconsumermobile_elements_playindicator-playindicator"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PlayIndicatorView extends AppCompatImageView implements oqs {

    /* JADX INFO: renamed from: L0 */
    public final wg61 f3698L0;

    /* JADX INFO: renamed from: M0 */
    public final wg61 f3699M0;

    /* JADX INFO: renamed from: N0 */
    public final wg61 f3700N0;

    /* JADX INFO: renamed from: O0 */
    public final wg61 f3701O0;

    /* JADX INFO: renamed from: P0 */
    public final wg61 f3702P0;

    /* JADX INFO: renamed from: Q0 */
    public final String f3703Q0;

    /* JADX INFO: renamed from: R0 */
    public final String f3704R0;

    /* JADX INFO: renamed from: S0 */
    public int f3705S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f3706T0;

    /* JADX INFO: renamed from: d */
    public final wg61 f3707d;

    /* JADX INFO: renamed from: e */
    public final wg61 f3708e;

    /* JADX INFO: renamed from: f */
    public final wg61 f3709f;

    /* JADX INFO: renamed from: g */
    public final wg61 f3710g;

    /* JADX INFO: renamed from: h */
    public final wg61 f3711h;

    /* JADX INFO: renamed from: i */
    public final wg61 f3712i;

    /* JADX INFO: renamed from: t */
    public final wg61 f3713t;

    public PlayIndicatorView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final r9b0 getBlackPausedDrawable() {
        return (r9b0) this.f3712i.getValue();
    }

    private final r9b0 getBlackPausedToPlayingDrawable() {
        return (r9b0) this.f3702P0.getValue();
    }

    private final r9b0 getBlackPlayingDrawable() {
        return (r9b0) this.f3709f.getValue();
    }

    private final r9b0 getBlackPlayingToPausedDrawable() {
        return (r9b0) this.f3699M0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r9b0 getPausedDrawable() {
        return (r9b0) this.f3710g.getValue();
    }

    private final r9b0 getPausedToPlayingDrawable() {
        return (r9b0) this.f3700N0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r9b0 getPlayingDrawable() {
        return (r9b0) this.f3707d.getValue();
    }

    private final r9b0 getPlayingToPausedDrawable() {
        return (r9b0) this.f3713t.getValue();
    }

    private final r9b0 getWhitePausedDrawable() {
        return (r9b0) this.f3711h.getValue();
    }

    private final r9b0 getWhitePausedToPlayingDrawable() {
        return (r9b0) this.f3701O0.getValue();
    }

    private final r9b0 getWhitePlayingDrawable() {
        return (r9b0) this.f3708e.getValue();
    }

    private final r9b0 getWhitePlayingToPausedDrawable() {
        return (r9b0) this.f3698L0.getValue();
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(vko0 vko0Var) {
        String str;
        int i;
        vko0Var.getClass();
        if (this.f3706T0 && this.f3705S0 == 1) {
            return;
        }
        Drawable drawable = getDrawable();
        r9b0 playingDrawable = null;
        r9b0 r9b0Var = drawable instanceof r9b0 ? (r9b0) drawable : null;
        if (r9b0Var != null) {
            r9b0Var.f196990b.removeAllListeners();
        }
        this.f3705S0 = 1;
        if (getDrawable() != null && wj50.m88271j(getDrawable(), getPlayingDrawable())) {
            Drawable drawable2 = getDrawable();
            r9b0 r9b0Var2 = drawable2 instanceof r9b0 ? (r9b0) drawable2 : null;
            if (r9b0Var2 != null) {
                r9b0Var2.m75027h();
            }
        }
        int iM38547C = edb.m38547C(1);
        if (iM38547C == 0) {
            str = this.f3703Q0;
        } else if (iM38547C == 1) {
            str = this.f3704R0;
        } else {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        setContentDescription(str);
        int iM38547C2 = edb.m38547C(1);
        if (iM38547C2 == 0 || iM38547C2 == 1) {
            i = 0;
        } else {
            if (iM38547C2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8;
        }
        setVisibility(i);
        int iM38547C3 = edb.m38547C(1);
        if (iM38547C3 == 0) {
            int iM38547C4 = edb.m38547C(3);
            if (iM38547C4 != 0) {
                if (iM38547C4 != 1) {
                    if (iM38547C4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (wj50.m88271j(getDrawable(), getBlackPausedDrawable())) {
                        m9642h(getBlackPausedToPlayingDrawable(), 1);
                        playingDrawable = getBlackPausedToPlayingDrawable();
                    } else {
                        playingDrawable = getBlackPlayingDrawable();
                        playingDrawable.m75030k();
                    }
                } else if (wj50.m88271j(getDrawable(), getWhitePausedDrawable())) {
                    m9642h(getWhitePausedToPlayingDrawable(), 1);
                    playingDrawable = getWhitePausedToPlayingDrawable();
                } else {
                    playingDrawable = getWhitePlayingDrawable();
                    playingDrawable.m75030k();
                }
            } else if (wj50.m88271j(getDrawable(), getPausedDrawable())) {
                m9642h(getPausedToPlayingDrawable(), 1);
                playingDrawable = getPausedToPlayingDrawable();
            } else {
                playingDrawable = getPlayingDrawable();
                playingDrawable.m75030k();
            }
        } else if (iM38547C3 == 1) {
            int iM38547C5 = edb.m38547C(3);
            if (iM38547C5 != 0) {
                if (iM38547C5 != 1) {
                    if (iM38547C5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (wj50.m88271j(getDrawable(), getBlackPlayingDrawable())) {
                        m9642h(getBlackPlayingToPausedDrawable(), 2);
                        playingDrawable = getBlackPlayingToPausedDrawable();
                    } else {
                        playingDrawable = getBlackPausedDrawable();
                    }
                } else if (wj50.m88271j(getDrawable(), getWhitePlayingDrawable())) {
                    m9642h(getWhitePlayingToPausedDrawable(), 2);
                    playingDrawable = getWhitePlayingToPausedDrawable();
                } else {
                    playingDrawable = getWhitePausedDrawable();
                }
            } else if (wj50.m88271j(getDrawable(), getPlayingDrawable())) {
                m9642h(getPlayingToPausedDrawable(), 2);
                playingDrawable = getPlayingToPausedDrawable();
            } else {
                playingDrawable = getPausedDrawable();
            }
        }
        setImageDrawable(playingDrawable);
    }

    /* JADX INFO: renamed from: h */
    public final void m9642h(r9b0 r9b0Var, int i) {
        this.f3706T0 = true;
        r9b0Var.m75030k();
        r9b0Var.f196990b.addListener(new glo0(i, this, r9b0Var));
    }

    public PlayIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlayIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3707d = new wg61(new flo0(this, 6));
        this.f3708e = new wg61(new flo0(this, 10));
        this.f3709f = new wg61(new flo0(this, 2));
        this.f3710g = new wg61(new flo0(this, 4));
        this.f3711h = new wg61(new flo0(this, 8));
        this.f3712i = new wg61(new flo0(this, 0));
        this.f3713t = new wg61(new flo0(this, 7));
        this.f3698L0 = new wg61(new flo0(this, 11));
        this.f3699M0 = new wg61(new flo0(this, 3));
        this.f3700N0 = new wg61(new flo0(this, 5));
        this.f3701O0 = new wg61(new flo0(this, 9));
        this.f3702P0 = new wg61(new flo0(this, 1));
        this.f3703Q0 = context.getResources().getString(R.string.play_indicator_playing_content_description);
        this.f3704R0 = context.getResources().getString(R.string.play_indicator_paused_content_description);
        this.f3705S0 = 3;
    }

    public /* synthetic */ PlayIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
