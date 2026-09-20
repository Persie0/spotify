package p204p;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class peb {

    /* JADX INFO: renamed from: b */
    public final qq8 f176692b;

    /* JADX INFO: renamed from: c */
    public final String f176693c;

    /* JADX INFO: renamed from: a */
    public final HashMap f176691a = new HashMap();

    /* JADX INFO: renamed from: d */
    public be41 f176694d = null;

    public peb(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f176692b = new oeb(cameraCharacteristics, 8);
        } else {
            this.f176692b = new qq8(cameraCharacteristics, 8);
        }
        this.f176693c = str;
    }

    /* JADX INFO: renamed from: a */
    public final Object m69715a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f176692b.f191505b).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f176691a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f176692b.f191505b).get(key);
                if (obj2 != null) {
                    this.f176691a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final be41 m69716b() {
        if (this.f176694d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m69715a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f176694d = new be41(streamConfigurationMap, new a9i0(this.f176693c));
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.f176694d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m69717c() {
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) this.f176692b.f191505b).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
