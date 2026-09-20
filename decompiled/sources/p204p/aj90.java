package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aj90 implements bj90 {

    /* JADX INFO: renamed from: a */
    public final String f16201a;

    public aj90(String str) {
        this.f16201a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj90) && wj50.m88271j(this.f16201a, ((aj90) obj).f16201a);
    }

    public final int hashCode() {
        return this.f16201a.hashCode();
    }
}
