package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ss41 implements tu41 {

    /* JADX INFO: renamed from: a */
    public final String f213487a;

    public ss41(String str) {
        this.f213487a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m79186a() {
        return this.f213487a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss41) && wj50.m88271j(this.f213487a, ((ss41) obj).f213487a);
    }

    public final int hashCode() {
        return this.f213487a.hashCode();
    }
}
