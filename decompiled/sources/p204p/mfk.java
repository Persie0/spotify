package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mfk {

    /* JADX INFO: renamed from: a */
    public final String f143077a;

    public mfk(String str) {
        this.f143077a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfk) && wj50.m88271j(this.f143077a, ((mfk) obj).f143077a);
    }

    public final int hashCode() {
        return this.f143077a.hashCode();
    }
}
