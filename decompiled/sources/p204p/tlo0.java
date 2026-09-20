package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tlo0 implements vlo0 {

    /* JADX INFO: renamed from: a */
    public final String f221497a;

    public tlo0(String str) {
        this.f221497a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlo0) && wj50.m88271j(this.f221497a, ((tlo0) obj).f221497a);
    }

    public final int hashCode() {
        return this.f221497a.hashCode();
    }
}
