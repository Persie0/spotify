package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lsp0 implements msp0 {

    /* JADX INFO: renamed from: a */
    public final String f136577a;

    /* JADX INFO: renamed from: b */
    public final String f136578b;

    /* JADX INFO: renamed from: c */
    public final String f136579c;

    /* JADX INFO: renamed from: d */
    public final pla1 f136580d;

    /* JADX INFO: renamed from: e */
    public final String f136581e;

    public lsp0(String str, String str2, String str3, pla1 pla1Var, String str4) {
        this.f136577a = str;
        this.f136578b = str2;
        this.f136579c = str3;
        this.f136580d = pla1Var;
        this.f136581e = str4;
    }

    @Override // p204p.msp0
    /* JADX INFO: renamed from: a */
    public final String mo54250a() {
        return this.f136581e;
    }

    @Override // p204p.msp0
    /* JADX INFO: renamed from: e */
    public final String mo54251e() {
        return this.f136578b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsp0)) {
            return false;
        }
        lsp0 lsp0Var = (lsp0) obj;
        return wj50.m88271j(this.f136577a, lsp0Var.f136577a) && wj50.m88271j(this.f136578b, lsp0Var.f136578b) && wj50.m88271j(this.f136579c, lsp0Var.f136579c) && wj50.m88271j(this.f136580d, lsp0Var.f136580d) && wj50.m88271j(this.f136581e, lsp0Var.f136581e);
    }

    @Override // p204p.msp0
    public final String getId() {
        return this.f136577a;
    }

    @Override // p204p.msp0
    public final String getPlaylistUri() {
        return this.f136579c;
    }

    @Override // p204p.msp0
    public final pla1 getSender() {
        return this.f136580d;
    }

    public final int hashCode() {
        return this.f136581e.hashCode() + ydj.m93448g(this.f136580d, s571.m77243b(s571.m77243b(this.f136577a.hashCode() * 31, 31, this.f136578b), 31, this.f136579c), 31);
    }
}
