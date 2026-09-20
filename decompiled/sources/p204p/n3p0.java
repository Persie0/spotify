package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n3p0 extends mb61 implements bi00 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ l190 f150101a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ l3p0 f150102b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Set f150103c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ j3p0 f150104d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ rt80 f150105e;

    public n3p0(fbk fbkVar) {
        super(6, fbkVar);
    }

    @Override // p204p.bi00
    /* JADX INFO: renamed from: c0 */
    public final Object mo27353c0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        n3p0 n3p0Var = new n3p0((fbk) obj6);
        n3p0Var.f150101a = (l190) obj;
        n3p0Var.f150102b = (l3p0) obj2;
        n3p0Var.f150103c = (Set) obj3;
        n3p0Var.f150104d = (j3p0) obj4;
        n3p0Var.f150105e = (rt80) obj5;
        return n3p0Var.invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        l190 l190Var = this.f150101a;
        l3p0 l3p0Var = this.f150102b;
        Set set = this.f150103c;
        j3p0 j3p0Var = this.f150104d;
        rt80 rt80Var = this.f150105e;
        bga.m29073P(obj);
        return new k3p0(j3p0Var, l190Var, set, l3p0Var, rt80Var);
    }
}
