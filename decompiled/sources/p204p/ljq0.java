package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ljq0 extends q2m0 {

    /* JADX INFO: renamed from: b */
    public final String f134128b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f134129c;

    /* JADX INFO: renamed from: d */
    public final jsa0 f134130d;

    public ljq0(String str, ArrayList arrayList, jsa0 jsa0Var) {
        super(5);
        this.f134128b = str;
        this.f134129c = arrayList;
        this.f134130d = jsa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljq0)) {
            return false;
        }
        ljq0 ljq0Var = (ljq0) obj;
        return wj50.m88271j(this.f134128b, ljq0Var.f134128b) && this.f134129c.equals(ljq0Var.f134129c) && this.f134130d.equals(ljq0Var.f134130d);
    }

    public final int hashCode() {
        String str = this.f134128b;
        return this.f134130d.hashCode() + lq51.m59700f(this.f134129c, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
