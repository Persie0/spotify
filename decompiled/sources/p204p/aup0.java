package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class aup0 implements he41 {

    /* JADX INFO: renamed from: f */
    public static final dx00 f19998f = new dx00(24);

    /* JADX INFO: renamed from: a */
    public final String f19999a;

    /* JADX INFO: renamed from: b */
    public final String f20000b;

    /* JADX INFO: renamed from: c */
    public final Map f20001c;

    /* JADX INFO: renamed from: d */
    public final String f20002d;

    /* JADX INFO: renamed from: e */
    public final String f20003e;

    public aup0(String str, String str2, String str3, String str4, Map map) {
        this.f19999a = str;
        this.f20000b = str2;
        this.f20001c = map;
        this.f20002d = str3;
        this.f20003e = str4;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aup0)) {
            return false;
        }
        aup0 aup0Var = (aup0) obj;
        return wj50.m88271j(this.f19999a, aup0Var.f19999a) && wj50.m88271j(this.f20000b, aup0Var.f20000b) && wj50.m88271j(this.f20001c, aup0Var.f20001c) && wj50.m88271j(this.f20002d, aup0Var.f20002d) && wj50.m88271j(this.f20003e, aup0Var.f20003e);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f19998f;
    }

    public final int hashCode() {
        int iM38557f = edb.m38557f(s571.m77243b(this.f19999a.hashCode() * 31, 31, this.f20000b), 31, this.f20001c);
        String str = this.f20002d;
        return this.f20003e.hashCode() + ((iM38557f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
