package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zy21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final int f287477a;

    /* JADX INFO: renamed from: b */
    public final String f287478b;

    public zy21(int i, String str) {
        this.f287477a = i;
        this.f287478b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy21)) {
            return false;
        }
        zy21 zy21Var = (zy21) obj;
        return this.f287477a == zy21Var.f287477a && wj50.m88271j(this.f287478b, zy21Var.f287478b);
    }

    public final int hashCode() {
        return this.f287478b.hashCode() + (Integer.hashCode(this.f287477a) * 31);
    }
}
