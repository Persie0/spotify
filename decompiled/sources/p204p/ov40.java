package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ov40 implements qv40 {

    /* JADX INFO: renamed from: a */
    public final String f170418a;

    public ov40(String str) {
        this.f170418a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ov40) && wj50.m88271j(this.f170418a, ((ov40) obj).f170418a);
    }

    public final int hashCode() {
        return this.f170418a.hashCode();
    }
}
