package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;

/* JADX INFO: loaded from: classes8.dex */
public final class dpk0 implements th00 {

    /* JADX INFO: renamed from: b */
    public static final st80 f51359b;

    /* JADX INFO: renamed from: a */
    public final wt80 f51360a;

    static {
        top0 top0VarM18421v = PlaylistRequestDecorationPolicy.m18421v();
        bjp0 bjp0VarM18365h0 = PlaylistDecorationPolicy.m18365h0();
        bjp0VarM18365h0.m29495G();
        top0VarM18421v.m81215w((PlaylistDecorationPolicy) bjp0VarM18365h0.build());
        amp0 amp0VarM18396H = PlaylistItemDecorationPolicy.m18396H();
        amp0VarM18396H.m26433D(true);
        amp0VarM18396H.m26430A();
        top0VarM18421v.m81214v(amp0VarM18396H);
        f51359b = new st80((PlaylistRequestDecorationPolicy) top0VarM18421v.build(), null, null, false, null, new b5u0(0, 10), null, 0, null, 478);
    }

    public dpk0(wt80 wt80Var) {
        this.f51360a = wt80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // p204p.th00
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(utc0 utc0Var, fbk fbkVar) {
        bpk0 bpk0Var;
        if (fbkVar instanceof bpk0) {
            bpk0Var = (bpk0) fbkVar;
            int i = bpk0Var.f29538d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bpk0Var.f29538d = i - Integer.MIN_VALUE;
            } else {
                bpk0Var = new bpk0(this, fbkVar);
            }
        } else {
            bpk0Var = new bpk0(this, fbkVar);
        }
        Object objM76980u = bpk0Var.f29536b;
        int i2 = bpk0Var.f29538d;
        if (i2 == 0) {
            bga.m29073P(objM76980u);
            vpj0 vpj0Var = new vpj0(this, utc0Var, (fbk) null, 13);
            bpk0Var.f29535a = utc0Var;
            bpk0Var.f29538d = 1;
            objM76980u = s1h1.m76980u(90000L, vpj0Var, bpk0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            utc0Var = bpk0Var.f29535a;
            bga.m29073P(objM76980u);
        }
        apk0 apk0Var = (apk0) objM76980u;
        if (apk0Var == null) {
            return new pwc0(utc0Var.f233891a);
        }
        return new owc0(utc0Var.f233891a, apk0Var.f17969b, opo.m67574x(apk0Var.f17968a));
    }
}
