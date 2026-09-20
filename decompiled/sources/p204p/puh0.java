package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class puh0 implements yvh0 {

    /* JADX INFO: renamed from: a */
    public final String f181456a;

    public puh0(String str) {
        this.f181456a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof puh0) && wj50.m88271j(this.f181456a, ((puh0) obj).f181456a);
    }

    public final int hashCode() {
        return this.f181456a.hashCode();
    }
}
