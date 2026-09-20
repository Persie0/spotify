package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cti0 implements eti0 {

    /* JADX INFO: renamed from: a */
    public final String f41893a;

    public cti0(String str) {
        this.f41893a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cti0) && wj50.m88271j(this.f41893a, ((cti0) obj).f41893a);
    }

    public final int hashCode() {
        return this.f41893a.hashCode();
    }
}
