package p204p;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class au6 {

    /* JADX INFO: renamed from: d */
    public static final au6 f19866d;

    /* JADX INFO: renamed from: a */
    public final int f19867a;

    /* JADX INFO: renamed from: b */
    public final int f19868b;

    /* JADX INFO: renamed from: c */
    public final hg40 f19869c;

    static {
        au6 au6Var;
        if (Build.VERSION.SDK_INT >= 33) {
            fg40 fg40Var = new fg40(4);
            for (int i = 1; i <= 10; i++) {
                fg40Var.m41574g(Integer.valueOf(h0b1.m46336x(i)));
            }
            au6Var = new au6(2, fg40Var.m41576i());
        } else {
            au6Var = new au6(2, 10);
        }
        f19866d = au6Var;
    }

    public au6(int i, Set set) {
        this.f19867a = i;
        hg40 hg40VarM47406p = hg40.m47406p(set);
        this.f19869c = hg40VarM47406p;
        o3a1 it = hg40VarM47406p.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f19868b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au6)) {
            return false;
        }
        au6 au6Var = (au6) obj;
        return this.f19867a == au6Var.f19867a && this.f19868b == au6Var.f19868b && Objects.equals(this.f19869c, au6Var.f19869c);
    }

    public final int hashCode() {
        int i = ((this.f19867a * 31) + this.f19868b) * 31;
        hg40 hg40Var = this.f19869c;
        return i + (hg40Var == null ? 0 : hg40Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f19867a + ", maxChannelCount=" + this.f19868b + ", channelMasks=" + this.f19869c + "]";
    }

    public au6(int i, int i2) {
        this.f19867a = i;
        this.f19868b = i2;
        this.f19869c = null;
    }
}
