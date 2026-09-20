package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x8b1 implements z8b1 {

    /* JADX INFO: renamed from: a */
    public final String f259107a;

    public x8b1(String str) {
        this.f259107a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8b1) && wj50.m88271j(this.f259107a, ((x8b1) obj).f259107a);
    }

    public final int hashCode() {
        return this.f259107a.hashCode();
    }
}
