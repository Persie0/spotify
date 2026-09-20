package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tlu extends vlu {

    /* JADX INFO: renamed from: a */
    public final String f221523a;

    /* JADX INFO: renamed from: b */
    public final String f221524b;

    /* JADX INFO: renamed from: c */
    public final List f221525c;

    /* JADX INFO: renamed from: d */
    public final String f221526d;

    public tlu(String str, List list, String str2, String str3) {
        this.f221523a = str;
        this.f221524b = str2;
        this.f221525c = list;
        this.f221526d = str3;
    }

    @Override // p204p.vlu
    /* JADX INFO: renamed from: a */
    public final String mo81070a() {
        return this.f221526d;
    }

    @Override // p204p.vlu
    /* JADX INFO: renamed from: b */
    public final String mo81071b() {
        return this.f221523a;
    }

    @Override // p204p.vlu
    /* JADX INFO: renamed from: c */
    public final String mo81072c() {
        return this.f221524b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlu)) {
            return false;
        }
        tlu tluVar = (tlu) obj;
        return wj50.m88271j(this.f221523a, tluVar.f221523a) && wj50.m88271j(this.f221524b, tluVar.f221524b) && wj50.m88271j(this.f221525c, tluVar.f221525c) && wj50.m88271j(this.f221526d, tluVar.f221526d);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(this.f221523a.hashCode() * 31, 31, this.f221524b), 31, this.f221525c);
        String str = this.f221526d;
        return iM77244c + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ tlu(String str, String str2, AbstractC2524w8 abstractC2524w8, String str3, int i) {
        this(str, (i & 4) != 0 ? lau.f131415a : abstractC2524w8, str2, (i & 8) != 0 ? null : str3);
    }
}
