package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fy20 implements gy20 {

    /* JADX INFO: renamed from: a */
    public final String f74508a;

    public fy20(String str) {
        this.f74508a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy20) && wj50.m88271j(this.f74508a, ((fy20) obj).f74508a);
    }

    public final int hashCode() {
        return this.f74508a.hashCode();
    }
}
