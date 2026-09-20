package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class q13 extends mb61 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184166a;

    /* JADX INFO: renamed from: b */
    public int f184167b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ niz f184168c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object[] f184169d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f184170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q13(int i, List list, fbk fbkVar) {
        super(3, fbkVar);
        this.f184166a = i;
        this.f184170e = list;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        niz nizVar = (niz) obj;
        Object[] objArr = (Object[]) obj2;
        fbk fbkVar = (fbk) obj3;
        switch (this.f184166a) {
            case 0:
                q13 q13Var = new q13(0, this.f184170e, fbkVar);
                q13Var.f184168c = nizVar;
                q13Var.f184169d = objArr;
                return q13Var.invokeSuspend(w2a1.f247311a);
            default:
                q13 q13Var2 = new q13(1, this.f184170e, fbkVar);
                q13Var2.f184168c = nizVar;
                q13Var2.f184169d = objArr;
                return q13Var2.invokeSuspend(w2a1.f247311a);
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f184166a) {
            case 0:
                niz nizVar = this.f184168c;
                Object[] objArr = this.f184169d;
                int i = this.f184167b;
                if (i == 0) {
                    bga.m29073P(obj);
                    qho[] qhoVarArr = (qho[]) objArr;
                    ArrayList arrayList = new ArrayList();
                    int length = qhoVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            qho qhoVar = qhoVarArr[i2];
                            oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                            w46 w46Var = ohoVar != null ? (w46) ohoVar.f165512a : null;
                            if (w46Var != null) {
                                arrayList.add(w46Var);
                            }
                            i2++;
                        } else {
                            String strM43753y0 = g6f.m43753y0(g6f.m43711Y0(arrayList, new u13(0, this.f184170e)), ", ", null, null, m13.f138827f, 30);
                            this.f184168c = null;
                            this.f184169d = null;
                            this.f184167b = 1;
                            Object objEmit = nizVar.emit(strM43753y0, this);
                            yuk yukVar = yuk.f276404a;
                            if (objEmit == yukVar) {
                                return yukVar;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                niz nizVar2 = this.f184168c;
                Object[] objArr2 = this.f184169d;
                int i3 = this.f184167b;
                if (i3 == 0) {
                    bga.m29073P(obj);
                    rql rqlVar = new rql(kkc0.m56705r0(g6f.m43746s1(this.f184170e, bk5.m29620k1((qho[]) objArr2))));
                    this.f184168c = null;
                    this.f184169d = null;
                    this.f184167b = 1;
                    Object objEmit2 = nizVar2.emit(rqlVar, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
