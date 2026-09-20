package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kp10 implements v1x {

    /* JADX INFO: renamed from: a */
    public final String f124954a;

    public kp10(String str) {
        this.f124954a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kp10) && wj50.m88271j(this.f124954a, ((kp10) obj).f124954a);
    }

    public final int hashCode() {
        return this.f124954a.hashCode();
    }
}
