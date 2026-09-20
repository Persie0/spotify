package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class so21 extends uo21 {

    /* JADX INFO: renamed from: a */
    public final String f211083a;

    public so21(String str) {
        this.f211083a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so21) && wj50.m88271j(this.f211083a, ((so21) obj).f211083a);
    }

    public final int hashCode() {
        String str = this.f211083a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
