package p204p;

import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ngo0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlayButtonView f153747b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ngo0(PlayButtonView playButtonView, int i) {
        super(0);
        this.f153746a = i;
        this.f153747b = playButtonView;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f153746a) {
            case 0:
                PlayButtonView playButtonView = this.f153747b;
                return iqg1.m51376r(playButtonView.getContext(), vc41.LOCKED_ACTIVE, R.color.encore_lock_icon_color, playButtonView.getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_badge_size));
            default:
                PlayButtonView playButtonView2 = this.f153747b;
                return iqg1.m51376r(playButtonView2.getContext(), vc41.SHUFFLE, R.color.encore_accent_color, playButtonView2.getContext().getResources().getDimensionPixelSize(R.dimen.encore_play_button_badge_size));
        }
    }
}
