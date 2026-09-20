package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class qkj implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f189577a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f189578b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vy81 f189579c;

    public qkj(niz nizVar, C1668ai c1668ai, vy81 vy81Var) {
        this.f189578b = nizVar;
        this.f189579c = vy81Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        pkj pkjVar;
        oho ohoVar;
        z3r z3rVar;
        Object x3rVar;
        switch (this.f189577a) {
            case 0:
                if (fbkVar instanceof pkj) {
                    pkjVar = (pkj) fbkVar;
                    int i = pkjVar.f178472b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pkjVar.f178472b = i - Integer.MIN_VALUE;
                    } else {
                        pkjVar = new pkj(this, fbkVar);
                    }
                } else {
                    pkjVar = new pkj(this, fbkVar);
                }
                Object obj2 = pkjVar.f178471a;
                int i2 = pkjVar.f178472b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    y3r y3rVar = (y3r) obj;
                    if (y3rVar instanceof x3r) {
                        ohoVar = new oho(((x3r) y3rVar).f257863a, null);
                    } else {
                        if (!(y3rVar instanceof v3r) && !(y3rVar instanceof w3r)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ohoVar = new oho(this.f189579c, null);
                    }
                    pkjVar.f178472b = 1;
                    Object objEmit = this.f189578b.emit(ohoVar, pkjVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof z3r) {
                    z3rVar = (z3r) fbkVar;
                    int i3 = z3rVar.f279013b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z3rVar.f279013b = i3 - Integer.MIN_VALUE;
                    } else {
                        z3rVar = new z3r(this, fbkVar);
                    }
                } else {
                    z3rVar = new z3r(this, fbkVar);
                }
                Object obj3 = z3rVar.f279012a;
                int i4 = z3rVar.f279013b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    x8n0 x8n0Var = (x8n0) obj;
                    int iM38547C = edb.m38547C(x8n0Var.f259189b);
                    if (iM38547C == 1) {
                        x3rVar = v3r.f236927a;
                    } else if (iM38547C != 2) {
                        x3rVar = w3r.f247631a;
                    } else {
                        vy81 vy81Var = this.f189579c;
                        x3rVar = new x3r(new vy81(vy81Var.f246009a, vy81Var.f246010b, vy81Var.f246011c, vy81Var.f246012d, vy81Var.f246013e, vy81Var.f246014f, vy81Var.f246015g, vy81Var.f246016h, vtg1.m86390q(vy81Var.f246017i, x8n0Var.f259190c), vy81Var.f246018t, x8n0Var.f259191d ? 4 : 3, vy81Var.f246007Y, vy81Var.f246008Z));
                    }
                    z3rVar.f279013b = 1;
                    Object objEmit2 = this.f189578b.emit(x3rVar, z3rVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }

    public qkj(niz nizVar, vy81 vy81Var) {
        this.f189578b = nizVar;
        this.f189579c = vy81Var;
    }
}
