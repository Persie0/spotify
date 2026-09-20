package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class kka1 implements e15 {

    /* JADX INFO: renamed from: a */
    public final String f123552a;

    public kka1(String str) {
        this.f123552a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m56691a() {
        return this.f123552a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kka1) {
            return wj50.m88271j(this.f123552a, ((kka1) obj).f123552a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f123552a.hashCode();
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("UrlAnnotation(url="), this.f123552a, ')');
    }
}
