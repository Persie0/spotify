package p204p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: classes11.dex */
public final class i0c0 {

    /* JADX INFO: renamed from: a */
    public final wt80 f97200a;

    /* JADX INFO: renamed from: b */
    public final er70 f97201b;

    /* JADX INFO: renamed from: c */
    public final wg61 f97202c = new wg61(l4b0.f129637b1);

    public i0c0(wt80 wt80Var, er70 er70Var) {
        this.f97200a = wt80Var;
        this.f97201b = er70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m49355a(u4z0 u4z0Var, ibk ibkVar) {
        h0c0 h0c0Var;
        ybv ybvVar;
        u4z0 u4z0Var2 = u4z0Var;
        if (ibkVar instanceof h0c0) {
            h0c0Var = (h0c0) ibkVar;
            int i = h0c0Var.f86216d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0c0Var.f86216d = i - Integer.MIN_VALUE;
            } else {
                h0c0Var = new h0c0(this, ibkVar);
            }
        } else {
            h0c0Var = new h0c0(this, ibkVar);
        }
        Object objM62841f = h0c0Var.f86214b;
        int i2 = h0c0Var.f86216d;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            String str = u4z0Var2.f226859b;
            st80 st80Var = new st80((PlaylistRequestDecorationPolicy) this.f97202c.getValue(), null, null, false, null, c5u0.f34291a, null, 0, null, 478);
            h0c0Var.f86213a = u4z0Var2;
            h0c0Var.f86216d = 1;
            objM62841f = ((mu80) this.f97200a).m62841f(str, st80Var, h0c0Var);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u4z0Var2 = h0c0Var.f86213a;
            bga.m29073P(objM62841f);
        }
        qu80 qu80Var = (qu80) ((p2x0) objM62841f).m68970c();
        if (qu80Var != null && (ybvVar = qu80Var.f192599e) != null) {
            if (ybvVar.f271277v.m59499a() || !ybvVar.f271278w.f156644h.f116555a.contains(lnn0.f135184c)) {
                ybvVar = null;
            }
            if (ybvVar != null) {
                return ((o290) this.f97201b.get()).m66097b(u4z0Var2.f226859b, ybvVar.f271277v);
            }
        }
        return null;
    }
}
