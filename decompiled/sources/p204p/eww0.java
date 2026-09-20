package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class eww0 implements gww0 {

    /* JADX INFO: renamed from: a */
    public final Object f63613a;

    public eww0(Class cls) {
        this.f63613a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eww0) && wj50.m88271j(this.f63613a, ((eww0) obj).f63613a);
    }

    @Override // p204p.gww0
    public final Object getKey() {
        return this.f63613a;
    }

    public final int hashCode() {
        return this.f63613a.hashCode();
    }
}
