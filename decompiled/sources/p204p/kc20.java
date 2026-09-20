package p204p;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class kc20 implements ddm0 {

    /* JADX INFO: renamed from: a */
    public final xre f121346a;

    /* JADX INFO: renamed from: b */
    public long f121347b;

    /* JADX INFO: renamed from: c */
    public final Vibrator f121348c;

    public kc20(Context context, xre xreVar) {
        this.f121346a = xreVar;
        this.f121348c = o7k0.m66381a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55980a(edm0 edm0Var) {
        VibrationEffect vibrationEffectCreateOneShot;
        VibrationEffect vibrationEffectCreatePredefined;
        Vibrator vibrator = this.f121348c;
        if (vibrator == null) {
            return;
        }
        edm0 edm0Var2 = edm0.f58547b;
        xre xreVar = this.f121346a;
        if (edm0Var != edm0Var2) {
            ((wy3) xreVar).getClass();
            if (System.currentTimeMillis() - this.f121347b < 500) {
                return;
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            int iOrdinal = edm0Var.ordinal();
            if (iOrdinal == 0) {
                vibrationEffectCreatePredefined = VibrationEffect.createPredefined(5);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                vibrationEffectCreatePredefined = VibrationEffect.createPredefined(1);
            }
            wj50.m88279p(vibrationEffectCreatePredefined);
            if (vibrator != null) {
                vibrator.vibrate(vibrationEffectCreatePredefined);
            }
        } else if (i >= 26) {
            int iOrdinal2 = edm0Var.ordinal();
            if (iOrdinal2 == 0) {
                vibrationEffectCreateOneShot = VibrationEffect.createOneShot(30L, 180);
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                vibrationEffectCreateOneShot = VibrationEffect.createWaveform(new long[]{0, 30, 80, 30}, new int[]{0, 255, 0, 255}, -1);
            }
            if (vibrator != null) {
                vibrator.vibrate(vibrationEffectCreateOneShot);
            }
        } else {
            int iOrdinal3 = edm0Var.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (vibrator != null) {
                    vibrator.vibrate(new long[]{0, 30, 80, 30}, -1);
                }
            } else if (vibrator != null) {
                vibrator.vibrate(30L);
            }
        }
        ((wy3) xreVar).getClass();
        this.f121347b = System.currentTimeMillis();
    }
}
