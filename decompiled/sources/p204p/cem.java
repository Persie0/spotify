package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cem {

    /* JADX INFO: renamed from: a */
    public final String f37154a;

    /* JADX INFO: renamed from: b */
    public final String f37155b;

    public cem(String str, String str2) {
        this.f37154a = str;
        this.f37155b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cem)) {
            return false;
        }
        cem cemVar = (cem) obj;
        return wj50.m88271j(this.f37154a, cemVar.f37154a) && wj50.m88271j(this.f37155b, cemVar.f37155b);
    }

    public final int hashCode() {
        return this.f37155b.hashCode() + (this.f37154a.hashCode() * 31);
    }
}
