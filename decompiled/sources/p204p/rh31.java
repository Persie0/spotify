package p204p;

import com.spotify.jam.internal.socialconnect.models.DeviceBroadcastStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class rh31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final DeviceBroadcastStatus f199101a;

    public rh31(DeviceBroadcastStatus deviceBroadcastStatus) {
        this.f199101a = deviceBroadcastStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rh31) && wj50.m88271j(this.f199101a, ((rh31) obj).f199101a);
    }

    public final int hashCode() {
        return this.f199101a.hashCode();
    }
}
