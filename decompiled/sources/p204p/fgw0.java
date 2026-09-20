package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fgw0 implements hgw0 {

    /* JADX INFO: renamed from: a */
    public final String f69413a;

    public fgw0(String str) {
        this.f69413a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fgw0) && wj50.m88271j(this.f69413a, ((fgw0) obj).f69413a);
    }

    public final int hashCode() {
        return this.f69413a.hashCode();
    }
}
