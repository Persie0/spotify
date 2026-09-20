package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sjm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final String f209878a;

    public sjm0(String str) {
        this.f209878a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjm0) && wj50.m88271j(this.f209878a, ((sjm0) obj).f209878a);
    }

    public final int hashCode() {
        return this.f209878a.hashCode();
    }
}
