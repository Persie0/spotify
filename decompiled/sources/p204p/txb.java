package p204p;

import androidx.car.app.model.CarColor;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class txb {

    /* JADX INFO: renamed from: b */
    public static final txb f224663b = new txb(new int[]{0, 1, 2, 3, 4, 5, 6, 7});

    /* JADX INFO: renamed from: a */
    public final HashSet f224664a = new HashSet();

    static {
        new txb(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    public txb(int[] iArr) {
        for (int i : iArr) {
            this.f224664a.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m81899a(CarColor carColor) {
        if (this.f224664a.contains(Integer.valueOf(carColor.getType()))) {
            return;
        }
        throw new IllegalArgumentException("Car color type is not allowed: " + carColor);
    }
}
