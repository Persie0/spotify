package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iaw {

    /* JADX INFO: renamed from: a */
    public final String f100352a;

    /* JADX INFO: renamed from: b */
    public final int f100353b;

    /* JADX INFO: renamed from: c */
    public final int f100354c;

    /* JADX INFO: renamed from: d */
    public final Integer f100355d;

    /* JADX INFO: renamed from: e */
    public final boolean f100356e;

    public iaw(String str, int i, int i2, Integer num, boolean z) {
        this.f100352a = str;
        this.f100353b = i;
        this.f100354c = i2;
        this.f100355d = num;
        this.f100356e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaw)) {
            return false;
        }
        iaw iawVar = (iaw) obj;
        return wj50.m88271j(this.f100352a, iawVar.f100352a) && this.f100353b == iawVar.f100353b && this.f100354c == iawVar.f100354c && wj50.m88271j(this.f100355d, iawVar.f100355d) && this.f100356e == iawVar.f100356e;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f100354c, mt60.m62800g(this.f100353b, this.f100352a.hashCode() * 31, 31), 31);
        Integer num = this.f100355d;
        return Boolean.hashCode(this.f100356e) + ((iM62800g + (num == null ? 0 : num.hashCode())) * 31);
    }
}
