package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class y8g1 extends j5u0 {

    /* JADX INFO: renamed from: a */
    public final wac f270299a;

    public y8g1(wac wacVar) {
        this.f270299a = wacVar;
    }

    @Override // p204p.j5u0
    /* JADX INFO: renamed from: a */
    public final Object mo52475a(Object obj) {
        if (obj != null) {
            return this.f270299a;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y8g1) {
            return this.f270299a.equals(((y8g1) obj).f270299a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f270299a.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f270299a.toString();
        return dq60.m36618r(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }
}
