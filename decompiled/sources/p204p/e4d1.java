package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final String f56056a;

    public e4d1(String str) {
        this.f56056a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4d1) && wj50.m88271j(this.f56056a, ((e4d1) obj).f56056a);
    }

    public final int hashCode() {
        return this.f56056a.hashCode();
    }
}
