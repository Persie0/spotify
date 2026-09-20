package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ivz0 implements jvz0 {

    /* JADX INFO: renamed from: a */
    public final String f106303a;

    public ivz0(String str) {
        this.f106303a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivz0) && wj50.m88271j(this.f106303a, ((ivz0) obj).f106303a);
    }

    public final int hashCode() {
        return this.f106303a.hashCode();
    }
}
