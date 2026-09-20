package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jsp0 implements msp0 {

    /* JADX INFO: renamed from: a */
    public final String f115530a;

    /* JADX INFO: renamed from: b */
    public final String f115531b;

    /* JADX INFO: renamed from: c */
    public final String f115532c;

    /* JADX INFO: renamed from: d */
    public final pla1 f115533d;

    /* JADX INFO: renamed from: e */
    public final String f115534e;

    /* JADX INFO: renamed from: f */
    public final String f115535f;

    public jsp0(String str, String str2, String str3, pla1 pla1Var, String str4, String str5) {
        this.f115530a = str;
        this.f115531b = str2;
        this.f115532c = str3;
        this.f115533d = pla1Var;
        this.f115534e = str4;
        this.f115535f = str5;
    }

    @Override // p204p.msp0
    /* JADX INFO: renamed from: a */
    public final String mo54250a() {
        return this.f115534e;
    }

    @Override // p204p.msp0
    /* JADX INFO: renamed from: e */
    public final String mo54251e() {
        return this.f115531b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsp0)) {
            return false;
        }
        jsp0 jsp0Var = (jsp0) obj;
        return wj50.m88271j(this.f115530a, jsp0Var.f115530a) && wj50.m88271j(this.f115531b, jsp0Var.f115531b) && wj50.m88271j(this.f115532c, jsp0Var.f115532c) && wj50.m88271j(this.f115533d, jsp0Var.f115533d) && wj50.m88271j(this.f115534e, jsp0Var.f115534e) && wj50.m88271j(this.f115535f, jsp0Var.f115535f);
    }

    @Override // p204p.msp0
    public final String getId() {
        return this.f115530a;
    }

    @Override // p204p.msp0
    public final String getPlaylistUri() {
        return this.f115532c;
    }

    @Override // p204p.msp0
    public final pla1 getSender() {
        return this.f115533d;
    }

    public final int hashCode() {
        return this.f115535f.hashCode() + s571.m77243b(ydj.m93448g(this.f115533d, s571.m77243b(s571.m77243b(this.f115530a.hashCode() * 31, 31, this.f115531b), 31, this.f115532c), 31), 31, this.f115534e);
    }
}
