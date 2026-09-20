package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kal {

    /* JADX INFO: renamed from: a */
    public final String f120930a;

    /* JADX INFO: renamed from: b */
    public final String f120931b;

    public kal(String str, String str2) {
        this.f120930a = str;
        this.f120931b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kal)) {
            return false;
        }
        kal kalVar = (kal) obj;
        return wj50.m88271j(this.f120930a, kalVar.f120930a) && wj50.m88271j(this.f120931b, kalVar.f120931b);
    }

    public final int hashCode() {
        return this.f120931b.hashCode() + (this.f120930a.hashCode() * 31);
    }
}
