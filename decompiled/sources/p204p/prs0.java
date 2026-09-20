package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class prs0 extends xrs0 implements vrs0 {

    /* JADX INFO: renamed from: a */
    public final String f180665a;

    public prs0(String str) {
        this.f180665a = str;
    }

    @Override // p204p.xrs0
    /* JADX INFO: renamed from: a */
    public final String mo70732a() {
        return this.f180665a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prs0) && wj50.m88271j(this.f180665a, ((prs0) obj).f180665a);
    }

    public final int hashCode() {
        return this.f180665a.hashCode();
    }
}
