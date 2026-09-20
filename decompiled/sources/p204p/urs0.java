package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class urs0 extends xrs0 implements qrs0 {

    /* JADX INFO: renamed from: a */
    public final String f233451a;

    public urs0(String str) {
        this.f233451a = str;
    }

    @Override // p204p.xrs0
    /* JADX INFO: renamed from: a */
    public final String mo70732a() {
        return this.f233451a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof urs0) && wj50.m88271j(this.f233451a, ((urs0) obj).f233451a);
    }

    public final int hashCode() {
        return this.f233451a.hashCode();
    }
}
