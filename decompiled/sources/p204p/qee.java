package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qee extends see {

    /* JADX INFO: renamed from: a */
    public final String f187912a;

    public qee(String str) {
        this.f187912a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qee) && wj50.m88271j(this.f187912a, ((qee) obj).f187912a);
    }

    public final int hashCode() {
        return this.f187912a.hashCode();
    }
}
