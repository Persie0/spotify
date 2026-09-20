package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes8.dex */
public final class z1a0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f278269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b2a0 f278270c;

    public /* synthetic */ z1a0(niz nizVar, b2a0 b2a0Var, int i) {
        this.f278268a = i;
        this.f278269b = nizVar;
        this.f278270c = b2a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        y1a0 y1a0Var;
        a2a0 a2a0Var;
        switch (this.f278268a) {
            case 0:
                if (fbkVar instanceof y1a0) {
                    y1a0Var = (y1a0) fbkVar;
                    int i = y1a0Var.f268215b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        y1a0Var.f268215b = i - Integer.MIN_VALUE;
                    } else {
                        y1a0Var = new y1a0(this, fbkVar);
                    }
                } else {
                    y1a0Var = new y1a0(this, fbkVar);
                }
                Object obj2 = y1a0Var.f268214a;
                int i2 = y1a0Var.f268215b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    v1a0 v1a0VarM27949a = b2a0.m27949a(this.f278270c, (PlayerState) obj);
                    y1a0Var.f268215b = 1;
                    Object objEmit = this.f278269b.emit(v1a0VarM27949a, y1a0Var);
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
                if (fbkVar instanceof a2a0) {
                    a2a0Var = (a2a0) fbkVar;
                    int i3 = a2a0Var.f11608b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a2a0Var.f11608b = i3 - Integer.MIN_VALUE;
                    } else {
                        a2a0Var = new a2a0(this, fbkVar);
                    }
                } else {
                    a2a0Var = new a2a0(this, fbkVar);
                }
                Object obj3 = a2a0Var.f11607a;
                int i4 = a2a0Var.f11608b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    v1a0 v1a0VarM27949a2 = b2a0.m27949a(this.f278270c, (PlayerState) obj);
                    a2a0Var.f11608b = 1;
                    Object objEmit2 = this.f278269b.emit(v1a0VarM27949a2, a2a0Var);
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
