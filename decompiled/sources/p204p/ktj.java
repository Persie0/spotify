package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ktj extends huj {

    /* JADX INFO: renamed from: a */
    public final String f126301a;

    /* JADX INFO: renamed from: b */
    public final String f126302b;

    /* JADX INFO: renamed from: c */
    public final String f126303c;

    public ktj(String str, String str2, String str3) {
        this.f126301a = str;
        this.f126302b = str2;
        this.f126303c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktj)) {
            return false;
        }
        ktj ktjVar = (ktj) obj;
        return wj50.m88271j(this.f126301a, ktjVar.f126301a) && wj50.m88271j(this.f126302b, ktjVar.f126302b) && wj50.m88271j(this.f126303c, ktjVar.f126303c);
    }

    public final int hashCode() {
        return this.f126303c.hashCode() + s571.m77243b(this.f126301a.hashCode() * 31, 31, this.f126302b);
    }
}
