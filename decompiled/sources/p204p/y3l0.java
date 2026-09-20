package p204p;

import com.spotify.offline_esperanto.proto.EsOffline$DeviceKey;
import com.spotify.offline_esperanto.proto.EsOffline$DevicesWithContextRequest;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import com.spotify.offline_esperanto.proto.EsOffline$GetListsContainingItemRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class y3l0 {

    /* JADX INFO: renamed from: a */
    public final fwk0 f268961a;

    public y3l0(fwk0 fwk0Var) {
        this.f268961a = fwk0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Completable m92766a(String str, f5r f5rVar) {
        amw amwVarM16125q = EsOffline$DownloadRequest.m16125q();
        amwVarM16125q.m26450r(str);
        ylw ylwVarM16113q = EsOffline$DeviceKey.m16113q();
        ylwVarM16113q.m94175q(f5rVar.m40773g());
        ylwVarM16113q.m94174m(f5rVar.m40772c());
        amwVarM16125q.m26449q(ylwVarM16113q);
        return this.f268961a.m42967a((EsOffline$DownloadRequest) amwVarM16125q.build()).flatMapCompletable(isy.f105340T0);
    }

    /* JADX INFO: renamed from: b */
    public final Object m92767b(String str, ibk ibkVar) {
        emw emwVarM16155o = EsOffline$GetListsContainingItemRequest.m16155o();
        emwVarM16155o.m39464m(str);
        return zn91.m96567o(this.f268961a.callSingle("spotify.offline_esperanto.proto.Offline", "GetListsContainingItem", (EsOffline$GetListsContainingItemRequest) emwVarM16155o.build()).map(yby.f271292S0).map(r2z.f195268T0), ibkVar);
    }

    /* JADX INFO: renamed from: c */
    public final Completable m92768c(String str, f5r f5rVar) {
        amw amwVarM16125q = EsOffline$DownloadRequest.m16125q();
        amwVarM16125q.m26450r(str);
        ylw ylwVarM16113q = EsOffline$DeviceKey.m16113q();
        ylwVarM16113q.m94175q(f5rVar.m40773g());
        ylwVarM16113q.m94174m(f5rVar.m40772c());
        amwVarM16125q.m26449q(ylwVarM16113q);
        return this.f268961a.callSingle("spotify.offline_esperanto.proto.Offline", "RemoveDownload", (EsOffline$DownloadRequest) amwVarM16125q.build()).map(hsy.f94834S0).flatMapCompletable(y3z.f269015T0);
    }

    /* JADX INFO: renamed from: d */
    public final Observable m92769d(String str) {
        zlw zlwVarM16115o = EsOffline$DevicesWithContextRequest.m16115o();
        zlwVarM16115o.m96391m(str);
        return this.f268961a.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeDevicesWithContext", (EsOffline$DevicesWithContextRequest) zlwVarM16115o.build()).map(r2z.f195267S0).map(y8z.f270426T0);
    }
}
