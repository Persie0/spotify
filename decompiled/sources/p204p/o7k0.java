package p204p;

import android.app.PictureInPictureParams;
import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.os.VibratorManager;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class o7k0 implements Function {

    /* JADX INFO: renamed from: a */
    public static final o7k0 f162585a = new o7k0();

    /* JADX INFO: renamed from: a */
    public static final Vibrator m66381a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            VibratorManager vibratorManager = systemService instanceof VibratorManager ? (VibratorManager) systemService : null;
            if (vibratorManager != null) {
                return vibratorManager.getDefaultVibrator();
            }
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            if (systemService2 instanceof Vibrator) {
                return (Vibrator) systemService2;
            }
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return new PictureInPictureParams.Builder().setAutoEnterEnabled(((Boolean) obj).booleanValue()).build();
    }
}
