package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class trs0 extends xrs0 implements vrs0 {

    /* JADX INFO: renamed from: a */
    public final String f223109a;

    public trs0(String str) {
        this.f223109a = str;
    }

    @Override // p204p.xrs0
    /* JADX INFO: renamed from: a */
    public final String mo70732a() {
        return this.f223109a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof trs0) && wj50.m88271j(this.f223109a, ((trs0) obj).f223109a);
    }

    public final int hashCode() {
        return this.f223109a.hashCode();
    }
}
