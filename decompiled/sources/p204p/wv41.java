package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class wv41 {

    /* JADX INFO: renamed from: a */
    public final String f255401a;

    /* JADX INFO: renamed from: b */
    public final String f255402b;

    /* JADX INFO: renamed from: c */
    public final Map f255403c;

    public wv41(String str, String str2, Map map) {
        this.f255401a = str;
        this.f255402b = str2;
        this.f255403c = map;
    }

    /* JADX INFO: renamed from: a */
    public final String m89077a() {
        return this.f255401a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv41)) {
            return false;
        }
        wv41 wv41Var = (wv41) obj;
        return wj50.m88271j(this.f255401a, wv41Var.f255401a) && wj50.m88271j(this.f255402b, wv41Var.f255402b) && wj50.m88271j(this.f255403c, wv41Var.f255403c);
    }

    public final int hashCode() {
        return this.f255403c.hashCode() + s571.m77243b(this.f255401a.hashCode() * 31, 31, this.f255402b);
    }
}
