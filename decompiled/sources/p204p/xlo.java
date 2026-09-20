package p204p;

import com.google.protobuf.Timestamp;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class xlo implements rt71 {

    /* JADX INFO: renamed from: X */
    public final String f263203X;

    /* JADX INFO: renamed from: a */
    public final String f263204a;

    /* JADX INFO: renamed from: b */
    public final String f263205b;

    /* JADX INFO: renamed from: c */
    public final fuz0 f263206c;

    /* JADX INFO: renamed from: d */
    public final fuz0 f263207d;

    /* JADX INFO: renamed from: e */
    public final String f263208e;

    /* JADX INFO: renamed from: f */
    public final String f263209f;

    /* JADX INFO: renamed from: g */
    public final Timestamp f263210g;

    /* JADX INFO: renamed from: h */
    public final String f263211h;

    /* JADX INFO: renamed from: i */
    public final int f263212i;

    /* JADX INFO: renamed from: t */
    public final bmo f263213t;

    public xlo(String str, String str2, fuz0 fuz0Var, fuz0 fuz0Var2, String str3, String str4, Timestamp timestamp, String str5, int i, bmo bmoVar) {
        this.f263204a = str;
        this.f263205b = str2;
        this.f263206c = fuz0Var;
        this.f263207d = fuz0Var2;
        this.f263208e = str3;
        this.f263209f = str4;
        this.f263210g = timestamp;
        this.f263211h = str5;
        this.f263212i = i;
        this.f263213t = bmoVar;
        this.f263203X = timestamp.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlo)) {
            return false;
        }
        xlo xloVar = (xlo) obj;
        return wj50.m88271j(this.f263204a, xloVar.f263204a) && wj50.m88271j(this.f263205b, xloVar.f263205b) && wj50.m88271j(this.f263206c, xloVar.f263206c) && wj50.m88271j(this.f263207d, xloVar.f263207d) && wj50.m88271j(this.f263208e, xloVar.f263208e) && wj50.m88271j(this.f263209f, xloVar.f263209f) && wj50.m88271j(this.f263210g, xloVar.f263210g) && wj50.m88271j(this.f263211h, xloVar.f263211h) && this.f263212i == xloVar.f263212i && wj50.m88271j(this.f263213t, xloVar.f263213t);
    }

    @Override // p204p.rt71
    public final String getId() {
        return this.f263203X;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f263204a.hashCode() * 31, 31, this.f263205b);
        fuz0 fuz0Var = this.f263206c;
        int iHashCode = (iM77243b + (fuz0Var == null ? 0 : Arrays.hashCode(fuz0Var.f73606a))) * 31;
        fuz0 fuz0Var2 = this.f263207d;
        int iM77243b2 = s571.m77243b((iHashCode + (fuz0Var2 == null ? 0 : Arrays.hashCode(fuz0Var2.f73606a))) * 31, 31, this.f263208e);
        String str = this.f263209f;
        return this.f263213t.hashCode() + mt60.m62800g(this.f263212i, s571.m77243b((this.f263210g.hashCode() + ((iM77243b2 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.f263211h), 31);
    }
}
