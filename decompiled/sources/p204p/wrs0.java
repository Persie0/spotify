package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wrs0 extends xrs0 implements qrs0 {

    /* JADX INFO: renamed from: a */
    public final String f254413a;

    public wrs0(String str) {
        this.f254413a = str;
    }

    @Override // p204p.xrs0
    /* JADX INFO: renamed from: a */
    public final String mo70732a() {
        return this.f254413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrs0) && wj50.m88271j(this.f254413a, ((wrs0) obj).f254413a);
    }

    public final int hashCode() {
        return this.f254413a.hashCode();
    }
}
