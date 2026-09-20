package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gdd implements qdd {

    /* JADX INFO: renamed from: a */
    public final String f78806a;

    public gdd(String str) {
        this.f78806a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdd) && wj50.m88271j(this.f78806a, ((gdd) obj).f78806a);
    }

    public final int hashCode() {
        return this.f78806a.hashCode();
    }
}
