package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ia50 implements la50 {

    /* JADX INFO: renamed from: a */
    public final String f100160a;

    public ia50(String str) {
        this.f100160a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia50) && wj50.m88271j(this.f100160a, ((ia50) obj).f100160a);
    }

    public final int hashCode() {
        String str = this.f100160a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
