package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u8f0 extends v8f0 {

    /* JADX INFO: renamed from: a */
    public final Object f227943a;

    public u8f0(Object obj) {
        this.f227943a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8f0) && wj50.m88271j(this.f227943a, ((u8f0) obj).f227943a);
    }

    public final int hashCode() {
        return this.f227943a.hashCode();
    }
}
