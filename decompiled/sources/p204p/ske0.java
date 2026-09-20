package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ske0 extends uke0 {

    /* JADX INFO: renamed from: a */
    public final String f210081a;

    /* JADX INFO: renamed from: b */
    public final String f210082b;

    /* JADX INFO: renamed from: c */
    public final List f210083c;

    /* JADX INFO: renamed from: d */
    public final String f210084d;

    /* JADX INFO: renamed from: e */
    public final String f210085e;

    /* JADX INFO: renamed from: f */
    public final String f210086f;

    public ske0(String str, String str2, String str3, String str4, List list, String str5) {
        this.f210081a = str;
        this.f210082b = str2;
        this.f210083c = list;
        this.f210084d = str3;
        this.f210085e = str4;
        this.f210086f = str5;
    }

    @Override // p204p.uke0
    /* JADX INFO: renamed from: a */
    public final String mo78374a() {
        return this.f210081a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ske0)) {
            return false;
        }
        ske0 ske0Var = (ske0) obj;
        return wj50.m88271j(this.f210081a, ske0Var.f210081a) && wj50.m88271j(this.f210082b, ske0Var.f210082b) && wj50.m88271j(this.f210083c, ske0Var.f210083c) && wj50.m88271j(this.f210084d, ske0Var.f210084d) && wj50.m88271j(this.f210085e, ske0Var.f210085e) && wj50.m88271j(this.f210086f, ske0Var.f210086f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77244c(s571.m77243b(this.f210081a.hashCode() * 31, 31, this.f210082b), 31, this.f210083c), 31, this.f210084d);
        String str = this.f210085e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f210086f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
