package p204p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes3.dex */
public final class p771 implements r771 {

    /* JADX INFO: renamed from: b */
    public final int f174617b;

    /* JADX INFO: renamed from: c */
    public final int f174618c;

    public p771(int i, int i2) {
        this.f174617b = i;
        this.f174618c = i2;
        boolean z = false;
        if (1 <= i && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        pt40.m70891a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i + ", " + i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p771.class != obj.getClass()) {
            return false;
        }
        p771 p771Var = (p771) obj;
        return this.f174617b == p771Var.f174617b && this.f174618c == p771Var.f174618c;
    }

    public final int hashCode() {
        return (this.f174617b * 31) + this.f174618c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiLine(minHeightInLines=");
        sb.append(this.f174617b);
        sb.append(", maxHeightInLines=");
        return edb.m38567p(sb, this.f174618c, ')');
    }

    public /* synthetic */ p771(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? Alert.DURATION_SHOW_INDEFINITELY : i2);
    }
}
