package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class uci implements wci {

    /* JADX INFO: renamed from: a */
    public final String f229066a;

    /* JADX INFO: renamed from: b */
    public final String f229067b;

    /* JADX INFO: renamed from: c */
    public final List f229068c;

    public uci(String str, List list, String str2) {
        this.f229066a = str;
        this.f229067b = str2;
        this.f229068c = list;
    }

    @Override // p204p.wci
    /* JADX INFO: renamed from: a */
    public final String mo80473a() {
        return this.f229066a;
    }

    @Override // p204p.wci
    /* JADX INFO: renamed from: b */
    public final String mo80474b() {
        return this.f229067b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uci)) {
            return false;
        }
        uci uciVar = (uci) obj;
        return wj50.m88271j(this.f229066a, uciVar.f229066a) && wj50.m88271j(this.f229067b, uciVar.f229067b) && wj50.m88271j(this.f229068c, uciVar.f229068c);
    }

    public final int hashCode() {
        return this.f229068c.hashCode() + s571.m77243b(this.f229066a.hashCode() * 31, 31, this.f229067b);
    }
}
