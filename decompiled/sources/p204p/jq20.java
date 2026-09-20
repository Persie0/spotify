package p204p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class jq20 extends v7j {

    /* JADX INFO: renamed from: u0 */
    public v7j[] f114774u0 = new v7j[4];

    /* JADX INFO: renamed from: v0 */
    public int f114775v0 = 0;

    /* JADX INFO: renamed from: W */
    public final void m54027W(v7j v7jVar) {
        if (v7jVar == this || v7jVar == null) {
            return;
        }
        int i = this.f114775v0 + 1;
        v7j[] v7jVarArr = this.f114774u0;
        if (i > v7jVarArr.length) {
            this.f114774u0 = (v7j[]) Arrays.copyOf(v7jVarArr, v7jVarArr.length * 2);
        }
        v7j[] v7jVarArr2 = this.f114774u0;
        int i2 = this.f114775v0;
        v7jVarArr2[i2] = v7jVar;
        this.f114775v0 = i2 + 1;
    }

    /* JADX INFO: renamed from: X */
    public final void m54028X(int i, ArrayList arrayList, ktd1 ktd1Var) {
        for (int i2 = 0; i2 < this.f114775v0; i2++) {
            v7j v7jVar = this.f114774u0[i2];
            ArrayList arrayList2 = ktd1Var.f126246a;
            if (!arrayList2.contains(v7jVar)) {
                arrayList2.add(v7jVar);
            }
        }
        for (int i3 = 0; i3 < this.f114775v0; i3++) {
            gwg1.m45950v(this.f114774u0[i3], i, arrayList, ktd1Var);
        }
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: h */
    public void mo44861h(v7j v7jVar, HashMap map) {
        super.mo44861h(v7jVar, map);
        jq20 jq20Var = (jq20) v7jVar;
        this.f114775v0 = 0;
        int i = jq20Var.f114775v0;
        for (int i2 = 0; i2 < i; i2++) {
            m54027W((v7j) map.get(jq20Var.f114774u0[i2]));
        }
    }

    /* JADX INFO: renamed from: Y */
    public void mo54029Y() {
    }
}
