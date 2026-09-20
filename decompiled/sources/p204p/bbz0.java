package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bbz0 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f25689a;

    /* JADX INFO: renamed from: b */
    public final cbz0 f25690b;

    /* JADX INFO: renamed from: c */
    public final String f25691c;

    public /* synthetic */ bbz0(int i, CharSequence charSequence) {
        this(charSequence, cbz0.f36270a, null);
    }

    /* JADX INFO: renamed from: a */
    public static bbz0 m28652a(bbz0 bbz0Var, String str, cbz0 cbz0Var, String str2, int i) {
        CharSequence charSequence = str;
        if ((i & 1) != 0) {
            charSequence = bbz0Var.f25689a;
        }
        if ((i & 2) != 0) {
            cbz0Var = bbz0Var.f25690b;
        }
        if ((i & 4) != 0) {
            str2 = bbz0Var.f25691c;
        }
        bbz0Var.getClass();
        return new bbz0(charSequence, cbz0Var, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbz0)) {
            return false;
        }
        bbz0 bbz0Var = (bbz0) obj;
        return wj50.m88271j(this.f25689a, bbz0Var.f25689a) && this.f25690b == bbz0Var.f25690b && wj50.m88271j(this.f25691c, bbz0Var.f25691c);
    }

    public final int hashCode() {
        int iHashCode = (this.f25690b.hashCode() + (this.f25689a.hashCode() * 31)) * 31;
        String str = this.f25691c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public bbz0(CharSequence charSequence, cbz0 cbz0Var, String str) {
        this.f25689a = charSequence;
        this.f25690b = cbz0Var;
        this.f25691c = str;
    }
}
