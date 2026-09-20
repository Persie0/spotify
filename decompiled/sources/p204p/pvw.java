package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pvw implements s2x {

    /* JADX INFO: renamed from: a */
    public final String f181854a;

    public pvw(String str) {
        this.f181854a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvw) && wj50.m88271j(this.f181854a, ((pvw) obj).f181854a);
    }

    public final int hashCode() {
        return this.f181854a.hashCode();
    }
}
