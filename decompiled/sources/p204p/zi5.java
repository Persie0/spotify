package p204p;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.util.Log;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.your_library_esperanto.proto.AlsoAvailableOfflineResponse;
import com.spotify.your_library_esperanto.proto.AlsoAvailableOfflineSuggestion;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class zi5 implements wi5, Function, SingleOnSubscribe, sv1, Init, w1j0, rcf, vd50, lp3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283081a;

    public /* synthetic */ zi5(int i) {
        this.f283081a = i;
    }

    /* JADX INFO: renamed from: e */
    public static final void m96194e(LinkedHashMap linkedHashMap, String str, int i, d0w d0wVar) {
        String strM34563b = d0wVar.m34563b(i);
        if (strM34563b.length() > 0) {
            linkedHashMap.put(str, strM34563b);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final lx31 m96195f(String str, String str2, String str3, String str4) {
        ArrayList arrayList = ox31.f170863a;
        return new lx31(str, qti0.m73841e(str2), str3, str4);
    }

    /* JADX INFO: renamed from: h */
    public static xzv m96196h() {
        b0w b0wVar = b0w.f22116d;
        vzk vzkVar = new vzk();
        vzk vzkVar2 = new vzk();
        yzv yzvVar = yzv.f277906d;
        xzv xzvVar = new xzv();
        xzvVar.f267789a = 0;
        xzvVar.f267790b = 0;
        xzvVar.f267791c = "";
        xzvVar.f267792d = "";
        xzvVar.f267793e = null;
        xzvVar.f267794f = null;
        xzvVar.f267795g = null;
        xzvVar.f267796h = false;
        xzvVar.f267797i = "";
        xzvVar.f267798j = "";
        xzvVar.f267799k = b0wVar;
        xzvVar.f267800l = vzkVar;
        xzvVar.f267801m = false;
        xzvVar.f267802n = null;
        xzvVar.f267803o = null;
        xzvVar.f267804p = false;
        xzvVar.f267805q = false;
        xzvVar.f267806r = false;
        xzvVar.f267807s = "";
        xzvVar.f267808t = vzkVar2;
        xzvVar.f267809u = false;
        xzvVar.f267810v = false;
        xzvVar.f267811w = false;
        xzvVar.f267812x = false;
        xzvVar.f267813y = false;
        xzvVar.f267814z = false;
        xzvVar.f267784A = yzvVar;
        xzvVar.f267785B = false;
        xzvVar.f267786C = t2l0.f216587a;
        xzvVar.f267787D = dpx.f51759a;
        xzvVar.f267788E = 1;
        return xzvVar;
    }

    /* JADX INFO: renamed from: i */
    public static cag0 m96197i(j8g0 j8g0Var, jsa0 jsa0Var, int i) {
        return new cag0(new g6h0(j8g0Var, Integer.valueOf(i)), jsa0Var != null ? jsa0Var.f115457a : null, jsa0Var != null ? Integer.valueOf(jsa0Var.f115458b) : null, jsa0Var != null ? jsa0Var.f115459c : null, jsa0Var != null ? jsa0Var.f115460d : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static Next m96198k(qsy0 qsy0Var) {
        return Next.m15605a(Collections.singleton(new k3z0(qsy0Var.f192232a, (d850) null, (sli0) (0 == true ? 1 : 0), 12)));
    }

    /* JADX INFO: renamed from: l */
    public static String m96199l(String str) {
        String strM35712j;
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(str);
        if (dd41VarM74726U.f47709c != gn80.LIVE_ROOM) {
            dd41VarM74726U = null;
        }
        if (dd41VarM74726U == null || (strM35712j = dd41VarM74726U.m35712j()) == null) {
            strM35712j = null;
        }
        if (strM35712j != null) {
            return strM35712j;
        }
        he41 he41VarM30579c = bup0.f31192a.m30579c(str);
        xtp0 xtp0Var = he41VarM30579c instanceof xtp0 ? (xtp0) he41VarM30579c : null;
        if (xtp0Var != null) {
            if (!xtp0Var.f265907a.equals("listening-party") || xtp0Var.f265908b.length() <= 0) {
                xtp0Var = null;
            }
            if (xtp0Var != null) {
                return xtp0Var.f265908b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0071 A[SYNTHETIC] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        jev jevVar;
        jev jevVar2;
        String strM98274q;
        bpe1 bpe1Var;
        String strM47210B;
        String strProvider;
        switch (this.f283081a) {
            case 7:
                ae50<AlsoAvailableOfflineSuggestion> ae50VarM23242o = ((AlsoAvailableOfflineResponse) obj).m23245n().m23242o();
                ArrayList arrayList = new ArrayList();
                for (AlsoAvailableOfflineSuggestion alsoAvailableOfflineSuggestion : ae50VarM23242o) {
                    wj50.m88279p(alsoAvailableOfflineSuggestion);
                    int iOrdinal = alsoAvailableOfflineSuggestion.m23250r().ordinal();
                    jev jevVar3 = jev.f111665N0;
                    if (iOrdinal == 2) {
                        jevVar = jev.f111675f;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            jevVar2 = jevVar3;
                        } else {
                            jevVar = jev.f111672c;
                        }
                        if (jevVar2 == jevVar3) {
                            bpe1Var = null;
                        } else {
                            YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e = alsoAvailableOfflineSuggestion.m23248p().mo78647e();
                            String uri = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.getUri();
                            wj50.m88279p(uri);
                            String name = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.getName();
                            strM98274q = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e.m98274q();
                            if (strM98274q.length() == 0) {
                                strM98274q = "";
                            }
                            bpe1Var = new bpe1(uri, name, false, strM98274q, jev.f111664M0, null, new ko3(jevVar2, alsoAvailableOfflineSuggestion.m23247o(), alsoAvailableOfflineSuggestion.m23249q(), alsoAvailableOfflineSuggestion.m23246n(), uri), 1);
                        }
                        if (bpe1Var != null) {
                            arrayList.add(bpe1Var);
                        }
                    } else {
                        jevVar = jev.f111679t;
                    }
                    jevVar2 = jevVar;
                    if (jevVar2 == jevVar3) {
                        bpe1Var = null;
                    } else {
                        YourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfo yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e2 = alsoAvailableOfflineSuggestion.m23248p().mo78647e();
                        String uri2 = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e2.getUri();
                        wj50.m88279p(uri2);
                        String name2 = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e2.getName();
                        strM98274q = yourLibraryDecoratedEntityOuterClass$YourLibraryEntityInfoMo78647e2.m98274q();
                        if (strM98274q.length() == 0) {
                            strM98274q = "";
                        }
                        bpe1Var = new bpe1(uri2, name2, false, strM98274q, jev.f111664M0, null, new ko3(jevVar2, alsoAvailableOfflineSuggestion.m23247o(), alsoAvailableOfflineSuggestion.m23249q(), alsoAvailableOfflineSuggestion.m23246n(), uri2), 1);
                    }
                    if (bpe1Var != null) {
                        arrayList.add(bpe1Var);
                    }
                }
                return arrayList;
            case 17:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49283h();
                if (contextTrack == null || !e72.m37990X(contextTrack)) {
                    strM47210B = hdi.m47210B(playerState);
                } else {
                    ContextTrack contextTrack2 = (ContextTrack) playerState.track().mo49283h();
                    strM47210B = contextTrack2 != null ? e72.m38000d0(contextTrack2, ContextTrack.Metadata.KEY_POINTER_URI) : null;
                    if (strM47210B == null) {
                        strM47210B = hdi.m47210B(playerState);
                    }
                }
                ContextTrack contextTrack3 = (ContextTrack) playerState.track().mo49283h();
                if (contextTrack3 == null || (strProvider = contextTrack3.provider()) == null) {
                    strProvider = "unknown";
                }
                return new fuh0(strM47210B, strProvider);
            default:
                return tut0.f223920h.get(obj);
        }
    }

    @Override // p204p.rcf
    /* JADX INFO: renamed from: b */
    public void mo75298b(py7 py7Var, Throwable th) {
        na6.m63959g(dq60.m36615o("Command failed: ", py7Var.f183363c, " (", py7Var.f183362b, ")"), th);
    }

    @Override // p204p.sv1
    public u790 begin(Context context) {
        pe40 pe40Var = pe40.f176629e;
        if (pe40Var == null) {
            pe40Var = new pe40();
        }
        edb.m38545A("\n            ", "begin", " was used. This should not happen as the Dummy is only injected if the rollout flag is disabled.\"\n        ");
        return pe40Var;
    }

    /* JADX INFO: renamed from: c */
    public void m96200c(bj60 bj60Var, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, eh00 eh00Var4, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-649511818);
        int i2 = i | (xq00Var.m91766g(bj60Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128) | (xq00Var.m91770i(eh00Var3) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var4) ? 16384 : 8192) | 196608;
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            if (bj60Var instanceof zi60) {
                xq00Var.m91771i0(-778645434);
                umg1.m83443k((zi60) bj60Var, eh00Var, eh00Var2, eh00Var3, eh00Var4, xq00Var, i2 & 524286);
                xq00Var.m91788r(false);
            } else {
                if (!bj60Var.equals(aj60.f16178a)) {
                    throw lq51.m59703i(-1410592171, xq00Var, false);
                }
                xq00Var.m91771i0(-778369317);
                xq00Var.m91788r(false);
            }
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oba(this, bj60Var, eh00Var, eh00Var2, eh00Var3, eh00Var4, fxh0Var2, i, 15);
        }
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        q2p0 q2p0VarM72028a = q2p0.m72028a(i);
        return q2p0VarM72028a == null ? q2p0.UNRECOGNIZED : q2p0VarM72028a;
    }

    @Override // p204p.lp3
    /* JADX INFO: renamed from: d */
    public void mo31098d(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // com.spotify.mobius.Init
    /* JADX INFO: renamed from: f0 */
    public First mo15576f0(Object obj) {
        return First.m15574b((r2c0) obj);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Bundle bundleM49974g;
        String strValueOf = String.valueOf(intent.getData());
        Set set = dd41.f47702f;
        String strM35712j = r46.m74726U(strValueOf).m35712j();
        wq50 wq50Var = (wq50) intent.getParcelableExtra("SELECTED_ITEM");
        if (wq50Var != null) {
            bundleM49974g = i97.m49974g(wq50Var, strM35712j);
        } else {
            if (!arg1.m26944l(strM35712j)) {
                throw new IllegalArgumentException("Category details fragment cannot be instantiated without a category");
            }
            bundleM49974g = i97.m49974g(null, strM35712j);
        }
        return new s1j0(bundleM49974g, kfc.class);
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        ServerSocket serverSocket = new ServerSocket(0);
        if (serverSocket.getLocalPort() == -1) {
            singleEmitter.onError(new IllegalStateException("Couldn't create socket"));
        } else {
            singleEmitter.onSuccess(serverSocket);
        }
        singleEmitter.setCancellable(new zg0(serverSocket, 1));
    }

    @Override // p204p.wi5
    /* JADX INFO: renamed from: t */
    public void mo75551t(yqq yqqVar, int i, int[] iArr, ko70 ko70Var, int[] iArr2) {
        if (ko70Var == ko70.f124556a) {
            bj5.m29365b(iArr, iArr2, false);
        } else {
            bj5.m29366c(i, iArr, iArr2, true);
        }
    }

    public String toString() {
        switch (this.f283081a) {
            case 0:
                return "Arrangement#Start";
            case 13:
                return "SCROLL";
            default:
                return super.toString();
        }
    }

    @Override // p204p.sv1
    public sv1 verifyRecordingInfo() {
        edb.m38545A("\n            ", "verifyRecordingInfo", " was used. This should not happen as the Dummy is only injected if the rollout flag is disabled.\"\n        ");
        return this;
    }

    @Override // p204p.sv1
    public sv1 withCoDoing(iue iueVar, Optional optional) {
        edb.m38545A("\n            ", "withCoDoing", " was used. This should not happen as the Dummy is only injected if the rollout flag is disabled.\"\n        ");
        return this;
    }

    public /* synthetic */ zi5(Object obj, int i) {
        this.f283081a = i;
    }

    public /* synthetic */ zi5(son sonVar, otn otnVar, int i) {
        this.f283081a = i;
    }

    public zi5(wcb wcbVar, peb pebVar, rwt0 rwt0Var, htz0 htz0Var, zb20 zb20Var) {
        this.f283081a = 2;
        Integer num = (Integer) pebVar.m69715a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            num.intValue();
        }
        new og6(rwt0Var);
        cvf1.m34052o(new io9(pebVar, 5));
    }

    @Override // p204p.rcf
    /* JADX INFO: renamed from: a */
    public void mo75297a(py7 py7Var) {
    }
}
