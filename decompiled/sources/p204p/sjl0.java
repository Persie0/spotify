package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class sjl0 {

    /* JADX INFO: renamed from: a */
    public final String f209872a;

    /* JADX INFO: renamed from: b */
    public final String f209873b;

    /* JADX INFO: renamed from: c */
    public final List f209874c;

    /* JADX INFO: renamed from: d */
    public final String f209875d;

    /* JADX INFO: renamed from: e */
    public final boolean f209876e;

    public sjl0(String str, String str2, String str3, ArrayList arrayList, boolean z) {
        this.f209872a = str;
        this.f209873b = str2;
        this.f209874c = arrayList;
        this.f209875d = str3;
        this.f209876e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjl0)) {
            return false;
        }
        sjl0 sjl0Var = (sjl0) obj;
        return wj50.m88271j(this.f209872a, sjl0Var.f209872a) && wj50.m88271j(this.f209873b, sjl0Var.f209873b) && wj50.m88271j(this.f209874c, sjl0Var.f209874c) && wj50.m88271j(this.f209875d, sjl0Var.f209875d) && this.f209876e == sjl0Var.f209876e;
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(this.f209872a.hashCode() * 31, 31, this.f209873b), 31, this.f209874c);
        String str = this.f209875d;
        return Boolean.hashCode(this.f209876e) + ((iM77244c + (str == null ? 0 : str.hashCode())) * 31);
    }
}
