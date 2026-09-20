package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gy9 implements iy9 {

    /* JADX INFO: renamed from: a */
    public final String f85517a;

    public gy9(String str) {
        this.f85517a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gy9) && wj50.m88271j(this.f85517a, ((gy9) obj).f85517a);
    }

    public final int hashCode() {
        return this.f85517a.hashCode();
    }
}
