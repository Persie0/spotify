package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ic31 {

    /* JADX INFO: renamed from: a */
    public final String f100723a;

    /* JADX INFO: renamed from: b */
    public final String f100724b;

    /* JADX INFO: renamed from: c */
    public final boolean f100725c;

    public ic31(String str, String str2, boolean z) {
        this.f100723a = str;
        this.f100724b = str2;
        this.f100725c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic31)) {
            return false;
        }
        ic31 ic31Var = (ic31) obj;
        return wj50.m88271j(this.f100723a, ic31Var.f100723a) && wj50.m88271j(this.f100724b, ic31Var.f100724b) && this.f100725c == ic31Var.f100725c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100725c) + s571.m77243b(this.f100723a.hashCode() * 31, 31, this.f100724b);
    }
}
