package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ym1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final String f274132a;

    public ym1(String str) {
        this.f274132a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym1) && wj50.m88271j(this.f274132a, ((ym1) obj).f274132a);
    }

    public final int hashCode() {
        return this.f274132a.hashCode();
    }
}
