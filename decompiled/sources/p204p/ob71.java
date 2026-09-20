package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ob71 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f163557a;

    /* JADX INFO: renamed from: b */
    public final int f163558b;

    /* JADX INFO: renamed from: c */
    public final int f163559c;

    public ob71(ArrayList arrayList, int i, int i2) {
        this.f163557a = arrayList;
        this.f163558b = i;
        this.f163559c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final List m66625a() {
        return this.f163557a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob71)) {
            return false;
        }
        ob71 ob71Var = (ob71) obj;
        return this.f163557a.equals(ob71Var.f163557a) && this.f163558b == ob71Var.f163558b && this.f163559c == ob71Var.f163559c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f163559c) + mt60.m62800g(this.f163558b, this.f163557a.hashCode() * 31, 31);
    }
}
