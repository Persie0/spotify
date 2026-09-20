package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w9v0 {

    /* JADX INFO: renamed from: a */
    public final String f249274a;

    public w9v0(String str) {
        this.f249274a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9v0) && wj50.m88271j(this.f249274a, ((w9v0) obj).f249274a);
    }

    public final int hashCode() {
        int iM38547C = edb.m38547C(1) * 31;
        String str = this.f249274a;
        return iM38547C + (str == null ? 0 : str.hashCode());
    }
}
