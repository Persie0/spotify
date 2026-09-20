package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pdd implements qdd {

    /* JADX INFO: renamed from: a */
    public final String f176415a;

    public pdd(String str) {
        this.f176415a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdd) && wj50.m88271j(this.f176415a, ((pdd) obj).f176415a);
    }

    public final int hashCode() {
        return this.f176415a.hashCode();
    }
}
