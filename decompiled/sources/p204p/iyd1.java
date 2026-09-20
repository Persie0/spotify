package p204p;

import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class iyd1 {

    /* JADX INFO: renamed from: e */
    public static final PlaylistRequestDecorationPolicy f106963e;

    /* JADX INFO: renamed from: a */
    public final String f106964a;

    /* JADX INFO: renamed from: b */
    public final wt80 f106965b;

    /* JADX INFO: renamed from: c */
    public final boolean f106966c;

    /* JADX INFO: renamed from: d */
    public final al40 f106967d = new al40(2);

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26430A();
        amp0VarM18396H.m26433D(true);
        top0VarM18421v.m81214v(amp0VarM18396H);
        f106963e = (PlaylistRequestDecorationPolicy) top0VarM18421v.build();
    }

    public iyd1(String str, wt80 wt80Var, boolean z) {
        this.f106964a = str;
        this.f106965b = wt80Var;
        this.f106966c = z;
    }

    /* JADX INFO: renamed from: a */
    public static final p2x0 m51905a(iyd1 iyd1Var, qkc1 qkc1Var, p2x0 p2x0Var, p2x0 p2x0Var2) {
        if ((p2x0Var instanceof m2x0) && (p2x0Var2 instanceof m2x0)) {
            qu80 qu80Var = (qu80) ((m2x0) p2x0Var).f139474a;
            qkc1Var.f189533c = Integer.valueOf(qu80Var.f192598d.size());
            return new m2x0(iyd1Var.m51906b(qu80Var, (qu80) ((m2x0) p2x0Var2).f139474a));
        }
        if (p2x0Var instanceof k2x0) {
            return ((k2x0) p2x0Var).m68968a(ngd1.f153669Y);
        }
        return p2x0Var2 instanceof k2x0 ? ((k2x0) p2x0Var2).m68968a(ngd1.f153671Z) : new k2x0(new i2x0("This should never happen. Check your code."));
    }

    /* JADX INFO: renamed from: b */
    public final eyd1 m51906b(qu80 qu80Var, qu80 qu80Var2) {
        Iterator it = qu80Var2.f192598d.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            al40 al40Var = this.f106967d;
            if (!zHasNext) {
                return new eyd1(qu80Var2.f192607m, new l5u0(qu80Var.f192598d, kkc0.m56706s0(al40Var)));
            }
            nw80 nw80Var = (nw80) it.next();
            al40Var.put(nw80Var.f159047a, nw80Var);
        }
    }
}
