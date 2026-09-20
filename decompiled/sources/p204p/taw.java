package p204p;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class taw {

    /* JADX INFO: renamed from: a */
    public final int f218702a;

    /* JADX INFO: renamed from: b */
    public final int f218703b;

    /* JADX INFO: renamed from: c */
    public final int f218704c;

    /* JADX INFO: renamed from: d */
    public final int f218705d;

    /* JADX INFO: renamed from: e */
    public final int f218706e;

    public taw(int i, int i2, int i3, int i4, int i5) {
        this.f218702a = i;
        this.f218703b = i2;
        this.f218704c = i3;
        this.f218705d = i4;
        this.f218706e = i5;
    }

    /* JADX INFO: renamed from: a */
    public final Date m80367a(Calendar calendar) {
        calendar.set(this.f218702a, this.f218703b - 1, this.f218704c, this.f218705d, this.f218706e);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taw)) {
            return false;
        }
        taw tawVar = (taw) obj;
        return this.f218702a == tawVar.f218702a && this.f218703b == tawVar.f218703b && this.f218704c == tawVar.f218704c && this.f218705d == tawVar.f218705d && this.f218706e == tawVar.f218706e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f218706e) + mt60.m62800g(this.f218705d, mt60.m62800g(this.f218704c, mt60.m62800g(this.f218703b, Integer.hashCode(this.f218702a) * 31, 31), 31), 31);
    }
}
