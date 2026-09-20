package p204p;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@rtz0
@SuppressLint({"UnsafeOptInUsageError"})
public final class qw31<T> {
    public static final pw31 Companion = new pw31();

    /* JADX INFO: renamed from: c */
    public static final fr70[] f193157c = {q3d0.m72078I(2, new saa0(17)), null};

    /* JADX INFO: renamed from: d */
    public static final vwp0 f193158d;

    /* JADX INFO: renamed from: a */
    public final List f193159a;

    /* JADX INFO: renamed from: b */
    public final List f193160b;

    static {
        vwp0 vwp0Var = new vwp0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        vwp0Var.m86594k("keys", false);
        vwp0Var.m86594k("values", false);
        f193158d = vwp0Var;
    }

    public /* synthetic */ qw31(int i, List list, List list2) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, f193158d);
            throw null;
        }
        this.f193159a = list;
        this.f193160b = list2;
    }

    public qw31(ArrayList arrayList, ArrayList arrayList2) {
        this.f193159a = arrayList;
        this.f193160b = arrayList2;
    }
}
