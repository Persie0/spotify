package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i001 {

    /* JADX INFO: renamed from: a */
    public final m101 f97086a;

    /* JADX INFO: renamed from: b */
    public final kg5 f97087b;

    public i001(m101 m101Var, kg5 kg5Var) {
        this.f97086a = m101Var;
        this.f97087b = kg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i001)) {
            return false;
        }
        i001 i001Var = (i001) obj;
        return this.f97086a.equals(i001Var.f97086a) && this.f97087b.equals(i001Var.f97087b);
    }

    public final int hashCode() {
        return this.f97087b.hashCode() + ((this.f97086a.hashCode() + (z8x.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + z8x.SESSION_START + ", sessionData=" + this.f97086a + ", applicationInfo=" + this.f97087b + ')';
    }
}
