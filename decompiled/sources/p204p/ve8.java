package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ve8 implements we8 {

    /* JADX INFO: renamed from: a */
    public final Object f240642a;

    public ve8(Object obj) {
        this.f240642a = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m85297a() {
        return this.f240642a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve8) && wj50.m88271j(this.f240642a, ((ve8) obj).f240642a);
    }

    public final int hashCode() {
        Object obj = this.f240642a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
