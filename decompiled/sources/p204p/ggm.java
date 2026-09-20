package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ggm {

    /* JADX INFO: renamed from: a */
    public final String f79704a;

    public ggm(String str) {
        this.f79704a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggm) && wj50.m88271j(this.f79704a, ((ggm) obj).f79704a);
    }

    public final int hashCode() {
        String str = this.f79704a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
