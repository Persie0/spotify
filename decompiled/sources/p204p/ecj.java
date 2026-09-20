package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ecj implements hcj {

    /* JADX INFO: renamed from: a */
    public final String f58345a;

    public ecj(String str) {
        this.f58345a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecj) && wj50.m88271j(this.f58345a, ((ecj) obj).f58345a);
    }

    public final int hashCode() {
        String str = this.f58345a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
