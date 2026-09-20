package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wx20 implements gy20 {

    /* JADX INFO: renamed from: a */
    public final String f255920a;

    public wx20(String str) {
        this.f255920a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wx20) && wj50.m88271j(this.f255920a, ((wx20) obj).f255920a);
    }

    public final int hashCode() {
        return this.f255920a.hashCode();
    }
}
