package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ibv extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pbv f100677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ whx f100678c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibv(pbv pbvVar, whx whxVar, int i) {
        super(1);
        this.f100676a = i;
        this.f100677b = pbvVar;
        this.f100678c = whxVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        w9z w9zVar;
        w9z w9zVar2;
        w9z w9zVar3;
        w9z w9zVar4;
        switch (this.f100676a) {
            case 0:
                u691 u691Var = (u691) obj;
                fbv fbvVar = fbv.f67903a;
                fbv fbvVar2 = fbv.f67904b;
                if (u691Var.m82439b(fbvVar, fbvVar2)) {
                    l9y l9yVar = this.f100677b.f175911a.f248609a;
                    return (l9yVar == null || (w9zVar2 = l9yVar.f131193b) == null) ? kbv.f121290b : w9zVar2;
                }
                if (!u691Var.m82439b(fbvVar2, fbv.f67905c)) {
                    return kbv.f121290b;
                }
                l9y l9yVar2 = this.f100678c.f251458a.f248609a;
                return (l9yVar2 == null || (w9zVar = l9yVar2.f131193b) == null) ? kbv.f121290b : w9zVar;
            case 1:
                int iOrdinal = ((fbv) obj).ordinal();
                float f = 1.0f;
                if (iOrdinal == 0) {
                    l9y l9yVar3 = this.f100677b.f175911a.f248609a;
                    if (l9yVar3 != null) {
                        f = l9yVar3.f131192a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l9y l9yVar4 = this.f100678c.f251458a.f248609a;
                    if (l9yVar4 != null) {
                        f = l9yVar4.f131192a;
                    }
                }
                return Float.valueOf(f);
            case 2:
                u691 u691Var2 = (u691) obj;
                fbv fbvVar3 = fbv.f67903a;
                fbv fbvVar4 = fbv.f67904b;
                if (u691Var2.m82439b(fbvVar3, fbvVar4)) {
                    say0 say0Var = this.f100677b.f175911a.f248612d;
                    return (say0Var == null || (w9zVar4 = say0Var.f207292c) == null) ? kbv.f121290b : w9zVar4;
                }
                if (!u691Var2.m82439b(fbvVar4, fbv.f67905c)) {
                    return kbv.f121290b;
                }
                say0 say0Var2 = this.f100678c.f251458a.f248612d;
                return (say0Var2 == null || (w9zVar3 = say0Var2.f207292c) == null) ? kbv.f121290b : w9zVar3;
            default:
                int iOrdinal2 = ((fbv) obj).ordinal();
                float f2 = 1.0f;
                if (iOrdinal2 == 0) {
                    say0 say0Var3 = this.f100677b.f175911a.f248612d;
                    if (say0Var3 != null) {
                        f2 = say0Var3.f207290a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    say0 say0Var4 = this.f100678c.f251458a.f248612d;
                    if (say0Var4 != null) {
                        f2 = say0Var4.f207290a;
                    }
                }
                return Float.valueOf(f2);
        }
    }
}
