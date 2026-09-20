package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y830 extends l930 {

    /* JADX INFO: renamed from: a */
    public final String f270186a;

    public y830(String str) {
        this.f270186a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y830) && wj50.m88271j(this.f270186a, ((y830) obj).f270186a);
    }

    public final int hashCode() {
        return this.f270186a.hashCode();
    }
}
