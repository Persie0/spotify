package p204p;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class h4i0 extends ov50 {

    /* JADX INFO: renamed from: e */
    public final long f87536e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f87537f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f87538g;

    public h4i0(int i, long j) {
        super(i, 3);
        this.f87536e = j;
        this.f87537f = new ArrayList();
        this.f87538g = new ArrayList();
    }

    /* JADX INFO: renamed from: r */
    public final h4i0 m46655r(int i) {
        ArrayList arrayList = this.f87538g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            h4i0 h4i0Var = (h4i0) arrayList.get(i2);
            if (h4i0Var.f170422b == i) {
                return h4i0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final i4i0 m46656s(int i) {
        ArrayList arrayList = this.f87537f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i4i0 i4i0Var = (i4i0) arrayList.get(i2);
            if (i4i0Var.f170422b == i) {
                return i4i0Var;
            }
        }
        return null;
    }

    @Override // p204p.ov50
    public final String toString() {
        return ov50.m68120e(this.f170422b) + " leaves: " + Arrays.toString(this.f87537f.toArray()) + " containers: " + Arrays.toString(this.f87538g.toArray());
    }
}
