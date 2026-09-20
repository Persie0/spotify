package p204p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class fp9 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71772a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f71773b;

    public /* synthetic */ fp9(z9j0 z9j0Var, int i) {
        this.f71772a = i;
        this.f71773b = z9j0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.f71772a;
        Boolean boolValueOf = null;
        z9j0 z9j0Var = this.f71773b;
        switch (i) {
            case 0:
                z9j0Var.mo47346g(((cp9) obj).f40500b);
                return;
            case 1:
                z9j0Var.mo47345e();
                return;
            case 2:
                y3t y3tVar = (y3t) obj;
                Set set = dd41.f47702f;
                String strM35694A = r46.m74726U("spotify:edit:profile:pronouns").m35694A();
                if (strM35694A != null) {
                    Bundle bundle = new Bundle();
                    String str = y3tVar.f268983c;
                    if (str == null) {
                        str = "";
                    }
                    bundle.putString("pronouns", str);
                    z9j0Var.mo47347h(strM35694A, bundle);
                    return;
                }
                return;
            case 3:
                z9j0Var.mo47345e();
                return;
            case 4:
                z9j0Var.mo47342b(xoc1.f264051b4.f243453a, ((qht) obj).f188850a, null);
                return;
            case 5:
                z9j0Var.mo47345e();
                return;
            case 6:
                z9j0Var.mo47342b(xoc1.f264028Y3.f243453a, ((vht) obj).f241556a, null);
                return;
            case 7:
                z9j0Var.mo47346g(((cp9) obj).f40500b);
                return;
            case 8:
                Set set2 = dd41.f47702f;
                z9j0Var.mo47347h("spotify:blend:story:".concat(r46.m74726U(((zo9) obj).f284727b).m35710h()), ikc0.m50936h("com.spotify.blend.tastematch.effecthandlers.group.KEY_IS_INVITE", true));
                return;
            case 9:
                z9j0Var.mo47345e();
                return;
            case 10:
                d850 d850Var = ((tu90) obj).f223797a;
                if (d850Var != null) {
                    z9j0Var.mo47342b("spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties", d850Var, null);
                    return;
                } else {
                    z9j0Var.mo47346g("spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties");
                    return;
                }
            case 11:
                mgu0 mgu0Var = (mgu0) obj;
                d850 d850Var2 = mgu0Var.f143636b;
                String str2 = mgu0Var.f143635a;
                if (d850Var2 != null) {
                    z9j0Var.mo47342b(str2, d850Var2, null);
                    return;
                } else {
                    z9j0Var.mo47346g(str2);
                    return;
                }
            case 12:
                akf akfVar = (akf) obj;
                d850 d850Var3 = akfVar.f16525b;
                String str3 = akfVar.f16524a;
                if (d850Var3 != null) {
                    z9j0Var.mo47342b(str3, d850Var3, null);
                    return;
                } else {
                    z9j0Var.mo47346g(str3);
                    return;
                }
            case 13:
                uu90 uu90Var = (uu90) obj;
                d850 d850Var4 = uu90Var.f234134b;
                String str4 = uu90Var.f234133a;
                if (d850Var4 != null) {
                    z9j0Var.mo47342b(str4, d850Var4, null);
                    return;
                } else {
                    z9j0Var.mo47346g(str4);
                    return;
                }
            case 14:
                wes0 wes0Var = (wes0) obj;
                z9j0Var.mo47346g(edb.m38566o("spotify:watch-feed:ai-playlist?sessionId=", wes0Var.f250617a, "&messageId=", wes0Var.f250618b));
                return;
            case 15:
                z9j0Var.mo63651f(new p6j0(((mtq0) obj).f147137d, "", false, false, 0, 0, true, null, null, null));
                return;
            case 16:
                z9j0Var.mo47342b(xoc1.f264177r2.f243453a, ((j801) obj).f109759a, null);
                return;
            case 17:
                l801 l801Var = (l801) obj;
                z9j0Var.mo47342b(l801Var.f130769a, l801Var.f130770b, null);
                return;
            case 18:
                ra91 ra91Var = (ra91) obj;
                boolean z = ra91Var.f197241d;
                tyv tyvVar = z ? syv.f215342b : pyv.f183528b;
                String strM82012c = tyvVar.m82012c(xoc1.f264151o0.m83614b("spotify:internal:parental-control:login-choice:" + ra91Var.f197240c));
                if (z) {
                    dlx dlxVar = ra91Var.f197242e;
                    if (dlxVar != null) {
                        boolValueOf = Boolean.valueOf(dlxVar instanceof blx);
                    }
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolValueOf = Boolean.FALSE;
                }
                Bundle bundleM70528i = pp91.m70528i();
                if (boolValueOf != null) {
                    bundleM70528i.putBoolean("is_free_override", boolValueOf.booleanValue());
                }
                if (strM82012c == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                z9j0Var.mo47348i(new p6j0(strM82012c, "", false, false, 0, 0, false, null, null, null), bundleM70528i);
                return;
            case 19:
                String str5 = ptl.m70998s("spotify:internal:regular-member-sub-account-details:", ((ua91) obj).f228434c, xoc1.f263978R3).f243453a;
                if (str5 == null) {
                    throw new IllegalStateException("uri was not set!");
                }
                z9j0Var.mo63651f(new p6j0(str5, "", false, false, 0, 0, false, null, null, null));
                return;
            default:
                z9j0Var.mo47342b(xoc1.f264169q2.f243453a, ((hme1) obj).f92973d, null);
                return;
        }
    }

    public fp9(z9j0 z9j0Var, x120 x120Var) {
        this.f71772a = 8;
        this.f71773b = z9j0Var;
    }
}
