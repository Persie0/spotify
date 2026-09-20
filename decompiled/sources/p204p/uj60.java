package p204p;

/* JADX INFO: loaded from: classes7.dex */
public abstract class uj60 {

    /* JADX INFO: renamed from: a */
    public final String f230912a;

    public uj60(String str) {
        this.f230912a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uj60) {
            return wj50.m88271j(this.f230912a, ((uj60) obj).f230912a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f230912a.hashCode();
    }
}
