package p204p;

import android.view.ContextThemeWrapper;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class h3p extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f87280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i3p f87281b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3p(i3p i3pVar, int i) {
        super(0);
        this.f87280a = i;
        this.f87281b = i3pVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f87280a) {
            case 0:
                return Integer.valueOf(this.f87281b.f98211a.getContext().getResources().getDimensionPixelSize(R.dimen.encore_badge_margin));
            case 1:
                return Integer.valueOf(this.f87281b.f98211a.getContext().getResources().getDimensionPixelSize(R.dimen.encore_badge_size));
            case 2:
                return new h210(this.f87281b.f98211a.getContext());
            case 3:
                return new LockedBadgeView(new ContextThemeWrapper(this.f87281b.f98211a.getContext(), R.style.LockedBadgeViewInText), null, 0, 6, null);
            case 4:
                return new szn0(this.f87281b.f98211a.getContext());
            case 5:
                return new mff0(this.f87281b.f98211a.getContext());
            case 6:
                return new bcq0(this.f87281b.f98211a.getContext());
            case 7:
                return new xjj0(this.f87281b.f98211a.getContext());
            default:
                return new DownloadBadgeView(this.f87281b.f98211a.getContext(), null, 0, 6, null);
        }
    }
}
