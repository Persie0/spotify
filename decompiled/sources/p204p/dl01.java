package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dl01 extends fl01 {

    /* JADX INFO: renamed from: a */
    public final String f50080a;

    public dl01(String str) {
        this.f50080a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl01) && wj50.m88271j(this.f50080a, ((dl01) obj).f50080a);
    }

    public final int hashCode() {
        return this.f50080a.hashCode();
    }
}
