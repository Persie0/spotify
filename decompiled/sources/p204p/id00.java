package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class id00 implements kd00 {

    /* JADX INFO: renamed from: a */
    public final String f100911a;

    public id00(String str) {
        this.f100911a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id00) && wj50.m88271j(this.f100911a, ((id00) obj).f100911a);
    }

    public final int hashCode() {
        return this.f100911a.hashCode();
    }
}
