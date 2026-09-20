package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v08 extends llx {

    /* JADX INFO: renamed from: a */
    public final byte[] f235937a;

    /* JADX INFO: renamed from: b */
    public final byte[] f235938b;

    public v08(byte[] bArr, byte[] bArr2) {
        this.f235937a = bArr;
        this.f235938b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof llx) {
            llx llxVar = (llx) obj;
            boolean z = llxVar instanceof v08;
            v08 v08Var = (v08) llxVar;
            if (Arrays.equals(this.f235937a, z ? v08Var.f235937a : v08Var.f235937a)) {
                v08 v08Var2 = (v08) llxVar;
                if (Arrays.equals(this.f235938b, z ? v08Var2.f235938b : v08Var2.f235938b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f235937a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f235938b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f235937a) + ", encryptedBlob=" + Arrays.toString(this.f235938b) + "}";
    }
}
