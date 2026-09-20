package p204p;

import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.playprogressbar.PlayProgressBarView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class n1q extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f149483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o1q f149484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1q(o1q o1qVar, int i) {
        super(0);
        this.f149483a = i;
        this.f149484b = o1qVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f149483a) {
            case 0:
                return this.f149484b.findViewById(R.id.check_play_icon);
            case 1:
                return this.f149484b.findViewById(R.id.play_progress);
            case 2:
                return (TextView) this.f149484b.findViewById(R.id.played_text);
            case 3:
                return (PlayProgressBarView) this.f149484b.findViewById(R.id.progress_bar);
            default:
                return (TextView) this.f149484b.findViewById(R.id.progress_text);
        }
    }
}
