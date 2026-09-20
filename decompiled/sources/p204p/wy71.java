package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class wy71 implements zy71 {

    /* JADX INFO: renamed from: a */
    public final String f256228a;

    public wy71(String str) {
        this.f256228a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy71) && wj50.m88271j(this.f256228a, ((wy71) obj).f256228a);
    }

    public final int hashCode() {
        return this.f256228a.hashCode();
    }
}
