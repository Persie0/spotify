package p204p;

import android.view.InputDevice;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oxu extends ri00 implements eh00 {

    /* JADX INFO: renamed from: h */
    public static final oxu f171571h = new oxu(0, pxu.class, "hasMouseInputDevice", "hasMouseInputDevice()Z", 1);

    @Override // p204p.eh00
    public final Object invoke() {
        wy41 wy41Var = pxu.f183228a;
        boolean z = false;
        for (int i : InputDevice.getDeviceIds()) {
            InputDevice device = InputDevice.getDevice(i);
            if (device != null && device.supportsSource(8194)) {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
