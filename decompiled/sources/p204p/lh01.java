package p204p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lh01 implements pmj {

    /* JADX INFO: renamed from: a */
    public final String f133335a;

    /* JADX INFO: renamed from: b */
    public final List f133336b;

    /* JADX INFO: renamed from: c */
    public final boolean f133337c;

    public lh01(String str, List list, boolean z) {
        this.f133335a = str;
        this.f133336b = list;
        this.f133337c = z;
    }

    @Override // p204p.pmj
    /* JADX INFO: renamed from: a */
    public final hej mo26175a(r9b0 r9b0Var, u8b0 u8b0Var, oz8 oz8Var) {
        return new zhj(r9b0Var, oz8Var, this, u8b0Var);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f133335a + "' Shapes: " + Arrays.toString(this.f133336b.toArray()) + '}';
    }
}
