package p204p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class c4t0 {

    /* JADX INFO: renamed from: a */
    public final v3t0 f34005a;

    /* JADX INFO: renamed from: b */
    public final boolean f34006b;

    /* JADX INFO: renamed from: c */
    public final cb31 f34007c;

    /* JADX INFO: renamed from: d */
    public final boolean f34008d;

    /* JADX INFO: renamed from: e */
    public final Object f34009e;

    /* JADX INFO: renamed from: f */
    public boolean f34010f = true;

    public c4t0(v3t0 v3t0Var, Object obj, boolean z, cb31 cb31Var, boolean z2) {
        this.f34005a = v3t0Var;
        this.f34006b = z;
        this.f34007c = cb31Var;
        this.f34008d = z2;
        this.f34009e = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m31449a() {
        if (this.f34006b) {
            return null;
        }
        Object obj = this.f34009e;
        if (obj != null) {
            return obj;
        }
        vph.m86125b("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }
}
