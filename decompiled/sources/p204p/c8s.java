package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes5.dex */
public final class c8s {

    /* JADX INFO: renamed from: a */
    public final int f35309a;

    /* JADX INFO: renamed from: b */
    public final int f35310b;

    public /* synthetic */ c8s() {
        this(Alert.DURATION_SHOW_INDEFINITELY, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8s)) {
            return false;
        }
        c8s c8sVar = (c8s) obj;
        return this.f35309a == c8sVar.f35309a && this.f35310b == c8sVar.f35310b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35310b) + (Integer.hashCode(this.f35309a) * 31);
    }

    public c8s(int i, int i2) {
        this.f35309a = i;
        this.f35310b = i2;
    }
}
