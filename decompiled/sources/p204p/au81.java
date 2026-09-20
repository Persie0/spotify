package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class au81 implements cu81 {

    /* JADX INFO: renamed from: a */
    public final String f19890a;

    public au81(String str) {
        this.f19890a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au81) && wj50.m88271j(this.f19890a, ((au81) obj).f19890a);
    }

    public final int hashCode() {
        return this.f19890a.hashCode();
    }
}
