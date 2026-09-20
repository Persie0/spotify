package p204p;

import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;
import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: classes6.dex */
public final class nsz0 extends OrientationEventListener {

    /* JADX INFO: renamed from: a */
    public final boolean f157937a;

    /* JADX INFO: renamed from: b */
    public final PublishProcessor f157938b;

    public nsz0(Context context) {
        super(context);
        this.f157937a = Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1;
        this.f157938b = new PublishProcessor();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m65591a(int i, int i2) {
        return 180 - Math.abs(Math.abs(i - i2) + (-180)) <= 15;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        uvl0 uvl0Var;
        if (!this.f157937a || i == -1) {
            return;
        }
        if (m65591a(i, 0)) {
            uvl0Var = uvl0.f234466a;
        } else {
            uvl0Var = (m65591a(i, 90) || m65591a(i, 270)) ? uvl0.f234467b : null;
        }
        if (uvl0Var != null) {
            this.f157938b.onNext(uvl0Var);
        }
    }
}
