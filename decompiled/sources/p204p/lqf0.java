package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lqf0 implements pqf0 {

    /* JADX INFO: renamed from: a */
    public final String f136039a;

    public lqf0(String str) {
        this.f136039a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqf0) && wj50.m88271j(this.f136039a, ((lqf0) obj).f136039a);
    }

    public final int hashCode() {
        return this.f136039a.hashCode();
    }
}
