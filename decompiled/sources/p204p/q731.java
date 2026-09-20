package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q731 implements s731 {

    /* JADX INFO: renamed from: a */
    public final String f186023a;

    public q731(String str) {
        this.f186023a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q731) && wj50.m88271j(this.f186023a, ((q731) obj).f186023a);
    }

    public final int hashCode() {
        return this.f186023a.hashCode();
    }
}
