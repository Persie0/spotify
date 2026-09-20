package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j37 implements k37 {

    /* JADX INFO: renamed from: a */
    public final String f108300a;

    public j37(String str) {
        this.f108300a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m52251a() {
        return this.f108300a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j37) && wj50.m88271j(this.f108300a, ((j37) obj).f108300a);
    }

    public final int hashCode() {
        return this.f108300a.hashCode();
    }
}
