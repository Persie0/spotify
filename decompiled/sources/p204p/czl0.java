package p204p;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class czl0 {

    /* JADX INFO: renamed from: a */
    public final OutputConfiguration f43589a;

    /* JADX INFO: renamed from: b */
    public String f43590b;

    /* JADX INFO: renamed from: c */
    public long f43591c = 1;

    public czl0(OutputConfiguration outputConfiguration) {
        this.f43589a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof czl0)) {
            return false;
        }
        czl0 czl0Var = (czl0) obj;
        return Objects.equals(this.f43589a, czl0Var.f43589a) && this.f43591c == czl0Var.f43591c && Objects.equals(this.f43590b, czl0Var.f43590b);
    }

    public final int hashCode() {
        int iHashCode = this.f43589a.hashCode() ^ 31;
        int i = (iHashCode << 5) - iHashCode;
        String str = this.f43590b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
        return Long.hashCode(this.f43591c) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
