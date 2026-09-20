package p204p;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class x780 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mcu f258852b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x780(mcu mcuVar, int i) {
        super(0);
        this.f258851a = i;
        this.f258852b = mcuVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f258851a) {
            case 0:
                return Integer.valueOf(((ConstraintLayout) this.f258852b.f142249b).getResources().getDimensionPixelSize(R.dimen.library_clear_chips_circle_size));
            case 1:
                return Integer.valueOf(((ConstraintLayout) this.f258852b.f142249b).getResources().getDimensionPixelSize(R.dimen.library_clear_chips_icon_size));
            default:
                return Integer.valueOf(((ConstraintLayout) this.f258852b.f142249b).getResources().getDimensionPixelSize(R.dimen.library_clear_chips_button_size));
        }
    }
}
