package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zyj implements bzj {

    /* JADX INFO: renamed from: a */
    public final String f287600a;

    public zyj(String str) {
        this.f287600a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyj) && wj50.m88271j(this.f287600a, ((zyj) obj).f287600a);
    }

    public final int hashCode() {
        return this.f287600a.hashCode();
    }
}
