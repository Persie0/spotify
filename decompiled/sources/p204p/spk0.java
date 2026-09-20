package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class spk0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f212889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f212890b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f212891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spk0(eh00 eh00Var, eh00 eh00Var2, int i) {
        super(1);
        this.f212889a = i;
        this.f212890b = eh00Var;
        this.f212891c = eh00Var2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f212889a) {
            case 0:
                ada adaVar = (ada) obj;
                if (!adaVar.equals(yca.f271432a) && !adaVar.equals(xca.f260173a)) {
                    if (!(adaVar instanceof zca)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iM38547C = edb.m38547C(((zca) adaVar).f281484a);
                    if (iM38547C == 0) {
                        this.f212890b.invoke();
                    } else if (iM38547C != 1) {
                        if (iM38547C != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f212890b.invoke();
                    } else {
                        this.f212891c.invoke();
                    }
                }
                return w2a1.f247311a;
            default:
                int iOrdinal = ((t3v0) obj).ordinal();
                if (iOrdinal == 0) {
                    this.f212890b.invoke();
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f212891c.invoke();
                }
                return w2a1.f247311a;
        }
    }
}
