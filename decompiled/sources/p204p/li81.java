package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class li81 implements oi81 {

    /* JADX INFO: renamed from: a */
    public final String f133743a;

    public li81(String str) {
        this.f133743a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li81) && wj50.m88271j(this.f133743a, ((li81) obj).f133743a);
    }

    public final int hashCode() {
        return this.f133743a.hashCode();
    }
}
