package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ws11 extends ys11 {

    /* JADX INFO: renamed from: a */
    public final String f254480a;

    /* JADX INFO: renamed from: b */
    public final String f254481b;

    /* JADX INFO: renamed from: c */
    public final String f254482c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f254483d;

    /* JADX INFO: renamed from: e */
    public final js11 f254484e;

    public ws11(String str, String str2, String str3, ArrayList arrayList, js11 js11Var) {
        this.f254480a = str;
        this.f254481b = str2;
        this.f254482c = str3;
        this.f254483d = arrayList;
        this.f254484e = js11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws11)) {
            return false;
        }
        ws11 ws11Var = (ws11) obj;
        return this.f254480a.equals(ws11Var.f254480a) && wj50.m88271j(this.f254481b, ws11Var.f254481b) && wj50.m88271j(this.f254482c, ws11Var.f254482c) && this.f254483d.equals(ws11Var.f254483d) && wj50.m88271j(this.f254484e, ws11Var.f254484e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f254480a.hashCode() * 31, 31, this.f254481b);
        String str = this.f254482c;
        int iM59700f = lq51.m59700f(this.f254483d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        js11 js11Var = this.f254484e;
        return iM59700f + (js11Var != null ? js11Var.hashCode() : 0);
    }
}
