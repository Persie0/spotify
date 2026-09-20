package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class l960 implements m960 {

    /* JADX INFO: renamed from: a */
    public final String f131015a;

    /* JADX INFO: renamed from: b */
    public final oc8 f131016b;

    /* JADX INFO: renamed from: c */
    public final byte[] f131017c;

    public l960(String str, oc8 oc8Var, byte[] bArr) {
        this.f131015a = str;
        this.f131016b = oc8Var;
        this.f131017c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l960.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l960 l960Var = (l960) obj;
        return wj50.m88271j(this.f131015a, l960Var.f131015a) && wj50.m88271j(this.f131016b, l960Var.f131016b) && Arrays.equals(this.f131017c, l960Var.f131017c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f131017c) + ((this.f131016b.hashCode() + (this.f131015a.hashCode() * 31)) * 31);
    }
}
