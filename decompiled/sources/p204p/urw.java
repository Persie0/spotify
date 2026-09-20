package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class urw implements s2x {

    /* JADX INFO: renamed from: a */
    public final int f233468a;

    /* JADX INFO: renamed from: b */
    public final String f233469b;

    public urw(int i, String str) {
        this.f233468a = i;
        this.f233469b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urw)) {
            return false;
        }
        urw urwVar = (urw) obj;
        return this.f233468a == urwVar.f233468a && wj50.m88271j(this.f233469b, urwVar.f233469b);
    }

    public final int hashCode() {
        return this.f233469b.hashCode() + (Integer.hashCode(this.f233468a) * 31);
    }
}
