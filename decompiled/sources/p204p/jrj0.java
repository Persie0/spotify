package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jrj0 implements lrj0 {

    /* JADX INFO: renamed from: a */
    public final List f115205a;

    /* JADX INFO: renamed from: b */
    public final String f115206b;

    /* JADX INFO: renamed from: c */
    public final String f115207c;

    /* JADX INFO: renamed from: d */
    public final String f115208d;

    public jrj0(String str, List list, String str2, String str3) {
        this.f115205a = list;
        this.f115206b = str;
        this.f115207c = str2;
        this.f115208d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrj0)) {
            return false;
        }
        jrj0 jrj0Var = (jrj0) obj;
        return wj50.m88271j(this.f115205a, jrj0Var.f115205a) && wj50.m88271j(this.f115206b, jrj0Var.f115206b) && wj50.m88271j(this.f115207c, jrj0Var.f115207c) && wj50.m88271j(this.f115208d, jrj0Var.f115208d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f115205a.hashCode() * 31, 31, this.f115206b), 31, this.f115207c);
        String str = this.f115208d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
