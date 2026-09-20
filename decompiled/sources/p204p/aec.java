package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aec implements bec {

    /* JADX INFO: renamed from: a */
    public final String f14830a;

    public aec(String str) {
        this.f14830a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aec) && wj50.m88271j(this.f14830a, ((aec) obj).f14830a);
    }

    public final int hashCode() {
        return this.f14830a.hashCode();
    }
}
