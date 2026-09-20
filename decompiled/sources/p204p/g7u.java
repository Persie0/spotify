package p204p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g7u implements w6u {

    /* JADX INFO: renamed from: a */
    public int f77353a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f77354b;

    public g7u(int i, int i2) {
        this.f77353a = (i2 & 1) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : i;
        this.f77354b = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final String m43928d() {
        return btz0.m30489M(new j691(new p39("  ", 7), wl51.m88464N0(g6f.m43753y0(this.f77354b, ",\n", null, null, null, 62))), "\n");
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m43929e() {
        return this.f77354b;
    }
}
