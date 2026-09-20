package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z7y extends c8y {

    /* JADX INFO: renamed from: a */
    public final String f280296a;

    public z7y(String str) {
        this.f280296a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7y) && wj50.m88271j(this.f280296a, ((z7y) obj).f280296a);
    }

    public final int hashCode() {
        String str = this.f280296a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
