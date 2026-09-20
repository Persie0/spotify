package p204p;

import android.content.Context;
import android.view.MotionEvent;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class srk extends wba {

    /* JADX INFO: renamed from: O0 */
    public final l02 f213330O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f213331P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f213332Q0;

    public srk(Context context, l02 l02Var) {
        super(context, R.style.CoreBottomSheetTheme);
        this.f213330O0 = l02Var;
    }

    @Override // p204p.wba, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (((Boolean) this.f213330O0.invoke()).booleanValue()) {
            super.cancel();
        } else {
            this.f213331P0 = false;
        }
    }

    @Override // p204p.n65, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f213331P0 = true;
        if (this.f213332Q0) {
            return;
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f213331P0) {
            this.f213332Q0 = true;
            try {
                return super.dispatchTouchEvent(motionEvent);
            } catch (NullPointerException e) {
                na6.m63959g("Failed to dispatch a touch event to a bottom sheet", e);
            } finally {
                this.f213332Q0 = false;
                if (this.f213331P0) {
                    super.dismiss();
                }
            }
        }
        return true;
    }
}
