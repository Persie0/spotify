package p204p;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class zu40 {

    /* JADX INFO: renamed from: a */
    public final InputConfiguration f286341a;

    public zu40(Object obj) {
        this.f286341a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zu40)) {
            return false;
        }
        return Objects.equals(this.f286341a, ((zu40) obj).f286341a);
    }

    public final int hashCode() {
        return this.f286341a.hashCode();
    }

    public final String toString() {
        return this.f286341a.toString();
    }
}
