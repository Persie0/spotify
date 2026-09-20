package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x160 implements c260 {

    /* JADX INFO: renamed from: a */
    public final String f257073a;

    public x160(String str) {
        this.f257073a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x160) && wj50.m88271j(this.f257073a, ((x160) obj).f257073a);
    }

    public final int hashCode() {
        return this.f257073a.hashCode();
    }
}
