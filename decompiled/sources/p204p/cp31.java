package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cp31 implements dp31 {

    /* JADX INFO: renamed from: a */
    public final String f40416a;

    public cp31(String str) {
        this.f40416a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp31) && wj50.m88271j(this.f40416a, ((cp31) obj).f40416a);
    }

    public final int hashCode() {
        return this.f40416a.hashCode();
    }
}
