package p204p;

import android.widget.SeekBar;
import com.spotify.encoremobile.widgets.CancellableSeekBar;

/* JADX INFO: loaded from: classes6.dex */
public final class mqb implements lqb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146234a;

    /* JADX INFO: renamed from: b */
    public boolean f146235b;

    /* JADX INFO: renamed from: c */
    public final Object f146236c;

    public /* synthetic */ mqb(Object obj, int i) {
        this.f146234a = i;
        this.f146236c = obj;
    }

    @Override // p204p.lqb
    /* JADX INFO: renamed from: a */
    public final void mo59732a(CancellableSeekBar cancellableSeekBar) {
        switch (this.f146234a) {
            case 0:
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.f146236c;
                if (onSeekBarChangeListener instanceof lqb) {
                    ((lqb) onSeekBarChangeListener).mo59732a(cancellableSeekBar);
                }
                break;
            default:
                ((szp) this.f146236c).invoke(sq81.f213039a);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        switch (this.f146234a) {
            case 0:
                ((SeekBar.OnSeekBarChangeListener) this.f146236c).onProgressChanged(seekBar, i, z);
                break;
            default:
                if (z) {
                    ((szp) this.f146236c).invoke(this.f146235b ? new uq81(i) : new tq81(i));
                }
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.f146234a) {
            case 0:
                ((SeekBar.OnSeekBarChangeListener) this.f146236c).onStartTrackingTouch(seekBar);
                break;
            default:
                this.f146235b = true;
                ((szp) this.f146236c).invoke(vq81.f243902a);
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.f146234a) {
            case 0:
                if (!this.f146235b) {
                    ((SeekBar.OnSeekBarChangeListener) this.f146236c).onStopTrackingTouch(seekBar);
                } else {
                    this.f146235b = false;
                }
                break;
            default:
                this.f146235b = false;
                ((szp) this.f146236c).invoke(new tq81(seekBar.getProgress()));
                break;
        }
    }
}
