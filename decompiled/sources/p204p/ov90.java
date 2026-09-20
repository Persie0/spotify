package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ov90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final String f170456a;

    public ov90(String str) {
        this.f170456a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ov90) && wj50.m88271j(this.f170456a, ((ov90) obj).f170456a);
    }

    public final int hashCode() {
        return this.f170456a.hashCode();
    }
}
