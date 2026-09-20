package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class qzf1 {

    /* JADX INFO: renamed from: a */
    public final atg1 f194200a;

    /* JADX INFO: renamed from: b */
    public final Boolean f194201b;

    /* JADX INFO: renamed from: c */
    public final w0h1 f194202c;

    public /* synthetic */ qzf1(g7d1 g7d1Var) {
        this.f194200a = (atg1) g7d1Var.f77247b;
        this.f194201b = (Boolean) g7d1Var.f77248c;
        this.f194202c = (w0h1) g7d1Var.f77249d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qzf1)) {
            return false;
        }
        qzf1 qzf1Var = (qzf1) obj;
        return mvl0.m62956s(this.f194200a, qzf1Var.f194200a) && mvl0.m62956s(null, null) && mvl0.m62956s(this.f194201b, qzf1Var.f194201b) && mvl0.m62956s(null, null) && mvl0.m62956s(this.f194202c, qzf1Var.f194202c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f194200a, null, this.f194201b, null, this.f194202c});
    }
}
