package p204p;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.C0014b;
import androidx.car.app.C0023j;
import androidx.car.app.C0024k;
import androidx.car.app.HostException;
import androidx.car.app.IAppHost;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.serialization.BundlerException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pxb {
    public static final int AUDIO_CONTENT_BUFFER_SIZE = 512;
    public static final String AUDIO_CONTENT_MIME = "audio/l16";
    public static final int AUDIO_CONTENT_SAMPLING_RATE = 16000;
    private static final int RECORDSTATE_RECORDING = 1;
    private static final int RECORDSTATE_REMOTE_CLOSED = 2;
    private static final int RECORDSTATE_STOPPED = 0;
    private final C0023j mCarContext;
    private OpenMicrophoneResponse mOpenMicrophoneResponse;
    private int mRecordingState = 0;
    private final Object mRecordingStateLock = new Object();

    public pxb(C0023j c0023j) {
        this.mCarContext = c0023j;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m71376a(pxb pxbVar) {
        synchronized (pxbVar.mRecordingStateLock) {
            pxbVar.mRecordingState = 2;
        }
    }

    public static pxb create(C0023j c0023j) {
        Objects.requireNonNull(c0023j);
        try {
            return (pxb) Class.forName(c0023j.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "androidx.car.app.media.AutomotiveCarAudioRecord" : "androidx.car.app.media.ProjectedCarAudioRecord").getConstructor(C0023j.class).newInstance(c0023j);
        } catch (ReflectiveOperationException unused) {
            throw new IllegalStateException("CarAudioRecord not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        synchronized (this.mRecordingStateLock) {
            int i3 = this.mRecordingState;
            if (i3 == 0) {
                throw new IllegalStateException("Called read before calling startRecording or after calling stopRecording");
            }
            if (i3 != 2) {
                return readInternal(bArr, i, i2);
            }
            return -1;
        }
    }

    public abstract int readInternal(byte[] bArr, int i, int i2);

    public void startRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                if (this.mRecordingState != 0) {
                    throw new IllegalStateException("Cannot start recording if it has started and not been stopped");
                }
                C0014b c0014b = (C0014b) this.mCarContext.m214d(C0014b.class);
                OpenMicrophoneRequest openMicrophoneRequest = new OpenMicrophoneRequest(new uol0(new io9(this, 6)));
                c0014b.getClass();
                OpenMicrophoneResponse openMicrophoneResponse = null;
                try {
                    C0024k c0024k = c0014b.f406c;
                    try {
                        Log.isLoggable("CarApp", 3);
                        IInterface iInterfaceM217b = c0024k.m217b("app");
                        if (iInterfaceM217b != null) {
                            pra praVarOpenMicrophone = ((IAppHost) iInterfaceM217b).openMicrophone(new pra(openMicrophoneRequest));
                            if (praVarOpenMicrophone != null) {
                                openMicrophoneResponse = (OpenMicrophoneResponse) praVarOpenMicrophone.m70706c();
                            }
                        }
                        this.mOpenMicrophoneResponse = openMicrophoneResponse;
                        if (openMicrophoneResponse == null) {
                            this.mOpenMicrophoneResponse = new OpenMicrophoneResponse(new vol0(new lp7(15)));
                        }
                        startRecordingInternal(this.mOpenMicrophoneResponse);
                        this.mRecordingState = 1;
                    } catch (SecurityException e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        throw new HostException("Remote openMicrophone call failed", e2);
                    }
                } catch (RemoteException | BundlerException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse);

    public void stopRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                OpenMicrophoneResponse openMicrophoneResponse = this.mOpenMicrophoneResponse;
                if (openMicrophoneResponse != null) {
                    if (this.mRecordingState != 2) {
                        openMicrophoneResponse.getCarAudioCallback().onStopRecording();
                    }
                    this.mOpenMicrophoneResponse = null;
                }
                stopRecordingInternal();
                this.mRecordingState = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void stopRecordingInternal();
}
