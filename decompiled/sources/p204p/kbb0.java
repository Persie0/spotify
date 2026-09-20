package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class kbb0 {

    /* JADX INFO: renamed from: j */
    public static final kbb0 f121161j = new kbb0(new s7f((ArrayList) null, 0, (List) null, (String) null, false, (sab0) null, (vab0) null, 0, (sbb0) null, 1023), "", "absent", "", "", "", false, true, null);

    /* JADX INFO: renamed from: a */
    public final s7f f121162a;

    /* JADX INFO: renamed from: b */
    public final String f121163b;

    /* JADX INFO: renamed from: c */
    public final String f121164c;

    /* JADX INFO: renamed from: d */
    public final String f121165d;

    /* JADX INFO: renamed from: e */
    public final String f121166e;

    /* JADX INFO: renamed from: f */
    public final String f121167f;

    /* JADX INFO: renamed from: g */
    public final boolean f121168g;

    /* JADX INFO: renamed from: h */
    public final boolean f121169h;

    /* JADX INFO: renamed from: i */
    public final String f121170i;

    public kbb0(s7f s7fVar, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6) {
        this.f121162a = s7fVar;
        this.f121163b = str;
        this.f121164c = str2;
        this.f121165d = str3;
        this.f121166e = str4;
        this.f121167f = str5;
        this.f121168g = z;
        this.f121169h = z2;
        this.f121170i = str6;
    }

    /* JADX INFO: renamed from: a */
    public static kbb0 m55940a(kbb0 kbb0Var, s7f s7fVar, String str, boolean z, String str2, int i) {
        if ((i & 1) != 0) {
            s7fVar = kbb0Var.f121162a;
        }
        s7f s7fVar2 = s7fVar;
        String str3 = kbb0Var.f121163b;
        if ((i & 4) != 0) {
            str = kbb0Var.f121164c;
        }
        String str4 = str;
        String str5 = kbb0Var.f121165d;
        String str6 = kbb0Var.f121166e;
        String str7 = kbb0Var.f121167f;
        boolean z2 = kbb0Var.f121168g;
        if ((i & 128) != 0) {
            z = kbb0Var.f121169h;
        }
        boolean z3 = z;
        if ((i & 256) != 0) {
            str2 = kbb0Var.f121170i;
        }
        kbb0Var.getClass();
        return new kbb0(s7fVar2, str3, str4, str5, str6, str7, z2, z3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbb0)) {
            return false;
        }
        kbb0 kbb0Var = (kbb0) obj;
        return wj50.m88271j(this.f121162a, kbb0Var.f121162a) && wj50.m88271j(this.f121163b, kbb0Var.f121163b) && wj50.m88271j(this.f121164c, kbb0Var.f121164c) && wj50.m88271j(this.f121165d, kbb0Var.f121165d) && wj50.m88271j(this.f121166e, kbb0Var.f121166e) && wj50.m88271j(this.f121167f, kbb0Var.f121167f) && this.f121168g == kbb0Var.f121168g && this.f121169h == kbb0Var.f121169h && wj50.m88271j(this.f121170i, kbb0Var.f121170i);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f121162a.hashCode() * 31, 31, this.f121163b), 31, this.f121164c), 31, this.f121165d), 31, this.f121166e), 31, this.f121167f), 31, this.f121168g), 31, this.f121169h);
        String str = this.f121170i;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
