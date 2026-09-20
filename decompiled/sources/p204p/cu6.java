package p204p;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: loaded from: classes.dex */
public final class cu6 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eu6 f42057a;

    public cu6(eu6 eu6Var) {
        this.f42057a = eu6Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        eu6.m40029c(this.f42057a);
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        eu6 eu6Var = this.f42057a;
        if (h0b1.m46323m(audioDeviceInfoArr, eu6.m40027a(eu6Var))) {
            eu6Var.f62885j = null;
        }
        eu6.m40029c(eu6Var);
    }
}
