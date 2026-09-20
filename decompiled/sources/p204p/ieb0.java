package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ieb0 implements qeb0 {

    /* JADX INFO: renamed from: a */
    public final String f101368a;

    public ieb0(String str) {
        this.f101368a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ieb0) && wj50.m88271j(this.f101368a, ((ieb0) obj).f101368a);
    }

    public final int hashCode() {
        return this.f101368a.hashCode();
    }
}
