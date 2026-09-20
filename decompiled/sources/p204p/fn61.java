package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fn61 implements mn61 {

    /* JADX INFO: renamed from: a */
    public final String f71214a;

    public fn61(String str) {
        this.f71214a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fn61) && wj50.m88271j(this.f71214a, ((fn61) obj).f71214a);
    }

    public final int hashCode() {
        return this.f71214a.hashCode();
    }
}
