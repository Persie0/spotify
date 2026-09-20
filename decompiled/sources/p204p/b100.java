package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b100 {

    /* JADX INFO: renamed from: a */
    public final String f22161a;

    public b100(String str) {
        this.f22161a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b100) && wj50.m88271j(this.f22161a, ((b100) obj).f22161a);
    }

    public final int hashCode() {
        return this.f22161a.hashCode();
    }
}
