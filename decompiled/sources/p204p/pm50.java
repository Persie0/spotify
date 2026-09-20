package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pm50 extends dl9 {

    /* JADX INFO: renamed from: a */
    public final String f178900a;

    public pm50(String str) {
        this.f178900a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm50) && wj50.m88271j(this.f178900a, ((pm50) obj).f178900a);
    }

    public final int hashCode() {
        String str = this.f178900a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
