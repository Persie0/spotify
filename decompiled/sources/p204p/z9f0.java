package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z9f0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final String f280772b;

    public z9f0(String str) {
        super(false);
        this.f280772b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9f0) && wj50.m88271j(this.f280772b, ((z9f0) obj).f280772b);
    }

    public final int hashCode() {
        return this.f280772b.hashCode();
    }
}
