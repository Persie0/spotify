package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ayw extends y1x {

    /* JADX INFO: renamed from: a */
    public final String f21368a;

    public ayw(String str) {
        this.f21368a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ayw) && wj50.m88271j(this.f21368a, ((ayw) obj).f21368a);
    }

    public final int hashCode() {
        return this.f21368a.hashCode();
    }
}
