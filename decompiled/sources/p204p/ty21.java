package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ty21 extends bz21 {

    /* JADX INFO: renamed from: a */
    public final String f224813a;

    public ty21(String str) {
        this.f224813a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty21) && wj50.m88271j(this.f224813a, ((ty21) obj).f224813a);
    }

    public final int hashCode() {
        return this.f224813a.hashCode();
    }
}
