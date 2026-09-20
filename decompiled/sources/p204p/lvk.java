package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lvk extends Throwable {

    /* JADX INFO: renamed from: a */
    public final String f137334a;

    public lvk(String str) {
        super("Could not resume player after onboarding: ".concat(str));
        this.f137334a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lvk) && wj50.m88271j(this.f137334a, ((lvk) obj).f137334a);
    }

    public final int hashCode() {
        return this.f137334a.hashCode();
    }
}
