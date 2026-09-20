package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vlz0 implements ylz0 {

    /* JADX INFO: renamed from: a */
    public final String f242632a;

    public vlz0(String str) {
        this.f242632a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlz0) && wj50.m88271j(this.f242632a, ((vlz0) obj).f242632a);
    }

    public final int hashCode() {
        return this.f242632a.hashCode();
    }
}
