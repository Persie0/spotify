package p204p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class wwb implements vwb {

    /* JADX INFO: renamed from: a */
    public final ho91 f255740a;

    /* JADX INFO: renamed from: b */
    public lij0 f255741b;

    public wwb(ho91 ho91Var) {
        this.f255740a = ho91Var;
        ho91Var.mo48022a();
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: G */
    public final /* bridge */ /* synthetic */ qge mo25169G() {
        return null;
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: I */
    public final boolean mo25170I() {
        return false;
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: e */
    public final List mo25171e() {
        return lau.f131415a;
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: f */
    public final Collection mo25172f() {
        ho91 ho91Var = this.f255740a;
        gd70 gd70VarMo48023b = ho91Var.mo48022a() == 3 ? ho91Var.mo48023b() : mo25173g().m50163p();
        wj50.m88279p(gd70VarMo48023b);
        return Collections.singletonList(gd70VarMo48023b);
    }

    @Override // p204p.jn91
    /* JADX INFO: renamed from: g */
    public final ib70 mo25173g() {
        return this.f255740a.mo48023b().mo36063C0().mo25173g();
    }

    @Override // p204p.vwb
    /* JADX INFO: renamed from: p */
    public final ho91 mo59099p() {
        return this.f255740a;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f255740a + ')';
    }
}
