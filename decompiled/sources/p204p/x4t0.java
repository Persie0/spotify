package p204p;

import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.spotify.authentication.tokenexchangeapi.TokenExchangeException;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x4t0 implements f5y, Predicate, BiFunction, Function, njq, i600, fi00, azx0, v8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258196a;

    public /* synthetic */ x4t0(int i) {
        this.f258196a = i;
    }

    @Override // p204p.v8j
    public void accept(Object obj) {
        ((n0y0) obj).f149203b.release();
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Boolean) obj2).booleanValue() ? Optional.empty() : Optional.of((PlayerState) obj);
    }

    /* JADX INFO: renamed from: b */
    public blz0 m89906b(fmd0 fmd0Var) {
        zkz0 zkz0VarM25971n;
        zkz0 zkz0VarM25971n2;
        switch (this.f258196a) {
            case 24:
                gx8 gx8Var = (gx8) fmd0Var.f71031d;
                return new blz0(gx8Var.m46028b(gx8Var.f85218b), gx8Var.m46028b(gx8Var.f85219c), fmd0Var.m42093l() == 1);
            case 25:
                gx8 gx8Var2 = (gx8) fmd0Var.f71031d;
                return ahg1.m25975r(new blz0(gx8Var2.m46028b(gx8Var2.f85218b), gx8Var2.m46028b(gx8Var2.f85219c), fmd0Var.m42093l() == 1), fmd0Var);
            case 26:
                return ahg1.m25970m(fmd0Var, koq0.f124885Y);
            case 27:
                return ahg1.m25970m(fmd0Var, wnq0.f253249Y);
            default:
                blz0 blz0Var = (blz0) fmd0Var.f71030c;
                if (blz0Var == null) {
                    return ahg1.m25970m(fmd0Var, koq0.f124885Y);
                }
                zkz0 zkz0Var = blz0Var.f28310b;
                zkz0 zkz0Var2 = blz0Var.f28309a;
                gx8 gx8Var3 = (gx8) fmd0Var.f71031d;
                if (fmd0Var.f71029b) {
                    zkz0VarM25971n2 = ahg1.m25971n(fmd0Var, gx8Var3, zkz0Var2);
                    zkz0VarM25971n = zkz0Var;
                    zkz0Var = zkz0Var2;
                    zkz0Var2 = zkz0VarM25971n2;
                } else {
                    zkz0VarM25971n = ahg1.m25971n(fmd0Var, gx8Var3, zkz0Var);
                    zkz0VarM25971n2 = zkz0VarM25971n;
                }
                if (wj50.m88271j(zkz0VarM25971n2, zkz0Var)) {
                    return blz0Var;
                }
                boolean z = true;
                if (fmd0Var.m42093l() != 1 && (fmd0Var.m42093l() != 3 || zkz0Var2.f283872b <= zkz0VarM25971n.f283872b)) {
                    z = false;
                }
                return ahg1.m25975r(new blz0(zkz0Var2, zkz0VarM25971n, z), fmd0Var);
        }
    }

    @Override // p204p.njq
    /* JADX INFO: renamed from: e */
    public void mo40111e(j4t0 j4t0Var) {
        j4t0Var.get().getClass();
        throw new ClassCastException();
    }

    @Override // p204p.i600
    /* JADX INFO: renamed from: f */
    public void mo24367f(i500 i500Var) {
        ((lrw0) i500Var).getClass();
    }

    @Override // p204p.f5y
    /* JADX INFO: renamed from: g */
    public c5y[] mo25402g() {
        return new c5y[]{new z4t0()};
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f258196a) {
            case 2:
                return ((PlayerState) obj).track().mo49279c();
            case 4:
                return ((Optional) obj).isPresent();
            case 8:
                return ((Boolean) obj).booleanValue();
            case 12:
                return ((xul0) obj).mo49279c();
            default:
                return mkg1.m62160v((e301) obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) throws TokenExchangeException {
        switch (this.f258196a) {
            case 5:
                return (PlayerState) ((Optional) obj).get();
            case 6:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49278b();
                String strContextUri = playerState.contextUri();
                xf40 xf40VarMetadata = contextTrack.metadata();
                String strM38000d0 = e72.m38000d0(contextTrack, "image_url");
                Uri uri = strM38000d0 == null ? Uri.EMPTY : Uri.parse(strM38000d0);
                String strUri = contextTrack.uri();
                Uri uri2 = Uri.EMPTY;
                return new fxx(Collections.singletonList(new axx(strUri, null, (String) xf40VarMetadata.get(ContextTrack.Metadata.KEY_TITLE), e72.m38021r(contextTrack), uri, uri2, uri2, uri2, null, null, 1, false, e72.m37982P(contextTrack), false, false, 3, 4, null, null, null, false, null, strContextUri, null, 0, null, null, null, null, null, null, null, null, 536870912, 2)), null, null, null);
            case 7:
            case 8:
            case 9:
            case 12:
            default:
                xul0 xul0Var = (xul0) obj;
                if (xul0Var.mo49279c()) {
                    return (String) xul0Var.mo49278b();
                }
                return null;
            case 10:
                return null;
            case 11:
                List list = (List) obj;
                c95.m31843i(list.size() == 1);
                return Observable.just((uuz) list.get(0));
            case 13:
                return (String) ((xul0) obj).mo49278b();
            case 14:
                List list2 = ((x3u0) obj).f257882b;
                return (list2 == null || list2.isEmpty()) ? C2244p5.f174033a : xul0.m92200a((String) ((Map) list2.get(0)).get("uri"));
            case 15:
                lz71 lz71Var = (lz71) obj;
                if (lz71Var instanceof kz71) {
                    String str = ((kz71) lz71Var).f128043a.f127714a;
                    if (!TextUtils.isEmpty(str)) {
                        Uri.Builder builderBuildUpon = Uri.parse("https://accounts.spotify.com/login/ott/v2").buildUpon();
                        builderBuildUpon.encodedFragment("token=" + str);
                        return builderBuildUpon.build();
                    }
                }
                if (!(lz71Var instanceof jz71)) {
                    throw new TokenExchangeException("Token exchange returned unexpected result: ".concat(lz71Var.getClass().getSimpleName()));
                }
                jz71 jz71Var = (jz71) lz71Var;
                throw new TokenExchangeException(edb.m38566o("Token exchange failed: ", jz71Var.getClass().getSimpleName(), " - ", jz71Var.mo30975a()));
            case 16:
                return Boolean.valueOf(gwg1.m45947s((String) obj));
            case 17:
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 18:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    c06 c06VarM79891a = t28.m79891a();
                    c06VarM79891a.m31088E(cursor.getString(1));
                    c06VarM79891a.f32695c = ner0.m64272b(cursor.getInt(2));
                    String string = cursor.getString(3);
                    c06VarM79891a.f32694b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(c06VarM79891a.m31099k());
                }
                return arrayList;
        }
    }
}
