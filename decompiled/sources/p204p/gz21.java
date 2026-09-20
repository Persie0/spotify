package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final String f85815a;

    public gz21(String str) {
        this.f85815a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz21) && wj50.m88271j(this.f85815a, ((gz21) obj).f85815a);
    }

    public final int hashCode() {
        return this.f85815a.hashCode();
    }
}
