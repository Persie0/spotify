package p204p;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public final class e2e {

    /* JADX INFO: renamed from: a */
    public final qti0 f55437a;

    /* JADX INFO: renamed from: b */
    public final urv0 f55438b;

    /* JADX INFO: renamed from: c */
    public final Collection f55439c;

    /* JADX INFO: renamed from: d */
    public final gh00 f55440d;

    /* JADX INFO: renamed from: e */
    public final xxd[] f55441e;

    public e2e(qti0 qti0Var, urv0 urv0Var, Collection collection, gh00 gh00Var, xxd... xxdVarArr) {
        this.f55437a = qti0Var;
        this.f55438b = urv0Var;
        this.f55439c = collection;
        this.f55440d = gh00Var;
        this.f55441e = xxdVarArr;
    }

    public /* synthetic */ e2e(qti0 qti0Var, xxd[] xxdVarArr) {
        this(qti0Var, xxdVarArr, a53.f12381L0);
    }

    public e2e(qti0 qti0Var, xxd[] xxdVarArr, gh00 gh00Var) {
        this(qti0Var, null, null, gh00Var, (xxd[]) Arrays.copyOf(xxdVarArr, xxdVarArr.length));
    }

    public /* synthetic */ e2e(Collection collection, xxd[] xxdVarArr) {
        this(collection, xxdVarArr, a53.f12383N0);
    }

    public e2e(Collection collection, xxd[] xxdVarArr, gh00 gh00Var) {
        this(null, null, collection, gh00Var, (xxd[]) Arrays.copyOf(xxdVarArr, xxdVarArr.length));
    }
}
