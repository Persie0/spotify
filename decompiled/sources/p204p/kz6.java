package p204p;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioManager$OnCommunicationDeviceChangedListener;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class kz6 {

    /* JADX INFO: renamed from: a */
    public static final kz6 f128021a = new kz6();

    /* JADX INFO: renamed from: a */
    public final void m57733a(AudioManager audioManager, Executor executor, Object obj) {
        audioManager.addOnCommunicationDeviceChangedListener(executor, q95.m72354c(obj));
    }

    /* JADX INFO: renamed from: b */
    public final void m57734b(AudioManager audioManager) {
        audioManager.clearCommunicationDevice();
    }

    /* JADX INFO: renamed from: c */
    public final List<AudioDeviceInfo> m57735c(AudioManager audioManager) {
        return audioManager.getAvailableCommunicationDevices();
    }

    /* JADX INFO: renamed from: d */
    public final AudioDeviceInfo m57736d(AudioManager audioManager) {
        return audioManager.getCommunicationDevice();
    }

    /* JADX INFO: renamed from: e */
    public final Object m57737e(final gh00 gh00Var) {
        return new AudioManager$OnCommunicationDeviceChangedListener() { // from class: p.qz6
            public final /* synthetic */ void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
                gh00Var.invoke(audioDeviceInfo);
            }
        };
    }

    /* JADX INFO: renamed from: f */
    public final void m57738f(AudioManager audioManager, Object obj) {
        audioManager.removeOnCommunicationDeviceChangedListener(q95.m72354c(obj));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m57739g(AudioManager audioManager, AudioDeviceInfo audioDeviceInfo) {
        return audioManager.setCommunicationDevice(audioDeviceInfo);
    }
}
