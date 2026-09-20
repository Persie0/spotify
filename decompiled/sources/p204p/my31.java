package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class my31 implements oy31 {

    /* JADX INFO: renamed from: a */
    public final String f148303a;

    public my31(String str) {
        this.f148303a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my31) && wj50.m88271j(this.f148303a, ((my31) obj).f148303a);
    }

    public final int hashCode() {
        return this.f148303a.hashCode();
    }
}
