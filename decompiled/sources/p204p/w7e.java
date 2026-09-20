package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w7e implements b8e {

    /* JADX INFO: renamed from: a */
    public final String f248648a;

    /* JADX INFO: renamed from: b */
    public final int f248649b;

    public w7e(String str, int i) {
        this.f248648a = str;
        this.f248649b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7e)) {
            return false;
        }
        w7e w7eVar = (w7e) obj;
        return wj50.m88271j(this.f248648a, w7eVar.f248648a) && this.f248649b == w7eVar.f248649b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f248649b) + (this.f248648a.hashCode() * 31);
    }
}
