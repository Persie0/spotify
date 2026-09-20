package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class g9z extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77927a;

    /* JADX INFO: renamed from: b */
    public int f77928b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f77929c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f77930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9z(String str, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f77927a = i;
        this.f77930d = str;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f77927a) {
            case 0:
                g9z g9zVar = new g9z(this.f77930d, fbkVar, 0);
                g9zVar.f77929c = obj;
                return g9zVar;
            default:
                g9z g9zVar2 = new g9z(this.f77930d, fbkVar, 1);
                g9zVar2.f77929c = obj;
                return g9zVar2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        niz nizVar = (niz) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f77927a) {
            case 0:
                break;
        }
        return ((g9z) create(nizVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f77927a) {
            case 0:
                niz nizVar = (niz) this.f77929c;
                int i = this.f77928b;
                if (i == 0) {
                    bga.m29073P(obj);
                    b450 b450Var = new b450(1, 20, 1);
                    ArrayList arrayList = new ArrayList(i6f.m49804T(b450Var, 10));
                    Iterator it = b450Var.iterator();
                    while (((a450) it).f12141c) {
                        arrayList.add(new xsx0(s571.m77246e(((t350) it).nextInt(), "FindInShowLoading-")));
                    }
                    d9z d9zVar = new d9z(this.f77930d, new lim0(arrayList));
                    this.f77929c = null;
                    this.f77928b = 1;
                    Object objEmit = nizVar.emit(d9zVar, this);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                niz nizVar2 = (niz) this.f77929c;
                int i2 = this.f77928b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    pqm0 pqm0Var = new pqm0(this.f77930d, f8e0.f66962a);
                    this.f77929c = null;
                    this.f77928b = 1;
                    Object objEmit2 = nizVar2.emit(pqm0Var, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
