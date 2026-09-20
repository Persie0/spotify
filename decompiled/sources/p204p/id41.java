package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class id41 implements kd41 {

    /* JADX INFO: renamed from: a */
    public final String f100938a;

    public id41(String str) {
        this.f100938a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m50274a() {
        return this.f100938a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id41) && wj50.m88271j(this.f100938a, ((id41) obj).f100938a);
    }

    public final int hashCode() {
        return this.f100938a.hashCode();
    }
}
