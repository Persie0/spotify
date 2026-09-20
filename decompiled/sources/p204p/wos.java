package p204p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.command.SetShufflingContextCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class wos implements xnd0 {

    /* JADX INFO: renamed from: a */
    public final uzx f253564a;

    /* JADX INFO: renamed from: b */
    public final myx f253565b;

    /* JADX INFO: renamed from: c */
    public final sxi f253566c;

    /* JADX INFO: renamed from: d */
    public final wm21 f253567d;

    /* JADX INFO: renamed from: e */
    public final u4i f253568e;

    public wos(uzx uzxVar, myx myxVar, sxi sxiVar, wm21 wm21Var, hon honVar) {
        this.f253564a = uzxVar;
        this.f253565b = myxVar;
        this.f253566c = sxiVar;
        this.f253567d = wm21Var;
        this.f253568e = honVar.m48101a(uzxVar);
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: a */
    public final Completable mo31391a(long j, String str) {
        return this.f253565b.m63224k(j, this.f253566c.m79644a(str)).map(tos.f222315a).flatMap(new gd5(this, j, 5)).ignoreElement();
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: b */
    public final Completable mo31392b(String str, Uri uri, Bundle bundle) {
        Logger.m3966b("MediaSessionCallback.onPlayFromUri - not implemented for %s!", str);
        return CompletableEmpty.f7437a;
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: c */
    public final Completable mo31393c(String str) {
        return this.f253565b.m63227n(this.f253566c.m79644a(str)).map(vos.f243525a).flatMapCompletable(new ibp(this, 18));
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: d */
    public final Completable mo31394d(long j, String str) {
        return this.f253567d.m88528a((int) j, this.f253566c.m79644a(str));
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: e */
    public final Completable mo31395e(String str) {
        return this.f253565b.m63217c(this.f253566c.m79644a(str)).map(ros.f201342a).flatMapCompletable(new bzo(this, 26));
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: f */
    public final boolean mo31396f(String str) {
        return false;
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: g */
    public final Completable mo31397g(String str, String str2, Bundle bundle) {
        try {
            return this.f253568e.m82335f(str2, bundle, this.f253566c.m79644a(str));
        } catch (IllegalArgumentException e) {
            Logger.m3967c(e, "Media action %s is not supported", str2);
            return CompletableEmpty.f7437a;
        }
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: h */
    public final Completable mo31398h(int i, String str) {
        Logger.m3966b("MediaSessionCallback.onSetRating - not implemented for %s!", str);
        return CompletableEmpty.f7437a;
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: i */
    public final Completable mo31399i(String str, String str2, Bundle bundle) {
        Logger.m3966b("MediaSessionCallback.onPlayFromSearch - not implemented for %s!", str);
        return CompletableEmpty.f7437a;
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: j */
    public final Completable mo31400j(String str) {
        return this.f253565b.m63226m(this.f253566c.m79644a(str)).map(uos.f232508a).flatMapCompletable(new jwo(this, 20));
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: k */
    public final Completable mo31401k(String str, hrd0 hrd0Var) {
        ExternalAccessoryDescription externalAccessoryDescriptionM79644a = this.f253566c.m79644a(str);
        int iOrdinal = hrd0Var.ordinal();
        myx myxVar = this.f253565b;
        uzx uzxVar = this.f253564a;
        if (iOrdinal == 0) {
            return ((c0y) uzxVar.f235651a.f246568h).m31202k(1).ignoreElement().m23301r(myxVar.m63220g(externalAccessoryDescriptionM79644a).ignoreElement());
        }
        if (iOrdinal == 1) {
            return ((c0y) uzxVar.f235651a.f246568h).m31202k(3).ignoreElement().m23301r(myxVar.m63221h(externalAccessoryDescriptionM79644a).ignoreElement());
        }
        if (iOrdinal == 2) {
            return ((c0y) uzxVar.f235651a.f246568h).m31202k(2).ignoreElement().m23301r(myxVar.m63219f(externalAccessoryDescriptionM79644a).ignoreElement());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: l */
    public final List mo31402l() {
        return lau.f131415a;
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: m */
    public final Completable mo31403m(int i, String str) {
        ExternalAccessoryDescription externalAccessoryDescriptionM79644a = this.f253566c.m79644a(str);
        int iM38547C = edb.m38547C(i);
        myx myxVar = this.f253565b;
        uzx uzxVar = this.f253564a;
        if (iM38547C == 0) {
            xzx xzxVar = uzxVar.f235651a.f246568h;
            Completable completableM23301r = ((c0y) xzxVar).f32912i.m51475d(SetShufflingContextCommand.create(false)).ignoreElement().m23301r(myxVar.m63225l(externalAccessoryDescriptionM79644a, 2, 1).ignoreElement());
            wj50.m88279p(completableM23301r);
            return completableM23301r;
        }
        if (iM38547C != 1) {
            throw new NoWhenBranchMatchedException();
        }
        xzx xzxVar2 = uzxVar.f235651a.f246568h;
        Completable completableM23301r2 = ((c0y) xzxVar2).f32912i.m51475d(SetShufflingContextCommand.create(true)).ignoreElement().m23301r(myxVar.m63225l(externalAccessoryDescriptionM79644a, 1, 2).ignoreElement());
        wj50.m88279p(completableM23301r2);
        return completableM23301r2;
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: n */
    public final Completable mo31404n(String str) {
        return this.f253565b.m63222i(this.f253566c.m79644a(str)).map(sos.f212648a).flatMapCompletable(new d9p(this, 19));
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: o */
    public final Completable mo31405o(String str) {
        return ((c0y) this.f253564a.f235651a.f246568h).m31195d(C2244p5.f174033a).ignoreElement();
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: p */
    public final Single mo31406p(String str, Bundle bundle) {
        Logger.m3966b("MediaSessionCallback.onCommand - not implemented for %s!", str);
        return Single.never();
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: q */
    public final Completable mo31407q(String str, Uri uri, Bundle bundle) {
        Logger.m3966b("MediaSessionCallback.onPrepareFromUri - not implemented for %s!", str);
        return CompletableEmpty.f7437a;
    }

    @Override // p204p.xnd0
    /* JADX INFO: renamed from: r */
    public final Completable mo31408r(int i, Bundle bundle, String str, String str2) {
        Logger.m3966b("MediaSessionCallback.onPlayFromMediaId - not implemented for %s!", str);
        return CompletableEmpty.f7437a;
    }
}
