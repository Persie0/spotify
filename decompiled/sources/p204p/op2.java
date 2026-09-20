package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class op2 implements pp2 {

    /* JADX INFO: renamed from: a */
    public final String f167737a;

    public op2(String str) {
        this.f167737a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m67513a() {
        return this.f167737a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof op2) && wj50.m88271j(this.f167737a, ((op2) obj).f167737a);
    }

    public final int hashCode() {
        String str = this.f167737a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
