package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class usu0 {

    /* JADX INFO: renamed from: a */
    public final String f233689a;

    public usu0(String str) {
        this.f233689a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usu0) && wj50.m88271j(this.f233689a, ((usu0) obj).f233689a);
    }

    public final int hashCode() {
        String str = this.f233689a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
