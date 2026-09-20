package p204p;

import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dt9 extends mo5 {

    /* JADX INFO: renamed from: a */
    public final Map f52749a;

    /* JADX INFO: renamed from: b */
    public final Set f52750b = s601.m77310m0(du9.f53014d, itn0.f105632d);

    /* JADX INFO: renamed from: c */
    public final mlm0 f52751c = mlm0.f144863b;

    public dt9(Map map) {
        this.f52749a = map;
    }

    @Override // p204p.mo5
    /* JADX INFO: renamed from: a */
    public final mlm0 mo35899a() {
        return this.f52751c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: f */
    public final Set mo28839f() {
        return this.f52750b;
    }

    @Override // p204p.mo5, p204p.ogm0
    /* JADX INFO: renamed from: g */
    public final wzq0 mo24414e() {
        return new wzq0(true);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Shows user prompts for episodes (Bluejay)";
    }

    @Override // p204p.mo5
    /* JADX INFO: renamed from: h */
    public final ohi mo35900h(String str, String str2) {
        ohi ohiVarValueOf;
        return (str2 == null || (ohiVarValueOf = ohi.valueOf(str2.toUpperCase(Locale.ROOT))) == null) ? ohi.f165463b : ohiVarValueOf;
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        Map map = this.f52749a;
        mlm0 mlm0Var = mlm0.f144863b;
        Object obj = map.get(mlm0Var);
        if (obj != null) {
            return ((yn5) obj).mo29034c();
        }
        throw new IllegalStateException(("No ArtifactPageGating registered for " + mlm0Var + ". Did you install the config module in MainActivityModule?").toString());
    }
}
