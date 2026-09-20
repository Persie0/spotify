package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ic91 {

    /* JADX INFO: renamed from: a */
    public final String f100763a;

    public ic91(String str) {
        this.f100763a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic91) && wj50.m88271j(this.f100763a, ((ic91) obj).f100763a);
    }

    public final int hashCode() {
        String str = this.f100763a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
