package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x80 {

    /* JADX INFO: renamed from: a */
    public final String f259024a;

    public x80(String str) {
        this.f259024a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x80) && wj50.m88271j(this.f259024a, ((x80) obj).f259024a);
    }

    public final int hashCode() {
        return this.f259024a.hashCode();
    }
}
