package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s7u0 {

    /* JADX INFO: renamed from: a */
    public final String f206477a;

    /* JADX INFO: renamed from: b */
    public final String f206478b;

    public s7u0(String str) {
        this.f206477a = str;
        this.f206478b = s571.m77250i(str, ":ratings");
    }

    /* JADX INFO: renamed from: a */
    public final String m77399a() {
        return this.f206478b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7u0) && wj50.m88271j(this.f206477a, ((s7u0) obj).f206477a);
    }

    public final int hashCode() {
        return this.f206477a.hashCode();
    }
}
