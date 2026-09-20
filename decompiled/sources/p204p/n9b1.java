package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n9b1 implements e15 {

    /* JADX INFO: renamed from: a */
    public final String f151765a;

    public n9b1(String str) {
        this.f151765a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m63914a() {
        return this.f151765a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n9b1) {
            return wj50.m88271j(this.f151765a, ((n9b1) obj).f151765a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f151765a.hashCode();
    }

    public final String toString() {
        return dq60.m36617q(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f151765a, ')');
    }
}
