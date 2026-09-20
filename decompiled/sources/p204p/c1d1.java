package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class c1d1 implements f1d1 {

    /* JADX INFO: renamed from: a */
    public final String f33058a;

    public c1d1(String str) {
        this.f33058a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1d1) && wj50.m88271j(this.f33058a, ((c1d1) obj).f33058a);
    }

    public final int hashCode() {
        return this.f33058a.hashCode();
    }
}
