package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class icl0 {

    /* JADX INFO: renamed from: a */
    public final boolean f100839a;

    /* JADX INFO: renamed from: b */
    public final boolean f100840b;

    /* JADX INFO: renamed from: c */
    public final int f100841c;

    public icl0(boolean z, boolean z2, int i) {
        this.f100839a = z;
        this.f100840b = z2;
        this.f100841c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icl0)) {
            return false;
        }
        icl0 icl0Var = (icl0) obj;
        return this.f100839a == icl0Var.f100839a && this.f100840b == icl0Var.f100840b && this.f100841c == icl0Var.f100841c;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f100839a) * 31, 31, this.f100840b);
        int i = this.f100841c;
        return iM77245d + (i == 0 ? 0 : edb.m38547C(i));
    }
}
