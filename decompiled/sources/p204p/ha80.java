package p204p;

import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.C0003b;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.widget.EditText;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ha80 implements Function, SingleOnSubscribe, ant, oal0, w1j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89152a;

    /* JADX INFO: renamed from: b */
    public final Object f89153b;

    public /* synthetic */ ha80(Object obj, int i) {
        this.f89152a = i;
        this.f89153b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ mab0 m46913a(ha80 ha80Var) {
        return (mab0) ha80Var.f89153b;
    }

    /* JADX INFO: renamed from: h */
    public static nzx0 m46914h(ha80 ha80Var, String str) {
        ha80Var.getClass();
        return new nzx0(new dnc(ha80Var, str, null, 11));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.gh00, p.ri00] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Completable completableM91823a;
        switch (this.f89152a) {
            case 0:
                return ((ri00) this.f89153b).invoke(obj);
            case 2:
                qdl qdlVar = (qdl) this.f89153b;
                return new qdl(qdlVar.f187706a, eq31.m39719a(qdlVar.f187707b, ((es31) obj).f62272a, 2));
            case 4:
                tm90 tm90Var = (tm90) this.f89153b;
                um90 um90VarM83424a = um90.m83424a(tm90Var.f221636i, 0L, ((Boolean) obj).booleanValue(), 1);
                tm90Var.f221636i = um90VarM83424a;
                return um90VarM83424a;
            case 7:
                Throwable th = (Throwable) obj;
                zjf zjfVar = (zjf) this.f89153b;
                Logger.m3967c(th, edb.m38564m("Failed to load single comment thread for comment uri: ", zjfVar.f283433a), new Object[0]);
                return new wlf(zjfVar.f283433a, th);
            case 10:
                PlayerState playerState = (PlayerState) obj;
                return new mfb0((ContextTrack) playerState.track().mo49278b(), (String) playerState.playbackId().mo49280e("absent"), ((kb4) ((tgb0) this.f89153b).f220160a.get()).m55927a());
            case 16:
                q9e0 q9e0Var = (q9e0) obj;
                return g0b1.m43282x(xsr.f265652b, new sqc0((zby) this.f89153b, q9e0Var, (fbk) null, 17)).m23293d(Observable.just(new y9e0(q9e0Var.f186578c))).onErrorReturn(new cz90(q9e0Var, 12));
            case 20:
                return Completable.m23289m(((jph0) this.f89153b).f114670o).m23293d(Observable.just(bph0.f29477a));
            case 21:
                e301 e301Var = (e301) obj;
                ((hvi0) this.f89153b).getClass();
                if (e301Var.f55573c || e301Var.f55574d) {
                    return yhi0.f272909a;
                }
                return e301Var.f55572b ? yhi0.f272910b : yhi0.f272911c;
            case 22:
                hj6 hj6Var = (hj6) obj;
                mc1 mc1Var = (mc1) this.f89153b;
                xqb xqbVar = (xqb) mc1Var.f142009b;
                ii6 ii6Var = hj6Var.f91969h;
                if (ii6Var instanceof hi6) {
                    completableM91823a = xqbVar.m91823a(Collections.singletonList(((hi6) ii6Var).f91721a));
                } else if (ii6Var instanceof bi6) {
                    completableM91823a = xqbVar.m91823a(Collections.singletonList(((bi6) ii6Var).f27343a));
                } else if (ii6Var instanceof ci6) {
                    completableM91823a = xqbVar.m91823a(Collections.singletonList(((ci6) ii6Var).f38232a));
                } else {
                    completableM91823a = ii6Var instanceof di6 ? xqbVar.m91823a(Collections.singletonList(((di6) ii6Var).f49260a)) : CompletableEmpty.f7437a;
                }
                return completableM91823a.m23298o((Scheduler) mc1Var.f142010c).m23292c(new i2j0(0, mc1Var, hj6Var)).m23307y();
            case 23:
                rbj0 rbj0Var = (rbj0) this.f89153b;
                return rbj0Var.f197621d.mo35842b(rbj0Var.f197623f, (String) obj);
            case 24:
                d350 d350Var = (d350) obj;
                by50 by50Var = (by50) this.f89153b;
                return new rej0(new i350(by50Var.f32075a, edb.m38564m("spotify:socialsession:", by50Var.f32076b), by50Var.f32082h.f287211d ? "ipl" : "rgs"), d350Var);
            case 26:
                yk91 yk91Var = (yk91) obj;
                List list = (List) yk91Var.f273650a;
                List list2 = (List) yk91Var.f273651b;
                List list3 = (List) yk91Var.f273652c;
                p8k0 p8k0Var = (p8k0) this.f89153b;
                return k0e1.m54986e(g0g1.m43302g(p8k0.m69335e(p8k0Var, p8k0Var.f174975L0, list), p8k0.m69335e(p8k0Var, p8k0Var.f174976M0, list2), p8k0.m69335e(p8k0Var, p8k0Var.f174977N0, list3), new g82(4, 18, (fbk) null)), dau.f47107a);
            default:
                Observable observable = (Observable) this.f89153b;
                return ((Boolean) obj).booleanValue() ? observable.startWithItem(op20.f167738a) : observable.startWithItem(op20.f167739b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
    /* JADX WARN: Code duplicated, block: B:81:0x017d  */
    /* JADX WARN: Code duplicated, block: B:83:0x018a  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:83:0x018a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    public java.lang.Object m46915b(p204p.ibk r31) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.ha80.m46915b(p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public rg50 m46916c() {
        return (rg50) this.f89153b;
    }

    /* JADX INFO: renamed from: d */
    public PlaybackStateCompat m46917d() {
        ArrayList arrayList;
        PlaybackStateCompat.CustomAction customAction;
        C0003b c0003b = (C0003b) this.f89153b;
        MediaSessionCompat$Token mediaSessionCompat$Token = c0003b.f51e;
        if (mediaSessionCompat$Token.m34c() != null) {
            try {
                return mediaSessionCompat$Token.m34c().getPlaybackState();
            } catch (RemoteException unused) {
            }
        }
        PlaybackState playbackState = c0003b.f47a.getPlaybackState();
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> listM24717j = a4p0.m24717j(playbackState);
        if (listM24717j != null) {
            ArrayList arrayList2 = new ArrayList(listM24717j.size());
            for (PlaybackState.CustomAction customAction2 : listM24717j) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle bundleM24719l = a4p0.m24719l(customAction3);
                    ood0.m67479k(bundleM24719l);
                    customAction = new PlaybackStateCompat.CustomAction(a4p0.m24713f(customAction3), a4p0.m24722o(customAction3), a4p0.m24720m(customAction3), bundleM24719l);
                    customAction.f46e = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Bundle bundleM28099a = b4p0.m28099a(playbackState);
        ood0.m67479k(bundleM28099a);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(a4p0.m24725r(playbackState), a4p0.m24724q(playbackState), a4p0.m24716i(playbackState), a4p0.m24723p(playbackState), a4p0.m24714g(playbackState), 0, a4p0.m24718k(playbackState), a4p0.m24721n(playbackState), arrayList, a4p0.m24715h(playbackState), bundleM28099a);
        playbackStateCompat.f31Y = playbackState;
        return playbackStateCompat;
    }

    /* JADX INFO: renamed from: e */
    public ArrayList m46918e() {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        List<MediaSession.QueueItem> queue = ((C0003b) this.f89153b).f47a.getQueue();
        if (queue == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(queue.size());
        for (MediaSession.QueueItem queueItem : queue) {
            if (queueItem != null) {
                MediaSession.QueueItem queueItem2 = queueItem;
                mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem2, MediaDescriptionCompat.m28c(nod0.m65237b(queueItem2)), nod0.m65238c(queueItem2));
            } else {
                mediaSessionCompat$QueueItem = null;
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public MediaSessionCompat$Token m46919f() {
        return ((rg50) this.f89153b).mo53385a();
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        o12 o12Var = (o12) this.f89153b;
        ((wek0) ((urt0) o12Var.f160572c).f233454b).m87889c();
        if (((o7m) o12Var.f160571b).mo31748c() != null) {
            return p1j0.f173119a;
        }
        Uri uri = j330.f108275d;
        return tm4.m81100x(vj00.class, new xj00(e301Var.f55571a, null, null), uzq0.f235620a);
    }

    /* JADX INFO: renamed from: i */
    public kxg0 m46920i(int i) {
        return new kxg0(i, (st91) this.f89153b);
    }

    /* JADX INFO: renamed from: j */
    public void m46921j() {
        ((PublishSubject) this.f89153b).onNext(tqc0.f222790a);
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        ((sir0) this.f89153b).mo30231j(new dsl0(exc));
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        ze90 ze90Var = (ze90) this.f89153b;
        fnk0 fnk0Var = ze90Var.f281978p;
        if (fnk0Var == null || !fnk0Var.m42228h("listening-activity.visibility_indicator_enabled")) {
            bjiVar = fnk0Var;
            bjiVar = ze90Var.f281979q;
        }
        if (bjiVar != null) {
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f89152a) {
            case 5:
                uwi uwiVar = (uwi) obj;
                nn90 nn90Var = (nn90) this.f89153b;
                nn90Var.getClass();
                boolean z = (uwiVar instanceof qwi) || (uwiVar instanceof twi);
                nn90Var.f156381t.setVisibility(z ? 4 : 0);
                hxt hxtVar = nn90Var.f156364L0;
                if (hxtVar != null) {
                    hxtVar.f96307t.setVisibility(z ? 0 : 8);
                    return;
                } else {
                    wj50.m88260d0("connectLabelVH");
                    throw null;
                }
            case 17:
                ((EditText) ((MessageInputView) this.f89153b).f2748R0.f28646d).setHint(((rw40) obj).f203253a.f193465a);
                return;
            default:
                ((gbk0) this.f89153b).m44237g(((Boolean) obj).booleanValue());
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ha80(gh00 gh00Var) {
        this.f89152a = 0;
        this.f89153b = (ri00) gh00Var;
    }

    public ha80(ObservableFromPublisher observableFromPublisher, s1e1 s1e1Var) {
        this.f89152a = 8;
        this.f89153b = s1e1Var;
    }

    public ha80(int i) {
        this.f89152a = i;
        switch (i) {
            case 13:
                this.f89153b = (ExtraCroppingQuirk) rbr.f197650a.m76583e(ExtraCroppingQuirk.class);
                break;
            default:
                this.f89153b = new PublishSubject();
                break;
        }
    }

    public ha80(Context context, ood0 ood0Var) {
        this.f89152a = 14;
        MediaSessionCompat$Token mediaSessionCompat$Token = ((jod0) ood0Var.f167565b).f114395c;
        if (mediaSessionCompat$Token != null) {
            Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f89153b = new nbd0(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f89153b = new C0003b(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
