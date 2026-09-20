package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class yfw0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272360a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f272361b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ st91 f272362c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hqb f272363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfw0(k7q0 k7q0Var, String str, st91 st91Var, hqb hqbVar, int i) {
        super(1);
        this.f272360a = i;
        this.f272361b = str;
        this.f272362c = st91Var;
        this.f272363d = hqbVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f272360a) {
            case 0:
                int iOrdinal = ((egw0) obj).ordinal();
                st91 st91Var = this.f272362c;
                boolean z = true;
                if (iOrdinal == 0) {
                    og6.m66869k(this.f272361b, st91Var);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    og6.m66868j(st91Var);
                    z = false;
                }
                this.f272363d.resumeWith(Boolean.valueOf(z));
                return w2a1.f247311a;
            default:
                int iOrdinal2 = ((egw0) obj).ordinal();
                st91 st91Var2 = this.f272362c;
                boolean z2 = true;
                if (iOrdinal2 == 0) {
                    og6.m66869k(this.f272361b, st91Var2);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    og6.m66868j(st91Var2);
                    z2 = false;
                }
                this.f272363d.resumeWith(Boolean.valueOf(z2));
                return w2a1.f247311a;
        }
    }
}
