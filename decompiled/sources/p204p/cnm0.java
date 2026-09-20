package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class cnm0 implements anm0 {

    /* JADX INFO: renamed from: a */
    public final r4m0 f40046a;

    /* JADX INFO: renamed from: b */
    public final obm0 f40047b;

    /* JADX INFO: renamed from: c */
    public final Observable f40048c;

    public cnm0(r4m0 r4m0Var, obm0 obm0Var, Observable observable) {
        this.f40046a = r4m0Var;
        this.f40047b = obm0Var;
        this.f40048c = observable;
    }

    /* JADX INFO: renamed from: c */
    public static bnm0 m33462c(r4m0 r4m0Var, obm0 obm0Var) {
        anm0 anm0Var;
        e6m0 e6m0Var = (e6m0) ((g480) r4m0Var.mo24326a().mo15684j0(e6m0.class)).mo31538a();
        if (e6m0Var != null) {
            if (!e6m0Var.f56668a) {
                e6m0Var = null;
            }
            if (e6m0Var != null) {
                pcm0 pcm0Var = obm0Var instanceof pcm0 ? (pcm0) obm0Var : null;
                if (pcm0Var != null && (anm0Var = (anm0) pcm0Var.mo60822f(anm0.class)) != null) {
                    return anm0Var.mo2758g();
                }
            }
        }
        return null;
    }

    @Override // p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        r4m0 r4m0Var = this.f40046a;
        sfj0 sfj0Var = (sfj0) ((g480) r4m0Var.mo24326a().mo15684j0(sfj0.class)).mo31538a();
        bnm0 bnm0VarM97225f = sfj0Var != null ? zy5.m97225f(new tfm0(1, sfj0Var.f208604a, this)) : null;
        return (bnm0VarM97225f == null && (bnm0VarM97225f = m33462c(r4m0Var, this.f40047b)) == null) ? jkg1.m53624i(r4m0Var.mo24326a().mo15684j0(q040.class), this.f40048c) : bnm0VarM97225f;
    }
}
