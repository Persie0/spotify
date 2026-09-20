package p204p;

import android.view.View;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;

/* JADX INFO: loaded from: classes8.dex */
public final class tg81 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TrackInfoView f220141b;

    public /* synthetic */ tg81(TrackInfoView trackInfoView, int i) {
        this.f220140a = i;
        this.f220141b = trackInfoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f220140a) {
            case 0:
                this.f220141b.f6347W0.invoke(yf81.f272179a);
                break;
            default:
                this.f220141b.f6347W0.invoke(yf81.f272180b);
                break;
        }
    }
}
