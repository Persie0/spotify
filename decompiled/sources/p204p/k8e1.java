package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k8e1 extends u8e1 {

    /* JADX INFO: renamed from: a */
    public final String f120323a;

    public k8e1(String str) {
        this.f120323a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8e1) && wj50.m88271j(this.f120323a, ((k8e1) obj).f120323a);
    }

    public final int hashCode() {
        return this.f120323a.hashCode();
    }
}
