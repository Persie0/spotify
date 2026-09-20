package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class srs0 extends xrs0 implements vrs0 {

    /* JADX INFO: renamed from: a */
    public final String f213375a;

    public srs0(String str) {
        this.f213375a = str;
    }

    @Override // p204p.xrs0
    /* JADX INFO: renamed from: a */
    public final String mo70732a() {
        return this.f213375a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srs0) && wj50.m88271j(this.f213375a, ((srs0) obj).f213375a);
    }

    public final int hashCode() {
        return this.f213375a.hashCode();
    }

    public /* synthetic */ srs0() {
        this("");
    }
}
