package p204p;

import android.os.Bundle;
import com.spotify.playbacknative.AudioDriver;
import com.spotify.thestage.vtec.logic.VtecWebToAndroidMessage$ShareRequested;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: classes11.dex */
public final class jgc1 implements Function, InterfaceC2207oa, oc5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112155a;

    /* JADX INFO: renamed from: b */
    public Object f112156b;

    @Override // p204p.oc5
    /* JADX INFO: renamed from: a */
    public void mo53293a(long j, String str, String str2, Bundle bundle) {
        String str3;
        yya1 yya1Var = (yya1) this.f112156b;
        if (((HashSet) yya1Var.f277453b).contains(str2)) {
            Bundle bundle2 = new Bundle();
            hg40 hg40Var = umf1.f231851a;
            String[] strArr = vgg1.f241245d;
            String[] strArr2 = vgg1.f241244c;
            int iMin = Math.min(33, 33);
            int i = 0;
            while (true) {
                if (i >= iMin) {
                    str3 = null;
                    break;
                }
                String str4 = strArr[i];
                if ((str2 == null && str4 == null) || (str2 != null && str2.equals(str4))) {
                    str3 = strArr2[i];
                    break;
                }
                i++;
            }
            if (str3 != null) {
                str2 = str3;
            }
            bundle2.putString("events", str2);
            ((ydi) yya1Var.f277454c).m93439u(bundle2);
        }
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        ihi ihiVar = (ihi) obj;
        zdd1 zdd1Var = (zdd1) this.f112156b;
        if (zdd1Var.m95915a()) {
            return zdd1Var.m95919e() && !ihiVar.f102295b;
        }
        return zdd1Var.m95919e();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object objInvoke;
        switch (this.f112155a) {
            case 0:
                ((mx91) ((oyp0) this.f112156b).f171833c).mo41790f();
                return te3.f219562a;
            case 1:
                mwc1 mwc1Var = (mwc1) obj;
                return exc1.m40229a((bka1) this.f112156b, mwc1Var, q3d0.m72082M(((double) AudioDriver.SPOTIFY_MAX_VOLUME) * mwc1Var.f147767b), mwc1Var.f147767b, mwc1Var.f147766a.f54148c);
            case 2:
                pqm0 pqm0Var = (pqm0) obj;
                String str = (String) pqm0Var.f180350a;
                String str2 = (String) pqm0Var.f180351b;
                VtecWebToAndroidMessage$ShareRequested vtecWebToAndroidMessage$ShareRequested = ((s4d1) this.f112156b).f205576a;
                if (str == null) {
                    str = vtecWebToAndroidMessage$ShareRequested.f6826d;
                }
                if (str2 == null) {
                    str2 = vtecWebToAndroidMessage$ShareRequested.f6830h;
                }
                return new a6d1(vtecWebToAndroidMessage$ShareRequested, str, str2);
            case 3:
            case 4:
            default:
                p2x0 p2x0Var = (p2x0) obj;
                wyb1 wyb1Var = new wyb1((mle1) this.f112156b, 5);
                if (p2x0Var instanceof k2x0) {
                    objInvoke = wyb1Var.invoke(((k2x0) p2x0Var).f118699a);
                } else {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objInvoke = u4m.f226774a;
                }
                return (v4m) objInvoke;
            case 5:
                nrd1 nrd1Var = (nrd1) obj;
                prd1 prd1Var = (prd1) this.f112156b;
                return prd1.m70709a(prd1Var, nrd1Var, ((s5p) prd1Var.f180563b).m77302l().filter(crq0.f41356X0).switchMap(new red1(3, prd1Var, nrd1Var)).onErrorReturn(new i391(nrd1Var, 13)).firstOrError());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m53294b(String str, ibk ibkVar) {
        sse1 sse1Var;
        if (ibkVar instanceof sse1) {
            sse1Var = (sse1) ibkVar;
            int i = sse1Var.f213589c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sse1Var.f213589c = i - Integer.MIN_VALUE;
            } else {
                sse1Var = new sse1(this, ibkVar);
            }
        } else {
            sse1Var = new sse1(this, ibkVar);
        }
        Object objM96567o = sse1Var.f213587a;
        int i2 = sse1Var.f213589c;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            tre1 tre1Var = (tre1) this.f112156b;
            ioe1 ioe1VarM98149q = YourLibraryContainsRequest.m98149q();
            ioe1VarM98149q.m51178q(str);
            Single singleM81346a = tre1Var.m81346a((YourLibraryContainsRequest) ioe1VarM98149q.build());
            sse1Var.f213589c = 1;
            objM96567o = zn91.m96567o(singleM81346a, sse1Var);
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
        YourLibraryContainsResponseEntity yourLibraryContainsResponseEntity = (YourLibraryContainsResponseEntity) g6f.m43745s0(((YourLibraryContainsResponse) objM96567o).m98153o());
        return Boolean.valueOf(yourLibraryContainsResponseEntity != null ? yourLibraryContainsResponseEntity.m98156o() : false);
    }

    public /* synthetic */ jgc1(Object obj, int i) {
        this.f112155a = i;
        this.f112156b = obj;
    }
}
