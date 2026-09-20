package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gcj implements hcj {

    /* JADX INFO: renamed from: a */
    public final String f78609a;

    public gcj(String str) {
        this.f78609a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcj) && wj50.m88271j(this.f78609a, ((gcj) obj).f78609a);
    }

    public final int hashCode() {
        String str = this.f78609a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
