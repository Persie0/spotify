package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.encoreconsumermobile.elements.badge.live.LiveEventBadgeView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class sk90 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210060a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f210061b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LiveEventBadgeView f210062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk90(Context context, LiveEventBadgeView liveEventBadgeView, int i) {
        super(0);
        this.f210060a = i;
        this.f210061b = context;
        this.f210062c = liveEventBadgeView;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f210060a) {
            case 0:
                Drawable drawable = this.f210061b.getDrawable(R.drawable.event_badge_background);
                if (drawable == null) {
                    throw new IllegalStateException("Could not get drawable resource");
                }
                drawable.setTintList(this.f210062c.getEndedColor());
                return drawable;
            case 1:
                Drawable drawable2 = this.f210061b.getDrawable(R.drawable.event_badge_background);
                if (drawable2 == null) {
                    throw new IllegalStateException("Could not get drawable resource");
                }
                drawable2.setTintList(this.f210062c.getLiveColor());
                return drawable2;
            default:
                Drawable drawable3 = this.f210061b.getDrawable(R.drawable.event_badge_background);
                if (drawable3 == null) {
                    throw new IllegalStateException("Could not get drawable resource");
                }
                drawable3.setTintList(this.f210062c.getScheduledColor());
                return drawable3;
        }
    }
}
