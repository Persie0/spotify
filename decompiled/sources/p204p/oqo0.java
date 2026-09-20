package p204p;

import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class oqo0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f168327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlayProgressBarView f168328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oqo0(PlayProgressBarView playProgressBarView, int i) {
        super(0);
        this.f168327a = i;
        this.f168328b = playProgressBarView;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f168327a) {
            case 0:
                return Integer.valueOf(this.f168328b.getResources().getDimensionPixelSize(R.dimen.play_progress_width));
            default:
                return Integer.valueOf(this.f168328b.getResources().getDimensionPixelSize(R.dimen.play_progress_min_width));
        }
    }
}
