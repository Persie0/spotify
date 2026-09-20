package p204p;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class xm90 implements owt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263322a;

    /* JADX INFO: renamed from: b */
    public final ProgressBar f263323b;

    public xm90(Context context, int i) {
        this.f263322a = i;
        switch (i) {
            case 1:
                ProgressBar progressBar = new ProgressBar(context, null, 0);
                progressBar.setProgressDrawable(context.getDrawable(R.drawable.live_progress_bar_rounded));
                progressBar.setPadding(0, 0, 0, 0);
                this.f263323b = progressBar;
                break;
            case 2:
                ProgressBar progressBar2 = new ProgressBar(context, null, 0);
                progressBar2.setProgressDrawable(context.getDrawable(R.drawable.progress_bar_rounded));
                progressBar2.setPadding(0, 0, 0, 0);
                this.f263323b = progressBar2;
                break;
            default:
                ProgressBar progressBar3 = new ProgressBar(context, null, 0);
                progressBar3.setProgressDrawable(context.getDrawable(R.drawable.live_progress_bar_rounded));
                progressBar3.setPadding(0, 0, 0, 0);
                this.f263323b = progressBar3;
                break;
        }
    }

    @Override // p204p.owt
    /* JADX INFO: renamed from: a */
    public final void mo26764a(Object obj, ext extVar) {
        switch (this.f263322a) {
            case 0:
                vm90 vm90Var = (vm90) obj;
                int i = (int) vm90Var.f242737b;
                ProgressBar progressBar = this.f263323b;
                progressBar.setMax(i);
                progressBar.setProgress((int) vm90Var.f242736a);
                break;
            case 1:
                wm90 wm90Var = (wm90) obj;
                int i2 = (int) wm90Var.f252761b;
                ProgressBar progressBar2 = this.f263323b;
                progressBar2.setMax(i2);
                progressBar2.setProgress((int) wm90Var.f252760a);
                break;
            default:
                f8s0 f8s0Var = (f8s0) obj;
                int i3 = (int) f8s0Var.f67082b;
                ProgressBar progressBar3 = this.f263323b;
                progressBar3.setMax(i3);
                progressBar3.setProgress((int) f8s0Var.f67081a);
                break;
        }
    }

    @Override // p204p.owt
    public final View getView() {
        switch (this.f263322a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f263323b;
    }
}
