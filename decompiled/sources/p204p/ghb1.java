package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ghb1 implements hhb1 {

    /* JADX INFO: renamed from: a */
    public final String f79881a;

    public ghb1(String str) {
        this.f79881a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghb1) && wj50.m88271j(this.f79881a, ((ghb1) obj).f79881a);
    }

    public final int hashCode() {
        return this.f79881a.hashCode();
    }
}
