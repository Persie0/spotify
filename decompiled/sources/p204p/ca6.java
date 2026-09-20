package p204p;

import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.p003ui.AspectRatioFrameLayout;
import com.spotify.login.loginflowimpl.DelegatingLoginActivity;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ca6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35752a;

    /* JADX INFO: renamed from: b */
    public boolean f35753b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35754c;

    public /* synthetic */ ca6(Object obj, boolean z, int i) {
        this.f35752a = i;
        this.f35754c = obj;
        this.f35753b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f35752a;
        Object obj = this.f35754c;
        switch (i) {
            case 0:
                this.f35753b = false;
                int i2 = AspectRatioFrameLayout.f1115d;
                ((AspectRatioFrameLayout) obj).getClass();
                break;
            case 1:
                if (!this.f35753b) {
                    ((asb) obj).f19369W0.setVisibility(8);
                }
                break;
            case 2:
                if (!this.f35753b) {
                    ((ctb) obj).f41839i1.setVisibility(8);
                }
                break;
            case 3:
                zfp zfpVar = (zfp) obj;
                Layout layout = ((TextView) zfpVar.f282363g.f286302e).getLayout();
                boolean z = layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0;
                if (this.f35753b || z) {
                    if (((View) zfpVar.f282363g.f286304g).getBackground() == null) {
                        zfpVar.getClass();
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        zu0 zu0Var = zfpVar.f282363g;
                        gradientDrawable.setOrientation(((TextView) zu0Var.f286302e).getLayoutDirection() == 1 ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT);
                        gradientDrawable.setShape(0);
                        gradientDrawable.setColors(new int[]{0, vtg1.m86387n((ConstraintLayout) zu0Var.f286299b, R.attr.baseBackgroundBase)});
                        ((View) zu0Var.f286304g).setBackground(gradientDrawable);
                    }
                    ((TextView) zfpVar.f282363g.f286303f).setVisibility(0);
                    ((View) zfpVar.f282363g.f286304g).setVisibility(0);
                } else {
                    ((TextView) zfpVar.f282363g.f286303f).setVisibility(8);
                    ((View) zfpVar.f282363g.f286304g).setVisibility(8);
                }
                break;
            case 4:
                DelegatingLoginActivity delegatingLoginActivity = (DelegatingLoginActivity) obj;
                delegatingLoginActivity.setResult(this.f35753b ? -1 : 0);
                delegatingLoginActivity.finish();
                break;
            default:
                fvg1.m42870m(((noz) obj).f156825c, true, this.f35753b);
                break;
        }
    }

    public /* synthetic */ ca6(boolean z, lkv0 lkv0Var, int i) {
        this.f35752a = i;
        this.f35753b = z;
        this.f35754c = lkv0Var;
    }

    public ca6(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f35752a = 0;
        this.f35754c = aspectRatioFrameLayout;
    }
}
