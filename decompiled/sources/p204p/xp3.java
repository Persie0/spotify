package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xp3 {

    /* JADX INFO: renamed from: a */
    public final Boolean f264417a;

    public xp3(Boolean bool) {
        this.f264417a = bool;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m91578a() {
        return this.f264417a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp3) && wj50.m88271j(this.f264417a, ((xp3) obj).f264417a);
    }

    public final int hashCode() {
        Boolean bool = this.f264417a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
