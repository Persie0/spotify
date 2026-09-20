package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ojo implements pjo {

    /* JADX INFO: renamed from: a */
    public final Object f166104a;

    public ojo(Object obj) {
        this.f166104a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ojo) && wj50.m88271j(this.f166104a, ((ojo) obj).f166104a);
    }

    public final int hashCode() {
        Object obj = this.f166104a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
