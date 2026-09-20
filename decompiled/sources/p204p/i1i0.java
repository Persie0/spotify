package p204p;

import android.view.MotionEvent;
import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes3.dex */
public final class i1i0 {

    /* JADX INFO: renamed from: a */
    public static final i1i0 f97537a = new i1i0();

    /* JADX INFO: renamed from: a */
    public final boolean m49416a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }
}
