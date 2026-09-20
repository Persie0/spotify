package p204p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes2.dex */
public final class c810 {

    /* JADX INFO: renamed from: c */
    public static final y5f f35072c = new y5f(false, false, false);

    /* JADX INFO: renamed from: a */
    public final z5f f35073a;

    /* JADX INFO: renamed from: b */
    public final jv4 f35074b;

    public c810(z5f z5fVar, jv4 jv4Var) {
        this.f35073a = z5fVar;
        this.f35074b = jv4Var;
    }

    /* JADX INFO: renamed from: a */
    public static final t5m m31769a(c810 c810Var, ContextTrack contextTrack, y5f y5fVar) {
        c810Var.getClass();
        boolean zM37985S = e72.m37985S(contextTrack);
        if (bm51.m29803n0(contextTrack.uri(), "spotify:ad:", false) || zM37985S) {
            return t5m.f217318c;
        }
        return y5fVar.f269419c ? t5m.f217316a : t5m.f217317b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Enum m31770b(ContextTrack contextTrack, ibk ibkVar) {
        z710 z710Var;
        if (ibkVar instanceof z710) {
            z710Var = (z710) ibkVar;
            int i = z710Var.f280061c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z710Var.f280061c = i - Integer.MIN_VALUE;
            } else {
                z710Var = new z710(this, ibkVar);
            }
        } else {
            z710Var = new z710(this, ibkVar);
        }
        Object objM96567o = z710Var.f280059a;
        int i2 = z710Var.f280061c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            if (!this.f35074b.m54368h()) {
                return t5m.f217318c;
            }
            String strM38019p = e72.m38019p(contextTrack);
            if (!e72.m37978L(contextTrack) || strM38019p == null) {
                strM38019p = contextTrack.uri();
                wj50.m88279p(strM38019p);
            }
            Single map = z5f.m95456b(this.f35073a, "", new String[]{strM38019p}).map(new vah1(strM38019p, 14)).map(new nps(28, this, contextTrack));
            z710Var.f280061c = 1;
            objM96567o = zn91.m96567o(map, z710Var);
            yuk yukVar = yuk.f276404a;
            if (objM96567o == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM96567o);
        }
        wj50.m88279p(objM96567o);
        return (t5m) objM96567o;
    }
}
