package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mnb0 implements onb0 {

    /* JADX INFO: renamed from: a */
    public final String f145382a;

    public mnb0(String str) {
        this.f145382a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnb0) && wj50.m88271j(this.f145382a, ((mnb0) obj).f145382a);
    }

    public final int hashCode() {
        return this.f145382a.hashCode();
    }
}
