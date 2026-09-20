package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class qwd implements rwd {

    /* JADX INFO: renamed from: a */
    public final String f193329a;

    /* JADX INFO: renamed from: b */
    public final pla1 f193330b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f193331c;

    public qwd(String str, pla1 pla1Var, ArrayList arrayList) {
        this.f193329a = str;
        this.f193330b = pla1Var;
        this.f193331c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwd)) {
            return false;
        }
        qwd qwdVar = (qwd) obj;
        return wj50.m88271j(this.f193329a, qwdVar.f193329a) && wj50.m88271j(this.f193330b, qwdVar.f193330b) && this.f193331c.equals(qwdVar.f193331c);
    }

    public final int hashCode() {
        String str = this.f193329a;
        return this.f193331c.hashCode() + ydj.m93448g(this.f193330b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }
}
