package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dfe0 {

    /* JADX INFO: renamed from: a */
    public final String f48591a;

    public dfe0(String str) {
        this.f48591a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfe0) && wj50.m88271j(this.f48591a, ((dfe0) obj).f48591a);
    }

    public final int hashCode() {
        return this.f48591a.hashCode();
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("MemberSignature(signature="), this.f48591a, ')');
    }
}
