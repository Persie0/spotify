package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class w891 implements z891 {

    /* JADX INFO: renamed from: a */
    public final String f248888a;

    public w891(String str) {
        this.f248888a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w891) && wj50.m88271j(this.f248888a, ((w891) obj).f248888a);
    }

    public final int hashCode() {
        return this.f248888a.hashCode();
    }
}
