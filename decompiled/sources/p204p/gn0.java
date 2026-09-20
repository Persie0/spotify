package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gn0 implements mn0 {

    /* JADX INFO: renamed from: a */
    public final String f81510a;

    public gn0(String str) {
        this.f81510a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn0) && wj50.m88271j(this.f81510a, ((gn0) obj).f81510a);
    }

    public final int hashCode() {
        return this.f81510a.hashCode();
    }
}
