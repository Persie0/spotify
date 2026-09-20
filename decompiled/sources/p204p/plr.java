package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class plr {

    /* JADX INFO: renamed from: a */
    public final String f178775a;

    public plr(String str) {
        this.f178775a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof plr) && wj50.m88271j(this.f178775a, ((plr) obj).f178775a);
    }

    public final int hashCode() {
        return this.f178775a.hashCode();
    }
}
