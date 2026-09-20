package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class it40 extends vwp0 {

    /* JADX INFO: renamed from: m */
    public final boolean f105420m;

    public it40(String str, g210 g210Var) {
        super(str, g210Var, 1);
        this.f105420m = true;
    }

    @Override // p204p.ktz0
    /* JADX INFO: renamed from: d */
    public final boolean mo51606d() {
        return this.f105420m;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, p.fr70] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, p.fr70] */
    @Override // p204p.vwp0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof it40) {
            ktz0 ktz0Var = (ktz0) obj;
            if (wj50.m88271j(this.f245521a, ktz0Var.mo33226i())) {
                it40 it40Var = (it40) obj;
                if (it40Var.f105420m && Arrays.equals((ktz0[]) this.f245531k.getValue(), (ktz0[]) it40Var.f245531k.getValue())) {
                    int iMo33222e = ktz0Var.mo33222e();
                    int i = this.f245523c;
                    if (i == iMo33222e) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (wj50.m88271j(mo33225h(i2).mo33226i(), ktz0Var.mo33225h(i2).mo33226i()) && wj50.m88271j(mo33225h(i2).getKind(), ktz0Var.mo33225h(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p204p.vwp0
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
