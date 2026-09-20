package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ah41 {

    /* JADX INFO: renamed from: a */
    public final Object f15621a;

    public ah41(g4a g4aVar) {
        this.f15621a = g4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah41) && wj50.m88271j(this.f15621a, ((ah41) obj).f15621a);
    }

    public final int hashCode() {
        Object obj = this.f15621a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
