package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v420 implements y420 {

    /* JADX INFO: renamed from: a */
    public final String f237023a;

    /* JADX INFO: renamed from: b */
    public final String f237024b;

    public v420(String str, String str2) {
        this.f237023a = str;
        this.f237024b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v420)) {
            return false;
        }
        v420 v420Var = (v420) obj;
        return wj50.m88271j(this.f237023a, v420Var.f237023a) && wj50.m88271j(this.f237024b, v420Var.f237024b);
    }

    public final int hashCode() {
        String str = this.f237023a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f237024b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
