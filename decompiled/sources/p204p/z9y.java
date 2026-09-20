package p204p;

import android.widget.SeekBar;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.nowplayingmini.uicomponents.seekbar.FadingSeekBarView;

/* JADX INFO: loaded from: classes8.dex */
public final class z9y implements lqb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FadingSeekBarView f280900a;

    public z9y(FadingSeekBarView fadingSeekBarView) {
        this.f280900a = fadingSeekBarView;
    }

    @Override // p204p.lqb
    /* JADX INFO: renamed from: a */
    public final void mo59732a(CancellableSeekBar cancellableSeekBar) {
        FadingSeekBarView fadingSeekBarView = this.f280900a;
        wbz0 wbz0Var = fadingSeekBarView.f6339V0;
        if (wbz0Var != null) {
            ype ypeVar = (ype) wbz0Var;
            xbz0 xbz0Var = (xbz0) ypeVar.f274920i;
            if (xbz0Var == null) {
                wj50.m88260d0("viewBinder");
                throw null;
            }
            xbz0Var.setPositionText(ypeVar.f274912a);
            ypeVar.f274913b = false;
        }
        fadingSeekBarView.setTimestampsVisible(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        wbz0 wbz0Var;
        if (!z || (wbz0Var = this.f280900a.f6339V0) == null) {
            return;
        }
        ((ype) wbz0Var).m94300c(i, true);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f280900a.setTimestampsVisible(true);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        FadingSeekBarView fadingSeekBarView = this.f280900a;
        wbz0 wbz0Var = fadingSeekBarView.f6339V0;
        if (wbz0Var != null) {
            ((ype) wbz0Var).m94300c(seekBar.getProgress(), false);
        }
        fadingSeekBarView.setTimestampsVisible(false);
    }
}
