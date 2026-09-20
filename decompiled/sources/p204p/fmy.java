package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fmy implements hmy {

    /* JADX INFO: renamed from: a */
    public final String f71127a;

    public fmy(String str) {
        this.f71127a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmy) && wj50.m88271j(this.f71127a, ((fmy) obj).f71127a);
    }

    public final int hashCode() {
        return this.f71127a.hashCode();
    }
}
