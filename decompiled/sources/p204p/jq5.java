package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jq5 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f114789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ d7m0 f114790c;

    public /* synthetic */ jq5(niz nizVar, d7m0 d7m0Var, int i) {
        this.f114788a = i;
        this.f114789b = nizVar;
        this.f114790c = d7m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        iq5 iq5Var;
        z8s0 z8s0Var;
        switch (this.f114788a) {
            case 0:
                if (fbkVar instanceof iq5) {
                    iq5Var = (iq5) fbkVar;
                    int i = iq5Var.f104631b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iq5Var.f104631b = i - Integer.MIN_VALUE;
                    } else {
                        iq5Var = new iq5(this, fbkVar);
                    }
                } else {
                    iq5Var = new iq5(this, fbkVar);
                }
                Object obj2 = iq5Var.f104630a;
                int i2 = iq5Var.f104631b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    Boolean boolValueOf = Boolean.valueOf(wj50.m88271j(((Map) obj).get(this.f114790c.f46240a), Boolean.TRUE));
                    iq5Var.f104631b = 1;
                    Object objEmit = this.f114789b.emit(boolValueOf, iq5Var);
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
                if (fbkVar instanceof z8s0) {
                    z8s0Var = (z8s0) fbkVar;
                    int i3 = z8s0Var.f280553b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z8s0Var.f280553b = i3 - Integer.MIN_VALUE;
                    } else {
                        z8s0Var = new z8s0(this, fbkVar);
                    }
                } else {
                    z8s0Var = new z8s0(this, fbkVar);
                }
                Object obj3 = z8s0Var.f280552a;
                int i4 = z8s0Var.f280553b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(wj50.m88271j(((Map) obj).get(this.f114790c.f46240a), Boolean.TRUE));
                    z8s0Var.f280553b = 1;
                    Object objEmit2 = this.f114789b.emit(boolValueOf2, z8s0Var);
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
}
