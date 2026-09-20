package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qf9 implements qh0 {

    /* JADX INFO: renamed from: a */
    public final String f188144a;

    public qf9(String str) {
        this.f188144a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qf9) && wj50.m88271j(this.f188144a, ((qf9) obj).f188144a);
    }

    public final int hashCode() {
        return this.f188144a.hashCode();
    }
}
