package p204p;

/* JADX INFO: loaded from: classes9.dex */
@rtz0
public final class kd40 {
    public static final jd40 Companion = new jd40();

    /* JADX INFO: renamed from: a */
    public final String f121605a;

    public /* synthetic */ kd40(int i, String str) {
        if (1 == (i & 1)) {
            this.f121605a = str;
        } else {
            edo.m38617p(i, 1, id40.f100937a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd40) && wj50.m88271j(this.f121605a, ((kd40) obj).f121605a);
    }

    public final int hashCode() {
        return this.f121605a.hashCode();
    }
}
