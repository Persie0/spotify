package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class w9a {

    /* JADX INFO: renamed from: a */
    public final float f249128a;

    /* JADX INFO: renamed from: b */
    public final pk31 f249129b;

    public w9a(float f, pk31 pk31Var) {
        this.f249128a = f;
        this.f249129b = pk31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9a)) {
            return false;
        }
        w9a w9aVar = (w9a) obj;
        return ybs.m93301b(this.f249128a, w9aVar.f249128a) && this.f249129b.equals(w9aVar.f249129b);
    }

    public final int hashCode() {
        return this.f249129b.hashCode() + (Float.hashCode(this.f249128a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderStroke(width=");
        pi9.m70086k(this.f249128a, sb, ", brush=");
        sb.append(this.f249129b);
        sb.append(')');
        return sb.toString();
    }
}
