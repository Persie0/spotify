package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nrq0 implements v3u {

    /* JADX INFO: renamed from: a */
    public final Object f157597a;

    public nrq0(Object obj) {
        this.f157597a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrq0) && wj50.m88271j(this.f157597a, ((nrq0) obj).f157597a);
    }

    public final int hashCode() {
        Object obj = this.f157597a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
