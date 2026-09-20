package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y1w {

    /* JADX INFO: renamed from: a */
    public final boolean f268412a;

    /* JADX INFO: renamed from: b */
    public final boolean f268413b;

    /* JADX INFO: renamed from: c */
    public final Integer f268414c;

    public y1w(boolean z, boolean z2, Integer num) {
        this.f268412a = z;
        this.f268413b = z2;
        this.f268414c = num;
    }

    /* JADX INFO: renamed from: a */
    public static y1w m92672a(y1w y1wVar, boolean z, boolean z2, Integer num, int i) {
        if ((i & 1) != 0) {
            z = y1wVar.f268412a;
        }
        if ((i & 2) != 0) {
            z2 = y1wVar.f268413b;
        }
        if ((i & 4) != 0) {
            num = y1wVar.f268414c;
        }
        y1wVar.getClass();
        return new y1w(z, z2, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1w)) {
            return false;
        }
        y1w y1wVar = (y1w) obj;
        return this.f268412a == y1wVar.f268412a && this.f268413b == y1wVar.f268413b && wj50.m88271j(this.f268414c, y1wVar.f268414c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f268412a) * 31, 31, this.f268413b);
        Integer num = this.f268414c;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
