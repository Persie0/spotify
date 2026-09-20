package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tkv0 {

    /* JADX INFO: renamed from: a */
    public final String f221228a;

    public tkv0(String str) {
        this.f221228a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkv0) && wj50.m88271j(this.f221228a, ((tkv0) obj).f221228a);
    }

    public final int hashCode() {
        String str = this.f221228a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
