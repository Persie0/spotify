package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ed01 implements fd01 {

    /* JADX INFO: renamed from: a */
    public final Object f58419a;

    public ed01(Object obj) {
        this.f58419a = obj;
    }

    @Override // p204p.fd01
    /* JADX INFO: renamed from: a */
    public final Object mo35690a() {
        return this.f58419a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed01) && wj50.m88271j(this.f58419a, ((ed01) obj).f58419a);
    }

    public final int hashCode() {
        Object obj = this.f58419a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
