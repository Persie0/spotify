package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gd91 implements fd91 {

    /* JADX INFO: renamed from: a */
    public final Set f78766a;

    /* JADX INFO: renamed from: b */
    public final t28 f78767b;

    /* JADX INFO: renamed from: c */
    public final id91 f78768c;

    public gd91(Set set, t28 t28Var, id91 id91Var) {
        this.f78766a = set;
        this.f78767b = t28Var;
        this.f78768c = id91Var;
    }

    /* JADX INFO: renamed from: a */
    public final hd91 m44416a(String str, keu keuVar, z591 z591Var) {
        Set set = this.f78766a;
        if (set.contains(keuVar)) {
            return new hd91(this.f78767b, str, keuVar, z591Var, this.f78768c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", keuVar, set));
    }
}
