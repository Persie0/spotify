package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bzw implements a3x {

    /* JADX INFO: renamed from: a */
    public final String f32604a;

    public bzw(String str) {
        this.f32604a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzw) && wj50.m88271j(this.f32604a, ((bzw) obj).f32604a);
    }

    public final int hashCode() {
        return this.f32604a.hashCode();
    }
}
