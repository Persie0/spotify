package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gm61 implements mn61 {

    /* JADX INFO: renamed from: a */
    public final String f81300a;

    public gm61(String str) {
        this.f81300a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm61) && wj50.m88271j(this.f81300a, ((gm61) obj).f81300a);
    }

    public final int hashCode() {
        return this.f81300a.hashCode();
    }
}
