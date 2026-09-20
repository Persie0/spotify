package p204p;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class azl0 {

    /* JADX INFO: renamed from: a */
    public final OutputConfiguration f21643a;

    /* JADX INFO: renamed from: b */
    public String f21644b;

    /* JADX INFO: renamed from: c */
    public boolean f21645c;

    /* JADX INFO: renamed from: d */
    public long f21646d = 1;

    public azl0(OutputConfiguration outputConfiguration) {
        this.f21643a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof azl0)) {
            return false;
        }
        azl0 azl0Var = (azl0) obj;
        return this.f21643a.equals(azl0Var.f21643a) && this.f21645c == azl0Var.f21645c && this.f21646d == azl0Var.f21646d && Objects.equals(this.f21644b, azl0Var.f21644b);
    }

    public final int hashCode() {
        int iHashCode = this.f21643a.hashCode() ^ 31;
        int i = (this.f21645c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
        int i2 = (i << 5) - i;
        String str = this.f21644b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i2;
        return Long.hashCode(this.f21646d) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
