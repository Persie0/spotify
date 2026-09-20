package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tb1 implements zb1 {

    /* JADX INFO: renamed from: a */
    public final String f218726a;

    public tb1(String str) {
        this.f218726a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb1) && wj50.m88271j(this.f218726a, ((tb1) obj).f218726a);
    }

    public final int hashCode() {
        return this.f218726a.hashCode();
    }
}
