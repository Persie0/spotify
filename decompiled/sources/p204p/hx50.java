package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class hx50 {

    /* JADX INFO: renamed from: a */
    public final String f96141a;

    /* JADX INFO: renamed from: b */
    public final String f96142b;

    /* JADX INFO: renamed from: c */
    public final String f96143c;

    /* JADX INFO: renamed from: d */
    public final Object f96144d;

    /* JADX INFO: renamed from: e */
    public final String f96145e;

    public hx50(String str, String str2, String str3, String str4, Map map) {
        this.f96141a = str;
        this.f96142b = str2;
        this.f96143c = str3;
        this.f96144d = map;
        this.f96145e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx50)) {
            return false;
        }
        hx50 hx50Var = (hx50) obj;
        return this.f96141a.equals(hx50Var.f96141a) && wj50.m88271j(this.f96142b, hx50Var.f96142b) && this.f96143c.equals(hx50Var.f96143c) && this.f96144d.equals(hx50Var.f96144d) && this.f96145e.equals(hx50Var.f96145e);
    }

    public final int hashCode() {
        return ((((this.f96145e.hashCode() + dq60.m36604d(s571.m77243b((((this.f96142b.hashCode() + (this.f96141a.hashCode() * 31)) * 31) + 559935491) * 31, 31, this.f96143c), 31, this.f96144d)) * 31) - 1290540065) * 31) + 1669334218;
    }
}
