package p204p;

import androidx.media3.session.legacy.MediaSessionManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class mqd0 implements snd0 {

    /* JADX INFO: renamed from: a */
    public final MediaSessionManager.RemoteUserInfo f146254a;

    public mqd0(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f146254a = remoteUserInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != mqd0.class) {
            return false;
        }
        return Objects.equals(this.f146254a, ((mqd0) obj).f146254a);
    }

    public final int hashCode() {
        return Objects.hash(this.f146254a);
    }
}
