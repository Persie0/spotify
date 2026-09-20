package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zu31 implements av31 {

    /* JADX INFO: renamed from: a */
    public final Object f286335a;

    public zu31(Object obj) {
        this.f286335a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m96997a() {
        return this.f286335a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu31) && wj50.m88271j(this.f286335a, ((zu31) obj).f286335a);
    }

    public final int hashCode() {
        Object obj = this.f286335a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
