package p204p;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class h790 extends mb61 implements zh00 {

    /* JADX INFO: renamed from: a */
    public boolean f88387a;

    /* JADX INFO: renamed from: b */
    public int f88388b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ e790 f88389c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ b790 f88390d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ljp f88391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h790(ljp ljpVar, fbk fbkVar) {
        super(5, fbkVar);
        this.f88391e = ljpVar;
    }

    @Override // p204p.zh00
    /* JADX INFO: renamed from: e1 */
    public final Object mo25195e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h790 h790Var = new h790(this.f88391e, (fbk) obj5);
        h790Var.f88389c = (e790) obj2;
        h790Var.f88390d = (b790) obj3;
        return h790Var.invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r0.m39990i(r1, r10) == r7) goto L25;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.ly8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zContains;
        boolean z;
        e790 e790Var = this.f88389c;
        b790 b790Var = this.f88390d;
        int i = this.f88388b;
        ljp ljpVar = this.f88391e;
        yuk yukVar = yuk.f276404a;
        if (i != 0) {
            if (i == 1) {
                z = this.f88387a;
                bga.m29073P(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj);
        if (!(b790Var instanceof b790)) {
            throw new NoWhenBranchMatchedException();
        }
        Set set = e790Var.f56872b;
        String str = b790Var.f24194a;
        zContains = set.contains(str);
        i790 i790Var = (i790) ljpVar.f134120f.get(str);
        if (i790Var != null) {
            nt80 nt80Var = i790Var.f99472c;
            Object dw80Var = zContains ? new dw80(nt80Var) : new cw80(nt80Var);
            pgo pgoVar = (pgo) ljpVar.f134117c;
            laz lazVar = laz.f131472t;
            fw80 fw80Var = (fw80) ljpVar.f134123i;
            this.f88389c = null;
            this.f88390d = b790Var;
            this.f88387a = zContains;
            this.f88388b = 1;
            if (pgoVar.mo25869e(lazVar, fw80Var, dw80Var, this) != yukVar) {
                z = zContains;
            }
        } else {
            etz etzVar = (etz) ljpVar.f134119e;
            Map mapSingletonMap = Collections.singletonMap(b790Var.f24194a, Boolean.valueOf(!zContains));
            this.f88389c = null;
            this.f88390d = null;
            this.f88387a = zContains;
            this.f88388b = 2;
        }
        return yukVar;
        zContains = z;
        etz etzVar2 = (etz) ljpVar.f134119e;
        Map mapSingletonMap2 = Collections.singletonMap(b790Var.f24194a, Boolean.valueOf(!zContains));
        this.f88389c = null;
        this.f88390d = null;
        this.f88387a = zContains;
        this.f88388b = 2;
    }
}
