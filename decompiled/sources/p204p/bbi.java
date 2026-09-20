package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bbi implements gbi {

    /* JADX INFO: renamed from: a */
    public final String f25568a;

    public bbi(String str) {
        this.f25568a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbi) && wj50.m88271j(this.f25568a, ((bbi) obj).f25568a);
    }

    public final int hashCode() {
        return this.f25568a.hashCode();
    }
}
