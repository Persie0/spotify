package p204p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Map;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class j8q {

    /* JADX INFO: renamed from: e */
    public static final wg61 f109986e = new wg61(C2087le.f132386P0);

    /* JADX INFO: renamed from: a */
    public final wt80 f109987a;

    /* JADX INFO: renamed from: b */
    public final o040 f109988b;

    /* JADX INFO: renamed from: c */
    public final Flowable f109989c;

    /* JADX INFO: renamed from: d */
    public final luk f109990d;

    public j8q(wt80 wt80Var, o040 o040Var, Flowable flowable, luk lukVar) {
        this.f109987a = wt80Var;
        this.f109988b = o040Var;
        this.f109989c = flowable;
        this.f109990d = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m52708a(j8q j8qVar, String str, String str2, ibk ibkVar) {
        h8q h8qVar;
        ContextTrack contextTrack;
        if (ibkVar instanceof h8q) {
            h8qVar = (h8q) ibkVar;
            int i = h8qVar.f88773e;
            if ((i & Integer.MIN_VALUE) != 0) {
                h8qVar.f88773e = i - Integer.MIN_VALUE;
            } else {
                h8qVar = new h8q(j8qVar, ibkVar);
            }
        } else {
            h8qVar = new h8q(j8qVar, ibkVar);
        }
        Object objM86757v = h8qVar.f88771c;
        int i2 = h8qVar.f88773e;
        if (i2 == 0) {
            bga.m29073P(objM86757v);
            Flowable flowable = j8qVar.f109989c;
            yab yabVarM54985d = k0e1.m54985d(AbstractC0000a.m11j(flowable, flowable).onErrorReturn(uwk.f234674V0));
            h8qVar.f88769a = str;
            h8qVar.f88770b = str2;
            h8qVar.f88773e = 1;
            objM86757v = vyf1.m86757v(yabVarM54985d, h8qVar);
            yuk yukVar = yuk.f276404a;
            if (objM86757v == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = h8qVar.f88770b;
            str = h8qVar.f88769a;
            bga.m29073P(objM86757v);
        }
        PlayerState playerState = (PlayerState) objM86757v;
        if (playerState != null && (contextTrack = (ContextTrack) playerState.track().mo49283h()) != null && wj50.m88271j(contextTrack.uri(), str) && wj50.m88271j(playerState.contextUri(), str2)) {
            return playerState;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: b */
    public static final Object m52709b(j8q j8qVar, String str, ibk ibkVar) {
        i8q i8qVar;
        String str2;
        if (ibkVar instanceof i8q) {
            i8qVar = (i8q) ibkVar;
            int i = i8qVar.f99827c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i8qVar.f99827c = i - Integer.MIN_VALUE;
            } else {
                i8qVar = new i8q(j8qVar, ibkVar);
            }
        } else {
            i8qVar = new i8q(j8qVar, ibkVar);
        }
        Object objM62841f = i8qVar.f99825a;
        int i2 = i8qVar.f99827c;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(objM62841f);
            wt80 wt80Var = j8qVar.f109987a;
            st80 st80Var = new st80(fig1.m41747y(), null, null, false, null, c5u0.f34291a, null, 0, null, 478);
            i8qVar.f99827c = 1;
            objM62841f = ((mu80) wt80Var).m62841f(str, st80Var, i8qVar);
            yuk yukVar = yuk.f276404a;
            if (objM62841f == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM62841f);
        }
        qu80 qu80Var = (qu80) ((p2x0) objM62841f).m68970c();
        if (qu80Var == null) {
            return qyg1.m74178H(false);
        }
        o040 o040Var = j8qVar.f109988b;
        ybv ybvVar = qu80Var.f192599e;
        Map map = ybvVar.f271272q;
        String str3 = ybvVar.f271271p;
        if (str3 == null) {
            str3 = "";
        }
        if (!o040Var.f160228b.contains(((w300) o040Var.f160227a).m87094a(str3)) && ((str2 = (String) map.get(Context.Metadata.KEY_IS_ALGOTORIAL)) == null || !Boolean.parseBoolean(str2))) {
            z = false;
        }
        return qyg1.m74178H(z);
    }
}
