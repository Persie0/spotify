package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jad implements lad {

    /* JADX INFO: renamed from: a */
    public final fbs f110441a;

    public jad(fbs fbsVar) {
        this.f110441a = fbsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jad) && wj50.m88271j(this.f110441a, ((jad) obj).f110441a);
    }

    public final int hashCode() {
        return this.f110441a.hashCode();
    }
}
