package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bve1 implements dve1 {

    /* JADX INFO: renamed from: a */
    public final String f31349a;

    public bve1(String str) {
        this.f31349a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bve1) && wj50.m88271j(this.f31349a, ((bve1) obj).f31349a);
    }

    public final int hashCode() {
        return this.f31349a.hashCode();
    }
}
