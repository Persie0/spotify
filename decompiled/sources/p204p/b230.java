package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b230 implements e230 {

    /* JADX INFO: renamed from: a */
    public final ifo f22479a;

    public b230(ifo ifoVar) {
        this.f22479a = ifoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b230) && wj50.m88271j(this.f22479a, ((b230) obj).f22479a);
    }

    public final int hashCode() {
        return this.f22479a.hashCode();
    }
}
