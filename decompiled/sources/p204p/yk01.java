package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yk01 extends fl01 {

    /* JADX INFO: renamed from: a */
    public final String f273528a;

    public yk01(String str) {
        this.f273528a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk01) && wj50.m88271j(this.f273528a, ((yk01) obj).f273528a);
    }

    public final int hashCode() {
        return this.f273528a.hashCode();
    }
}
