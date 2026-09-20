package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ian0 implements kan0 {

    /* JADX INFO: renamed from: a */
    public final String f100317a;

    /* JADX INFO: renamed from: b */
    public final String f100318b;

    /* JADX INFO: renamed from: c */
    public final String f100319c;

    public ian0(String str, String str2, String str3) {
        this.f100317a = str;
        this.f100318b = str2;
        this.f100319c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ian0)) {
            return false;
        }
        ian0 ian0Var = (ian0) obj;
        return wj50.m88271j(this.f100317a, ian0Var.f100317a) && wj50.m88271j(this.f100318b, ian0Var.f100318b) && wj50.m88271j(this.f100319c, ian0Var.f100319c);
    }

    public final int hashCode() {
        return this.f100319c.hashCode() + s571.m77243b(this.f100317a.hashCode() * 31, 31, this.f100318b);
    }
}
