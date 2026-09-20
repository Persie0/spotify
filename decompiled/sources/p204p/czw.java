package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class czw implements a3x {

    /* JADX INFO: renamed from: a */
    public final String f43647a;

    public czw(String str) {
        this.f43647a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czw) && wj50.m88271j(this.f43647a, ((czw) obj).f43647a);
    }

    public final int hashCode() {
        return this.f43647a.hashCode();
    }
}
