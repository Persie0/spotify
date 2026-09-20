package p204p;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class c3q extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d3q f33728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3q(d3q d3qVar, int i) {
        super(0);
        this.f33727a = i;
        this.f33728b = d3qVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f33727a) {
            case 0:
                return Integer.valueOf(this.f33728b.f44976a.getContext().getResources().getDimensionPixelSize(R.dimen.encore_badge_margin));
            case 1:
                return Integer.valueOf(this.f33728b.f44976a.getContext().getResources().getDimensionPixelSize(R.dimen.encore_badge_size));
            case 2:
                return new xjj0(this.f33728b.f44976a.getContext());
            case 3:
                return new h210(this.f33728b.f44976a.getContext());
            case 4:
                Context context = this.f33728b.f44976a.getContext();
                ntb1 ntb1Var = new ntb1(context, null, 0, R.drawable.encore_icon_video);
                ntb1Var.setContentDescription(ntb1Var.getResources().getString(R.string.your_library_video_downloaded_badge_content_description));
                ntb1Var.setAdjustViewBounds(true);
                ntb1Var.setImageTintList(lzj.m60387w(context, R.color.video_downloaded_badge_color));
                ntb1Var.setIconActive(true);
                return ntb1Var;
            case 5:
                return new LockedBadgeView(new ContextThemeWrapper(this.f33728b.f44976a.getContext(), R.style.LockedBadgeViewInText), null, 0, 6, null);
            case 6:
                return new szn0(this.f33728b.f44976a.getContext());
            case 7:
                Context context2 = this.f33728b.f44976a.getContext();
                vi71 vi71Var = new vi71(context2, null, 0, R.drawable.encore_icon_events);
                vi71Var.setContentDescription(vi71Var.getResources().getString(R.string.your_library_ticket_badge_content_description));
                vi71Var.setAdjustViewBounds(true);
                vi71Var.setImageTintList(lzj.m60387w(context2, R.color.ticket_badge_color));
                vi71Var.setIconActive(false);
                return vi71Var;
            case 8:
                return new mff0(this.f33728b.f44976a.getContext());
            case 9:
                return new bcq0(this.f33728b.f44976a.getContext());
            default:
                return new DownloadBadgeView(this.f33728b.f44976a.getContext(), null, 0, 6, null);
        }
    }
}
