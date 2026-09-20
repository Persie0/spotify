package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class c880 extends e880 {

    /* JADX INFO: renamed from: a */
    public final String f35141a;

    public c880(String str) {
        this.f35141a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c880) && wj50.m88271j(this.f35141a, ((c880) obj).f35141a);
    }

    public final int hashCode() {
        String str = this.f35141a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
