package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cw01 extends dw01 {

    /* JADX INFO: renamed from: a */
    public final String f42597a;

    public cw01(String str) {
        this.f42597a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw01) && wj50.m88271j(this.f42597a, ((cw01) obj).f42597a);
    }

    public final int hashCode() {
        return this.f42597a.hashCode();
    }
}
