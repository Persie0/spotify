package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ysy implements zsy {

    /* JADX INFO: renamed from: a */
    public final Object f275899a;

    public ysy(Object obj) {
        this.f275899a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysy) && wj50.m88271j(this.f275899a, ((ysy) obj).f275899a);
    }

    public final int hashCode() {
        Object obj = this.f275899a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
