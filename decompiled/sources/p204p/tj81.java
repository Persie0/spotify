package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tj81 {

    /* JADX INFO: renamed from: a */
    public final String f220849a;

    /* JADX INFO: renamed from: b */
    public final String f220850b;

    /* JADX INFO: renamed from: c */
    public final List f220851c;

    /* JADX INFO: renamed from: d */
    public final String f220852d;

    public tj81(String str, List list, String str2, String str3) {
        this.f220849a = str;
        this.f220850b = str2;
        this.f220851c = list;
        this.f220852d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj81)) {
            return false;
        }
        tj81 tj81Var = (tj81) obj;
        return wj50.m88271j(this.f220849a, tj81Var.f220849a) && wj50.m88271j(this.f220850b, tj81Var.f220850b) && wj50.m88271j(this.f220851c, tj81Var.f220851c) && wj50.m88271j(this.f220852d, tj81Var.f220852d);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(this.f220849a.hashCode() * 31, 31, this.f220850b), 31, this.f220851c);
        String str = this.f220852d;
        return iM77244c + (str == null ? 0 : str.hashCode());
    }
}
