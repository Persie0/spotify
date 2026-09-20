package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i9n0 extends j9n0 {

    /* JADX INFO: renamed from: a */
    public final String f100047a;

    /* JADX INFO: renamed from: b */
    public final l380 f100048b;

    public i9n0(String str, l380 l380Var) {
        this.f100047a = str;
        this.f100048b = l380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9n0)) {
            return false;
        }
        i9n0 i9n0Var = (i9n0) obj;
        return wj50.m88271j(this.f100047a, i9n0Var.f100047a) && wj50.m88271j(this.f100048b, i9n0Var.f100048b);
    }

    public final int hashCode() {
        return this.f100048b.hashCode() + (this.f100047a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePasswordValidationReceived(validationResult=" + this.f100048b + ")";
    }
}
