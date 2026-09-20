package p204p;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* JADX INFO: loaded from: classes2.dex */
public final class pk91 {

    /* JADX INFO: renamed from: a */
    public final Context f178417a;

    /* JADX INFO: renamed from: b */
    public final wg61 f178418b = new wg61(new ok91(this));

    public pk91(Context context) {
        this.f178417a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m70182a() {
        if (Build.VERSION.SDK_INT >= 29) {
            wg61 wg61Var = this.f178418b;
            if (((Vibrator) wg61Var.getValue()).hasVibrator()) {
                ((Vibrator) wg61Var.getValue()).vibrate(VibrationEffect.createPredefined(2));
            }
        }
    }
}
