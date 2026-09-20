package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z221 implements a321 {

    /* JADX INFO: renamed from: a */
    public final String f278467a;

    public z221(String str) {
        this.f278467a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z221) && wj50.m88271j(this.f278467a, ((z221) obj).f278467a);
    }

    public final int hashCode() {
        return this.f278467a.hashCode();
    }
}
