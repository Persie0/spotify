package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ie81 {

    /* JADX INFO: renamed from: a */
    public final String f101347a;

    /* JADX INFO: renamed from: b */
    public final String f101348b;

    /* JADX INFO: renamed from: c */
    public final Object f101349c;

    public ie81(String str, String str2, Map map) {
        this.f101347a = str;
        this.f101348b = str2;
        this.f101349c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie81)) {
            return false;
        }
        ie81 ie81Var = (ie81) obj;
        return wj50.m88271j(this.f101347a, ie81Var.f101347a) && wj50.m88271j(this.f101348b, ie81Var.f101348b) && this.f101349c.equals(ie81Var.f101349c);
    }

    public final int hashCode() {
        String str = this.f101347a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f101348b;
        return this.f101349c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
