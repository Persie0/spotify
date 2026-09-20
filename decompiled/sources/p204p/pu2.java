package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pu2 implements tu2 {

    /* JADX INFO: renamed from: a */
    public final String f181310a;

    public pu2(String str) {
        this.f181310a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu2) && wj50.m88271j(this.f181310a, ((pu2) obj).f181310a);
    }

    public final int hashCode() {
        return this.f181310a.hashCode();
    }
}
