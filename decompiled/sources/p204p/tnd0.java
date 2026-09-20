package p204p;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class tnd0 {

    /* JADX INFO: renamed from: a */
    public final MediaSessionManager.RemoteUserInfo f221946a;

    /* JADX INFO: renamed from: b */
    public final int f221947b;

    /* JADX INFO: renamed from: c */
    public final int f221948c;

    /* JADX INFO: renamed from: d */
    public final boolean f221949d;

    /* JADX INFO: renamed from: e */
    public final snd0 f221950e;

    /* JADX INFO: renamed from: f */
    public final Bundle f221951f;

    public tnd0(MediaSessionManager.RemoteUserInfo remoteUserInfo, int i, int i2, boolean z, snd0 snd0Var, Bundle bundle) {
        this.f221946a = remoteUserInfo;
        this.f221947b = i;
        this.f221948c = i2;
        this.f221949d = z;
        this.f221950e = snd0Var;
        this.f221951f = bundle;
    }

    /* JADX INFO: renamed from: a */
    public static tnd0 m81172a() {
        return new tnd0(new MediaSessionManager.RemoteUserInfo(MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER, -1, -1), 0, 0, false, null, Bundle.EMPTY);
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m81173b() {
        return new Bundle(this.f221951f);
    }

    /* JADX INFO: renamed from: c */
    public final String m81174c() {
        return this.f221946a.getPackageName();
    }

    /* JADX INFO: renamed from: d */
    public final int m81175d() {
        return this.f221946a.getUid();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tnd0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        tnd0 tnd0Var = (tnd0) obj;
        snd0 snd0Var = tnd0Var.f221950e;
        snd0 snd0Var2 = this.f221950e;
        return (snd0Var2 == null && snd0Var == null) ? this.f221946a.equals(tnd0Var.f221946a) : Objects.equals(snd0Var2, snd0Var);
    }

    public final int hashCode() {
        return Objects.hash(this.f221950e, this.f221946a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        MediaSessionManager.RemoteUserInfo remoteUserInfo = this.f221946a;
        sb.append(remoteUserInfo.getPackageName());
        sb.append(", uid=");
        sb.append(remoteUserInfo.getUid());
        sb.append("}");
        return sb.toString();
    }
}
