package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ey01 {

    /* JADX INFO: renamed from: a */
    public final String f63909a;

    public ey01(String str) {
        this.f63909a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey01) || !wj50.m88271j(this.f63909a, ((ey01) obj).f63909a)) {
            return false;
        }
        Object obj2 = ajq.f16314T0;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        String str = this.f63909a;
        return ajq.f16314T0.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
