package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sh6 extends uh6 {

    /* JADX INFO: renamed from: a */
    public final String f209113a;

    /* JADX INFO: renamed from: b */
    public final kyy f209114b;

    public sh6(String str, kyy kyyVar) {
        this.f209113a = str;
        this.f209114b = kyyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh6)) {
            return false;
        }
        sh6 sh6Var = (sh6) obj;
        return wj50.m88271j(this.f209113a, sh6Var.f209113a) && this.f209114b == sh6Var.f209114b;
    }

    public final int hashCode() {
        String str = this.f209113a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        kyy kyyVar = this.f209114b;
        return iHashCode + (kyyVar != null ? kyyVar.hashCode() : 0);
    }
}
