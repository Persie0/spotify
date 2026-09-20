package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w6b implements c7b {

    /* JADX INFO: renamed from: a */
    public final String f248319a;

    public w6b(String str) {
        this.f248319a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6b) && wj50.m88271j(this.f248319a, ((w6b) obj).f248319a);
    }

    public final int hashCode() {
        return this.f248319a.hashCode();
    }
}
