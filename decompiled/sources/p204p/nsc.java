package p204p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class nsc extends sz30 {

    /* JADX INFO: renamed from: b */
    public final String f157739b;

    /* JADX INFO: renamed from: c */
    public final boolean f157740c;

    /* JADX INFO: renamed from: d */
    public final boolean f157741d;

    /* JADX INFO: renamed from: e */
    public final String[] f157742e;

    /* JADX INFO: renamed from: f */
    public final sz30[] f157743f;

    public nsc(String str, boolean z, boolean z2, String[] strArr, sz30[] sz30VarArr) {
        super("CTOC");
        this.f157739b = str;
        this.f157740c = z;
        this.f157741d = z2;
        this.f157742e = strArr;
        this.f157743f = sz30VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nsc.class == obj.getClass()) {
            nsc nscVar = (nsc) obj;
            if (this.f157740c == nscVar.f157740c && this.f157741d == nscVar.f157741d && Objects.equals(this.f157739b, nscVar.f157739b) && Arrays.equals(this.f157742e, nscVar.f157742e) && Arrays.equals(this.f157743f, nscVar.f157743f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.f157740c ? 1 : 0)) * 31) + (this.f157741d ? 1 : 0)) * 31;
        String str = this.f157739b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
