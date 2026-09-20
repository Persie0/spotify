package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mnr0 implements onr0 {

    /* JADX INFO: renamed from: a */
    public final String f145472a;

    public mnr0(String str) {
        this.f145472a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnr0) && wj50.m88271j(this.f145472a, ((mnr0) obj).f145472a);
    }

    public final int hashCode() {
        return this.f145472a.hashCode();
    }
}
