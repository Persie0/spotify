package p204p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class hqk0 {

    /* JADX INFO: renamed from: a */
    public final ul50 f94214a;

    /* JADX INFO: renamed from: b */
    public final int[] f94215b;

    /* JADX INFO: renamed from: c */
    public final String[] f94216c;

    /* JADX INFO: renamed from: d */
    public final Set f94217d;

    public hqk0(ul50 ul50Var, int[] iArr, String[] strArr) {
        this.f94214a = ul50Var;
        this.f94215b = iArr;
        this.f94216c = strArr;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f94217d = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : gbu.f78413a;
    }

    /* JADX INFO: renamed from: a */
    public final int[] m48294a() {
        return this.f94215b;
    }

    /* JADX INFO: renamed from: b */
    public final void m48295b(Set set) {
        int[] iArr = this.f94215b;
        int length = iArr.length;
        Set setM63425d = gbu.f78413a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                x401 x401Var = new x401();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        x401Var.add(this.f94216c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                setM63425d = n0e1.m63425d(x401Var);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                setM63425d = this.f94217d;
            }
        }
        if (setM63425d.isEmpty()) {
            return;
        }
        this.f94214a.mo73038b(setM63425d);
    }
}
