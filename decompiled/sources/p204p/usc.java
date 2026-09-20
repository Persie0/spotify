package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class usc {

    /* JADX INFO: renamed from: a */
    public final String f233584a;

    /* JADX INFO: renamed from: b */
    public final int f233585b;

    public usc(String str, int i) {
        this.f233584a = str;
        this.f233585b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usc)) {
            return false;
        }
        usc uscVar = (usc) obj;
        return wj50.m88271j(this.f233584a, uscVar.f233584a) && this.f233585b == uscVar.f233585b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f233585b) + (this.f233584a.hashCode() * 31);
    }
}
