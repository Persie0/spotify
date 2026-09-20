package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iai extends nai {

    /* JADX INFO: renamed from: a */
    public final String f100261a;

    /* JADX INFO: renamed from: b */
    public final z650 f100262b;

    public iai(String str, z650 z650Var) {
        this.f100261a = str;
        this.f100262b = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iai)) {
            return false;
        }
        iai iaiVar = (iai) obj;
        return wj50.m88271j(this.f100261a, iaiVar.f100261a) && wj50.m88271j(this.f100262b, iaiVar.f100262b);
    }

    public final int hashCode() {
        int iHashCode = this.f100261a.hashCode() * 31;
        z650 z650Var = this.f100262b;
        return iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode());
    }
}
