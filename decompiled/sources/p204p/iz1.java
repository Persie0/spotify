package p204p;

import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Emitter;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class iz1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f107101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz1(Consumer consumer, int i) {
        super(1);
        this.f107100a = i;
        this.f107101b = consumer;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f107100a) {
            case 0:
                this.f107101b.accept((yz1) obj);
                return w2a1.f247311a;
            case 1:
                this.f107101b.accept(new wa5((za5) obj));
                return w2a1.f247311a;
            case 2:
                this.f107101b.accept(new xa5((za5) obj));
                return w2a1.f247311a;
            case 3:
                this.f107101b.accept((ov5) obj);
                return w2a1.f247311a;
            case 4:
                this.f107101b.accept(rj6.f199725a);
                return w2a1.f247311a;
            case 5:
                ((Boolean) obj).booleanValue();
                this.f107101b.accept(lfa.f132858a);
                return w2a1.f247311a;
            case 6:
                int iOrdinal = ((bda) obj).ordinal();
                if (iOrdinal != 0) {
                    Consumer consumer = this.f107101b;
                    if (iOrdinal == 1) {
                        consumer.accept(mfa.f143005a);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        consumer.accept(nfa.f153303a);
                    }
                }
                return w2a1.f247311a;
            case 7:
                this.f107101b.accept((nai) obj);
                return w2a1.f247311a;
            case 8:
                this.f107101b.accept((pdi) obj);
                return w2a1.f247311a;
            case 9:
                if (((Boolean) obj).booleanValue()) {
                    this.f107101b.accept(n3j.f150060a);
                }
                return w2a1.f247311a;
            case 10:
                ((Boolean) obj).booleanValue();
                this.f107101b.accept(ozs.f172352a);
                return w2a1.f247311a;
            case 11:
                g6t g6tVar = (g6t) obj;
                boolean z = g6tVar instanceof f6t;
                Consumer consumer2 = this.f107101b;
                if (z) {
                    consumer2.accept(new i5t(((f6t) g6tVar).f66499a));
                } else if (!(g6tVar instanceof d6t)) {
                    if (!(g6tVar instanceof e6t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    consumer2.accept(u4t.f226795a);
                }
                return w2a1.f247311a;
            case 12:
                g6t g6tVar2 = (g6t) obj;
                if (g6tVar2 instanceof f6t) {
                    this.f107101b.accept(new h5t(((f6t) g6tVar2).f66499a));
                } else if (!(g6tVar2 instanceof d6t) && !(g6tVar2 instanceof e6t)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            case 13:
                g6t g6tVar3 = (g6t) obj;
                if (!(g6tVar3 instanceof f6t)) {
                    if (!(g6tVar3 instanceof d6t) && !(g6tVar3 instanceof e6t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f107101b.accept(b5t.f23693a);
                }
                return w2a1.f247311a;
            case 14:
                g6t g6tVar4 = (g6t) obj;
                if (!(g6tVar4 instanceof f6t)) {
                    if (!(g6tVar4 instanceof d6t) && !(g6tVar4 instanceof e6t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f107101b.accept(a5t.f12595a);
                }
                return w2a1.f247311a;
            case 15:
                this.f107101b.accept(new t0u((String) obj, true));
                return w2a1.f247311a;
            case 16:
                gpy gpyVar = (gpy) obj;
                Object obj2 = gpyVar.f83268a;
                apy apyVar = obj2 instanceof apy ? (apy) obj2 : null;
                this.f107101b.accept(new boy(gpyVar.f83269b, apyVar != null ? apyVar.f18032b : false));
                return Boolean.FALSE;
            case 17:
                this.f107101b.accept(doy.f51129a);
                return Boolean.TRUE;
            case 18:
                this.f107101b.accept(coy.f40367a);
                return Boolean.TRUE;
            case 19:
                this.f107101b.accept((l8f) obj);
                return w2a1.f247311a;
            case 20:
                this.f107101b.accept(new r680((String) obj));
                return w2a1.f247311a;
            case 21:
                nmc0 nmc0Var = (nmc0) obj;
                boolean z2 = nmc0Var instanceof kmc0;
                Consumer consumer3 = this.f107101b;
                if (z2) {
                    consumer3.accept(new glc0(((kmc0) nmc0Var).f124109a));
                } else if (nmc0Var instanceof lmc0) {
                    consumer3.accept(new hlc0(((lmc0) nmc0Var).f134857a));
                } else if (nmc0Var instanceof jmc0) {
                    consumer3.accept(flc0.f70753a);
                } else if (nmc0Var instanceof hmc0) {
                    consumer3.accept(clc0.f39245a);
                } else if (nmc0Var instanceof imc0) {
                    consumer3.accept(dlc0.f50181a);
                } else {
                    if (!(nmc0Var instanceof mmc0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    consumer3.accept(elc0.f60685a);
                }
                return w2a1.f247311a;
            case 22:
                this.f107101b.accept(new ank0((Emitter) obj));
                return w2a1.f247311a;
            case 23:
                this.f107101b.accept(new f9n0((String) obj, true));
                return w2a1.f247311a;
            case 24:
                knr0 knr0Var = (knr0) obj;
                boolean zEquals = knr0Var.equals(gnr0.f82773a);
                Consumer consumer4 = this.f107101b;
                if (zEquals) {
                    consumer4.accept(tor0.f222314a);
                } else if (knr0Var.equals(hnr0.f93386a)) {
                    consumer4.accept(uor0.f232507a);
                } else if (knr0Var instanceof cnr0) {
                    consumer4.accept(por0.f179781a);
                } else if (knr0Var instanceof bnr0) {
                    consumer4.accept(new oor0(((bnr0) knr0Var).f28917a));
                } else if (knr0Var.equals(dnr0.f50874a)) {
                    consumer4.accept(qor0.f191034a);
                } else if (knr0Var.equals(enr0.f61221a)) {
                    consumer4.accept(ror0.f201341a);
                } else if (knr0Var.equals(fnr0.f71352a)) {
                    consumer4.accept(sor0.f212647a);
                } else if (knr0Var.equals(jnr0.f114188a)) {
                    consumer4.accept(kpr0.f125116a);
                } else {
                    if (!knr0Var.equals(inr0.f104048a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    consumer4.accept(jpr0.f114714a);
                }
                return w2a1.f247311a;
            case 25:
                this.f107101b.accept(new xzr0((ryz) obj));
                return w2a1.f247311a;
            case 26:
                this.f107101b.accept(new qzr0((p0s0) obj));
                return w2a1.f247311a;
            case 27:
                this.f107101b.accept(new nzr0((p0s0) obj));
                return w2a1.f247311a;
            default:
                this.f107101b.accept(new mzr0((p0s0) obj));
                return w2a1.f247311a;
        }
    }
}
