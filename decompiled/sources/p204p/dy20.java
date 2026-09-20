package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dy20 implements gy20 {

    /* JADX INFO: renamed from: a */
    public final String f54157a;

    public dy20(String str) {
        this.f54157a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dy20) && wj50.m88271j(this.f54157a, ((dy20) obj).f54157a);
    }

    public final int hashCode() {
        return this.f54157a.hashCode();
    }
}
