package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n1x implements a3x {

    /* JADX INFO: renamed from: a */
    public final String f149553a;

    public n1x(String str) {
        this.f149553a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1x) && wj50.m88271j(this.f149553a, ((n1x) obj).f149553a);
    }

    public final int hashCode() {
        return this.f149553a.hashCode();
    }
}
