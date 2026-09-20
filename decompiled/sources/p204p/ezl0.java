package p204p;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ezl0 {

    /* JADX INFO: renamed from: a */
    public final OutputConfiguration f64413a;

    /* JADX INFO: renamed from: b */
    public long f64414b = 1;

    public ezl0(OutputConfiguration outputConfiguration) {
        this.f64413a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ezl0)) {
            return false;
        }
        ezl0 ezl0Var = (ezl0) obj;
        return Objects.equals(this.f64413a, ezl0Var.f64413a) && this.f64414b == ezl0Var.f64414b;
    }

    public final int hashCode() {
        int iHashCode = this.f64413a.hashCode() ^ 31;
        return Long.hashCode(this.f64414b) ^ ((iHashCode << 5) - iHashCode);
    }
}
