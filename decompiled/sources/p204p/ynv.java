package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ynv implements aov {

    /* JADX INFO: renamed from: a */
    public final String f274509a;

    public ynv(String str) {
        this.f274509a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynv) && wj50.m88271j(this.f274509a, ((ynv) obj).f274509a);
    }

    public final int hashCode() {
        return this.f274509a.hashCode();
    }
}
