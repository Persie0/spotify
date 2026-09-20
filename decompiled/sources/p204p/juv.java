package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class juv {

    /* JADX INFO: renamed from: a */
    public final String f116178a;

    /* JADX INFO: renamed from: b */
    public final String f116179b;

    public juv(String str, String str2) {
        this.f116178a = str;
        this.f116179b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juv)) {
            return false;
        }
        juv juvVar = (juv) obj;
        return wj50.m88271j(this.f116178a, juvVar.f116178a) && wj50.m88271j(this.f116179b, juvVar.f116179b);
    }

    public final int hashCode() {
        return this.f116179b.hashCode() + (this.f116178a.hashCode() * 31);
    }
}
