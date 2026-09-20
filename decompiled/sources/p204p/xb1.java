package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xb1 implements zb1 {

    /* JADX INFO: renamed from: a */
    public final String f259812a;

    public xb1(String str) {
        this.f259812a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xb1) && wj50.m88271j(this.f259812a, ((xb1) obj).f259812a);
    }

    public final int hashCode() {
        return this.f259812a.hashCode();
    }
}
