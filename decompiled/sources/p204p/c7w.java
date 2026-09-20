package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c7w extends e7w {

    /* JADX INFO: renamed from: a */
    public final String f35038a;

    public c7w(String str) {
        this.f35038a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7w) && wj50.m88271j(this.f35038a, ((c7w) obj).f35038a);
    }

    public final int hashCode() {
        String str = this.f35038a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
