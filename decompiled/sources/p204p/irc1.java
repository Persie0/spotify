package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class irc1 {

    /* JADX INFO: renamed from: a */
    public final List f104951a;

    /* JADX INFO: renamed from: b */
    public final String f104952b;

    /* JADX INFO: renamed from: c */
    public final n6f f104953c;

    /* JADX INFO: renamed from: d */
    public final String f104954d;

    public irc1(List list, String str, n6f n6fVar, String str2) {
        this.f104951a = list;
        this.f104952b = str;
        this.f104953c = n6fVar;
        this.f104954d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irc1)) {
            return false;
        }
        irc1 irc1Var = (irc1) obj;
        return wj50.m88271j(this.f104951a, irc1Var.f104951a) && wj50.m88271j(this.f104952b, irc1Var.f104952b) && wj50.m88271j(this.f104953c, irc1Var.f104953c) && wj50.m88271j(this.f104954d, irc1Var.f104954d);
    }

    public final int hashCode() {
        int iHashCode = this.f104951a.hashCode() * 31;
        String str = this.f104952b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n6f n6fVar = this.f104953c;
        int iHashCode3 = (iHashCode2 + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31;
        String str2 = this.f104954d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ irc1(String str, int i, List list) {
        this((i & 1) != 0 ? lau.f131415a : list, null, null, (i & 8) != 0 ? null : str);
    }
}
