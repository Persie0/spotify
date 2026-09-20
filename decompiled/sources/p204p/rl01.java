package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rl01 implements sl01 {

    /* JADX INFO: renamed from: a */
    public final String f200191a;

    public rl01(String str) {
        this.f200191a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl01) && wj50.m88271j(this.f200191a, ((rl01) obj).f200191a);
    }

    public final int hashCode() {
        return this.f200191a.hashCode();
    }
}
