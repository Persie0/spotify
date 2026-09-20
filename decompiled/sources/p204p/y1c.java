package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y1c implements i2c {

    /* JADX INFO: renamed from: a */
    public final Object f268226a;

    public y1c(Object obj) {
        this.f268226a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1c) && wj50.m88271j(this.f268226a, ((y1c) obj).f268226a);
    }

    public final int hashCode() {
        return this.f268226a.hashCode();
    }
}
