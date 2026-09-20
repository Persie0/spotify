package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zu81 {

    /* JADX INFO: renamed from: a */
    public final String f286393a;

    public zu81(String str) {
        this.f286393a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu81) && wj50.m88271j(this.f286393a, ((zu81) obj).f286393a);
    }

    public final int hashCode() {
        return edb.m38547C(2) + (this.f286393a.hashCode() * 31);
    }
}
