package p204p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class t840 {

    /* JADX INFO: renamed from: a */
    public final String f217958a;

    /* JADX INFO: renamed from: b */
    public final String f217959b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f217960c;

    /* JADX INFO: renamed from: d */
    public final String f217961d;

    /* JADX INFO: renamed from: e */
    public final String f217962e;

    /* JADX INFO: renamed from: f */
    public final byte[] f217963f;

    public t840(String str, String str2, ArrayList arrayList, String str3, String str4, byte[] bArr) {
        this.f217958a = str;
        this.f217959b = str2;
        this.f217960c = arrayList;
        this.f217961d = str3;
        this.f217962e = str4;
        this.f217963f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t840)) {
            return false;
        }
        t840 t840Var = (t840) obj;
        return wj50.m88271j(this.f217958a, t840Var.f217958a) && wj50.m88271j(this.f217959b, t840Var.f217959b) && this.f217960c.equals(t840Var.f217960c) && wj50.m88271j(this.f217961d, t840Var.f217961d) && wj50.m88271j(this.f217962e, t840Var.f217962e) && wj50.m88271j(this.f217963f, t840Var.f217963f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(lq51.m59700f(this.f217960c, s571.m77243b(this.f217958a.hashCode() * 31, 31, this.f217959b), 31), 31, this.f217961d);
        String str = this.f217962e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.f217963f;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
