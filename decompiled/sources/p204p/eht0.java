package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class eht0 {

    /* JADX INFO: renamed from: a */
    public final Class f59660a;

    /* JADX INFO: renamed from: b */
    public final Class f59661b;

    public eht0(Class cls, Class cls2) {
        this.f59660a = cls;
        this.f59661b = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static eht0 m39004a(Class cls) {
        return new eht0(dht0.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eht0.class != obj.getClass()) {
            return false;
        }
        eht0 eht0Var = (eht0) obj;
        if (this.f59661b.equals(eht0Var.f59661b)) {
            return this.f59660a.equals(eht0Var.f59660a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59660a.hashCode() + (this.f59661b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f59661b;
        Class cls2 = this.f59660a;
        if (cls2 == dht0.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
