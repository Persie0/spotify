package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tx51 implements vx51 {

    /* JADX INFO: renamed from: a */
    public final String f224572a;

    public tx51(String str) {
        this.f224572a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx51) && wj50.m88271j(this.f224572a, ((tx51) obj).f224572a);
    }

    public final int hashCode() {
        return this.f224572a.hashCode();
    }
}
