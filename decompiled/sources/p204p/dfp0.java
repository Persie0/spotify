package p204p;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class dfp0 extends mo5 {

    /* JADX INFO: renamed from: a */
    public final kss0 f48629a;

    /* JADX INFO: renamed from: b */
    public final Set f48630b = bk5.m29624m1(new gn80[]{gn80.MAGPIE, gn80.PROMPTED_PLAYLIST});

    /* JADX INFO: renamed from: c */
    public final mlm0 f48631c = mlm0.f144862a;

    public dfp0(kss0 kss0Var) {
        this.f48629a = kss0Var;
    }

    @Override // p204p.mo5
    /* JADX INFO: renamed from: a */
    public final mlm0 mo35899a() {
        return this.f48631c;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return this.f48630b;
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "this page will show user prompts that they can edit";
    }

    @Override // p204p.mo5
    /* JADX INFO: renamed from: h */
    public final ohi mo35900h(String str, String str2) {
        ohi ohiVarValueOf;
        kss0 kss0Var = this.f48629a;
        if (!kss0Var.m57254e() && kss0Var.m57256g()) {
            return ohi.f165462a;
        }
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            return ohi.f165463b;
        }
        return (str2 == null || (ohiVarValueOf = ohi.valueOf(str2.toUpperCase(Locale.ROOT))) == null) ? ohi.f165464c : ohiVarValueOf;
    }

    @Override // p204p.ogm0
    public final boolean isEnabled() {
        return this.f48629a.m57256g();
    }
}
